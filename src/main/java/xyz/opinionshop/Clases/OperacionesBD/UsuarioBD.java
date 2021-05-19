package xyz.opinionshop.Clases.OperacionesBD;

import xyz.opinionshop.Clases.Cuentas.Usuario;
import java.sql.SQLException;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import xyz.opinionshop.Clases.Cuentas.Carrito;
import xyz.opinionshop.Clases.Cuentas.MetodoDePago;

public class UsuarioBD extends BD{
    public int Id;
    public String Email;
    public String Password;
    public String Domicilio;
    public String NombreCompleto;
    public Date Nacimiento;
    public MetodoDePago MP;
    public int Contacto;
    public String ProductosComprados;
    public Carrito CarritoU;
    private Object utilDate;
    
    protected UsuarioBD(int id, String email, String password, String domicilio, String nombre_completo, Date nacimiento, int contacto) {
      Id = id;
      Email = email;
      Password = password;
      Domicilio = domicilio;
      NombreCompleto = nombre_completo;
      Nacimiento = nacimiento;
      Contacto = contacto;
    }

    
     protected static boolean Iniciar(String email, String password) throws SQLException, ClassNotFoundException {
        Conectar();
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `usuarios` WHERE `email` = ? AND `password` = ? LIMIT 1");
        Consulta.setString(1, email);
        Consulta.setString(2, password);
        
        RS = Consulta.executeQuery();
        if(RS.next()) {
            Usuario.UsuarioActual = new Usuario(RS.getInt("id") ,RS.getString("email"), RS.getString("password"), RS.getString("domicilio"), RS.getString("nombre_completo"), RS.getDate("nacimiento"), RS.getInt("contacto"));
            Usuario.UsuarioActual.CarritoU = new Carrito(RS.getString("carrito"));
            
            RS = MetodoDePago.ObtenerMP(Usuario.UsuarioActual.Id);
            
            if(RS != null) {
                Usuario.UsuarioActual.MP = new MetodoDePago(RS.getInt("id_usuario"), RS.getString("numero"), RS.getString("vencimiento"), RS.getInt("cvv"));
            }
            else {
                Usuario.UsuarioActual.MP = null;
            }
            
            Desconectar();
            
            return true;
        }
        else{
            
            Desconectar();
            
            return false;
        }
        
    }
    
    protected void Guardar() throws SQLException, ClassNotFoundException{
        Conectar();  
        
        Consulta = Conexion.prepareStatement("INSERT INTO `usuarios` (`nombre_completo`, `email`, `password`, `domicilio`,`nacimiento`, `contacto`, `carrito`) VALUES (?, ?, ?, ?, ?, ?, ?)");
        Consulta.setString(1,NombreCompleto);
        Consulta.setString(2, Email);
        Consulta.setString(3, Password);
        Consulta.setString(4, Domicilio);
        Consulta.setDate(5,new java.sql.Date(Nacimiento.getTime()));
        Consulta.setInt(6, Contacto);
        Consulta.setString(7, "[]");
        
        Consulta.execute();
        
        Desconectar();
   }
   
    public static boolean EsEmail(String email) {
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");

        Matcher mather = pattern.matcher(email);

        return mather.find();

    }
    
    public static boolean EsNumeroTelefonico(String telefono) {

        Pattern pattern = Pattern.compile("^[6-7]{1}\\d{7}$");

        Matcher mather = pattern.matcher(telefono);

        return mather.find();

    }
    
    
    public static boolean ExisteUsuario(String email) throws SQLException, ClassNotFoundException {
        Conectar();
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `usuarios` WHERE `email` = ? LIMIT 1");
        Consulta.setString(1, email);
        
        RS = Consulta.executeQuery();
        
        Desconectar();
        
        return RS.next();
    }
   
    
   protected void Actualizar() throws SQLException, ClassNotFoundException{
        Conectar();
        
        Consulta = Conexion.prepareStatement("UPDATE `usuarios` SET `password` = ?, `domicilio` = ?, `contacto` = ? WHERE `id` = ? ");
        Consulta.setString(1, Password);
        Consulta.setString(2, Domicilio);
        Consulta.setInt(3,Contacto);
        Consulta.setInt(4, Id);
        
        Consulta.executeUpdate();
        
        Desconectar();
   }
   
   protected void Eliminar() throws SQLException, ClassNotFoundException{
        Conectar();
        
        Consulta = Conexion.prepareStatement("DELETE FROM `usuarios` WHERE `id` = ?");
        Consulta.setInt(1, Id);
        Consulta.execute();
        
        Usuario.UsuarioActual = null;
        
        Desconectar();
   }
   
   protected void ActualizarCarrito(String carrito_json) throws SQLException, ClassNotFoundException{
        Conectar();
        
        Consulta = Conexion.prepareStatement("UPDATE `usuarios` SET `carrito` = ? WHERE `id` = ? ");
        Consulta.setString(1, carrito_json);
        Consulta.setInt(2, Id);
        Consulta.execute();
        
        
        Desconectar();
   }
}

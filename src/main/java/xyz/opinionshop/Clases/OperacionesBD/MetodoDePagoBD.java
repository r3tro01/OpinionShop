package xyz.opinionshop.Clases.OperacionesBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MetodoDePagoBD extends BD{
    public int IdUsuario;
    public String NumeroTarjeta;
    public String Vencimiento;
    public int CVV;
    
    protected MetodoDePagoBD(int id_usuario, String numero_tarjeta, String vencimiento, int cvv) {
        IdUsuario = id_usuario;
        NumeroTarjeta = numero_tarjeta;
        Vencimiento = vencimiento;
        CVV = cvv;
    }
    
    protected void Guardar() throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("INSERT INTO `tarjetas` (`id_usuario`, `numero`, `vencimiento`, `cvv`) VALUES (?, ?, ?, ?)");
        Consulta.setInt(1,IdUsuario);
        Consulta.setString(2, NumeroTarjeta);
        Consulta.setString(3, Vencimiento);
        Consulta.setInt(4, CVV);
        
        Consulta.execute();
        
        Desconectar();
    }
    
    public static boolean EsTarjeta(String numero_tarjeta) {
        Pattern pattern = Pattern.compile("^[4-6]{1}\\d{15}$");

        Matcher mather = pattern.matcher(numero_tarjeta);

        return mather.find();
    }
    
    protected static ResultSet ObtenerMP(int id_usuario) throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `tarjetas` WHERE `id_usuario` = ?");
        Consulta.setInt(1,id_usuario);
        
        RS = Consulta.executeQuery();
        
        if(RS.next()) {
            Desconectar();
            
            return RS;
        }
        else {
            Desconectar();
            
            return null;
        }
    }
    
    protected void Actualizar() throws SQLException, ClassNotFoundException{
        BD.Conectar();
        
        Consulta = Conexion.prepareStatement("UPDATE `usuarios` SET `numero` = ?, `vencimiento` = ?, `cvv` = ? WHERE `id_usuario` = ? ");
        Consulta.setString(1, NumeroTarjeta);
        Consulta.setString(2, Vencimiento);
        Consulta.setInt(3, CVV);
        Consulta.setInt(4, IdUsuario);
        
        Consulta.execute();
        
        Desconectar();
   }
    
    protected void Eliminar() throws SQLException, ClassNotFoundException{
        Conectar();
        
        Consulta = Conexion.prepareStatement("DELETE FROM `tarjetas` WHERE `id_usuario` = ?");
        Consulta.setInt(1, IdUsuario);
        Consulta.execute();
        
        Desconectar();
   }
    
    
}

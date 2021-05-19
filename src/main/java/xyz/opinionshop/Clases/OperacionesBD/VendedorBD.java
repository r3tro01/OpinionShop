package xyz.opinionshop.Clases.OperacionesBD;

import java.sql.SQLException;
import xyz.opinionshop.Clases.Cuentas.Vendedor;

public class VendedorBD extends BD{
    public int Id;
    public String Nombre;
    public int Fundacion;
    public String Descripcion;
    public String Domicilio;
    public int Contacto;
    
    protected VendedorBD(int id, String nombre, int fundacion, String descripcion, String domicilio, int contacto) {
        Id = id;
        Nombre = nombre;
        Fundacion = fundacion;
        Descripcion = descripcion;
        Domicilio = domicilio;
        Contacto = contacto;
    }
    
    protected static void UnVendedor(int id) throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `vendedores` WHERE `id` = ?");
        Consulta.setInt(1, id);
        
        RS = Consulta.executeQuery();
        RS.next();
        
        Vendedor.VendedorActual = new Vendedor(RS.getInt("id"), RS.getString("nombre"), RS.getInt("fundacion"), RS.getString("descripcion"), RS.getString("domicilio"), RS.getInt("contacto"));
        
        Desconectar();
    }
}

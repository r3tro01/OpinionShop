package xyz.opinionshop.Clases.OperacionesBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import xyz.opinionshop.Clases.Cuentas.Producto;

public class ProductoBD extends BD{
    public int Id;
    public int IdVendedor;
    public String NombreVendedor;
    public String Nombre;
    public String Descripcion;
    public double Precio;
    public int Stock;
    
    protected ProductoBD(int id, int id_vendedor, String nombre, String nombre_vendedor, String descripcion, double precio, int stock) {
        Id = id;
        IdVendedor = id_vendedor;
        Nombre = nombre;
        NombreVendedor = nombre_vendedor;
        Descripcion = descripcion;
        Precio = precio;
        Stock = stock;
    }
    
    protected static void UnProducto(int id) throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `productos` WHERE `id` = ?");
        Consulta.setInt(1, id);
        
        RS = Consulta.executeQuery();
        RS.next();
        
        Producto.ProductoActual = new Producto(RS.getInt("id"), RS.getInt("id_vendedor"), RS.getString("nombre"), RS.getString("nombre_vendedor"), RS.getString("descripcion"), RS.getDouble("precio"), RS.getInt("stock"));
        
        Desconectar();
    }
    
    protected static ResultSet Productos() throws SQLException, ClassNotFoundException {      
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `productos`");
        
        RS = Consulta.executeQuery();
        
        Desconectar();
        
        return RS;
    }
}

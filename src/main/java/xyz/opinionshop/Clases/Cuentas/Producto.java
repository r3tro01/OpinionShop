package xyz.opinionshop.Clases.Cuentas;

import java.sql.ResultSet;
import java.sql.SQLException;
import xyz.opinionshop.Clases.OperacionesBD.ProductoBD;

public class Producto extends ProductoBD{
    public static Producto ProductoActual;
    
    public Producto(int id, int id_vendedor, String nombre_vendedor, String nombre, String descripcion, double precio, int stock) {
        super(id, id_vendedor, nombre_vendedor, nombre, descripcion, precio, stock);
    }
    
    public static void ObtenerProducto(int id) throws SQLException, ClassNotFoundException {
       UnProducto(id);
    }
    
    public static ResultSet ObtenerProductos() throws SQLException, ClassNotFoundException {
       return Productos();
    }
    
    
}

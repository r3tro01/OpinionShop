package xyz.opinionshop.Clases.Mensajes;

import java.sql.ResultSet;
import java.sql.SQLException;
import xyz.opinionshop.Clases.OperacionesBD.PostBD;

public class Post extends PostBD{
    public static Post PostActual;
    
    public Post(int id, int id_usuario, String nombre_usuario, String titulo,String fecha, String mensaje) {
        super(id, id_usuario, nombre_usuario, titulo, fecha,  mensaje);
    }
    
    public void Registrar() throws SQLException, ClassNotFoundException {
        Guardar();
    }
    
    public static void ObtenerPost(int id_producto) throws SQLException, ClassNotFoundException {
        UnPost(id_producto);
    }
    
    public static ResultSet ObtenerPosts() throws SQLException, ClassNotFoundException {
        return Posts();
    }
    
}

package xyz.opinionshop.Clases.Mensajes;

import java.sql.ResultSet;
import java.sql.SQLException;
import xyz.opinionshop.Clases.OperacionesBD.ComentarioBD;

public class Comentario extends ComentarioBD{

    public Comentario(int id_usuario, int id_post, String nombre_usuario, String comentario, String fecha) {
        super(id_usuario, id_post, nombre_usuario, comentario, fecha);
    }
    
    public void Registrar() throws SQLException, ClassNotFoundException {
        Guardar();
    }
    
    public static ResultSet ObtenerComentarios(int id_post) throws SQLException, ClassNotFoundException {
        return Comentarios(id_post);
    }
}

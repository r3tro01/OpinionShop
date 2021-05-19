package xyz.opinionshop.Clases.Mensajes;

import java.sql.ResultSet;
import java.sql.SQLException;
import xyz.opinionshop.Clases.OperacionesBD.OpinionBD;

public class Opinion extends OpinionBD {

    public Opinion(int id, int id_producto, int id_usuario, String nombre_usuario, String opinion, int estrellas, String fecha) {
        super(id, id_producto, id_usuario, nombre_usuario, opinion, estrellas, fecha);
    }
    
    public void Registrar() throws SQLException, ClassNotFoundException {
        Guardar();
    }
    
    public static ResultSet ObtenerOpiniones(int id_producto) throws SQLException, ClassNotFoundException {
        return Opiniones(id_producto);
    }

}

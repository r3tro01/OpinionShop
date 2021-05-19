package xyz.opinionshop.Clases.OperacionesBD;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ComentarioBD extends BD{
    public int Id;
    public int IdUsuario;
    public int IdPost;
    public String NombreUsuario;
    public String Comentario;
    public String Fecha;
    
    protected ComentarioBD(int id_usuario, int id_post, String nombre_usuario, String comentario, String fecha) {
        IdUsuario = id_usuario;
        IdPost = id_post;
        NombreUsuario = nombre_usuario;
        Comentario = comentario;
        Fecha = fecha;
    }
    
    protected void Guardar() throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("INSERT INTO `comentarios` (`id_usuario`, `id_post` ,`nombre_usuario`, `comentario`, `fecha`) VALUES (?, ?, ?, ?, ?)");
        Consulta.setInt(1, IdUsuario);
        Consulta.setInt(2, IdPost);
        Consulta.setString(3, NombreUsuario);
        Consulta.setString(4, Comentario);
        Consulta.setString(5, Fecha);
        
        Consulta.execute();
        
        Consulta = Conexion.prepareStatement("SELECT `id` FROM `comentarios`", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        RS = Consulta.executeQuery();
        RS.afterLast();
        RS.previous();
        
        Id = RS.getInt(1);
        
        Desconectar();
    }
    
    
    protected static ResultSet Comentarios(int id_post) throws SQLException, ClassNotFoundException {      
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `comentarios` WHERE `id_post` = ?");
        Consulta.setInt(1, id_post);
        
        RS = Consulta.executeQuery();
        
        Desconectar();
        
        return RS;
    }
}

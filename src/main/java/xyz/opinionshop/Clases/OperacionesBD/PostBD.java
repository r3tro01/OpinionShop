package xyz.opinionshop.Clases.OperacionesBD;

import java.sql.ResultSet;
import java.sql.SQLException;
import xyz.opinionshop.Clases.Mensajes.Post;

public class PostBD extends BD{
    public int Id;
    public int IdUsuario;
    public String NombreUsuario;
    public String Titulo;
    public String Mensaje;
    public String Fecha;
    
    protected PostBD(int id, int id_usuario, String nombre_usuario, String titulo, String fecha, String mensaje) {
        Id = id;
        IdUsuario = id_usuario;
        NombreUsuario = nombre_usuario;
        Titulo = titulo;
        Fecha = fecha;
        Mensaje = mensaje;
    }
    
    protected void Guardar() throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("INSERT INTO `posts` (`id_usuario`, `nombre_usuario`, `titulo`, `mensaje`, `fecha`) VALUES (?, ?, ?, ?, ?)");
        Consulta.setInt(1, IdUsuario);
        Consulta.setString(2, NombreUsuario);
        Consulta.setString(3, Titulo);
        Consulta.setString(4, Mensaje);
        Consulta.setString(5, Fecha);
        Consulta.execute();
        
        Consulta = Conexion.prepareStatement("SELECT `id` FROM `posts`", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        RS = Consulta.executeQuery();
        RS.afterLast();
        RS.previous();
        
        Id = RS.getInt(1);
        
        Desconectar();
    }
    
    protected static void UnPost(int id_post) throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `posts` WHERE `id` = ?");
        Consulta.setInt(1, id_post);
        
        RS = Consulta.executeQuery();
        RS.next();
        
        Post.PostActual = null;
        Post.PostActual = new Post(RS.getInt("id"), RS.getInt("id_usuario"), RS.getString("nombre_usuario"), RS.getString("titulo"), RS.getString("fecha"), RS.getString("mensaje"));
        
        Desconectar();
    }
    
    protected static ResultSet Posts() throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `posts`", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        RS = Consulta.executeQuery();
        
        Desconectar();
        
        return RS;
    }
    
    
}

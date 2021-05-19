package xyz.opinionshop.Clases.OperacionesBD;

import java.sql.ResultSet;
import java.sql.SQLException;

public class OpinionBD extends BD{
    public int Id;
    public int IdProducto;
    public int IdUsuario;
    public String NombreUsuario;
    public String Opinion;
    public int Estrellas;
    public String Fecha;
    
    protected OpinionBD(int id, int id_producto, int id_usuario, String nombre_usuario, String opinion, int estrellas, String fecha) {
        Id = id;
        IdProducto = id_producto;
        IdUsuario = id_usuario;
        NombreUsuario = nombre_usuario;
        Opinion = opinion;
        Estrellas = estrellas;
        Fecha = fecha;
    }
    
    protected void Guardar() throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("INSERT INTO `opiniones` (`id_producto`, `id_usuario`, `nombre_usuario`, `opinion`, `estrellas`, `fecha`) VALUES (?, ?, ?, ?, ?, ?)");
        Consulta.setInt(1, IdProducto);
        Consulta.setInt(2, IdUsuario);
        Consulta.setString(3, NombreUsuario);
        Consulta.setString(4, Opinion);
        Consulta.setInt(5, Estrellas);
        Consulta.setString(6, Fecha);
        Consulta.execute();
        
        Consulta = Conexion.prepareStatement("SELECT `id` FROM `opiniones`", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        
        RS = Consulta.executeQuery();
        RS.afterLast();
        RS.previous();
        
        Id = RS.getInt(1);
        
        Desconectar();
    }
    
    protected static ResultSet Opiniones(int id_producto) throws SQLException, ClassNotFoundException {
        Conectar();  
        
        Consulta = Conexion.prepareStatement("SELECT * FROM `opiniones` WHERE `id_producto` = ?", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
        Consulta.setInt(1, id_producto);
        
        RS = Consulta.executeQuery();
        
        Desconectar();
        
        return RS;
    }
}

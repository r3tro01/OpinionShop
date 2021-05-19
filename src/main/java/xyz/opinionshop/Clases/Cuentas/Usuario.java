package xyz.opinionshop.Clases.Cuentas;

import java.sql.*;
import xyz.opinionshop.Clases.OperacionesBD.UsuarioBD;

public class Usuario extends UsuarioBD{
    public static Usuario UsuarioActual = null;
    
    public Usuario(int id, String email, String password, String domicilio, String nombre_completo, Date nacimiento, int contacto) {
        super(id, email, password, domicilio, nombre_completo, nacimiento, contacto);
    }
    
    public void Registrar() throws SQLException, ClassNotFoundException {
        Guardar();
        Iniciar(Email,Password);
    }
    
    public static boolean Entrar(String email, String password) throws SQLException, ClassNotFoundException {
        return Iniciar(email, password);
    }
    
    public void Modificar() throws SQLException, ClassNotFoundException {
        Actualizar();
    }
    
    public void Borrar() throws SQLException, ClassNotFoundException {
        Eliminar();
    }
    
    public void ModificarCarrito(String carrito_json) throws SQLException, ClassNotFoundException {
        ActualizarCarrito(carrito_json);
    }
    
}

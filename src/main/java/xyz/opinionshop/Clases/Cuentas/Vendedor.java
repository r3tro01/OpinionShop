package xyz.opinionshop.Clases.Cuentas;

import java.sql.SQLException;
import xyz.opinionshop.Clases.OperacionesBD.VendedorBD;

public class Vendedor extends VendedorBD{
    public static Vendedor VendedorActual;
    
    public Vendedor(int id, String nombre, int fundacion, String descripcion, String domicilio, int contacto) {
        super(id, nombre, fundacion, descripcion, domicilio, contacto);
    }
    
    public static void ObtenerVendedor(int id) throws SQLException, ClassNotFoundException {
        UnVendedor(id);
    }
}

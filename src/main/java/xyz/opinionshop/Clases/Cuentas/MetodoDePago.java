package xyz.opinionshop.Clases.Cuentas;

import java.sql.SQLException;
import xyz.opinionshop.Clases.OperacionesBD.MetodoDePagoBD;

public class MetodoDePago extends MetodoDePagoBD{
    public MetodoDePago(int id_usuario, String numero_tarjeta, String vencimiento, int cvv) {
        super(id_usuario, numero_tarjeta, vencimiento, cvv);
    }
    
    public void Registrar() throws SQLException, ClassNotFoundException {
        Guardar();
    }
    
    public void Modificar() throws SQLException, ClassNotFoundException {
        Actualizar();
    }
    
    public void Borrar() throws SQLException, ClassNotFoundException {
        Eliminar();
    }
}

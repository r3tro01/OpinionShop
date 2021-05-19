package xyz.opinionshop.Clases.Cuentas;

import java.sql.SQLException;
import org.json.*;


public final class Carrito{
    public JSONArray CarritoJSON;
    public double SubTotal;
    public double Envio = 9.0;
    public double Otros = 1.99;
    public double Total;

    public Carrito(String carrito_json) {
        CarritoJSON = new JSONArray(carrito_json);
        
        ModificarDatos();
    }
    
    public void AgregarProducto(String nombre, double precio) throws SQLException, ClassNotFoundException {
        JSONObject Producto = new JSONObject();
        
        Producto.put("nombre", nombre);
        Producto.put("precio", precio);
        
        CarritoJSON.put(Producto);
        
        Usuario.UsuarioActual.ModificarCarrito(CarritoJSON.toString());
        
        ModificarDatos();
    }
    
    public void EliminarProducto(int index) throws SQLException, ClassNotFoundException {
        
        CarritoJSON.remove(index);
        
        Usuario.UsuarioActual.ModificarCarrito(CarritoJSON.toString());
        
        ModificarDatos();
    }
    
    /**
         * Este metodo actualiza los datos del carrito cada vez que se realiza un cambio en el
    */
    public void ModificarDatos() {
        
        JSONObject Producto;
        
        SubTotal = 0.0;
                
        for(int i = 0; i < CarritoJSON.length() ;i++) {
            Producto = CarritoJSON.getJSONObject(i);
            
            SubTotal += Producto.getDouble("precio");
        }
        
        Total = SubTotal + Envio + Otros;
    }
}

package xyz.opinionshop.Main.Usuario;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.JPanel;
import org.json.*;
import xyz.opinionshop.Clases.Cuentas.Usuario;

/**
 *
 * @author Family
 */
public class ProductosPane extends javax.swing.JPanel {
    final int x = 50;
    int y = 20;
    int altura = 110;
    
    public ProductosPane() {
        initComponents();
        
        this.setPreferredSize(new Dimension(980, altura));
        this.setBackground(Color.white);
        
        JSONArray CarritoJSON = Usuario.UsuarioActual.CarritoU.CarritoJSON;
        JSONObject ProductoJSON;
        JPanel Producto;
        
        for(int i = 0; i < CarritoJSON.length() ;i++) {
            ProductoJSON = CarritoJSON.getJSONObject(i);
            
            Producto = new UnProducto(i, ProductoJSON.getString("nombre"), ProductoJSON.getDouble("precio"));
            Producto.setBounds(x, y, 600, 100);
            
            this.setPreferredSize(new Dimension(980, altura));
            
            altura += 110;
            
            y = y + 110;
                       
            this.add(Producto);
            this.revalidate();
            this.repaint();
        }
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

package xyz.opinionshop.Main.Vendedor;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author Family
 */
public class ProductosPane extends javax.swing.JPanel {
    int x = 20;
    int y = 20;
    int altura = 280;
    
    public ProductosPane(JFrame lugar, ResultSet productos) throws SQLException {
        initComponents();
        
        this.setPreferredSize(new Dimension(980, altura));
        this.setBackground(Color.white);
        
        while(productos.next()) {
            JPanel Producto;
            Producto = new UnProducto(lugar, productos.getInt("id"), productos.getString("nombre") , productos.getDouble("precio"));
            Producto.setBounds(x, y, 300, 270);
            
            altura += 60;
            
            if(x == 660) {
                x = 20; 
                y = y + 290;
                altura += 290;
                this.setPreferredSize(new Dimension(980, altura));
            }
            else {
                x = x + 320; 
            }
        
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
            .addGap(0, 980, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 600, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

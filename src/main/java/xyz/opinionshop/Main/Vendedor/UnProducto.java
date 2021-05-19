package xyz.opinionshop.Main.Vendedor;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import xyz.opinionshop.Clases.Cuentas.Producto;

/**
 *
 * @author Family
 */
public class UnProducto extends javax.swing.JPanel {
    JFrame Lugar;
    int Id;
    
    public UnProducto(JFrame lugar, int id_producto, String nombre_producto, double precio) {
        initComponents();
        
        Lugar = lugar;
        Id = id_producto;
        NombreProducto.setText(nombre_producto);
        Precio.setText("Precio: $" + precio);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        NombreProducto = new javax.swing.JLabel();
        ImagenProducto = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Ver = new javax.swing.JButton();

        ImagenProducto.setIcon(new javax.swing.ImageIcon(getClass().getResource("/producto1.png"))); // NOI18N

        Ver.setFont(new java.awt.Font("Arial", 1, 10)); // NOI18N
        Ver.setText("Ver");
        Ver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(57, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Ver)
                .addGap(123, 123, 123))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(NombreProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ImagenProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ver)
                .addContainerGap(32, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        try {
            Producto.ObtenerProducto(Id);
            
            new XProducto().setVisible(true);
            
            Lugar.dispose();
            
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
        }
        
        
    }//GEN-LAST:event_VerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ImagenProducto;
    private javax.swing.JLabel NombreProducto;
    private javax.swing.JLabel Precio;
    private javax.swing.JButton Ver;
    // End of variables declaration//GEN-END:variables
}

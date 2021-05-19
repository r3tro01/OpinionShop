package xyz.opinionshop.Main.Vendedor;

import java.sql.SQLException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import javax.swing.JOptionPane;
import xyz.opinionshop.Clases.Cuentas.Producto;
import xyz.opinionshop.Clases.Cuentas.Usuario;
import xyz.opinionshop.Clases.Cuentas.Vendedor;
import xyz.opinionshop.Clases.Mensajes.Opinion;
import xyz.opinionshop.Main.Cabezera;
import xyz.opinionshop.Main.Main;

/**
 *
 * @author Family
 */
public class XProducto extends javax.swing.JFrame {
    int Estrellas = 0;
    Date date;
    DateFormat dateFormat;
    String Fecha;
    
    /**
     * Creates new form Producto
     */
    public XProducto() {
        initComponents();
        
        Main.Caracteristicas(this);
        Main.Encabezado(Encabezado, new Cabezera(this));
        
        Nombre.setText(Producto.ProductoActual.Nombre);
        Descripcion.setText(Producto.ProductoActual.Descripcion);
        Precio.setText("Precio: $" + Producto.ProductoActual.Precio);
        Stock.setText("Stock: " + Producto.ProductoActual.Stock);
        VendedorLabel.setText(Producto.ProductoActual.NombreVendedor);
        
        if(Usuario.UsuarioActual == null) {
            AgregarCarrito.setVisible(false);
            Opinion.setVisible(false);
            Opinar.setVisible(false);
            OpinarLabel.setVisible(false);
            e1.setVisible(false);
            e2.setVisible(false);
            e3.setVisible(false);
            e4.setVisible(false);
            e5.setVisible(false);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Encabezado = new javax.swing.JPanel();
        ProductoImagen = new javax.swing.JLabel();
        Nombre = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        AgregarCarrito = new javax.swing.JButton();
        Opinar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Opinion = new javax.swing.JTextArea();
        VerOpiniones = new javax.swing.JButton();
        OpinarLabel = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        Stock = new javax.swing.JLabel();
        VendedorLabel = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Descripcion = new javax.swing.JTextArea();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Encabezado.setPreferredSize(new java.awt.Dimension(1000, 20));

        javax.swing.GroupLayout EncabezadoLayout = new javax.swing.GroupLayout(Encabezado);
        Encabezado.setLayout(EncabezadoLayout);
        EncabezadoLayout.setHorizontalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1000, Short.MAX_VALUE)
        );
        EncabezadoLayout.setVerticalGroup(
            EncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 60, Short.MAX_VALUE)
        );

        ProductoImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/producto.png"))); // NOI18N

        AgregarCarrito.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        AgregarCarrito.setText("Agregar al carrito");
        AgregarCarrito.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AgregarCarritoActionPerformed(evt);
            }
        });

        Opinar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        Opinar.setText("Opinar");
        Opinar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OpinarActionPerformed(evt);
            }
        });

        Opinion.setColumns(20);
        Opinion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Opinion.setRows(5);
        jScrollPane1.setViewportView(Opinion);

        VerOpiniones.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        VerOpiniones.setText("Ver opiniones");
        VerOpiniones.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                VerOpinionesActionPerformed(evt);
            }
        });

        OpinarLabel.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        OpinarLabel.setText("Opina sobre este producto:");

        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png"))); // NOI18N
        e3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e3MouseClicked(evt);
            }
        });

        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png"))); // NOI18N
        e4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e4MouseClicked(evt);
            }
        });

        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png"))); // NOI18N
        e5.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e5.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e5MouseClicked(evt);
            }
        });

        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png"))); // NOI18N
        e2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e2MouseClicked(evt);
            }
        });

        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png"))); // NOI18N
        e1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        e1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                e1MouseClicked(evt);
            }
        });

        VendedorLabel.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        VendedorLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                VendedorLabelMouseClicked(evt);
            }
        });

        Descripcion.setEditable(false);
        Descripcion.setColumns(20);
        Descripcion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Descripcion.setLineWrap(true);
        Descripcion.setRows(5);
        jScrollPane2.setViewportView(Descripcion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(OpinarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 707, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ProductoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 356, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jScrollPane2)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Opinar, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(AgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(VerOpiniones, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(VendedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Encabezado, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(ProductoImagen, javax.swing.GroupLayout.PREFERRED_SIZE, 218, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Nombre, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(AgregarCarrito, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(VerOpiniones, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(21, 21, 21)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(Stock, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(VendedorLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(61, 61, 61)
                .addComponent(OpinarLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 135, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Opinar, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(114, 114, 114))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void e2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e2MouseClicked
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        
        Estrellas = 2;
    }//GEN-LAST:event_e2MouseClicked

    private void e3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e3MouseClicked
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        
        Estrellas = 3;
    }//GEN-LAST:event_e3MouseClicked

    private void e4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e4MouseClicked
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        
        Estrellas = 4;
    }//GEN-LAST:event_e4MouseClicked

    private void e5MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e5MouseClicked
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        
        Estrellas = 5;
    }//GEN-LAST:event_e5MouseClicked

    private void e1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_e1MouseClicked
        e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
        e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
        
        Estrellas = 1;
    }//GEN-LAST:event_e1MouseClicked

    private void OpinarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OpinarActionPerformed
        date = Calendar.getInstance().getTime();
        dateFormat = new SimpleDateFormat("yyyy-mm-dd hh:mm:ss");
        Fecha = dateFormat.format(date);
        
        if(Estrellas != 0 || Opinion.getText().length() > 8) {
            Opinion OpinionNueva = new Opinion(0, Producto.ProductoActual.Id, Usuario.UsuarioActual.Id, Usuario.UsuarioActual.NombreCompleto, Opinion.getText(), Estrellas, Fecha);
            
            try {
                OpinionNueva.Registrar();
            } 
            catch (SQLException | ClassNotFoundException ex) {
                JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
            }
        }
        
        else {
            JOptionPane.showMessageDialog(null, "Ingrese datos correctamente");
        }
    }//GEN-LAST:event_OpinarActionPerformed

    private void VerOpinionesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerOpinionesActionPerformed
        try {
            new Opiniones().setVisible(true);
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
        }
        
        this.dispose();
    }//GEN-LAST:event_VerOpinionesActionPerformed

    private void AgregarCarritoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AgregarCarritoActionPerformed
        try {
            Usuario.UsuarioActual.CarritoU.AgregarProducto(Producto.ProductoActual.Nombre, Producto.ProductoActual.Precio);
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
        }
    }//GEN-LAST:event_AgregarCarritoActionPerformed

    private void VendedorLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_VendedorLabelMouseClicked
        try {
            Vendedor.ObtenerVendedor(Producto.ProductoActual.IdVendedor);
            
            new PerfilVendedor().setVisible(true);
            
            this.dispose();
            
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
        }
    }//GEN-LAST:event_VendedorLabelMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(XProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XProducto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XProducto().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton AgregarCarrito;
    private javax.swing.JTextArea Descripcion;
    private javax.swing.JPanel Encabezado;
    private javax.swing.JLabel Nombre;
    private javax.swing.JButton Opinar;
    private javax.swing.JLabel OpinarLabel;
    private javax.swing.JTextArea Opinion;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel ProductoImagen;
    private javax.swing.JLabel Stock;
    private javax.swing.JLabel VendedorLabel;
    private javax.swing.JButton VerOpiniones;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables
}

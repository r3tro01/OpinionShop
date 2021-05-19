package xyz.opinionshop.Main.Interacciones;

import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import xyz.opinionshop.Clases.Mensajes.Post;

/**
 *
 * @author Family
 */
public class UnPost extends javax.swing.JPanel {
    JFrame Lugar;
    int Id;

    public UnPost(JFrame lugar, int id_post, String titulo_post) {
        initComponents();
        
        Lugar = lugar;
        Id = id_post;
        Titulo.setText(titulo_post);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        Ver = new javax.swing.JButton();

        Titulo.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N

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
                .addContainerGap()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 520, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Ver)
                .addContainerGap(23, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Ver)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents

    private void VerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_VerActionPerformed
        try {
            Post.ObtenerPost(Id);
            
            new XPost().setVisible(true);
            Lugar.dispose();
            
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
        }

    }//GEN-LAST:event_VerActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Titulo;
    private javax.swing.JButton Ver;
    // End of variables declaration//GEN-END:variables
}

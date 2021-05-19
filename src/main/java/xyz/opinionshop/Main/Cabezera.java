/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xyz.opinionshop.Main;

import xyz.opinionshop.Main.Usuario.Carro;
import java.awt.Color;
import java.sql.SQLException;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import xyz.opinionshop.Main.Interacciones.Foro;
import xyz.opinionshop.Main.Vendedor.Productos;
import xyz.opinionshop.Clases.Cuentas.Usuario;
import xyz.opinionshop.Main.Usuario.PerfilUsuario;


/**
 *
 * @author Family
 */
public class Cabezera extends javax.swing.JPanel {
    JFrame Lugar;
    
    public Cabezera(JFrame lugar) {
        initComponents();
        Lugar = lugar;
        
        this.setBackground(Color.white);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Carrito = new javax.swing.JLabel();
        PerfilUsuario = new javax.swing.JLabel();
        Mercado = new javax.swing.JLabel();
        Icono1 = new javax.swing.JLabel();
        Inicio = new javax.swing.JLabel();
        QuienesSomos = new javax.swing.JLabel();
        Foro1 = new javax.swing.JLabel();

        Carrito.setIcon(new javax.swing.ImageIcon(getClass().getResource("/carrito.png"))); // NOI18N
        Carrito.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Carrito.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                CarritoMouseClicked(evt);
            }
        });

        PerfilUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N
        PerfilUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        PerfilUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                PerfilUsuarioMouseClicked(evt);
            }
        });

        Mercado.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Mercado.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Mercado.setText("Mercado");
        Mercado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Mercado.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                MercadoMouseClicked(evt);
            }
        });

        Icono1.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Icono1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Icono1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icono1.jpeg"))); // NOI18N
        Icono1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        Inicio.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Inicio.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Inicio.setText("Inicio");
        Inicio.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Inicio.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                InicioMouseClicked(evt);
            }
        });

        QuienesSomos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        QuienesSomos.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        QuienesSomos.setText("Quienes Somos?");
        QuienesSomos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        QuienesSomos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                QuienesSomosMouseClicked(evt);
            }
        });

        Foro1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        Foro1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Foro1.setText("Foro");
        Foro1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        Foro1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Foro1MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(Mercado, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(Foro1, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(QuienesSomos)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 252, Short.MAX_VALUE)
                .addComponent(Carrito, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(PerfilUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(Mercado, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Inicio, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(QuienesSomos, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Foro1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(PerfilUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(Carrito, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(Icono1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void InicioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_InicioMouseClicked
        // TODO add your handling code here:
        new Inicio().setVisible(true);
        Lugar.dispose();
    }//GEN-LAST:event_InicioMouseClicked

    private void MercadoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_MercadoMouseClicked
        try {
            // TODO add your handling code here:
            new Productos().setVisible(true);
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
        }
        
        Lugar.dispose();
    }//GEN-LAST:event_MercadoMouseClicked

    private void Foro1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Foro1MouseClicked
        try {
            new Foro().setVisible(true);
        } 
        catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, "Ocurrio un error en la operacion");
        }
        
        Lugar.dispose();
    }//GEN-LAST:event_Foro1MouseClicked

    private void QuienesSomosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_QuienesSomosMouseClicked
        new AcercaDeNosotros().setVisible(true);
        
        Lugar.dispose();
    }//GEN-LAST:event_QuienesSomosMouseClicked

    private void PerfilUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_PerfilUsuarioMouseClicked
        if(Usuario.UsuarioActual == null) {
            new IniciarSesion().setVisible(true);
        
        }
        else{
            new PerfilUsuario().setVisible(true);
        }
        
        Lugar.dispose();
    }//GEN-LAST:event_PerfilUsuarioMouseClicked

    private void CarritoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_CarritoMouseClicked
        if(Usuario.UsuarioActual == null) {
            new IniciarSesion().setVisible(true);
        
        }
        else{
            new Carro().setVisible(true);
        }
        
        Lugar.dispose();
    }//GEN-LAST:event_CarritoMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Carrito;
    private javax.swing.JLabel Foro1;
    private javax.swing.JLabel Icono1;
    private javax.swing.JLabel Inicio;
    private javax.swing.JLabel Mercado;
    private javax.swing.JLabel PerfilUsuario;
    private javax.swing.JLabel QuienesSomos;
    // End of variables declaration//GEN-END:variables
}

package xyz.opinionshop.Main.Interacciones;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author Family
 */
public class ComentariosPane extends javax.swing.JPanel {
    final int x = 40;
    int y = 10;
    int altura = 0;
    
    public ComentariosPane(ResultSet RS) throws SQLException {
        initComponents();
        
        this.setPreferredSize(new Dimension(980, altura));
        this.setBackground(Color.white);
        
        while(RS.next()) {
            JPanel UnComentario = new UnComentario(RS.getString("nombre_usuario"), RS.getString("comentario"), RS.getString("fecha"));
            UnComentario.setBounds(x, y, 900, 85);
            
            this.setPreferredSize(new Dimension(980, altura));
            
            altura += 95;
            
            y = y + 95;
        
            this.add(UnComentario);
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

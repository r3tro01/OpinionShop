package xyz.opinionshop.Main.Vendedor;

import java.awt.Color;
import java.awt.Dimension;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JPanel;

/**
 *
 * @author Family
 */
public class OpinionesPane extends javax.swing.JPanel {
    final int x = 10;
    int y = 10;
    int altura = 110;

    public OpinionesPane(ResultSet RS) throws SQLException {
        initComponents();
        
        this.setPreferredSize(new Dimension(980, altura));
        this.setBackground(Color.white);
        
        RS.afterLast();
        while(RS.previous()) {
            JPanel Opinion = new UnaOpinion(RS.getString("nombre_usuario"), RS.getString("opinion"), RS.getInt("estrellas"));
            Opinion.setBounds(x, y, 960, 100);
            
            this.setPreferredSize(new Dimension(980, altura));
            
            altura += 60;
            
            y = y + 110;
        
            this.add(Opinion);
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

package xyz.opinionshop.Main.Interacciones;

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
public class PostsPane extends javax.swing.JPanel {
    final int x = 180;
    int y = 10;
    int altura = 70;

    public PostsPane(JFrame lugar, ResultSet RS) throws SQLException {
        initComponents();
        
        this.setPreferredSize(new Dimension(980, altura));
        this.setBackground(Color.white);
        
        RS.afterLast();
        
        while(RS.previous()) {
            JPanel Post = new UnPost(lugar, RS.getInt("id"), RS.getString("titulo"));
            Post.setBounds(x, y, 620, 50);
            
            this.setPreferredSize(new Dimension(980, altura));
            
            altura += 60;
            
            y = y + 60;
        
            this.add(Post);
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
            .addGap(0, 500, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}

package xyz.opinionshop.Main.Vendedor;

/**
 *
 * @author Family
 */
public class UnaOpinion extends javax.swing.JPanel {

    public UnaOpinion(String nombre_usuario, String opinion, int estrellas) {
        initComponents();
        
        NombreUsuario.setText(nombre_usuario);
        Opinion.setText(opinion);
        
        switch(estrellas) {
            case 1:
                e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                break;
            case 2: 
                e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                break;
            case 3:
                e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                break;
            case 4:
                e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella.png")));
                break;
            case 5:
                e1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                e5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/estrella1.png")));
                break;
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        UsuarioImagen = new javax.swing.JLabel();
        NombreUsuario = new javax.swing.JLabel();
        e2 = new javax.swing.JLabel();
        e3 = new javax.swing.JLabel();
        e4 = new javax.swing.JLabel();
        e5 = new javax.swing.JLabel();
        e1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Opinion = new javax.swing.JTextArea();

        UsuarioImagen.setIcon(new javax.swing.ImageIcon(getClass().getResource("/usuario.png"))); // NOI18N

        Opinion.setEditable(false);
        Opinion.setColumns(20);
        Opinion.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        Opinion.setRows(5);
        jScrollPane1.setViewportView(Opinion);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(UsuarioImagen))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(NombreUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 480, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(e5, javax.swing.GroupLayout.DEFAULT_SIZE, 53, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(e2, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e3, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e4, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e5, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(e1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(UsuarioImagen)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NombreUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                .addContainerGap())
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel NombreUsuario;
    private javax.swing.JTextArea Opinion;
    private javax.swing.JLabel UsuarioImagen;
    private javax.swing.JLabel e1;
    private javax.swing.JLabel e2;
    private javax.swing.JLabel e3;
    private javax.swing.JLabel e4;
    private javax.swing.JLabel e5;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

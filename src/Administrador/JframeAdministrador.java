
package Administrador;

import PanelesViews.PanelListarFincas;
import PanelesViews.PanelListarUsuarios;
import PanelesViews.PanelRegistrarUsuario;
import PanelesViews.PanelRegistrarFinca;
import java.awt.BorderLayout;
import java.awt.Dimension;

public class JframeAdministrador extends javax.swing.JFrame {

    PanelRegistrarUsuario ventanaRegistroUsuario;
    PanelRegistrarFinca ventanaRegistrarFincas;
    
    
    public JframeAdministrador() {
        initComponents();
        setLocationRelativeTo(null);
        this.ventanaRegistroUsuario = new PanelRegistrarUsuario(this);
        this.ventanaRegistrarFincas = new PanelRegistrarFinca(this);
        
    }
    
    public void showInsertUsers(){
        this.panelEstatico.removeAll();
        this.panelEstatico.repaint();
        
        PanelRegistrarUsuario ventanaPanelRegistrarUsuario = new PanelRegistrarUsuario(this);
        ventanaPanelRegistrarUsuario.setSize(this.panelEstatico.getSize());
        panelEstatico.add(ventanaPanelRegistrarUsuario, BorderLayout.CENTER);
        
        panelEstatico.revalidate();
        panelEstatico.repaint();
    }
     public void showInsertFincas(){
        this.panelEstatico.removeAll();
        this.panelEstatico.repaint();
        
        PanelRegistrarFinca ventanaPanelRegistrarFincas = new PanelRegistrarFinca(this);
        ventanaPanelRegistrarFincas.setSize(this.panelEstatico.getSize());
        panelEstatico.add(ventanaPanelRegistrarFincas, BorderLayout.CENTER);
        
        panelEstatico.revalidate();
        panelEstatico.repaint();
    }
    
    public void showUsers(){
        this.panelEstatico.removeAll();
        this.panelEstatico.repaint();
        
        PanelListarUsuarios ventanaPanelListarUsuarios = new PanelListarUsuarios(this);
        ventanaPanelListarUsuarios.setSize(this.panelEstatico.getSize());
        ventanaPanelListarUsuarios.setLocation(0,0);
        
        panelEstatico.add(ventanaPanelListarUsuarios, BorderLayout.CENTER);
        panelEstatico.revalidate();
        panelEstatico.repaint();
    }
    public void showFincas(){
        this.panelEstatico.removeAll();
        this.panelEstatico.repaint();
        
        PanelListarFincas ventanaPanelListarFincas = new PanelListarFincas(this);
        ventanaPanelListarFincas.setSize(this.panelEstatico.getSize());
        ventanaPanelListarFincas.setLocation(0,0);
        panelEstatico.add(ventanaPanelListarFincas, BorderLayout.CENTER);
        panelEstatico.revalidate();
        panelEstatico.repaint();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PanelAbsolute = new javax.swing.JPanel();
        PanelLateral = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        nombreSuperAdmin = new javax.swing.JLabel();
        buttonAdmin = new javax.swing.JButton();
        buttonFincas = new javax.swing.JButton();
        buttonnCerrarSesion = new javax.swing.JButton();
        PanelSuperior = new javax.swing.JPanel();
        TituloPrincipal = new javax.swing.JLabel();
        panelEstatico = new javax.swing.JPanel();

        jPanel1.setBackground(new java.awt.Color(204, 204, 204));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 770, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        PanelAbsolute.setBackground(new java.awt.Color(255, 255, 255));

        PanelLateral.setBackground(new java.awt.Color(0, 153, 51));
        PanelLateral.setAlignmentX(3.0F);
        PanelLateral.setPreferredSize(new java.awt.Dimension(271, 0));

        Bienvenido.setFont(new java.awt.Font("HP Simplified Hans", 2, 24)); // NOI18N
        Bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenido.setText("BIENVENIDO");

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));
        jSeparator1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        nombreSuperAdmin.setFont(new java.awt.Font("HP Simplified Hans", 2, 18)); // NOI18N
        nombreSuperAdmin.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        nombreSuperAdmin.setText("Juan Monsalve");

        buttonAdmin.setBackground(new java.awt.Color(0, 102, 0));
        buttonAdmin.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        buttonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/admin1.png"))); // NOI18N
        buttonAdmin.setText("Usuarios");
        buttonAdmin.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonAdmin.setBorderPainted(false);
        buttonAdmin.setContentAreaFilled(false);
        buttonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdmin.setFocusPainted(false);
        buttonAdmin.setFocusable(false);
        buttonAdmin.setOpaque(true);
        buttonAdmin.setRolloverEnabled(false);
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });

        buttonFincas.setBackground(new java.awt.Color(0, 102, 0));
        buttonFincas.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        buttonFincas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/hogar (1).png"))); // NOI18N
        buttonFincas.setText("Fincas");
        buttonFincas.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonFincas.setBorderPainted(false);
        buttonFincas.setContentAreaFilled(false);
        buttonFincas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonFincas.setFocusPainted(false);
        buttonFincas.setFocusable(false);
        buttonFincas.setOpaque(true);
        buttonFincas.setRolloverEnabled(false);
        buttonFincas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFincasActionPerformed(evt);
            }
        });

        buttonnCerrarSesion.setBackground(new java.awt.Color(204, 0, 0));
        buttonnCerrarSesion.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N
        buttonnCerrarSesion.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resource/cerrar-sesion1.png"))); // NOI18N
        buttonnCerrarSesion.setText("Cerrar Sesion");
        buttonnCerrarSesion.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        buttonnCerrarSesion.setBorderPainted(false);
        buttonnCerrarSesion.setContentAreaFilled(false);
        buttonnCerrarSesion.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonnCerrarSesion.setFocusPainted(false);
        buttonnCerrarSesion.setFocusable(false);
        buttonnCerrarSesion.setOpaque(true);
        buttonnCerrarSesion.setRolloverEnabled(false);

        javax.swing.GroupLayout PanelLateralLayout = new javax.swing.GroupLayout(PanelLateral);
        PanelLateral.setLayout(PanelLateralLayout);
        PanelLateralLayout.setHorizontalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Bienvenido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFincas, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(nombreSuperAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addContainerGap())
        );
        PanelLateralLayout.setVerticalGroup(
            PanelLateralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelLateralLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addComponent(nombreSuperAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(buttonFincas, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 309, Short.MAX_VALUE)
                .addComponent(buttonnCerrarSesion, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        PanelSuperior.setBackground(new java.awt.Color(0, 153, 51));
        PanelSuperior.setPreferredSize(new java.awt.Dimension(770, 120));

        TituloPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        TituloPrincipal.setFont(new java.awt.Font("HP Simplified Hans", 1, 36)); // NOI18N
        TituloPrincipal.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        TituloPrincipal.setText("SUPER-ADMINISTRADOR");

        javax.swing.GroupLayout PanelSuperiorLayout = new javax.swing.GroupLayout(PanelSuperior);
        PanelSuperior.setLayout(PanelSuperiorLayout);
        PanelSuperiorLayout.setHorizontalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 770, Short.MAX_VALUE)
        );
        PanelSuperiorLayout.setVerticalGroup(
            PanelSuperiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(TituloPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, 120, Short.MAX_VALUE)
        );

        panelEstatico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEstaticoLayout = new javax.swing.GroupLayout(panelEstatico);
        panelEstatico.setLayout(panelEstaticoLayout);
        panelEstaticoLayout.setHorizontalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 763, Short.MAX_VALUE)
        );
        panelEstaticoLayout.setVerticalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 558, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout PanelAbsoluteLayout = new javax.swing.GroupLayout(PanelAbsolute);
        PanelAbsolute.setLayout(PanelAbsoluteLayout);
        PanelAbsoluteLayout.setHorizontalGroup(
            PanelAbsoluteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAbsoluteLayout.createSequentialGroup()
                .addGroup(PanelAbsoluteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelAbsoluteLayout.createSequentialGroup()
                        .addComponent(PanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(panelEstatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        PanelAbsoluteLayout.setVerticalGroup(
            PanelAbsoluteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelAbsoluteLayout.createSequentialGroup()
                .addComponent(PanelLateral, javax.swing.GroupLayout.PREFERRED_SIZE, 690, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(PanelAbsoluteLayout.createSequentialGroup()
                .addComponent(PanelSuperior, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(panelEstatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAbsolute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelAbsolute, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        showUsers();
        
    }//GEN-LAST:event_buttonAdminActionPerformed

    private void buttonFincasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFincasActionPerformed
        showFincas();
    }//GEN-LAST:event_buttonFincasActionPerformed

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
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JframeAdministrador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JframeAdministrador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JPanel PanelAbsolute;
    private javax.swing.JPanel PanelLateral;
    private javax.swing.JPanel PanelSuperior;
    private javax.swing.JLabel TituloPrincipal;
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonFincas;
    private javax.swing.JButton buttonnCerrarSesion;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel nombreSuperAdmin;
    private javax.swing.JPanel panelEstatico;
    // End of variables declaration//GEN-END:variables


}

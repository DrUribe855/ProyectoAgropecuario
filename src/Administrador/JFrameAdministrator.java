package Administrador;

import PanelesViews.PanelListarFincas;
import PanelesViews.PanelListarUsuarios;
import PanelesViews.PanelListarVacas;
import PanelesViews.PanelRegistrarUsuario;
import PanelesViews.PanelRegistrarFinca;
import PanelesViews.PanelRegistrarVaca;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import javax.swing.UIManager;

public class JFrameAdministrator extends javax.swing.JFrame {

    PanelRegistrarUsuario ventanaRegistroUsuario;
    PanelRegistrarFinca ventanaRegistrarFincas;
    PanelListarVacas ventanaListarVacas;
    
    
    public JFrameAdministrator() {
        initComponents();
        setLocationRelativeTo(null);
        this.ventanaRegistroUsuario = new PanelRegistrarUsuario(this);
        this.ventanaRegistrarFincas = new PanelRegistrarFinca(this);
        this.ventanaListarVacas = new PanelListarVacas(this);
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
    
    public void showInsertCows(){
        this.panelEstatico.removeAll();
        this.panelEstatico.repaint();
        
        PanelRegistrarVaca ventanaPanelRegistrarVacas = new PanelRegistrarVaca(this);
        ventanaPanelRegistrarVacas.setSize(this.panelEstatico.getSize());
        panelEstatico.add(ventanaPanelRegistrarVacas, BorderLayout.CENTER);
        
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
    
    public void showVacas(){
        this.panelEstatico.removeAll();
        this.panelEstatico.repaint();
        
        PanelListarVacas ventanaListarVacas = new PanelListarVacas(this);
        ventanaListarVacas.setSize(this.panelEstatico.getSize());
        ventanaListarVacas.setLocation(0,0);
        panelEstatico.add(ventanaListarVacas, BorderLayout.CENTER);
        panelEstatico.revalidate();
        panelEstatico.repaint();
    }

     
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        menu = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        buttonAdmin = new javax.swing.JButton();
        buttonFincas = new javax.swing.JButton();
        panelEstatico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(0, 143, 111));
        menu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jButton1.setBackground(new java.awt.Color(28, 163, 129));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/cows-icon.png"))); // NOI18N
        jButton1.setText("Listado de vacas");
        jButton1.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton1.setBorderPainted(false);
        jButton1.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton1.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton1.setIconTextGap(12);
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        menu.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 240, 270, 53));

        jButton2.setBackground(new java.awt.Color(28, 163, 129));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jButton2.setForeground(new java.awt.Color(255, 255, 255));
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/log-out-icon.png"))); // NOI18N
        jButton2.setText("Cerrar sesión");
        jButton2.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        jButton2.setBorderPainted(false);
        jButton2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jButton2.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        jButton2.setIconTextGap(12);
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });
        menu.add(jButton2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 460, 270, 53));

        buttonAdmin.setBackground(new java.awt.Color(28, 163, 129));
        buttonAdmin.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonAdmin.setForeground(new java.awt.Color(255, 255, 255));
        buttonAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/users-icon.png"))); // NOI18N
        buttonAdmin.setText("Listado de empleados");
        buttonAdmin.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        buttonAdmin.setBorderPainted(false);
        buttonAdmin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonAdmin.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonAdmin.setIconTextGap(12);
        buttonAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdminActionPerformed(evt);
            }
        });
        menu.add(buttonAdmin, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 140, 270, 53));

        buttonFincas.setBackground(new java.awt.Color(28, 163, 129));
        buttonFincas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        buttonFincas.setForeground(new java.awt.Color(255, 255, 255));
        buttonFincas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/farms-icon.png"))); // NOI18N
        buttonFincas.setText("Listado de fincas");
        buttonFincas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        buttonFincas.setBorderPainted(false);
        buttonFincas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        buttonFincas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        buttonFincas.setIconTextGap(12);
        buttonFincas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonFincasActionPerformed(evt);
            }
        });
        menu.add(buttonFincas, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 190, 270, 53));

        panelEstatico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEstaticoLayout = new javax.swing.GroupLayout(panelEstatico);
        panelEstatico.setLayout(panelEstaticoLayout);
        panelEstaticoLayout.setHorizontalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        panelEstaticoLayout.setVerticalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelEstatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, 562, Short.MAX_VALUE)
            .addComponent(panelEstatico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.showVacas();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdminActionPerformed
        showUsers();
    }//GEN-LAST:event_buttonAdminActionPerformed

    private void buttonFincasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonFincasActionPerformed
        this.showFincas();
    }//GEN-LAST:event_buttonFincasActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameAdministrator().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonFincas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelEstatico;
    // End of variables declaration//GEN-END:variables
}

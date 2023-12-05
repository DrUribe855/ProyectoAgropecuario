package Administrador;

import Login.Login;
import PanelesViews.PanelBienvenida;
import PanelesViews.PanelListarFincas;
import PanelesViews.PanelListarUsuarios;
import PanelesViews.PanelListarVacas;
import PanelesViews.PanelRegistrarUsuario;
import PanelesViews.PanelRegistrarVaca;
import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import javax.swing.UIManager;

public class JFrameAdministrator extends javax.swing.JFrame {

    PanelRegistrarUsuario ventanaRegistroUsuario;
    PanelBienvenida panelBienvenida;
    
    PanelListarVacas ventanaListarVacas;
    
    String nombre;
    //String id;
    
    public JFrameAdministrator(String nombre) {
        this.nombre = nombre;
        //this.id = id;
        initComponents();
        initAlternComponents();
        setLocationRelativeTo(null);
        this.panelBienvenida = new PanelBienvenida();
        this.ventanaRegistroUsuario = new PanelRegistrarUsuario(this);
        this.ventanaListarVacas = new PanelListarVacas(this);
    }
    public JFrameAdministrator() {
        initComponents();
        setLocationRelativeTo(null);
        this.ventanaRegistroUsuario = new PanelRegistrarUsuario(this);
        this.ventanaListarVacas = new PanelListarVacas(this);
    }
    
    public void initAlternComponents(){
        this.labelNombre.setText("¡Bienvenido " + this.nombre + "!");
        PanelBienvenida panelBienvenida = new PanelBienvenida();
        panelBienvenida.setSize(this.panelEstatico.getSize());
        panelEstatico.add(panelBienvenida);
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
    
    /*public void showInsertFincas(){
       this.panelEstatico.removeAll();
       this.panelEstatico.repaint();
        
       PanelRegistrarFinca ventanaPanelRegistrarFincas = new PanelRegistrarFinca(this);
       ventanaPanelRegistrarFincas.setSize(this.panelEstatico.getSize());
       panelEstatico.add(ventanaPanelRegistrarFincas, BorderLayout.CENTER);
        
       panelEstatico.revalidate();
       panelEstatico.repaint();
    }*/
    
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
        labelNombre = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        panelEstatico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        menu.setBackground(new java.awt.Color(0, 143, 111));

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

        labelNombre.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        labelNombre.setForeground(new java.awt.Color(255, 255, 255));
        labelNombre.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jSeparator1.setForeground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonFincas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(menuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(labelNombre, javax.swing.GroupLayout.DEFAULT_SIZE, 253, Short.MAX_VALUE)
                    .addComponent(jSeparator1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(labelNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51)
                .addGroup(menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(buttonAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(100, 100, 100)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(menuLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(buttonFincas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 186, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18))
        );

        panelEstatico.setBackground(new java.awt.Color(255, 255, 255));

        javax.swing.GroupLayout panelEstaticoLayout = new javax.swing.GroupLayout(panelEstatico);
        panelEstatico.setLayout(panelEstaticoLayout);
        panelEstaticoLayout.setHorizontalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 790, Short.MAX_VALUE)
        );
        panelEstaticoLayout.setVerticalGroup(
            panelEstaticoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 550, Short.MAX_VALUE)
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
            .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(panelEstatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        dispose();
        Login login = new Login();
        login.setVisible(true);
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
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdmin;
    private javax.swing.JButton buttonFincas;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel labelNombre;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelEstatico;
    // End of variables declaration//GEN-END:variables
}
                   

package PanelesViews;

import Clases.Conexion;
import Clases.Usuario;
import java.util.HashMap;
import java.util.Map;

public class JframeModificarUsuario extends javax.swing.JFrame {
    
    Conexion conexion;
    PanelListarUsuarios ventana;
    String documento;
    String nombres;
    String apellidos;
    String telefono;
    String rol;
    String email;
    
    public JframeModificarUsuario(PanelListarUsuarios ventana,String documento, String nombres, String apellidos, String telefono, String rol, String email) {
        this.ventana = ventana;
        this.documento = documento;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.telefono= telefono;
        this.rol= rol;
        this.email = email;
        this.conexion = new Conexion();
        initComponents();
        initAlternComponents();
        fillInputsUsers();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }
    
    public void fillInputsUsers(){
        campoDocumento.setText(this.documento);
        campoNombres.setText(this.nombres);
        campoApellidos.setText(this.apellidos);
        campoTelefono.setText(this.telefono);
        campoRol.setText(this.rol);
        campoEmail.setText(this.email);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        campoTelefono = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        btnModificar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoDocumento = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoNombres = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoApellidos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoRol = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        campoTelefono.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N

        jLabel6.setBackground(new java.awt.Color(255, 255, 255));
        jLabel6.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 0, 0));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("E-mail");

        campoEmail.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N

        jLabel8.setBackground(new java.awt.Color(255, 255, 255));
        jLabel8.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(0, 0, 0));
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Rol");

        btnCancelar.setBackground(new java.awt.Color(204, 0, 0));
        btnCancelar.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        btnModificar.setBackground(new java.awt.Color(0, 153, 0));
        btnModificar.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        btnModificar.setText("Modificar");
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("HP Simplified Hans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Usuario");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Documento");

        campoDocumento.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Nombre");

        campoNombres.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Apellidos");

        campoApellidos.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Telefono");

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoDocumento)
                            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoApellidos)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(97, 97, 97)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoNombres)
                            .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 155, Short.MAX_VALUE)
                            .addComponent(campoTelefono)))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addGap(134, 134, 134)
                        .addComponent(btnCancelar)
                        .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(66, 66, 66)
                                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoRol)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(panelPrincipalLayout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(btnModificar)))))
                .addGap(61, 61, 61))
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoDocumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoNombres, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoTelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoRol, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(panelPrincipalLayout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoApellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(51, 51, 51)
                .addGroup(panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCancelar)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed

        String documento = campoDocumento.getText();
        String nombres = campoNombres.getText();
        String apellidos = campoApellidos.getText();
        String telefono = campoTelefono.getText();
        String rol = campoRol.getText();
        String email = campoEmail.getText();
        

        if (!documento.equals("") && !nombres.equals("") && !apellidos.equals("") && !telefono.equals("") && !rol.equals("") && !email.equals("")  ) {
           
            // POST con Datos
            Map<String, String> updateData = new HashMap<>();
            updateData.put("documento", documento);
            updateData.put("nombres", nombres);
            updateData.put("apellidos", apellidos);
            updateData.put("telefono", telefono);
            updateData.put("rol", rol);
            updateData.put("email", email);
            System.out.println("Consumo UPDATE: " + conexion.consumoPOST("http://localhost/APIenPHPVacas/UpdateUsuario.php", updateData));
            System.out.println("Usuario Modificado");
            this.ventana.fillData();
            dispose();
            //Alerta alert = new Alerta("Persona Creada","La persona fue creada correctamente","success");

        }else{
            //Alerta alert = new Alerta("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            //validarTodosInputs();
        }
    }//GEN-LAST:event_btnModificarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnModificar;
    private javax.swing.JTextField campoApellidos;
    private javax.swing.JTextField campoDocumento;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNombres;
    private javax.swing.JTextField campoRol;
    private javax.swing.JTextField campoTelefono;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}

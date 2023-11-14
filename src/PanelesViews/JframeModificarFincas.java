
package PanelesViews;

import Clases.Conexion;
import Clases.Finca;
import java.util.HashMap;
import java.util.Map;

public class JframeModificarFincas extends javax.swing.JFrame {
    Conexion conexion;
    PanelListarFincas ventana;
    Integer id_finca;
    String nombre_finca;
    
    public JframeModificarFincas(PanelListarFincas ventana, Integer id_finca, String nombre_finca) {
        this.id_finca = id_finca;
        this.ventana = ventana;
        this.nombre_finca = nombre_finca;
        this.conexion = new Conexion();
        initComponents();
        initAlternComponents();
        fillInputsUsers();
    }
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }
    
    public void fillInputsUsers(){
        campoIdFinca.setText(this.id_finca.toString());
        campoNombreFinca.setText(this.nombre_finca);
        
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        campoNombreFinca = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        buttonModificarFinca = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        campoIdFinca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));
        jPanel1.setForeground(new java.awt.Color(0, 0, 0));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("HP Simplified Hans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Modificar Finca");

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Nombre");

        campoNombreFinca.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N
        campoNombreFinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoNombreFincaActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(204, 0, 0));
        jButton1.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jButton1.setText("Volver");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonModificarFinca.setBackground(new java.awt.Color(0, 153, 0));
        buttonModificarFinca.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        buttonModificarFinca.setText("Modificar");
        buttonModificarFinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonModificarFincaActionPerformed(evt);
            }
        });

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Id Finca");

        campoIdFinca.setEditable(false);
        campoIdFinca.setFont(new java.awt.Font("HP Simplified Hans", 0, 18)); // NOI18N
        campoIdFinca.setEnabled(false);
        campoIdFinca.setFocusable(false);
        campoIdFinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoIdFincaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton1)
                            .addComponent(campoIdFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(campoNombreFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 178, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(28, 28, 28))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(81, 81, 81)
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addComponent(buttonModificarFinca)))
                        .addContainerGap(22, Short.MAX_VALUE))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoNombreFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIdFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(68, 68, 68)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(buttonModificarFinca))
                .addContainerGap(95, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonModificarFincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonModificarFincaActionPerformed
        
        String id_finca = campoIdFinca.getText();
        String nombre_finca = campoNombreFinca.getText();
        
        

        if (!nombre_finca.equals("") && !id_finca.equals("")) {
           
            // POST con Datos
            Map<String, String> updateData = new HashMap<>();
            updateData.put("id_finca", id_finca);
            updateData.put("nombre_finca", nombre_finca);
            System.out.println("Consumo UPDATE: " + conexion.consumoPOST("http://localhost/APIenPHPVacas/UpdateFinca.php", updateData));
            System.out.println("Finca Modificada");
            this.ventana.fillData();
            dispose();
            //Alerta alert = new Alerta("Persona Creada","La persona fue creada correctamente","success");

        }else{
            //Alerta alert = new Alerta("Datos Inválidos", "Todos los campos son obligatorios.", "error");
            //validarTodosInputs();
        }
    }//GEN-LAST:event_buttonModificarFincaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void campoNombreFincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoNombreFincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoNombreFincaActionPerformed

    private void campoIdFincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoIdFincaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoIdFincaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonModificarFinca;
    private javax.swing.JTextField campoIdFinca;
    private javax.swing.JTextField campoNombreFinca;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

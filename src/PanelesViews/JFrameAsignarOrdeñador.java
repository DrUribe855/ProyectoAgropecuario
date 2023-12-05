package PanelesViews;

import Clases.Alerta;
import Clases.Conexion;
import Clases.Finca;
import Clases.Usuario;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class JFrameAsignarOrdeñador extends javax.swing.JFrame {

    int id_finca;
    Conexion conexion;
    Gson gson;
    public JFrameAsignarOrdeñador(int id_finca) {
        this.id_finca = id_finca;
        this.conexion = new Conexion();
        this.gson = new Gson();
        initComponents();
        initAlternComponents();
        mostrarOrdeniadores();
        initAlternStyles();
    }
    
    public void initAlternStyles(){
        selectOrdeniadores.putClientProperty( "JComponent.roundRect", true );
        this.btnVolver.putClientProperty( "JButton.buttonType", "roundRect" );
        this.btnRegistrar.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    
    public void mostrarOrdeniadores(){
        String textoJson = conexion.consumoGET("http://localhost/APIenPHPVacas/ObtenerUsuarios.php");
        System.out.print(textoJson);
        JsonObject jsonobject = JsonParser.parseString(textoJson).getAsJsonObject();
        JsonArray registros  = jsonobject.getAsJsonArray("registros");
        List<Usuario> usuarios = new ArrayList<>();
        
        for (JsonElement elemento : registros) {
            JsonObject registro = elemento.getAsJsonObject();
            String documento = registro.get("documento").getAsString();
            String nombres = registro.get("nombres").getAsString();
            String rol = registro.get("rol").getAsString();
            this.selectOrdeniadores.addItem(documento + " - " + nombres + " - " + rol);
            
        }
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        this.inputIdFinca.setText(Integer.toString(this.id_finca));
    }
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        labelAsignacionUsuario = new javax.swing.JLabel();
        inputIdFinca = new LIB.FSTexFieldMD();
        selectOrdeniadores = new javax.swing.JComboBox<>();
        btnVolver = new javax.swing.JButton();
        btnRegistrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        labelAsignacionUsuario.setBackground(new java.awt.Color(0, 143, 111));
        labelAsignacionUsuario.setFont(new java.awt.Font("Segoe UI", 3, 24)); // NOI18N
        labelAsignacionUsuario.setForeground(new java.awt.Color(255, 255, 255));
        labelAsignacionUsuario.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        labelAsignacionUsuario.setText("Asignación de ordeñador");
        labelAsignacionUsuario.setOpaque(true);

        inputIdFinca.setBackground(new java.awt.Color(255, 255, 255));
        inputIdFinca.setForeground(new java.awt.Color(0, 0, 0));
        inputIdFinca.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        inputIdFinca.setFocusable(false);
        inputIdFinca.setPlaceholder("");

        selectOrdeniadores.setBackground(new java.awt.Color(255, 255, 255));

        btnVolver.setBackground(new java.awt.Color(255, 51, 51));
        btnVolver.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });

        btnRegistrar.setBackground(new java.awt.Color(0, 204, 0));
        btnRegistrar.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrar.setText("Asignar");
        btnRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(labelAsignacionUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(btnVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(inputIdFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 89, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(selectOrdeniadores, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 222, Short.MAX_VALUE))
                .addGap(41, 41, 41))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(labelAsignacionUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(inputIdFinca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(selectOrdeniadores, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 76, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 43, Short.MAX_VALUE)
                    .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(42, 42, 42))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        dispose();
    }//GEN-LAST:event_btnVolverActionPerformed

    private void btnRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarActionPerformed
        String id = inputIdFinca.getText();
        String datosOrdeniador = (String) selectOrdeniadores.getSelectedItem();
        String [] datos = datosOrdeniador.split("-");
        String documento = datos[0].trim();
        
        System.out.println(documento);
        if(!documento.equals("")){
            Map<String, String> getData = new HashMap<>();
            getData.put("documento", documento);
            
            String textoJson = conexion.consumoGET("http://localhost/ApienPHPVacas/getUsuario.php", getData);
            
            if(!textoJson.equals("[]")){
                JsonObject persona = gson.fromJson(textoJson, JsonObject.class);
                System.out.println("json object " + persona);
                String idUsuario = persona.get("id_usuario").getAsString();
                System.out.println(idUsuario);
                
                if(!idUsuario.equals("") && !id.equals("")){
                    Map<String, String> insertData = new HashMap<>();
                    insertData.put("id_usuario", idUsuario);
                    insertData.put("id_finca", id);
                    System.out.println("Consumo INSERT: " + conexion.consumoPOST("http://localhost/APIenPHPVacas/insertOrdeniadoresFinca.php", insertData));
                    Alerta alert = new Alerta("Usuario asignado","El usuario fue asignado correctamente","success");
                }
            }
        }
    }//GEN-LAST:event_btnRegistrarActionPerformed

    
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
            java.util.logging.Logger.getLogger(JFrameAsignarOrdeñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameAsignarOrdeñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameAsignarOrdeñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameAsignarOrdeñador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnRegistrar;
    private javax.swing.JButton btnVolver;
    private LIB.FSTexFieldMD inputIdFinca;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel labelAsignacionUsuario;
    private javax.swing.JComboBox<String> selectOrdeniadores;
    // End of variables declaration//GEN-END:variables
}

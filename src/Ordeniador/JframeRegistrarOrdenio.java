
package Ordeniador;

import Administrador.JFrameAdministrator;
import Clases.Alerta;
import Clases.Conexion;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.TimeZone;
import javax.swing.ImageIcon;

public class JframeRegistrarOrdenio extends javax.swing.JFrame {

    Conexion conexion;
    JframeOrdeniador ventana;
    String id_ordeniador;
    String id_vaca;
    String estado;
    
    public JframeRegistrarOrdenio(JframeOrdeniador ventana, String id_usuario, String id_vaca, String estado) {
        this.conexion = new Conexion();
        this.ventana = ventana;
        this.id_ordeniador = id_usuario;
        this.id_vaca = id_vaca;
        this.estado = estado;
        
        initComponents();
        initAlternComponents();
        fillInputs();
    }
    
   
    public void initAlternComponents(){
        setLocationRelativeTo(null);
        setIconImage(new ImageIcon(getClass().getResource("/Img/logo.jpeg")).getImage());
    }
    public void fillInputs(){
        campoIdVaca.setText(id_vaca);
        campoIdVaca.setEnabled(false);
        
        campoOrdeniador.setText(id_ordeniador);
        campoOrdeniador.setEnabled(false);
        System.out.println(estado);
        
        // Obtener la fecha y hora actual
        Date fechaHoraActual = new Date();
        
        // Crear un formato para la zona horaria de Colombia y el formato de 12 horas
        SimpleDateFormat formatoColombia = new SimpleDateFormat("yyyy/MM/dd hh:mm:ss a");
        formatoColombia.setTimeZone(TimeZone.getTimeZone("America/Bogota"));

        // Formatear la fecha y hora actual según la zona horaria de Colombia y el formato de 12 horas
        String fechaHoraFormateada = formatoColombia.format(fechaHoraActual);

        // Asignar la fecha y hora formateada al JTextField
        campoFecha.setText(fechaHoraFormateada);

        // Deshabilitar el JTextField
        campoFecha.setEnabled(false);
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        buttonVolver = new javax.swing.JButton();
        buttonRegistrar = new javax.swing.JButton();
        campoIdVaca = new LIB.FSTexFieldMD();
        campoOrdeniador = new LIB.FSTexFieldMD();
        campoLitros = new LIB.FSTexFieldMD();
        campoFecha = new LIB.FSTexFieldMD();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel2.setBackground(new java.awt.Color(255, 255, 255));
        jLabel2.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(0, 0, 0));
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("Identificador Vaca");

        jLabel3.setBackground(new java.awt.Color(255, 255, 255));
        jLabel3.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 0, 0));
        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel3.setText("Ordeñador");

        jLabel4.setBackground(new java.awt.Color(255, 255, 255));
        jLabel4.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 0, 0));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Cantidad Litros");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(0, 0, 0));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("Fecha");

        buttonVolver.setBackground(new java.awt.Color(204, 0, 0));
        buttonVolver.setFont(new java.awt.Font("HP Simplified Hans", 3, 18)); // NOI18N
        buttonVolver.setForeground(new java.awt.Color(255, 255, 255));
        buttonVolver.setText("Volver");
        buttonVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonVolverActionPerformed(evt);
            }
        });

        buttonRegistrar.setBackground(new java.awt.Color(0, 153, 0));
        buttonRegistrar.setFont(new java.awt.Font("HP Simplified Hans", 3, 18)); // NOI18N
        buttonRegistrar.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistrar.setText("Registrar");
        buttonRegistrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarActionPerformed(evt);
            }
        });

        campoIdVaca.setBackground(new java.awt.Color(255, 255, 255));
        campoIdVaca.setForeground(new java.awt.Color(0, 0, 0));
        campoIdVaca.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        campoIdVaca.setPlaceholder("");

        campoOrdeniador.setBackground(new java.awt.Color(255, 255, 255));
        campoOrdeniador.setForeground(new java.awt.Color(0, 0, 0));
        campoOrdeniador.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        campoOrdeniador.setPlaceholder("");

        campoLitros.setBackground(new java.awt.Color(255, 255, 255));
        campoLitros.setForeground(new java.awt.Color(0, 0, 0));
        campoLitros.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        campoLitros.setPlaceholder("");

        campoFecha.setBackground(new java.awt.Color(255, 255, 255));
        campoFecha.setForeground(new java.awt.Color(0, 0, 0));
        campoFecha.setBordeColorFocus(new java.awt.Color(0, 0, 0));
        campoFecha.setPlaceholder("");

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("HP Simplified Hans", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Registrar Ordeño");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(77, 77, 77)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(124, 124, 124)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(72, 72, 72))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(75, 75, 75)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(125, 125, 125)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(73, 73, 73))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoIdVaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoFecha, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoOrdeniador, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(buttonVolver, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 162, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(65, 65, 65))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoIdVaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoOrdeniador, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoLitros, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoFecha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(55, 55, 55)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonVolver, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE)
                    .addComponent(buttonRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 39, Short.MAX_VALUE))
                .addContainerGap(22, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarActionPerformed
        String id_vaca = campoIdVaca.getText();
        String ordeniador = campoOrdeniador.getText();
        String litros = campoLitros.getText();
        String fecha = campoFecha.getText();

        if (!id_vaca.equals("") && !ordeniador.equals("") && !litros.equals("") && !fecha.equals("") ) {
            
            //Primero se hace el registro de produccion de la vaca
            Map<String, String> insertData = new HashMap<>();
            insertData.put("id_vaca", id_vaca);
            insertData.put("id_ordeniador", ordeniador);
            insertData.put("litros", litros);
            insertData.put("fecha", fecha);
            System.out.println("Consumo INSERT: " + conexion.consumoPOST("http://localhost/APIenPHPVacas/insertProcesoOrdenio.php", insertData));
            
            //Segundo, el estado de la vaca pasa a ordeñada
            Map<String, String> updateData = new HashMap<>();
            updateData.put("id_vaca", id_vaca);
            updateData.put("estado", estado);
            System.out.println("Consumo UPDATE: " + conexion.consumoPOST("http://localhost/APIenPHPVacas/UpdateEstadoVaca.php", updateData));
            

            System.out.println("Ordeño registrado");
            // hace que recargue el panel de listar
            JframeOrdeniador ventana2 = new JframeOrdeniador();
            setVisible(false);
            ventana.showVacasOrdeniadores();
            Alerta alert = new Alerta("Ordeño Registrado","El ordeño fue registrado correctamente","success");
        }else{
            Alerta alert = new Alerta("Datos Vacios", "Todos los campos son obligatorios.", "warning");
        }
    }//GEN-LAST:event_buttonRegistrarActionPerformed

    private void buttonVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonVolverActionPerformed
        dispose();
    }//GEN-LAST:event_buttonVolverActionPerformed

    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonRegistrar;
    private javax.swing.JButton buttonVolver;
    private LIB.FSTexFieldMD campoFecha;
    private LIB.FSTexFieldMD campoIdVaca;
    private LIB.FSTexFieldMD campoLitros;
    private LIB.FSTexFieldMD campoOrdeniador;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}

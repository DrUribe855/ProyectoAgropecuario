 package PanelesViews;

import Administrador.JFrameAdministrator;
import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Conexion;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;
import Clases.Vaca;
import com.google.gson.JsonElement;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;


public class PanelListarVacas extends javax.swing.JPanel {
    
    public Conexion conexion;
    public JFrameAdministrator ventanaAdministrador;
    DefaultTableModel modelo;
    public PanelListarVacas(JFrameAdministrator administrador) {
        this.conexion = new Conexion();
        this.ventanaAdministrador = administrador;
        initComponents();
        initAlternComponents();
        initAlternStyles();
        fillData();
    }

    public void initAlternComponents(){
        modelo = (DefaultTableModel)TableVacas.getModel();
        this.TableVacas.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        this.TableVacas.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox()));
    }
    
    public void initAlternStyles(){
        this.buttonRegistrarVacas.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    
    public void fillData(){
        String textoJson = conexion.consumoGET("http://localhost/APIenPHPVacas/JoinListarVacas.php");
        System.out.println(textoJson);
        JsonObject JsonObject = JsonParser.parseString(textoJson).getAsJsonObject();
        JsonArray registros = JsonObject.getAsJsonArray("registros");
        List<Vaca> vacas = new ArrayList<>();
        
        for(JsonElement elemento : registros){
            JsonObject registro = elemento.getAsJsonObject();
            Integer id_vaca = registro.get("id_vaca").getAsInt();
            String nombre_finca = registro.get("nombre_finca").getAsString();
            String alias = registro.get("alias").getAsString();
            String descripcion = registro.get("descripcion").getAsString();
            String estado = registro.get("estado").getAsString();
            Vaca vaca = new Vaca(id_vaca, nombre_finca, alias, descripcion, estado);
            vacas.add(vaca);
        }
        
        modelo.setRowCount(0);
        for(Vaca vaca: vacas){
            JButton btn_editar = new JButton("Modificar");
            
             btn_editar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateVaca(vaca);
                    System.out.println("Modificar");
                }
            });
             
            Object[] filas = new Object[6];
            filas[0] = vaca.getId_vaca();
            filas[1] = vaca.getNombre_finca();
            filas[2] = vaca.getAlias();
            filas[3] = vaca.getDescripcion();
            filas[4] = vaca.getEstado();
            filas[5] = btn_editar;  
            
            modelo.addRow(filas);         
        }
    }
    
    public void updateVaca(Vaca vaca){
        Integer id_vaca = vaca.getId_vaca();
        String nombre_finca = vaca.getNombre_finca();
        String alias = vaca.getAlias();
        String descripcion = vaca.getDescripcion();
        String estado = vaca.getEstado();
        
        JframeModificarVacas ventanaUpdate = new JframeModificarVacas(this.ventanaAdministrador, id_vaca, nombre_finca, descripcion, alias, estado);
        ventanaUpdate.setVisible(true);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTableVacas = new javax.swing.JPanel();
        PanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableVacas = new javax.swing.JTable();
        buttonRegistrarVacas = new javax.swing.JButton();

        PanelTableVacas.setBackground(new java.awt.Color(255, 255, 255));

        PanelTable.setBackground(new java.awt.Color(255, 255, 255));

        TableVacas.setBackground(new java.awt.Color(255, 255, 255));
        TableVacas.setForeground(new java.awt.Color(0, 0, 0));
        TableVacas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador Vaca", "Finca", "Alias", "Descripcion", "Estado", "Modificar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableVacas);

        buttonRegistrarVacas.setBackground(new java.awt.Color(0, 143, 111));
        buttonRegistrarVacas.setFont(new java.awt.Font("HP Simplified Hans", 3, 18)); // NOI18N
        buttonRegistrarVacas.setForeground(new java.awt.Color(255, 255, 255));
        buttonRegistrarVacas.setText("Registrar Vacas");
        buttonRegistrarVacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRegistrarVacasActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTableLayout = new javax.swing.GroupLayout(PanelTable);
        PanelTable.setLayout(PanelTableLayout);
        PanelTableLayout.setHorizontalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(buttonRegistrarVacas)
                .addContainerGap())
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 760, Short.MAX_VALUE)
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableLayout.createSequentialGroup()
                .addContainerGap(12, Short.MAX_VALUE)
                .addComponent(buttonRegistrarVacas)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 423, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout PanelTableVacasLayout = new javax.swing.GroupLayout(PanelTableVacas);
        PanelTableVacas.setLayout(PanelTableVacasLayout);
        PanelTableVacasLayout.setHorizontalGroup(
            PanelTableVacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableVacasLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(PanelTable, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        PanelTableVacasLayout.setVerticalGroup(
            PanelTableVacasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 772, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelTableVacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(PanelTableVacas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRegistrarVacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRegistrarVacasActionPerformed
        this.ventanaAdministrador.showInsertCows();
    }//GEN-LAST:event_buttonRegistrarVacasActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTable;
    private javax.swing.JPanel PanelTableVacas;
    private javax.swing.JTable TableVacas;
    private javax.swing.JButton buttonRegistrarVacas;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

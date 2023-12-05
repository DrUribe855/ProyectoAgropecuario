
package PanelesViews;

import Administrador.JFrameAdministrator;
import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Conexion;
import Clases.Finca;
import Clases.Usuario;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


public class PanelListarFincas extends javax.swing.JPanel {
    
    Conexion conexion;
    DefaultTableModel modelo;
    private JFrameAdministrator ventanaAdministrador;
    
    public PanelListarFincas(JFrameAdministrator administrador) {
        this.conexion = new Conexion();
        this.ventanaAdministrador = administrador;
        initComponents();
        initAlternComponents();
        initAlternStyles();
        fillData();
    }
    public void initAlternComponents(){
        modelo = (DefaultTableModel)TableFincas.getModel();
        this.TableFincas.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        this.TableFincas.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox()));

        this.TableFincas.getColumn("Asignar").setCellRenderer(new ButtonRenderer());
        this.TableFincas.getColumn("Asignar").setCellEditor(new ButtonEditor(new JCheckBox()));
    }
    
    public void initAlternStyles(){
        btnRegistrarFinca.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    
    public void fillData(){
        
        String textoJson = conexion.consumoGET("http://localhost/APIenPHPVacas/ObtenerFincas.php");
        System.out.println(textoJson);
        JsonObject jsonobject = JsonParser.parseString(textoJson).getAsJsonObject();
        JsonArray registros  = jsonobject.getAsJsonArray("registros");
        List<Finca> fincas = new ArrayList<>();
        
        for (JsonElement elemento : registros) {
            JsonObject registro = elemento.getAsJsonObject();
            Integer id_finca = registro.get("id_finca").getAsInt();
            String nombre_finca = registro.get("nombre_finca").getAsString();
            Finca finca = new Finca(id_finca, nombre_finca);
            
            fincas.add(finca);
        } 
        modelo.setRowCount(0);
        for (Finca finca : fincas) {
            
            JButton btn_editar = new JButton("Modificar");
            JButton btn_eliminar = new JButton("Asignar");
            
            // Agregar un ActionListener al botón "Editar"
            btn_editar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateFinca(finca);
                    System.out.println("Modificar");
                }
            });

            // Agregar un ActionListener al botón "Eliminar"
            btn_eliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    asignarFinca(finca);
                    System.out.println("Asignar");
                }
            });
            
            Object[] filas = new Object[4];
            filas[0] = finca.getId_finca();
            filas[1] = finca.getNombre_finca();
            filas[2] = btn_editar;
            filas[3] = btn_eliminar;
            
            modelo.addRow(filas);
        }
    }
    
    public void updateFinca(Finca finca){
        
        Integer id_finca = finca.getId_finca();
        String nombre_finca = finca.getNombre_finca();
        
        System.out.println(id_finca);
        
        JframeModificarFincas ventanaUpdate = new JframeModificarFincas(this,id_finca, nombre_finca);
        ventanaUpdate.setVisible(true);
    }
    
    public void asignarFinca(Finca finca){
        int id_finca = finca.getId_finca();
        JFrameAsignarOrdeñador ventanaAsignacion = new JFrameAsignarOrdeñador(id_finca);
        ventanaAsignacion.setVisible(true);
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTableFincas = new javax.swing.JPanel();
        PanelTable = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableFincas = new javax.swing.JTable();
        btnRegistrarFinca = new javax.swing.JButton();

        PanelTable.setBackground(new java.awt.Color(255, 255, 255));

        TableFincas.setBackground(new java.awt.Color(255, 255, 255));
        TableFincas.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        TableFincas.setForeground(new java.awt.Color(0, 0, 0));
        TableFincas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Identificador Finca", "Nombre Finca", "Modificar", "Asignar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableFincas);

        btnRegistrarFinca.setBackground(new java.awt.Color(0, 143, 111));
        btnRegistrarFinca.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegistrarFinca.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarFinca.setText("Registrar finca");
        btnRegistrarFinca.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarFincaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTableLayout = new javax.swing.GroupLayout(PanelTable);
        PanelTable.setLayout(PanelTableLayout);
        PanelTableLayout.setHorizontalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 789, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20))
        );
        PanelTableLayout.setVerticalGroup(
            PanelTableLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableLayout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnRegistrarFinca, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout PanelTableFincasLayout = new javax.swing.GroupLayout(PanelTableFincas);
        PanelTableFincas.setLayout(PanelTableFincasLayout);
        PanelTableFincasLayout.setHorizontalGroup(
            PanelTableFincasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTable, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        PanelTableFincasLayout.setVerticalGroup(
            PanelTableFincasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTable, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 801, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelTableFincas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 498, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addComponent(PanelTableFincas, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarFincaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarFincaActionPerformed
        JframeRegistrarFinca ventana = new JframeRegistrarFinca(this.ventanaAdministrador);
        ventana.setVisible(true);
    }//GEN-LAST:event_btnRegistrarFincaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTable;
    private javax.swing.JPanel PanelTableFincas;
    private javax.swing.JTable TableFincas;
    private javax.swing.JButton btnRegistrarFinca;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables

}

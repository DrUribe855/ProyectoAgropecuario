
package Ordeniador;

import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Conexion;
import Clases.VacasConOrdeniador;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.table.DefaultTableModel;

public class PanelListarVacasOrdeniadores extends javax.swing.JPanel {

    DefaultTableModel modelo;
    JframeOrdeniador ventanaOrdeniador;
    Conexion conexion;
    String documento;
    String id_vaca;
    String estado;
    Gson gson = new Gson();
    
    public PanelListarVacasOrdeniadores(JframeOrdeniador ventanaOrdeniador, String documento) {
        this.conexion = new Conexion();
        this.ventanaOrdeniador = ventanaOrdeniador;
        this.documento = documento;
        initComponents();
        initAlternComponents();
        fillData();
    }

    public void initAlternComponents(){
        modelo = (DefaultTableModel)Table.getModel();
        this.Table.getColumn("Ordeñar").setCellRenderer(new ButtonRenderer());
        this.Table.getColumn("Ordeñar").setCellEditor(new ButtonEditor(new JCheckBox()));
    }
    
    public void showInsertOrdenio(){  
    }
    
    public void fillData(){
        Map<String, String> mapData = new HashMap<>();
        mapData.put("documento", documento);
        
        String textoJson = conexion.consumoGET("http://localhost/APIenPHPVacas/JoinFincaVacasUsuarios.php", mapData);
        System.out.println(textoJson);
        
        JsonObject jsonobject = JsonParser.parseString(textoJson).getAsJsonObject();
        JsonArray registros  = jsonobject.getAsJsonArray("registros");
        
        List<VacasConOrdeniador> vacas_ordeniadores = new ArrayList<>();
        for (JsonElement elemento : registros) {
            
            JsonObject registro = elemento.getAsJsonObject();
            this.id_vaca = registro.get("id_vaca").getAsString();
            String alias = registro.get("alias").getAsString();
            this.estado = registro.get("estado").getAsString();
         
            VacasConOrdeniador vacas_ordenio = new VacasConOrdeniador(alias, estado);
            
            vacas_ordeniadores.add(vacas_ordenio);
            System.out.println("Entro al primer ciclo");
        }  
        modelo.setRowCount(0);
        
        for (VacasConOrdeniador vacas_ordenio : vacas_ordeniadores) {
            System.out.println("Entro al segundo ciclo");
            
            
            JButton btn_insertar = new JButton("Ordeñar");
            
            // Agregar un ActionListener al botón "Editar"
            btn_insertar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    
                    
                    Map<String, String> data = new HashMap<>();
                    data.put("documento", documento);
                    String textoJson = conexion.consumoGET("http://localhost/APIenPHPVacas/getUsuario.php", mapData);
                    System.out.println(textoJson);
                    
                    
                    JsonObject usuario = gson.fromJson(textoJson, JsonObject.class);
                    String id_usuario = usuario.get("id_usuario").getAsString();
                    System.out.println(estado);
                   
                    
                    
                    
                    JframeRegistrarOrdenio ventana = new JframeRegistrarOrdenio(ventanaOrdeniador, id_usuario, id_vaca, estado);
                    ventana.setVisible(true);
                }
            });

            Object[] filas = new Object[3];
            filas[0] = vacas_ordenio.getAlias();
            filas[1] = vacas_ordenio.getEstado();
            filas[2] = btn_insertar;
            modelo.addRow(filas);
            
     
        }
        
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panelPrincipal = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();

        panelPrincipal.setBackground(new java.awt.Color(255, 255, 255));

        Table.setBackground(new java.awt.Color(255, 255, 255));
        Table.setFont(new java.awt.Font("HP Simplified Hans", 0, 12)); // NOI18N
        Table.setForeground(new java.awt.Color(0, 0, 0));
        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Vaca", "Estado", "Ordeñar"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.Object.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(Table);

        javax.swing.GroupLayout panelPrincipalLayout = new javax.swing.GroupLayout(panelPrincipal);
        panelPrincipal.setLayout(panelPrincipalLayout);
        panelPrincipalLayout.setHorizontalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 721, Short.MAX_VALUE)
                .addContainerGap())
        );
        panelPrincipalLayout.setVerticalGroup(
            panelPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelPrincipalLayout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(33, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panelPrincipal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable Table;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel panelPrincipal;
    // End of variables declaration//GEN-END:variables
}

package PanelesViews;


import Administrador.JFrameAdministrator;
import Clases.ButtonEditor;
import Clases.ButtonRenderer;
import Clases.Conexion;
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


public class PanelListarUsuarios extends javax.swing.JPanel {

    Conexion conexion;
    DefaultTableModel modelo;
    private JFrameAdministrator ventanaAdministrador;
    
    public PanelListarUsuarios(JFrameAdministrator administrador) {
        this.conexion = new Conexion();
        this.ventanaAdministrador = administrador;
        initComponents();
        initAlternStyles();
        initAlternComponents();
        fillData();
        
    }
    
    public void initAlternComponents(){
        modelo = (DefaultTableModel)TableUsuarios.getModel();
        this.TableUsuarios.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        this.TableUsuarios.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox()));
    }
    
    public void initAlternStyles(){
        btnRegistrarUsuarios.putClientProperty( "JButton.buttonType", "roundRect" );
    }
    
    

    public void fillData(){
        
        String textoJson = conexion.consumoGET("http://localhost/APIenPHPVacas/ObtenerUsuarios.php");
        System.out.print(textoJson);
        JsonObject jsonobject = JsonParser.parseString(textoJson).getAsJsonObject();
        JsonArray registros  = jsonobject.getAsJsonArray("registros");
        List<Usuario> usuarios = new ArrayList<>();
        
        for (JsonElement elemento : registros) {
            JsonObject registro = elemento.getAsJsonObject();
            String documento = registro.get("documento").getAsString();
            String nombres = registro.get("nombres").getAsString();
            String apellidos = registro.get("apellidos").getAsString();
            String telefono = registro.get("telefono").getAsString();
            String rol = registro.get("rol").getAsString();
            String email = registro.get("email").getAsString();
            String password = registro.get("passw").getAsString();
         
            Usuario usuario = new Usuario(documento, nombres, apellidos, telefono, rol, email, password);
            
            usuarios.add(usuario);
        } 
        
        modelo.setRowCount(0);
        for (Usuario usuario : usuarios) {
            
            JButton btn_editar = new JButton("Modificar");
            
            
            // Agregar un ActionListener al botón "Editar"
            btn_editar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateUser(usuario);
                }
            });

            
            
            Object[] filas = new Object[7];
            filas[0] = usuario.getDocumento();
            filas[1] = usuario.getNombres();
            filas[2] = usuario.getApellidos();
            filas[3] = usuario.getTelefono();
            filas[4] = usuario.getRol();
            filas[5] = usuario.getEmail();
            filas[6] = btn_editar;
           
            
            modelo.addRow(filas);
        }
    }
    
    
    
    public void updateUser(Usuario usuario){
        
        String documento = usuario.getDocumento();
        String nombres = usuario.getNombres();
        String apellidos = usuario.getApellidos();
        String telefono = usuario.getTelefono();
        String rol = usuario.getRol();
        String email = usuario.getEmail();
        
        JframeModificarUsuario ventanaUpdate = new JframeModificarUsuario(this, documento, nombres, apellidos, telefono, rol, email);
        ventanaUpdate.setVisible(true);
    }
    
   
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTableUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        btnRegistrarUsuarios = new javax.swing.JButton();

        PanelTableUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        TableUsuarios.setBackground(new java.awt.Color(255, 255, 255));
        TableUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Apellido", "Telefono", "Rol", "E-mail", "Modificar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableUsuarios);

        btnRegistrarUsuarios.setBackground(new java.awt.Color(0, 143, 111));
        btnRegistrarUsuarios.setFont(new java.awt.Font("Segoe UI", 3, 18)); // NOI18N
        btnRegistrarUsuarios.setForeground(new java.awt.Color(255, 255, 255));
        btnRegistrarUsuarios.setText("Registrar");
        btnRegistrarUsuarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuariosActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTableUsuariosLayout = new javax.swing.GroupLayout(PanelTableUsuarios);
        PanelTableUsuarios.setLayout(PanelTableUsuariosLayout);
        PanelTableUsuariosLayout.setHorizontalGroup(
            PanelTableUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelTableUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 857, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableUsuariosLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegistrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        PanelTableUsuariosLayout.setVerticalGroup(
            PanelTableUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableUsuariosLayout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(btnRegistrarUsuarios, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 457, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTableUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(PanelTableUsuarios, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarUsuariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuariosActionPerformed
        this.ventanaAdministrador.showInsertUsers();
    }//GEN-LAST:event_btnRegistrarUsuariosActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTableUsuarios;
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JButton btnRegistrarUsuarios;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

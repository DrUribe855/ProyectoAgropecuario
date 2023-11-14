package PanelesViews;


import Administrador.JframeAdministrador;
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
    private JframeAdministrador ventanaAdministrador;
    
    public PanelListarUsuarios(JframeAdministrador administrador) {
        this.conexion = new Conexion();
        this.ventanaAdministrador = administrador;
        initComponents();
        initAlternComponents();
        fillData();
        
    }
    
    public void initAlternComponents(){
        modelo = (DefaultTableModel)TableUsuarios.getModel();
        this.TableUsuarios.getColumn("Modificar").setCellRenderer(new ButtonRenderer());
        this.TableUsuarios.getColumn("Modificar").setCellEditor(new ButtonEditor(new JCheckBox()));

        this.TableUsuarios.getColumn("Eliminar").setCellRenderer(new ButtonRenderer());
        this.TableUsuarios.getColumn("Eliminar").setCellEditor(new ButtonEditor(new JCheckBox()));
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
            JButton btn_eliminar = new JButton("Eliminar");
            
            // Agregar un ActionListener al botón "Editar"
            btn_editar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    updateUser(usuario);
                }
            });

            // Agregar un ActionListener al botón "Eliminar"
            btn_eliminar.addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    deleteUser(usuario);
                }
            });
            
            Object[] filas = new Object[8];
            filas[0] = usuario.getDocumento();
            filas[1] = usuario.getNombres();
            filas[2] = usuario.getApellidos();
            filas[3] = usuario.getTelefono();
            filas[4] = usuario.getRol();
            filas[5] = usuario.getEmail();
            filas[6] = btn_editar;
            filas[7] = btn_eliminar;
            
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
    
    public void deleteUser(Usuario usuario){
        System.out.println("Nombre: "+usuario.getNombres());
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        PanelTableUsuarios = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableUsuarios = new javax.swing.JTable();
        btnRegistrarUsuario = new javax.swing.JButton();

        PanelTableUsuarios.setBackground(new java.awt.Color(255, 255, 255));

        TableUsuarios.setBackground(new java.awt.Color(204, 204, 204));
        TableUsuarios.setForeground(new java.awt.Color(0, 0, 0));
        TableUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Documento", "Nombre", "Apellido", "Telefono", "Rol", "E-mail", "Modificar", "Eliminar"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(TableUsuarios);

        btnRegistrarUsuario.setBackground(new java.awt.Color(0, 153, 0));
        btnRegistrarUsuario.setFont(new java.awt.Font("HP Simplified Hans", 1, 18)); // NOI18N
        btnRegistrarUsuario.setText("Registrar Usuario");
        btnRegistrarUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarUsuarioActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout PanelTableUsuariosLayout = new javax.swing.GroupLayout(PanelTableUsuarios);
        PanelTableUsuarios.setLayout(PanelTableUsuariosLayout);
        PanelTableUsuariosLayout.setHorizontalGroup(
            PanelTableUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableUsuariosLayout.createSequentialGroup()
                .addContainerGap(646, Short.MAX_VALUE)
                .addComponent(btnRegistrarUsuario)
                .addGap(17, 17, 17))
            .addGroup(PanelTableUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1)
                .addContainerGap())
        );
        PanelTableUsuariosLayout.setVerticalGroup(
            PanelTableUsuariosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelTableUsuariosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrarUsuario)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
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

    private void btnRegistrarUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarUsuarioActionPerformed
        this.ventanaAdministrador.showInsertUsers();
    }//GEN-LAST:event_btnRegistrarUsuarioActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel PanelTableUsuarios;
    private javax.swing.JTable TableUsuarios;
    private javax.swing.JButton btnRegistrarUsuario;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}

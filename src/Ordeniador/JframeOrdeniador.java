 package Ordeniador;

import com.formdev.flatlaf.FlatLightLaf;
import java.awt.BorderLayout;
import javax.swing.UIManager;


public class JframeOrdeniador extends javax.swing.JFrame {
    
    String nombre;
    String documento;
    //String id;
    public JframeOrdeniador(String nombre,String documento ) {
        this.nombre = nombre;
        this.documento = documento;
        //this.id = id;
        initComponents();
        initAlternComponents();
    }
    
    public void initAlternComponents(){
        setLocationRelativeTo(null);
    }
    
    public void showVacasOrdeniadores(){
        this.panelEstatico.removeAll();
        this.panelEstatico.repaint();
        
        PanelListarVacasOrdeniadores ventanaPanelListarVacasOrdeniadores = new PanelListarVacasOrdeniadores(documento);
        ventanaPanelListarVacasOrdeniadores.setSize(this.panelEstatico.getSize());
        ventanaPanelListarVacasOrdeniadores.setLocation(0,0);
                
        panelEstatico.add(ventanaPanelListarVacasOrdeniadores, BorderLayout.CENTER);
        panelEstatico.revalidate();
        panelEstatico.repaint();
        
    }
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        background = new javax.swing.JPanel();
        menu = new javax.swing.JPanel();
        btn_listadoVacas = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        panelEstatico = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        menu.setBackground(new java.awt.Color(0, 143, 111));

        btn_listadoVacas.setBackground(new java.awt.Color(28, 163, 129));
        btn_listadoVacas.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        btn_listadoVacas.setForeground(new java.awt.Color(255, 255, 255));
        btn_listadoVacas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Img/icon-list.png"))); // NOI18N
        btn_listadoVacas.setText("Listado de vacas");
        btn_listadoVacas.setBorder(javax.swing.BorderFactory.createMatteBorder(1, 10, 1, 1, new java.awt.Color(0, 0, 0)));
        btn_listadoVacas.setBorderPainted(false);
        btn_listadoVacas.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btn_listadoVacas.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btn_listadoVacas.setIconTextGap(12);
        btn_listadoVacas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_listadoVacasActionPerformed(evt);
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

        javax.swing.GroupLayout menuLayout = new javax.swing.GroupLayout(menu);
        menu.setLayout(menuLayout);
        menuLayout.setHorizontalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(btn_listadoVacas, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        menuLayout.setVerticalGroup(
            menuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(menuLayout.createSequentialGroup()
                .addGap(101, 101, 101)
                .addComponent(btn_listadoVacas, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 300, Short.MAX_VALUE)
                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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
            .addGap(0, 0, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout backgroundLayout = new javax.swing.GroupLayout(background);
        background.setLayout(backgroundLayout);
        backgroundLayout.setHorizontalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(backgroundLayout.createSequentialGroup()
                .addComponent(menu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(panelEstatico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        backgroundLayout.setVerticalGroup(
            backgroundLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(menu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(panelEstatico, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(background, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    private void btn_listadoVacasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_listadoVacasActionPerformed
        this.showVacasOrdeniadores();
    }//GEN-LAST:event_btn_listadoVacasActionPerformed

    
    public static void main(String args[]) {
        try {
            UIManager.setLookAndFeel( new FlatLightLaf() );
        } catch( Exception ex ) {
            System.err.println( "Failed to initialize LaF" );
        }
       
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel background;
    private javax.swing.JButton btn_listadoVacas;
    private javax.swing.JButton jButton2;
    private javax.swing.JPanel menu;
    private javax.swing.JPanel panelEstatico;
    // End of variables declaration//GEN-END:variables
}

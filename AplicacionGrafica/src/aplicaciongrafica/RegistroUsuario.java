package aplicaciongrafica;

import Class.RegistroDatos;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Esthefani Machado
 */
public class RegistroUsuario extends javax.swing.JDialog {

    public RegistroUsuario(java.awt.Frame parent, boolean modal) {
       
        super(parent, modal);
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
        bloquear();
        
    }
    
    void limpiar(){
        CampoNombre.setText("");
        CampoApellido.setText("");
        CampoDireccion.setText("");
        CampoLogin.setText("");
        CampoContraseña.setText("");
        CampoREContraseña.setText("");
    }
    
    void bloquear(){
        CampoNombre.setEnabled(false);
        CampoApellido.setEnabled(false);
        CampoDireccion.setEnabled(false);
        SBotonFemenino.setEnabled(false);
        SBotonMasculino.setEnabled(false);
        
        CampoLogin.setEnabled(false);
        CampoContraseña.setEnabled(false);
        CampoREContraseña.setEnabled(false);
        SeleccionTipo.setEnabled(false);
        
        BotonAceptar.setEnabled(false);
        BotonCancelar.setEnabled(false);
        BotonNuevo.setEnabled(true);
    }
    
    void desbloquear(){
        CampoNombre.setEnabled(true);
        CampoApellido.setEnabled(true);
        CampoDireccion.setEnabled(true);
        SBotonFemenino.setEnabled(true);
        SBotonMasculino.setEnabled(true);
        
        CampoLogin.setEnabled(true);
        CampoContraseña.setEnabled(true);
        CampoREContraseña.setEnabled(true);
        SeleccionTipo.setEnabled(true);
        
        BotonAceptar.setEnabled(true);
        BotonCancelar.setEnabled(true);
        BotonNuevo.setEnabled(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BotonGrupoSexo = new javax.swing.ButtonGroup();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        PanelUsuario = new javax.swing.JPanel();
        CampoNombre = new javax.swing.JTextField();
        CampoApellido = new javax.swing.JTextField();
        CampoDireccion = new javax.swing.JTextField();
        SBotonFemenino = new javax.swing.JRadioButton();
        SBotonMasculino = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        PanelCuenta = new javax.swing.JPanel();
        CampoLogin = new javax.swing.JTextField();
        SeleccionadorContraseña = new javax.swing.JCheckBox();
        CampoContraseña = new javax.swing.JPasswordField();
        CampoREContraseña = new javax.swing.JPasswordField();
        SeleccionTipo = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        BotonAceptar = new javax.swing.JButton();
        BotonCancelar = new javax.swing.JButton();
        BotonNuevo = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("REGISTER");

        CampoNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoNombreActionPerformed(evt);
            }
        });

        CampoApellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoApellidoActionPerformed(evt);
            }
        });

        CampoDireccion.setHorizontalAlignment(javax.swing.JTextField.LEFT);
        CampoDireccion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        CampoDireccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoDireccionActionPerformed(evt);
            }
        });

        BotonGrupoSexo.add(SBotonFemenino);
        SBotonFemenino.setText("Female");

        BotonGrupoSexo.add(SBotonMasculino);
        SBotonMasculino.setText("Male");

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Name:");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Lastname:");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Address:");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Gender:");
        jLabel5.setVerticalAlignment(javax.swing.SwingConstants.TOP);

        javax.swing.GroupLayout PanelUsuarioLayout = new javax.swing.GroupLayout(PanelUsuario);
        PanelUsuario.setLayout(PanelUsuarioLayout);
        PanelUsuarioLayout.setHorizontalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelUsuarioLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(CampoDireccion, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                            .addComponent(CampoApellido, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(CampoNombre, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(50, 50, 50))
                    .addGroup(PanelUsuarioLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(SBotonFemenino)
                        .addGap(10, 10, 10)
                        .addComponent(SBotonMasculino)
                        .addGap(0, 178, Short.MAX_VALUE))))
        );
        PanelUsuarioLayout.setVerticalGroup(
            PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelUsuarioLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoDireccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                .addGroup(PanelUsuarioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SBotonFemenino)
                    .addComponent(SBotonMasculino)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("User Data", PanelUsuario);

        SeleccionadorContraseña.setText("Password expires in the next 30 days.");
        SeleccionadorContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionadorContraseñaActionPerformed(evt);
            }
        });

        CampoContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoContraseñaActionPerformed(evt);
            }
        });

        CampoREContraseña.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CampoREContraseñaActionPerformed(evt);
            }
        });

        SeleccionTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Personal", "Business" }));
        SeleccionTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SeleccionTipoActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Login:");

        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel6.setText("Password:");

        jLabel7.setText("Re Password:");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Type:");

        javax.swing.GroupLayout PanelCuentaLayout = new javax.swing.GroupLayout(PanelCuenta);
        PanelCuenta.setLayout(PanelCuentaLayout);
        PanelCuentaLayout.setHorizontalGroup(
            PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, PanelCuentaLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(PanelCuentaLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(CampoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(PanelCuentaLayout.createSequentialGroup()
                        .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SeleccionTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(CampoContraseña, javax.swing.GroupLayout.DEFAULT_SIZE, 252, Short.MAX_VALUE)
                                .addComponent(CampoREContraseña))
                            .addComponent(SeleccionadorContraseña))))
                .addGap(50, 50, 50))
        );
        PanelCuentaLayout.setVerticalGroup(
            PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PanelCuentaLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CampoREContraseña, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(PanelCuentaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SeleccionTipo)
                    .addComponent(jLabel8))
                .addGap(14, 14, 14)
                .addComponent(SeleccionadorContraseña))
        );

        jTabbedPane1.addTab("Account Data", PanelCuenta);

        BotonAceptar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Aceptar.png"))); // NOI18N
        BotonAceptar.setBorderPainted(false);
        BotonAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonAceptarActionPerformed(evt);
            }
        });

        BotonCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Cancelar.png"))); // NOI18N
        BotonCancelar.setBorderPainted(false);
        BotonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonCancelarActionPerformed(evt);
            }
        });

        BotonNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Añadir.png"))); // NOI18N
        BotonNuevo.setBorderPainted(false);
        BotonNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BotonNuevoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(BotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42))
            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(BotonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(BotonNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(BotonAceptar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SeleccionadorContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionadorContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionadorContraseñaActionPerformed

    private void BotonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonCancelarActionPerformed
        limpiar();
        bloquear();     
    }//GEN-LAST:event_BotonCancelarActionPerformed

    private void CampoREContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoREContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoREContraseñaActionPerformed

    private void BotonNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonNuevoActionPerformed
        desbloquear();
        limpiar();
        CampoNombre.requestFocus();
        PanelUsuario.requestFocus();
    }//GEN-LAST:event_BotonNuevoActionPerformed

    private void BotonAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BotonAceptarActionPerformed

        String nombre, apellido, direccion, sexo="", login, tipo, sql, changePassword, fechaActual;
        char password[], password2[];
        
        Date fecha = new Date();
        SimpleDateFormat FormatoFecha = new SimpleDateFormat("MM-dd-yyyy");
        fechaActual = FormatoFecha.format(fecha);
        
        nombre = CampoNombre.getText();
        apellido = CampoApellido.getText();
        direccion = CampoDireccion.getText();
        if (SBotonFemenino.isSelected())
            sexo = "Female";
        if (SBotonMasculino.isSelected())
            sexo = "Male";
        
        login = CampoLogin.getText();
        password = CampoContraseña.getPassword();
        String pass = new String (password);
        password2 = CampoREContraseña.getPassword();
        String pass2 = new String (password2);
        tipo = (String) SeleccionTipo.getSelectedItem();
        if (SeleccionadorContraseña.isSelected())
                changePassword = "Yes";
        else{
                changePassword = "No";
                fechaActual = "";
            }
       
        if (nombre.equals("")||apellido.equals("")||direccion.equals("")||sexo.equals("")||login.equals("")||tipo.equals("")||(!pass.equals(pass2))) {
            if (!pass.equals(pass2))
                javax.swing.JOptionPane.showMessageDialog(this, "Passwords do not match", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
            else
                javax.swing.JOptionPane.showMessageDialog(this, "You must complete the required information", "Error", javax.swing.JOptionPane.ERROR_MESSAGE);
        }else {/****************************************************************/
            
            RegistroDatos userdata = new RegistroDatos();
            
            Object [] informacion= new Object [5];
            informacion[0] = nombre;
            informacion[1] = apellido;
            informacion[2] = direccion;
            informacion[3] = sexo;
            informacion[4] = login;
      
            Object [] informacion2 = new Object [5];
            informacion2[0] = login;
            informacion2[1] = pass;
            informacion2[2] = tipo;
            informacion2[3] = changePassword;
            informacion2[4] = fechaActual;
            
            userdata.RegistroDatos("accountdata",informacion2);
            
            userdata.RegistroDatos("UserData (name_user, lastname_user, address_user, sex_user, login_user)",informacion);
        }
        
        BotonNuevo.setEnabled(true);
                
    }//GEN-LAST:event_BotonAceptarActionPerformed

    private void SeleccionTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SeleccionTipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SeleccionTipoActionPerformed

    private void CampoContraseñaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoContraseñaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CampoContraseñaActionPerformed

    private void CampoApellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoApellidoActionPerformed
        CampoApellido.transferFocus();
    }//GEN-LAST:event_CampoApellidoActionPerformed

    private void CampoNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoNombreActionPerformed
        CampoNombre.transferFocus();
    }//GEN-LAST:event_CampoNombreActionPerformed

    private void CampoDireccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CampoDireccionActionPerformed
        CampoDireccion.transferFocus();
    }//GEN-LAST:event_CampoDireccionActionPerformed

    /**
     * @param args the command line arguments
     */
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
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistroUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                RegistroUsuario dialog = new RegistroUsuario(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BotonAceptar;
    private javax.swing.JButton BotonCancelar;
    private javax.swing.ButtonGroup BotonGrupoSexo;
    private javax.swing.JButton BotonNuevo;
    private javax.swing.JTextField CampoApellido;
    private javax.swing.JPasswordField CampoContraseña;
    private javax.swing.JTextField CampoDireccion;
    private javax.swing.JTextField CampoLogin;
    private javax.swing.JTextField CampoNombre;
    private javax.swing.JPasswordField CampoREContraseña;
    private javax.swing.JPanel PanelCuenta;
    private javax.swing.JPanel PanelUsuario;
    private javax.swing.JRadioButton SBotonFemenino;
    private javax.swing.JRadioButton SBotonMasculino;
    private javax.swing.JComboBox<String> SeleccionTipo;
    private javax.swing.JCheckBox SeleccionadorContraseña;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTabbedPane jTabbedPane1;
    // End of variables declaration//GEN-END:variables
}

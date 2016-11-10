package aplicaciongrafica;
import javax.swing.UIManager;
import java.awt.Image;
import java.awt.Toolkit;

/**
 *
 * @author Esthefani Machado
 */
public class VentanaPrincipal extends javax.swing.JFrame {

    public VentanaPrincipal() {
        initComponents();
        this.setLocationRelativeTo(null);
    }

    public Image getIconImage() {
        Image retValue;
        retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Imagenes/Icono.png")); 
        return retValue;
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JLabel();
        MenuArchivo = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        SubMenuCrear = new javax.swing.JMenu();
        SubMenuUsuario = new javax.swing.JMenuItem();
        SubMenuDatosRegistrados = new javax.swing.JMenuItem();
        SubMenuSalir = new javax.swing.JMenuItem();
        MenuAyuda = new javax.swing.JMenu();
        SubMenuAcercaDe = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("DATABASE - USER REGISTER");
        setIconImage(getIconImage());
        setUndecorated(true);
        setResizable(false);

        Fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondo.jpg"))); // NOI18N

        jMenu1.setText("Menu");

        SubMenuCrear.setText("New");

        SubMenuUsuario.setText("User Register");
        SubMenuUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuUsuarioActionPerformed(evt);
            }
        });
        SubMenuCrear.add(SubMenuUsuario);

        jMenu1.add(SubMenuCrear);

        SubMenuDatosRegistrados.setText("Data Base Register");
        SubMenuDatosRegistrados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuDatosRegistradosActionPerformed(evt);
            }
        });
        jMenu1.add(SubMenuDatosRegistrados);

        SubMenuSalir.setText("Exit");
        SubMenuSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuSalirActionPerformed(evt);
            }
        });
        jMenu1.add(SubMenuSalir);

        MenuArchivo.add(jMenu1);

        MenuAyuda.setText("Help");

        SubMenuAcercaDe.setText("Acerca De...");
        SubMenuAcercaDe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubMenuAcercaDeActionPerformed(evt);
            }
        });
        MenuAyuda.add(SubMenuAcercaDe);

        MenuArchivo.add(MenuAyuda);

        setJMenuBar(MenuArchivo);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SubMenuSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuSalirActionPerformed
        
        int valor = javax.swing.JOptionPane.showConfirmDialog(this, "Are you sure you want to exit?", "Exit", javax.swing.JOptionPane.YES_NO_OPTION, javax.swing.JOptionPane.QUESTION_MESSAGE);
        if (valor == javax.swing.JOptionPane.YES_OPTION)
            System.exit(0);
    }//GEN-LAST:event_SubMenuSalirActionPerformed

    private void SubMenuUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuUsuarioActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable () {
            public void run () {
                new RegistroUsuario(new javax.swing.JFrame(), true).setVisible(true);
            }
        });
    }//GEN-LAST:event_SubMenuUsuarioActionPerformed

    private void SubMenuAcercaDeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuAcercaDeActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                
                AcercaDe dialog = new AcercaDe (new javax.swing.JFrame(),true);
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_SubMenuAcercaDeActionPerformed

    private void SubMenuDatosRegistradosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubMenuDatosRegistradosActionPerformed
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run(){
                
                DBList dialog = new DBList (new javax.swing.JFrame(),true);
                dialog.setVisible(true);
            }
        });
    }//GEN-LAST:event_SubMenuDatosRegistradosActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {

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
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VentanaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                try {   
                    UIManager.setLookAndFeel ("com.jtattoo.plaf.acryl.AcrylLookAndFeel");//*****SI
                } catch (Exception e) {}
                       
                new VentanaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Fondo;
    private javax.swing.JMenuBar MenuArchivo;
    private javax.swing.JMenu MenuAyuda;
    private javax.swing.JMenuItem SubMenuAcercaDe;
    private javax.swing.JMenu SubMenuCrear;
    private javax.swing.JMenuItem SubMenuDatosRegistrados;
    private javax.swing.JMenuItem SubMenuSalir;
    private javax.swing.JMenuItem SubMenuUsuario;
    private javax.swing.JMenu jMenu1;
    // End of variables declaration//GEN-END:variables
}
//Link del fondo del diseño
//<a href="http://www.freepik.es/fotos-vectores-gratis/negocios">Negocios de vector diseñado por Freepik</a>
//<a href="http://www.freepik.es/fotos-vectores-gratis/fondo">Fondo de vector diseñado por Freepik</a>
//http://www.freepik.es/index.php?goto=41&idd=387063&url=aHR0cDovL3d3dy5mcmVldmVjdG9ycy5uZXQvZGV0YWlscy9Vc2VyK0ljb25z

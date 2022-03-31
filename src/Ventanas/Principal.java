package Ventanas;

import Ventanas.Usuario.login;
import Ventanas.Usuario.registroUsuario;
import Ventana.Empleado.Agregar_Empleado;
import java.awt.Desktop;
import java.awt.Image;
import java.awt.Toolkit;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        
        initComponents();

        //Modelando ventana
        setSize(1280, 745);
        setTitle(" -  Principal");
        setLocationRelativeTo(null);
        
        //Add window icon
        setIconImage(getIconImage());
        
        //Componentes
        cerrarSesionBtn.setVisible(false);
                
    }

    //Icono de ventana principal.
    @Override
        public final Image getIconImage(){
        
           Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("menu/icons/coding.png"));
        
           return retValue;
        }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        cerrarSesionBtn = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        Usuario_Menu = new javax.swing.JMenu();
        agregar_Usuario_Btn = new javax.swing.JMenuItem();
        gestionarBtn = new javax.swing.JMenuItem();
        Empleado_Menu = new javax.swing.JMenu();
        agregar_Empelado_Btn = new javax.swing.JMenuItem();
        gestionarEmpBtn = new javax.swing.JMenuItem();
        Contabilidad_Menu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        SalarioBase_Nomina_Btn = new javax.swing.JMenuItem();
        verNominaBtn = new javax.swing.JMenuItem();
        perfilMenu = new javax.swing.JMenu();
        perfilBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cerrarSesionBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/login/icons/logout (2).png"))); // NOI18N
        cerrarSesionBtn.setText("Cerrar sesion");

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addContainerGap(1137, Short.MAX_VALUE)
                .addComponent(cerrarSesionBtn)
                .addContainerGap())
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, DesktopLayout.createSequentialGroup()
                .addContainerGap(658, Short.MAX_VALUE)
                .addComponent(cerrarSesionBtn)
                .addContainerGap())
        );
        Desktop.setLayer(cerrarSesionBtn, javax.swing.JLayeredPane.DEFAULT_LAYER);

        getContentPane().add(Desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 710));

        Usuario_Menu.setText("Usuario");

        agregar_Usuario_Btn.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        agregar_Usuario_Btn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/menu/icons/add_menuicon.png"))); // NOI18N
        agregar_Usuario_Btn.setText("Agregar");
        agregar_Usuario_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_Usuario_BtnActionPerformed(evt);
            }
        });
        Usuario_Menu.add(agregar_Usuario_Btn);

        gestionarBtn.setText("Gestionar");
        Usuario_Menu.add(gestionarBtn);

        jMenuBar1.add(Usuario_Menu);

        Empleado_Menu.setText("Empelado");

        agregar_Empelado_Btn.setText("Agregar");
        agregar_Empelado_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_Empelado_BtnActionPerformed(evt);
            }
        });
        Empleado_Menu.add(agregar_Empelado_Btn);

        gestionarEmpBtn.setText("Gestionar");
        Empleado_Menu.add(gestionarEmpBtn);

        jMenuBar1.add(Empleado_Menu);

        Contabilidad_Menu.setText("Contabilidad");

        jMenu1.setText("Nomina");

        SalarioBase_Nomina_Btn.setText("Ver Salario Base");
        SalarioBase_Nomina_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalarioBase_Nomina_BtnActionPerformed(evt);
            }
        });
        jMenu1.add(SalarioBase_Nomina_Btn);

        verNominaBtn.setText("Ver nomina");
        jMenu1.add(verNominaBtn);

        Contabilidad_Menu.add(jMenu1);

        jMenuBar1.add(Contabilidad_Menu);

        perfilMenu.setText("Perfil");

        perfilBtn.setText("Ver perfil");
        perfilMenu.add(perfilBtn);

        jMenuBar1.add(perfilMenu);

        setJMenuBar(jMenuBar1);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void agregar_Usuario_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_Usuario_BtnActionPerformed
        
        //Haciendo visible la ventana de registro
        registroUsuario X = new registroUsuario();
        Desktop.add(X);
        X.setVisible(true);
        
    }//GEN-LAST:event_agregar_Usuario_BtnActionPerformed

    private void agregar_Empelado_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_Empelado_BtnActionPerformed
        
    // Haciendo visible la ventana de agregar Empleados
    Agregar_Empleado c = new Agregar_Empleado();
    Desktop.add(c);
    c.setVisible(true);
    
    }//GEN-LAST:event_agregar_Empelado_BtnActionPerformed

    private void SalarioBase_Nomina_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalarioBase_Nomina_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_SalarioBase_Nomina_BtnActionPerformed

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
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
                new Principal().setVisible(true);
                
                //Agregando el login
                login X = new login();
                Desktop.add(X);
                X.setVisible(true);
                
                //Ocultando menus
                Usuario_Menu.setVisible(false);
                Empleado_Menu.setVisible(false);
                Contabilidad_Menu.setVisible(false);
                perfilMenu.setVisible(false);
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu Contabilidad_Menu;
    public static javax.swing.JDesktopPane Desktop;
    public static javax.swing.JMenu Empleado_Menu;
    private javax.swing.JMenuItem SalarioBase_Nomina_Btn;
    public static javax.swing.JMenu Usuario_Menu;
    private javax.swing.JMenuItem agregar_Empelado_Btn;
    private javax.swing.JMenuItem agregar_Usuario_Btn;
    public static javax.swing.JButton cerrarSesionBtn;
    private javax.swing.JMenuItem gestionarBtn;
    private javax.swing.JMenuItem gestionarEmpBtn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem perfilBtn;
    public static javax.swing.JMenu perfilMenu;
    private javax.swing.JMenuItem verNominaBtn;
    // End of variables declaration//GEN-END:variables
}

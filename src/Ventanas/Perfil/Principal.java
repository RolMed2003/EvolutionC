package Ventanas.Perfil;

import Ventanas.Contabilidad.Nomina;
import Ventanas.Empleados.Agregar_Empleado;
import Ventanas.Empleados.Gestionar_empleados;
import Ventanas.Usuarios.Gestionar;
import Ventanas.Usuarios.login;
import Ventanas.Usuarios.registroUsuario;
import java.awt.Image;
import java.awt.Toolkit;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class Principal extends javax.swing.JFrame {

    public Principal() {

        initComponents();

        //Modelando
        setSize(1280, 720);
        setTitle(" -  Principal");
        setLocationRelativeTo(null);
        setIconImage(getIconImage());

        //Componentes
        Usuario_Menu.setVisible(false);
        Empleado_Menu.setVisible(false);
        Contabilidad_Menu.setVisible(false);
        perfilMenu.setVisible(false);

        //Login
        login X = new login();
        Desktop.add(X);
        X.setVisible(true);

    }

    //Icono de ventana principal.
    @Override
    public final Image getIconImage() {

        Image retValue = Toolkit.getDefaultToolkit().getImage(ClassLoader.getSystemResource("Recursos/Iconos/"
                + "MenuBar/coding.png"));

        return retValue;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Usuario_Menu = new javax.swing.JMenu();
        registrarUsuarioBtn = new javax.swing.JMenuItem();
        gestionarUsuarioBtn = new javax.swing.JMenuItem();
        Empleado_Menu = new javax.swing.JMenu();
        registrarEmpleadoBtn = new javax.swing.JMenuItem();
        gestionarEmpleadoBtn = new javax.swing.JMenuItem();
        Contabilidad_Menu = new javax.swing.JMenu();
        verNominaBtn = new javax.swing.JMenuItem();
        verSalariosBtn = new javax.swing.JMenuItem();
        perfilMenu = new javax.swing.JMenu();
        verPerfilBtn = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 699, Short.MAX_VALUE)
        );

        Usuario_Menu.setText("Usuarios");

        registrarUsuarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/MenuBar/add_menuicon.png"))); // NOI18N
        registrarUsuarioBtn.setText("Registrar");
        registrarUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarUsuarioBtnActionPerformed(evt);
            }
        });
        Usuario_Menu.add(registrarUsuarioBtn);

        gestionarUsuarioBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/MenuBar/gestion_usuario.png"))); // NOI18N
        gestionarUsuarioBtn.setText("Gestionar");
        gestionarUsuarioBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarUsuarioBtnActionPerformed(evt);
            }
        });
        Usuario_Menu.add(gestionarUsuarioBtn);

        jMenuBar1.add(Usuario_Menu);

        Empleado_Menu.setText("Empleados");

        registrarEmpleadoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/MenuBar/add_empleado.png"))); // NOI18N
        registrarEmpleadoBtn.setText("Registrar");
        registrarEmpleadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                registrarEmpleadoBtnActionPerformed(evt);
            }
        });
        Empleado_Menu.add(registrarEmpleadoBtn);

        gestionarEmpleadoBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/MenuBar/management.png"))); // NOI18N
        gestionarEmpleadoBtn.setText("Gestionar");
        gestionarEmpleadoBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionarEmpleadoBtnActionPerformed(evt);
            }
        });
        Empleado_Menu.add(gestionarEmpleadoBtn);

        jMenuBar1.add(Empleado_Menu);

        Contabilidad_Menu.setText("Contabilidad");

        verNominaBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/MenuBar/budget.png"))); // NOI18N
        verNominaBtn.setText("Nomina");
        verNominaBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verNominaBtnActionPerformed(evt);
            }
        });
        Contabilidad_Menu.add(verNominaBtn);

        verSalariosBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/MenuBar/salary.png"))); // NOI18N
        verSalariosBtn.setText("Ver salarios base");
        Contabilidad_Menu.add(verSalariosBtn);

        jMenuBar1.add(Contabilidad_Menu);

        perfilMenu.setText("Perfil");

        verPerfilBtn.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/MenuBar/user_profile.png"))); // NOI18N
        verPerfilBtn.setText("Ver perfil");
        verPerfilBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                verPerfilBtnActionPerformed(evt);
            }
        });
        perfilMenu.add(verPerfilBtn);

        jMenuBar1.add(perfilMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Desktop)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void verPerfilBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verPerfilBtnActionPerformed

        String Username = login.Username;

        if (Username.equals("System")) {

            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cerca.png"));
            JOptionPane.showMessageDialog(null, "Aun no se ha agregado un perfil para este usuario", " -  Error",
                    JOptionPane.PLAIN_MESSAGE, icon);

        } else {

            verPerfil X = new verPerfil();
            Desktop.add(X);
            X.setVisible(true);

        }

    }//GEN-LAST:event_verPerfilBtnActionPerformed

    private void gestionarUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarUsuarioBtnActionPerformed
        Gestionar x = new Gestionar();
        Desktop.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_gestionarUsuarioBtnActionPerformed

    private void gestionarEmpleadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionarEmpleadoBtnActionPerformed
        Gestionar_empleados x = new Gestionar_empleados();
        Desktop.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_gestionarEmpleadoBtnActionPerformed

    private void registrarUsuarioBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarUsuarioBtnActionPerformed

        registroUsuario X = new registroUsuario();
        Desktop.add(X);
        X.setVisible(true);

    }//GEN-LAST:event_registrarUsuarioBtnActionPerformed

    private void registrarEmpleadoBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_registrarEmpleadoBtnActionPerformed

        Agregar_Empleado X = new Agregar_Empleado();
        Desktop.add(X);
        X.setVisible(true);

    }//GEN-LAST:event_registrarEmpleadoBtnActionPerformed

    private void verNominaBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_verNominaBtnActionPerformed
        Nomina x = new Nomina();
        Desktop.add(x);
        x.setVisible(true);
    }//GEN-LAST:event_verNominaBtnActionPerformed

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
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public static javax.swing.JMenu Contabilidad_Menu;
    public static javax.swing.JDesktopPane Desktop;
    public static javax.swing.JMenu Empleado_Menu;
    public static javax.swing.JMenu Usuario_Menu;
    private javax.swing.JMenuItem gestionarEmpleadoBtn;
    private javax.swing.JMenuItem gestionarUsuarioBtn;
    private javax.swing.JMenuBar jMenuBar1;
    public static javax.swing.JMenu perfilMenu;
    private javax.swing.JMenuItem registrarEmpleadoBtn;
    private javax.swing.JMenuItem registrarUsuarioBtn;
    private javax.swing.JMenuItem verNominaBtn;
    private javax.swing.JMenuItem verPerfilBtn;
    private javax.swing.JMenuItem verSalariosBtn;
    // End of variables declaration//GEN-END:variables
}

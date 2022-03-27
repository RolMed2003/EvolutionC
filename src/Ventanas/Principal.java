package Ventanas;

import Ventanas.Usuario.login;
import Ventanas.Usuario.registroUsuario;
import Ventana.Empleado.Agregar_Empleado;
import java.awt.Desktop;

public class Principal extends javax.swing.JFrame {

    public Principal() {
        
        initComponents();
        
        
        
        //Modelando ventana
        setSize(1280, 700);
        setTitle(" -  Principal");
        setLocationRelativeTo(null);
                
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Desktop = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        Usuario_Menu = new javax.swing.JMenu();
        agregar_Usuario_Btn = new javax.swing.JMenuItem();
        gestionar_Usuario_Btn = new javax.swing.JRadioButtonMenuItem();
        Empleado_Menu = new javax.swing.JMenu();
        agregar_Empelado_Btn = new javax.swing.JMenuItem();
        gestionar_Empleado_Btn = new javax.swing.JRadioButtonMenuItem();
        Contabilidad_Menu = new javax.swing.JMenu();
        jMenu1 = new javax.swing.JMenu();
        SalarioBase_Nomina_Btn = new javax.swing.JMenuItem();
        VerNomina_Nomina_Btn = new javax.swing.JRadioButtonMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        javax.swing.GroupLayout DesktopLayout = new javax.swing.GroupLayout(Desktop);
        Desktop.setLayout(DesktopLayout);
        DesktopLayout.setHorizontalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1280, Short.MAX_VALUE)
        );
        DesktopLayout.setVerticalGroup(
            DesktopLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );

        getContentPane().add(Desktop, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1280, 680));

        Usuario_Menu.setText("Usuario");

        agregar_Usuario_Btn.setText("Agregar");
        agregar_Usuario_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_Usuario_BtnActionPerformed(evt);
            }
        });
        Usuario_Menu.add(agregar_Usuario_Btn);

        gestionar_Usuario_Btn.setSelected(true);
        gestionar_Usuario_Btn.setText("Gestionar");
        gestionar_Usuario_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                gestionar_Usuario_BtnActionPerformed(evt);
            }
        });
        Usuario_Menu.add(gestionar_Usuario_Btn);

        jMenuBar1.add(Usuario_Menu);

        Empleado_Menu.setText("Empelado");

        agregar_Empelado_Btn.setText("Agregar");
        agregar_Empelado_Btn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_Empelado_BtnActionPerformed(evt);
            }
        });
        Empleado_Menu.add(agregar_Empelado_Btn);

        gestionar_Empleado_Btn.setSelected(true);
        gestionar_Empleado_Btn.setText("Gestionar");
        Empleado_Menu.add(gestionar_Empleado_Btn);

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

        VerNomina_Nomina_Btn.setSelected(true);
        VerNomina_Nomina_Btn.setText("Ver Nomina");
        jMenu1.add(VerNomina_Nomina_Btn);

        Contabilidad_Menu.add(jMenu1);

        jMenuBar1.add(Contabilidad_Menu);

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

    private void gestionar_Usuario_BtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_gestionar_Usuario_BtnActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_gestionar_Usuario_BtnActionPerformed

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
                
                login X = new login();
                Desktop.add(X);
                X.setVisible(true);
                
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu Contabilidad_Menu;
    public static javax.swing.JDesktopPane Desktop;
    private javax.swing.JMenu Empleado_Menu;
    private javax.swing.JMenuItem SalarioBase_Nomina_Btn;
    private javax.swing.JMenu Usuario_Menu;
    private javax.swing.JRadioButtonMenuItem VerNomina_Nomina_Btn;
    private javax.swing.JMenuItem agregar_Empelado_Btn;
    private javax.swing.JMenuItem agregar_Usuario_Btn;
    private javax.swing.JRadioButtonMenuItem gestionar_Empleado_Btn;
    private javax.swing.JRadioButtonMenuItem gestionar_Usuario_Btn;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    // End of variables declaration//GEN-END:variables
}

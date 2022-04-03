package Ventanas.Usuarios;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.PlaceHolder;
import Ventanas.Principal;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class login extends javax.swing.JInternalFrame {

    public login() {

        initComponents();
        PlaceHolder u = new PlaceHolder("Ingrese su usuario", user_field);
        PlaceHolder p = new PlaceHolder("Ingrese su contraseña", passTxt);

        setSize(406, 534);
        setLocation(437, 88);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        login_img = new javax.swing.JLabel();
        fondo_panel = new javax.swing.JPanel();
        user_field = new javax.swing.JTextField();
        passTxt = new javax.swing.JPasswordField();
        user_txt = new javax.swing.JLabel();
        pass_txt = new javax.swing.JLabel();
        entrar_panelButton = new javax.swing.JPanel();
        entrar_txtButton = new javax.swing.JLabel();

        setTitle("Login");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        login_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/user (1).png"))); // NOI18N
        Fondo.add(login_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 10, -1, -1));

        fondo_panel.setBackground(new java.awt.Color(52, 128, 225));

        user_field.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        user_field.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                user_fieldActionPerformed(evt);
            }
        });

        passTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N

        user_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        user_txt.setForeground(new java.awt.Color(255, 255, 255));
        user_txt.setText("USERNAME");

        pass_txt.setFont(new java.awt.Font("Trebuchet MS", 1, 24)); // NOI18N
        pass_txt.setForeground(new java.awt.Color(255, 255, 255));
        pass_txt.setText("PASSWORD");

        entrar_panelButton.setBackground(new java.awt.Color(0, 149, 212));
        entrar_panelButton.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255)));
        entrar_panelButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar_panelButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrar_panelButtonMouseClicked(evt);
            }
        });

        entrar_txtButton.setFont(new java.awt.Font("Trebuchet MS", 1, 22)); // NOI18N
        entrar_txtButton.setForeground(new java.awt.Color(255, 255, 255));
        entrar_txtButton.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        entrar_txtButton.setText("ENTRAR");
        entrar_txtButton.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        entrar_txtButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                entrar_txtButtonMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout entrar_panelButtonLayout = new javax.swing.GroupLayout(entrar_panelButton);
        entrar_panelButton.setLayout(entrar_panelButtonLayout);
        entrar_panelButtonLayout.setHorizontalGroup(
            entrar_panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar_txtButton, javax.swing.GroupLayout.DEFAULT_SIZE, 121, Short.MAX_VALUE)
        );
        entrar_panelButtonLayout.setVerticalGroup(
            entrar_panelButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(entrar_txtButton, javax.swing.GroupLayout.DEFAULT_SIZE, 51, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout fondo_panelLayout = new javax.swing.GroupLayout(fondo_panel);
        fondo_panel.setLayout(fondo_panelLayout);
        fondo_panelLayout.setHorizontalGroup(
            fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(fondo_panelLayout.createSequentialGroup()
                .addGroup(fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(fondo_panelLayout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addGroup(fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(user_txt)
                            .addComponent(pass_txt)
                            .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(fondo_panelLayout.createSequentialGroup()
                        .addGap(105, 105, 105)
                        .addComponent(entrar_panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(45, Short.MAX_VALUE))
        );
        fondo_panelLayout.setVerticalGroup(
            fondo_panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, fondo_panelLayout.createSequentialGroup()
                .addContainerGap(92, Short.MAX_VALUE)
                .addComponent(user_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(user_field, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(pass_txt)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(passTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(entrar_panelButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        Fondo.add(fondo_panel, new org.netbeans.lib.awtextra.AbsoluteConstraints(30, 50, 330, 410));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 500, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entrar_txtButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrar_txtButtonMouseClicked

        //Reset warnings
        user_field.setBackground(Color.white);
        passTxt.setBackground(Color.white);

        //Variables
        int Val = 0;
        String user, pass, access;

        user = user_field.getText().trim();
        pass = passTxt.getText().trim();

        //Validaciones
        if (user.equals("")) {

            Val++;
            user_field.setBackground(new Color(224, 186, 51));

        }
        if (pass.equals("")) {

            Val++;
            passTxt.setBackground(new Color(224, 186, 51));

        }

        //Guardando datos
        if (Val == 0) {
            
            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select Role_User from Usuarios where Nombre_User = '"
                        +user+"' and Password_User = '"+pass+"'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    //Obteniendo el rol del usuario
                    access = rs.getString("Role_User");
                    
                    //Enviandolo a su respectiva ventana.
                    if(access.equalsIgnoreCase("Administrador")){
                        
                        Principal.Usuario_Menu.setVisible(true);
                        Principal.Empleado_Menu.setVisible(true);
                        Principal.Contabilidad_Menu.setVisible(true);
                        Principal.perfilMenu.setVisible(true);
                        Principal.cerrarSesionBtn.setVisible(true);
                        
                        this.dispose();
                        
                        Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                        JOptionPane.showMessageDialog(null, "Sesion iniciada como Administrador.", " -  Info",
                                JOptionPane.PLAIN_MESSAGE, icon);
                        
                    }else if(access.equalsIgnoreCase("Contador")){
                        
                        Principal.Empleado_Menu.setVisible(true);
                        Principal.Contabilidad_Menu.setVisible(true);
                        Principal.perfilMenu.setVisible(true);
                        Principal.cerrarSesionBtn.setVisible(true);
                        
                        this.dispose();
                        
                        Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                        JOptionPane.showMessageDialog(null, "Sesion iniciada como Contador.", " -  Info",
                                JOptionPane.PLAIN_MESSAGE, icon);
                        
                    }else if(access.equalsIgnoreCase("Aux.Nomina")){
                        
                        Principal.Empleado_Menu.setVisible(true);
                        Principal.Contabilidad_Menu.setVisible(true);
                        Principal.perfilMenu.setVisible(true);
                        Principal.cerrarSesionBtn.setVisible(true);
                        
                        this.dispose();
                        
                        Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                        JOptionPane.showMessageDialog(null, "Sesion iniciada como Auxiliar de Nomina.", " -  Info",
                                JOptionPane.PLAIN_MESSAGE, icon);
                        
                    }else if(access.equalsIgnoreCase("Empleado")){
                        
                        Principal.perfilMenu.setVisible(true);
                        Principal.cerrarSesionBtn.setVisible(true);
                        
                        this.dispose();
                        
                        Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                        JOptionPane.showMessageDialog(null, "Sesion iniciada como Empleado.", " -  Info",
                                JOptionPane.PLAIN_MESSAGE, icon);
                        
                    }
                    
                }else{
                    
                    user_field.requestFocus();
                    user_field.setText("");
                    passTxt.setText("");
                    
                    Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cerca.png"));
                    JOptionPane.showMessageDialog(null, "Nombre de usuario o contraseña incorrectos.",
                        "Mensaje de error", JOptionPane.PLAIN_MESSAGE, icon);
                    
                }
                
            } catch (SQLException e) {
                
                //Esto es lo que nos saldra por consola si hay un error al iniciar sesion
                System.err.println("Error al logear al usuario");
                
            }

        } else {

            //Mensaje de advertencia para que el usuario no deje campos vacios.
            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.",
                    "Mensaje de advertencia", JOptionPane.PLAIN_MESSAGE, icon);

        }

    }//GEN-LAST:event_entrar_txtButtonMouseClicked

    private void user_fieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_user_fieldActionPerformed

    }//GEN-LAST:event_user_fieldActionPerformed

    private void entrar_panelButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_entrar_panelButtonMouseClicked

    }//GEN-LAST:event_entrar_panelButtonMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel entrar_panelButton;
    private javax.swing.JLabel entrar_txtButton;
    private javax.swing.JPanel fondo_panel;
    private javax.swing.JLabel login_img;
    private javax.swing.JPasswordField passTxt;
    private javax.swing.JLabel pass_txt;
    private javax.swing.JTextField user_field;
    private javax.swing.JLabel user_txt;
    // End of variables declaration//GEN-END:variables

}

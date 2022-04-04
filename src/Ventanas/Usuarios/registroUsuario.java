package Ventanas.Usuarios;

import Clases.Apoyo.Conexion;
import Clases.Apoyo.PlaceHolder;
import java.awt.Color;
import java.sql.*;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;

public class registroUsuario extends javax.swing.JInternalFrame {

    public registroUsuario() {

        initComponents();

        PlaceHolder u2 = new PlaceHolder("Ingrese un usuario", userTxt);
        PlaceHolder pass2 = new PlaceHolder("Ingrese una contraseña", contra_txt);

        //Modelando la ventana 
        setSize(517, 557);
        setLocation(380, 70);
        setTitle("Registro de usuario");

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Fondo = new javax.swing.JPanel();
        regist_img = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        userTxt = new javax.swing.JTextField();
        contra_txt = new javax.swing.JPasswordField();
        rolCmb = new javax.swing.JComboBox();
        registrarBtn = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Registrar usuario");

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        regist_img.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/agregar-usuario (1).png"))); // NOI18N
        Fondo.add(regist_img, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 20, 130, 130));

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel1.setText("Nombre de usuario:");
        Fondo.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 160, -1, -1));

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel2.setText("Contraseña:");
        Fondo.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 250, -1, -1));

        jLabel3.setFont(new java.awt.Font("Trebuchet MS", 0, 22)); // NOI18N
        jLabel3.setText("Rol:");
        Fondo.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 360, -1, -1));

        userTxt.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        userTxt.setBorder(null);
        userTxt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                userTxtActionPerformed(evt);
            }
        });
        Fondo.add(userTxt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 200, 180, 28));

        contra_txt.setFont(new java.awt.Font("Trebuchet MS", 0, 16)); // NOI18N
        contra_txt.setBorder(null);
        Fondo.add(contra_txt, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 290, 180, 30));

        rolCmb.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        rolCmb.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Administrador", "Contador", "Aux.Nomina", "Empleado" }));
        Fondo.add(rolCmb, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 360, 122, 34));

        registrarBtn.setBackground(new java.awt.Color(0, 149, 212));
        registrarBtn.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        registrarBtn.setPreferredSize(new java.awt.Dimension(105, 35));
        registrarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                registrarBtnMouseClicked(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 1, 20)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("REGISTRAR");
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout registrarBtnLayout = new javax.swing.GroupLayout(registrarBtn);
        registrarBtn.setLayout(registrarBtnLayout);
        registrarBtnLayout.setHorizontalGroup(
            registrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
        );
        registrarBtnLayout.setVerticalGroup(
            registrarBtnLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );

        Fondo.add(registrarBtn, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 420, 130, 50));

        jPanel1.setBackground(new java.awt.Color(0, 156, 255));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 1, 27)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setText("REGISTRO DE USUARIO ");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel5)
                .addContainerGap(197, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Fondo.add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 30, 500, 90));
        Fondo.add(jSeparator1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 230, 180, 10));
        Fondo.add(jSeparator2, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 330, 180, 10));

        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/user_registro.png"))); // NOI18N
        Fondo.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 170, -1, -1));

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Login/pass.png"))); // NOI18N
        Fondo.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 280, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 501, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, 527, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void registrarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_registrarBtnMouseClicked

        //Reset warnings
        userTxt.setBackground(Color.white);
        contra_txt.setBackground(Color.white);

        //Variables
        String user, pass, selection = "null";
        int select, Val = 0;

        user = userTxt.getText();
        pass = contra_txt.getText();
        select = rolCmb.getSelectedIndex();

        //Obteniendo los valores del combo box
        if (select == 0) {

            selection = "Administrador";

        } else if (select == 1) {

            selection = "Contador";

        } else if (select == 2) {

            selection = "Aux.Nomina";

        } else if (select == 3) {

            selection = "Empleado";

        }

        //Validaciones
        if (user.equals("")) {

            Val++;
            userTxt.setBackground(new Color(224, 186, 51));

        }
        if (pass.equals("")) {

            Val++;
            contra_txt.setBackground(new Color(224, 186, 51));

        }

        //Insertando datos en la base de datos.
        if (Val == 0) {

            try {
                
                Connection cn = Conexion.conectar();
                PreparedStatement pst = cn.prepareStatement("select user from Usuarios where user = '"
                        + user +"'");
                
                ResultSet rs = pst.executeQuery();
                
                if(rs.next()){
                    
                    Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cerca.png"));
                        JOptionPane.showMessageDialog(null, "Nombre de usuario ya en uso.", " -  Error",
                                JOptionPane.PLAIN_MESSAGE, icon);
                    
                }else{
                    
                    cn.close();
                    
                    try {
                        
                        Connection cn2 = Conexion.conectar();
                        PreparedStatement pst2 = cn2.prepareStatement("insert into Usuarios values (?,?,?,?,?)");

                        pst2.setInt(1, 0);
                        pst2.setString(2, user);
                        pst2.setString(3, pass);
                        pst2.setString(4, selection);
                        pst2.setString(5, "");
                        pst2.execute();

                        //Mensaje de confirmacion
                        Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/cheque.png"));
                        JOptionPane.showMessageDialog(null, "Registro guardado exitosamente", " -  Info",
                                JOptionPane.PLAIN_MESSAGE, icon);

                        //Reseteando campos.
                        userTxt.setText("");
                        contra_txt.setText("");
                        
                    } catch (SQLException e) {
                        
                        System.err.println("Error al registrar usuario."+ e);
                        
                    }
                    
                }
                
            } catch (SQLException e) {
                
                System.err.println("Error al comprobar el nombre de usuario."+ e);
                
            }
            
        }else{
            
            Icon icon = new ImageIcon(getClass().getResource("../../Recursos/Iconos/JOption/advertencia.png"));
            JOptionPane.showMessageDialog(null, "Por favor, rellene todos los campos.", " -  Advertencia",
                    JOptionPane.PLAIN_MESSAGE, icon);
            
        }    

    }//GEN-LAST:event_registrarBtnMouseClicked

    private void userTxtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_userTxtActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_userTxtActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPasswordField contra_txt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel regist_img;
    private javax.swing.JPanel registrarBtn;
    private javax.swing.JComboBox rolCmb;
    private javax.swing.JTextField userTxt;
    // End of variables declaration//GEN-END:variables

}

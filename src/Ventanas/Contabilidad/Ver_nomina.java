package Ventanas.Contabilidad;

import Clases.Generales.Nomina;
import java.awt.Color;
import java.util.Locale;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ver_nomina extends javax.swing.JInternalFrame {

    Nomina nom = new Nomina();
    int aMouse, bMouse, cMouse, dMouse, eMouse, fMouse;

    public Ver_nomina() {
        initComponents();

        tblDatos_nomina.setModel(nom.mostrarDatosNomina((DefaultTableModel) tblDatos_nomina.getModel()));

        setSize(1180, 580);
        setLocation(50, 20);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        allNominas = new javax.swing.JFrame();
        Fondo = new javax.swing.JPanel();
        barra_superior = new javax.swing.JPanel();
        panel_exit = new javax.swing.JPanel();
        txt_exiit = new javax.swing.JLabel();
        agregarNómina = new javax.swing.JFrame();
        Fondo_2 = new javax.swing.JPanel();
        jLabel7 = new javax.swing.JLabel();
        barra_superior2 = new javax.swing.JPanel();
        panel_exit2 = new javax.swing.JPanel();
        txt_exiit2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        jTextField3 = new javax.swing.JTextField();
        panel_nomina = new javax.swing.JPanel();
        txt_nomina = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        editarNómina = new javax.swing.JFrame();
        Fondo_3 = new javax.swing.JPanel();
        panel_exit3 = new javax.swing.JPanel();
        txt_exit3 = new javax.swing.JLabel();
        barra_superior3 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblDatos_nomina = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblNomina = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        ver_button = new javax.swing.JButton();
        editar_button = new javax.swing.JButton();
        agregar_button = new javax.swing.JButton();

        allNominas.setUndecorated(true);
        allNominas.setResizable(false);

        Fondo.setBackground(new java.awt.Color(255, 255, 255));
        Fondo.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        barra_superior.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superiorMouseDragged(evt);
            }
        });
        barra_superior.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superiorMousePressed(evt);
            }
        });

        javax.swing.GroupLayout barra_superiorLayout = new javax.swing.GroupLayout(barra_superior);
        barra_superior.setLayout(barra_superiorLayout);
        barra_superiorLayout.setHorizontalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 870, Short.MAX_VALUE)
        );
        barra_superiorLayout.setVerticalGroup(
            barra_superiorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Fondo.add(barra_superior, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 870, 40));

        panel_exit.setBackground(new java.awt.Color(255, 255, 255));

        txt_exiit.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        txt_exiit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exiit.setText("X");
        txt_exiit.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exiit.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txt_exiitMouseDragged(evt);
            }
        });
        txt_exiit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exiitMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exiitMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exiitMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_exiitMousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_exitLayout = new javax.swing.GroupLayout(panel_exit);
        panel_exit.setLayout(panel_exitLayout);
        panel_exitLayout.setHorizontalGroup(
            panel_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exiit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exitLayout.setVerticalGroup(
            panel_exitLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exitLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exiit, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo.add(panel_exit, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 50, 40));

        javax.swing.GroupLayout allNominasLayout = new javax.swing.GroupLayout(allNominas.getContentPane());
        allNominas.getContentPane().setLayout(allNominasLayout);
        allNominasLayout.setHorizontalGroup(
            allNominasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        allNominasLayout.setVerticalGroup(
            allNominasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo, javax.swing.GroupLayout.PREFERRED_SIZE, 552, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        agregarNómina.setUndecorated(true);
        agregarNómina.setResizable(false);

        Fondo_2.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Nómina/payment-day.png"))); // NOI18N
        Fondo_2.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 40, -1, -1));

        barra_superior2.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superior2MouseDragged(evt);
            }
        });
        barra_superior2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superior2MousePressed(evt);
            }
        });

        panel_exit2.setBackground(new java.awt.Color(255, 255, 255));

        txt_exiit2.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        txt_exiit2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exiit2.setText("X");
        txt_exiit2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exiit2.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseDragged(evt);
            }
        });
        txt_exiit2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exiit2MouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                txt_exiit2MousePressed(evt);
            }
        });

        javax.swing.GroupLayout panel_exit2Layout = new javax.swing.GroupLayout(panel_exit2);
        panel_exit2.setLayout(panel_exit2Layout);
        panel_exit2Layout.setHorizontalGroup(
            panel_exit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exiit2, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        panel_exit2Layout.setVerticalGroup(
            panel_exit2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_exit2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(txt_exiit2, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout barra_superior2Layout = new javax.swing.GroupLayout(barra_superior2);
        barra_superior2.setLayout(barra_superior2Layout);
        barra_superior2Layout.setHorizontalGroup(
            barra_superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_superior2Layout.createSequentialGroup()
                .addContainerGap(411, Short.MAX_VALUE)
                .addComponent(panel_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(129, 129, 129))
        );
        barra_superior2Layout.setVerticalGroup(
            barra_superior2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, barra_superior2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(panel_exit2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        Fondo_2.add(barra_superior2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 590, 40));

        jLabel4.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel4.setText("Viaticos:");
        Fondo_2.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 390, -1, -1));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        Fondo_2.add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 380, 200, 30));

        jLabel5.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel5.setText("Salario base: ");
        Fondo_2.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 200, -1, -1));

        jLabel6.setFont(new java.awt.Font("Trebuchet MS", 0, 18)); // NOI18N
        jLabel6.setText("Horas extras: ");
        Fondo_2.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 300, -1, -1));

        jTextField2.setEditable(false);
        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });
        Fondo_2.add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 190, 200, 30));

        jTextField3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField3ActionPerformed(evt);
            }
        });
        Fondo_2.add(jTextField3, new org.netbeans.lib.awtextra.AbsoluteConstraints(160, 290, 200, 30));

        panel_nomina.setBackground(new java.awt.Color(255, 153, 51));

        txt_nomina.setFont(new java.awt.Font("Yu Gothic", 1, 24)); // NOI18N
        txt_nomina.setForeground(new java.awt.Color(255, 255, 255));
        txt_nomina.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_nomina.setText("AGREGAR NÓMINA");

        javax.swing.GroupLayout panel_nominaLayout = new javax.swing.GroupLayout(panel_nomina);
        panel_nomina.setLayout(panel_nominaLayout);
        panel_nominaLayout.setHorizontalGroup(
            panel_nominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_nominaLayout.createSequentialGroup()
                .addComponent(txt_nomina, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        panel_nominaLayout.setVerticalGroup(
            panel_nominaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_nomina, javax.swing.GroupLayout.DEFAULT_SIZE, 80, Short.MAX_VALUE)
        );

        Fondo_2.add(panel_nomina, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 60, 460, 80));

        jButton1.setFont(new java.awt.Font("Yu Gothic", 1, 16)); // NOI18N
        jButton1.setText("AGREGAR");
        Fondo_2.add(jButton1, new org.netbeans.lib.awtextra.AbsoluteConstraints(190, 480, -1, -1));

        javax.swing.GroupLayout agregarNóminaLayout = new javax.swing.GroupLayout(agregarNómina.getContentPane());
        agregarNómina.getContentPane().setLayout(agregarNóminaLayout);
        agregarNóminaLayout.setHorizontalGroup(
            agregarNóminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_2, javax.swing.GroupLayout.PREFERRED_SIZE, 461, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        agregarNóminaLayout.setVerticalGroup(
            agregarNóminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_2, javax.swing.GroupLayout.DEFAULT_SIZE, 552, Short.MAX_VALUE)
        );

        editarNómina.setUndecorated(true);
        editarNómina.setResizable(false);

        Fondo_3.setBackground(new java.awt.Color(255, 255, 255));
        Fondo_3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        panel_exit3.setBackground(new java.awt.Color(255, 255, 255));

        txt_exit3.setFont(new java.awt.Font("Yu Gothic UI Light", 1, 24)); // NOI18N
        txt_exit3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        txt_exit3.setText("X");
        txt_exit3.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        txt_exit3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                txt_exit3MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                txt_exit3MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                txt_exit3MouseExited(evt);
            }
        });

        javax.swing.GroupLayout panel_exit3Layout = new javax.swing.GroupLayout(panel_exit3);
        panel_exit3.setLayout(panel_exit3Layout);
        panel_exit3Layout.setHorizontalGroup(
            panel_exit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit3, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE)
        );
        panel_exit3Layout.setVerticalGroup(
            panel_exit3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(txt_exit3, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        Fondo_3.add(panel_exit3, new org.netbeans.lib.awtextra.AbsoluteConstraints(860, 0, 50, 40));

        barra_superior3.setBackground(new java.awt.Color(255, 255, 255));
        barra_superior3.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                barra_superior3MouseDragged(evt);
            }
        });
        barra_superior3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                barra_superior3MousePressed(evt);
            }
        });

        javax.swing.GroupLayout barra_superior3Layout = new javax.swing.GroupLayout(barra_superior3);
        barra_superior3.setLayout(barra_superior3Layout);
        barra_superior3Layout.setHorizontalGroup(
            barra_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 860, Short.MAX_VALUE)
        );
        barra_superior3Layout.setVerticalGroup(
            barra_superior3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 40, Short.MAX_VALUE)
        );

        Fondo_3.add(barra_superior3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 860, 40));

        javax.swing.GroupLayout editarNóminaLayout = new javax.swing.GroupLayout(editarNómina.getContentPane());
        editarNómina.getContentPane().setLayout(editarNóminaLayout);
        editarNóminaLayout.setHorizontalGroup(
            editarNóminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        editarNóminaLayout.setVerticalGroup(
            editarNóminaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Fondo_3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        setClosable(true);
        setTitle("Nomina");

        tblDatos_nomina.setFont(new java.awt.Font("Trebuchet MS", 0, 14)); // NOI18N
        tblDatos_nomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nombre", "Cargo", "Tipo"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                true, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblDatos_nomina.setRowHeight(20);
        jScrollPane1.setViewportView(tblDatos_nomina);
        if (tblDatos_nomina.getColumnModel().getColumnCount() > 0) {
            tblDatos_nomina.getColumnModel().getColumn(0).setResizable(false);
            tblDatos_nomina.getColumnModel().getColumn(1).setResizable(false);
            tblDatos_nomina.getColumnModel().getColumn(2).setResizable(false);
            tblDatos_nomina.getColumnModel().getColumn(3).setResizable(false);
        }

        tblNomina.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        tblNomina.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Salario bruto", "Horas extras", "Total Horas extras", "Viáticos", "INSS", "IR", "Salario neto"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, true, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblNomina.setRowHeight(20);
        jScrollPane2.setViewportView(tblNomina);
        if (tblNomina.getColumnModel().getColumnCount() > 0) {
            tblNomina.getColumnModel().getColumn(0).setResizable(false);
            tblNomina.getColumnModel().getColumn(0).setPreferredWidth(10);
            tblNomina.getColumnModel().getColumn(1).setResizable(false);
            tblNomina.getColumnModel().getColumn(2).setResizable(false);
            tblNomina.getColumnModel().getColumn(3).setResizable(false);
            tblNomina.getColumnModel().getColumn(4).setResizable(false);
            tblNomina.getColumnModel().getColumn(5).setResizable(false);
            tblNomina.getColumnModel().getColumn(6).setResizable(false);
            tblNomina.getColumnModel().getColumn(7).setResizable(false);
        }

        jLabel1.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel1.setText("Tabla de empleados");

        jLabel2.setFont(new java.awt.Font("Trebuchet MS", 1, 14)); // NOI18N
        jLabel2.setText("Nómina del empleado");

        ver_button.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        ver_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Nómina/all.png"))); // NOI18N
        ver_button.setText("Ver todas las nóminas");
        ver_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ver_buttonActionPerformed(evt);
            }
        });

        editar_button.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        editar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Nómina/editar_nomina.png"))); // NOI18N
        editar_button.setText("Editar Nómina");
        editar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editar_buttonActionPerformed(evt);
            }
        });

        agregar_button.setFont(new java.awt.Font("Yu Gothic", 1, 14)); // NOI18N
        agregar_button.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Recursos/Iconos/Nómina/add_nomina.png"))); // NOI18N
        agregar_button.setText("Agregar Nómina");
        agregar_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregar_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane2)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 700, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel2))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ver_button)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(editar_button, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(agregar_button, javax.swing.GroupLayout.Alignment.LEADING)))))
                        .addGap(75, 75, 75))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(agregar_button)
                        .addGap(18, 18, 18)
                        .addComponent(editar_button)
                        .addGap(18, 18, 18)
                        .addComponent(ver_button)))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ver_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ver_buttonActionPerformed
        allNominas.setVisible(true);
        allNominas.setSize(910, 552);
        allNominas.setLocationRelativeTo(null);
    }//GEN-LAST:event_ver_buttonActionPerformed

    private void txt_exiitMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiitMouseDragged

    }//GEN-LAST:event_txt_exiitMouseDragged

    private void txt_exiitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiitMouseClicked
        allNominas.dispose();
    }//GEN-LAST:event_txt_exiitMouseClicked

    private void txt_exiitMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiitMouseEntered

        panel_exit.setBackground(Color.red);
        txt_exiit.setForeground(Color.white);
    }//GEN-LAST:event_txt_exiitMouseEntered

    private void txt_exiitMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiitMouseExited
        panel_exit.setBackground(Color.white);
        txt_exiit.setForeground(Color.black);
    }//GEN-LAST:event_txt_exiitMouseExited

    private void txt_exiitMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiitMousePressed
        //error
    }//GEN-LAST:event_txt_exiitMousePressed

    private void barra_superiorMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        allNominas.setLocation(x - aMouse, y - bMouse);
    }//GEN-LAST:event_barra_superiorMouseDragged

    private void barra_superiorMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superiorMousePressed
        aMouse = evt.getX();
        bMouse = evt.getY();
    }//GEN-LAST:event_barra_superiorMousePressed

    private void agregar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregar_buttonActionPerformed
        agregarNómina.setVisible(true);
        agregarNómina.setSize(461, 552);
        agregarNómina.setLocationRelativeTo(null);
        
    }//GEN-LAST:event_agregar_buttonActionPerformed

    private void txt_exiit2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseDragged

    }//GEN-LAST:event_txt_exiit2MouseDragged

    private void txt_exiit2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseClicked
        agregarNómina.dispose();
    }//GEN-LAST:event_txt_exiit2MouseClicked

    private void txt_exiit2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseEntered
        panel_exit2.setBackground(Color.red);
        txt_exiit2.setForeground(Color.white);
    }//GEN-LAST:event_txt_exiit2MouseEntered

    private void txt_exiit2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MouseExited
        panel_exit2.setBackground(Color.white);
        txt_exiit2.setForeground(Color.black);
    }//GEN-LAST:event_txt_exiit2MouseExited

    private void txt_exiit2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exiit2MousePressed

    }//GEN-LAST:event_txt_exiit2MousePressed

    private void barra_superior2MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior2MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        allNominas.setLocation(x - cMouse, y - dMouse);
    }//GEN-LAST:event_barra_superior2MouseDragged

    private void barra_superior2MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior2MousePressed
        cMouse = evt.getX();
        dMouse = evt.getY();
    }//GEN-LAST:event_barra_superior2MousePressed

    private void editar_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editar_buttonActionPerformed
        editarNómina.setVisible(true);
        editarNómina.setSize(910, 552);
        editarNómina.setLocationRelativeTo(null);
    }//GEN-LAST:event_editar_buttonActionPerformed

    private void barra_superior3MouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior3MouseDragged
        int x = evt.getXOnScreen();
        int y = evt.getYOnScreen();
        allNominas.setLocation(x - eMouse, y - fMouse);
    }//GEN-LAST:event_barra_superior3MouseDragged

    private void barra_superior3MousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_barra_superior3MousePressed
        eMouse = evt.getX();
        fMouse = evt.getY();
    }//GEN-LAST:event_barra_superior3MousePressed

    private void txt_exit3MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exit3MouseEntered
        panel_exit3.setBackground(Color.red);
        txt_exit3.setForeground(Color.white);
    }//GEN-LAST:event_txt_exit3MouseEntered

    private void txt_exit3MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exit3MouseExited
        panel_exit3.setBackground(Color.white);
        txt_exit3.setForeground(Color.black);
    }//GEN-LAST:event_txt_exit3MouseExited

    private void txt_exit3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_txt_exit3MouseClicked
        editarNómina.dispose();
    }//GEN-LAST:event_txt_exit3MouseClicked

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

    private void jTextField3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Fondo;
    private javax.swing.JPanel Fondo_2;
    private javax.swing.JPanel Fondo_3;
    private javax.swing.JFrame agregarNómina;
    private javax.swing.JButton agregar_button;
    private javax.swing.JFrame allNominas;
    private javax.swing.JPanel barra_superior;
    private javax.swing.JPanel barra_superior2;
    private javax.swing.JPanel barra_superior3;
    private javax.swing.JFrame editarNómina;
    private javax.swing.JButton editar_button;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JPanel panel_exit;
    private javax.swing.JPanel panel_exit2;
    private javax.swing.JPanel panel_exit3;
    private javax.swing.JPanel panel_nomina;
    private javax.swing.JTable tblDatos_nomina;
    private javax.swing.JTable tblNomina;
    private javax.swing.JLabel txt_exiit;
    private javax.swing.JLabel txt_exiit2;
    private javax.swing.JLabel txt_exit3;
    private javax.swing.JLabel txt_nomina;
    private javax.swing.JButton ver_button;
    // End of variables declaration//GEN-END:variables
}

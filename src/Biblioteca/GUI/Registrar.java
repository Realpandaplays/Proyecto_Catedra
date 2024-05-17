package Biblioteca.GUI;

import Biblioteca.DAL.ConexionMySQL;
import Biblioteca.DAL.RegistroUsuarios;
import Biblioteca.POJOS.Usuarios;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura Pineda
 */
public class Registrar extends javax.swing.JFrame {

    private RegistroUsuarios registrar = new RegistroUsuarios ((Connection) ConexionMySQL.obtenerConexion());
    
    private void LimpiarCajas(){
        
        txtCarnet.setText(null);
        txtUsuario.setText(null);
        txtNombre.setText(null);
        txtApellido.setText(null);
        txtClave.setText(null);
        txtCumple.setText(null);
        cobxPrivilegio.setSelectedIndex(0);
        cbxMostrar.setSelected(false);
        
    }
    public Registrar() {
        initComponents();
        txtClave.setEchoChar((char)0);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        pnlBg = new javax.swing.JPanel();
        pnlEncabezado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        pnlCuerpo = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtCarnet = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jLabel5 = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();
        jSeparator5 = new javax.swing.JSeparator();
        cbxMostrar = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        txtCumple = new javax.swing.JTextField();
        jSeparator6 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        cobxPrivilegio = new javax.swing.JComboBox<>();
        pnlGuardar = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        pnlRegresar = new javax.swing.JPanel();
        btnRegresar = new javax.swing.JLabel();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEncabezado.setBackground(new java.awt.Color(70, 119, 152));

        jLabel10.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Registrar Usuario");

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(228, 228, 228)
                .addComponent(jLabel10)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGap(40, 40, 40)
                .addComponent(jLabel10)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pnlCuerpo.setBackground(new java.awt.Color(197, 197, 197));

        jLabel1.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(66, 64, 64));
        jLabel1.setText("Carnet:");

        txtCarnet.setBackground(new java.awt.Color(197, 197, 197));
        txtCarnet.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtCarnet.setText("Ingrese su carnet");
        txtCarnet.setBorder(null);
        txtCarnet.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCarnetFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCarnetFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(66, 64, 64));
        jLabel2.setText("Usuario:");

        txtUsuario.setBackground(new java.awt.Color(197, 197, 197));
        txtUsuario.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtUsuario.setText("Ingrese su usuario");
        txtUsuario.setBorder(null);
        txtUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUsuarioFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(66, 64, 64));
        jLabel3.setText("Nombre:");

        txtNombre.setBackground(new java.awt.Color(197, 197, 197));
        txtNombre.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtNombre.setText("Ingrese su nombre");
        txtNombre.setBorder(null);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtNombreFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(66, 64, 64));
        jLabel4.setText("Apellido:");

        txtApellido.setBackground(new java.awt.Color(197, 197, 197));
        txtApellido.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtApellido.setText("Ingrese su apellido");
        txtApellido.setBorder(null);
        txtApellido.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtApellidoFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtApellidoFocusLost(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(66, 64, 64));
        jLabel5.setText("Contraseña:");

        txtClave.setBackground(new java.awt.Color(197, 197, 197));
        txtClave.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtClave.setText("jPasswordField1");
        txtClave.setBorder(null);
        txtClave.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtClaveFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtClaveFocusLost(evt);
            }
        });

        cbxMostrar.setBackground(new java.awt.Color(197, 197, 197));
        cbxMostrar.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        cbxMostrar.setForeground(new java.awt.Color(66, 64, 64));
        cbxMostrar.setText("Mostrar");
        cbxMostrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbxMostrarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 64, 64));
        jLabel6.setText("Fecha de nacimiento:");

        txtCumple.setBackground(new java.awt.Color(197, 197, 197));
        txtCumple.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtCumple.setText("yyyy-mm-dd");
        txtCumple.setBorder(null);

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 64, 64));
        jLabel7.setText("Rol:");

        cobxPrivilegio.setBackground(new java.awt.Color(197, 197, 197));
        cobxPrivilegio.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        cobxPrivilegio.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Administrador", "Profesor", "Estudiante" }));
        cobxPrivilegio.setBorder(null);

        pnlGuardar.setBackground(new java.awt.Color(197, 197, 197));
        pnlGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlGuardarMouseExited(evt);
            }
        });

        btnGuardar.setForeground(new java.awt.Color(66, 64, 64));
        btnGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/guardar.png"))); // NOI18N
        btnGuardar.setText("Guardar");
        btnGuardar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnGuardarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnGuardarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlGuardarLayout = new javax.swing.GroupLayout(pnlGuardar);
        pnlGuardar.setLayout(pnlGuardarLayout);
        pnlGuardarLayout.setHorizontalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGuardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlGuardarLayout.setVerticalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlGuardarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pnlRegresar.setBackground(new java.awt.Color(197, 197, 197));
        pnlRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        pnlRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlRegresarMouseExited(evt);
            }
        });

        btnRegresar.setBackground(new java.awt.Color(197, 197, 197));
        btnRegresar.setForeground(new java.awt.Color(66, 64, 64));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/regresar.png"))); // NOI18N
        btnRegresar.setText("Regresar");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRegresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRegresarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlRegresarLayout = new javax.swing.GroupLayout(pnlRegresar);
        pnlRegresar.setLayout(pnlRegresarLayout);
        pnlRegresarLayout.setHorizontalGroup(
            pnlRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegresarLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnRegresar)
                .addContainerGap())
        );
        pnlRegresarLayout.setVerticalGroup(
            pnlRegresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlCuerpoLayout = new javax.swing.GroupLayout(pnlCuerpo);
        pnlCuerpo.setLayout(pnlCuerpoLayout);
        pnlCuerpoLayout.setHorizontalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(pnlCuerpoLayout.createSequentialGroup()
                        .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator3)
                                    .addComponent(txtNombre)))
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator5)
                                    .addComponent(txtClave)))
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator1)
                                    .addComponent(txtCarnet, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator6)
                                    .addComponent(txtCumple, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE))))
                        .addGap(34, 34, 34)
                        .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cobxPrivilegio, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator4)
                                    .addComponent(txtApellido, javax.swing.GroupLayout.DEFAULT_SIZE, 197, Short.MAX_VALUE)))
                            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlCuerpoLayout.createSequentialGroup()
                                        .addComponent(jLabel2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(jSeparator2)
                                            .addComponent(txtUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 200, Short.MAX_VALUE)))
                                    .addComponent(cbxMostrar))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(78, 78, 78))
                    .addGroup(pnlCuerpoLayout.createSequentialGroup()
                        .addGap(85, 85, 85)
                        .addComponent(pnlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(183, 183, 183))))
        );
        pnlCuerpoLayout.setVerticalGroup(
            pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCuerpoLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2)
                    .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(30, 30, 30)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtClave, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbxMostrar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCumple, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7)
                    .addComponent(cobxPrivilegio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(pnlCuerpoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRegresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(46, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlCuerpo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addComponent(pnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCuerpo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegresarMouseEntered
        pnlRegresar.setBackground(new Color(149,147,147));
        btnRegresar.setForeground(new Color(0,0,0));
        btnRegresar.setFont(new Font("Dialog", Font.BOLD, 12));
    }//GEN-LAST:event_pnlRegresarMouseEntered

    private void pnlRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegresarMouseExited
        pnlRegresar.setBackground(new Color(197,197,197));
        btnRegresar.setForeground(new Color(66,64,64));
        btnRegresar.setFont(new Font("Dialog", Font.PLAIN, 12));
    }//GEN-LAST:event_pnlRegresarMouseExited

    private void pnlRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegresarMouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlRegresarMouseClicked

    private void btnRegresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseEntered
        pnlRegresar.setBackground(new Color(149,147,147));
        btnRegresar.setForeground(new Color(0,0,0));
        btnRegresar.setFont(new Font("Dialog", Font.BOLD, 12));
    }//GEN-LAST:event_btnRegresarMouseEntered

    private void btnRegresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseExited
        pnlRegresar.setBackground(new Color(197,197,197));
        btnRegresar.setForeground(new Color(66,64,64));
        btnRegresar.setFont(new Font("Dialog", Font.PLAIN, 12));
    }//GEN-LAST:event_btnRegresarMouseExited

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Inicio inicio = new Inicio();
        inicio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void btnGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseEntered
        pnlGuardar.setBackground(new Color(149,147,147));
        btnGuardar.setForeground(new Color(0,0,0));
        btnGuardar.setFont(new Font("Dialog", Font.BOLD, 12));
    }//GEN-LAST:event_btnGuardarMouseEntered

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
       
        if (txtCarnet.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Carnet no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtUsuario.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Usuario no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Nombre no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtApellido.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Apellido no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtClave.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Clave no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtCumple.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Cumpleaños no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (cobxPrivilegio.getSelectedItem()=="Seleccionar"){
                JOptionPane.showMessageDialog(null, "Por favor seleccionar un rol",
                    "Error", JOptionPane.ERROR_MESSAGE);  
        } else {
            String identificacion = txtCarnet.getText();
            String usuario = txtUsuario.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String clave = new String (txtClave.getPassword());
            String nacimiento = txtCumple.getText();
            String privilegio = (String) cobxPrivilegio.getSelectedItem();
            
            Usuarios registro = new Usuarios (identificacion, clave, nombre, apellido, usuario, nacimiento, privilegio);
                    
            if(registrar.RegistrarUser(registro)){
                JOptionPane.showMessageDialog(this, "Usuario Registrado correctamente",
                        "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar usuario",
                        "Registro fallido", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        LimpiarCajas();
        txtCarnet.requestFocus();
    }//GEN-LAST:event_btnGuardarMouseClicked

    private void btnGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseExited
        pnlGuardar.setBackground(new Color(197,197,197));
        btnGuardar.setForeground(new Color(66,64,64));
        btnGuardar.setFont(new Font("Dialog", Font.PLAIN, 12));
    }//GEN-LAST:event_btnGuardarMouseExited

    private void pnlGuardarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGuardarMouseEntered
        pnlGuardar.setBackground(new Color(149,147,147));
        btnGuardar.setForeground(new Color(0,0,0));
        btnGuardar.setFont(new Font("Dialog", Font.BOLD, 12));
    }//GEN-LAST:event_pnlGuardarMouseEntered

    private void pnlGuardarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGuardarMouseExited
        pnlGuardar.setBackground(new Color(197,197,197));
        btnGuardar.setForeground(new Color(66,64,64));
        btnGuardar.setFont(new Font("Dialog", Font.PLAIN, 12));
    }//GEN-LAST:event_pnlGuardarMouseExited

    private void pnlGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlGuardarMouseClicked
        if (txtCarnet.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Carnet no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtUsuario.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Usuario no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtNombre.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Nombre no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtApellido.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Apellido no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtClave.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Clave no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtCumple.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Cumpleaños no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (cobxPrivilegio.getSelectedItem()=="Seleccionar"){
                JOptionPane.showMessageDialog(null, "Por favor seleccionar un rol",
                    "Error", JOptionPane.ERROR_MESSAGE);  
        } else {
            String identificacion = txtCarnet.getText();
            String usuario = txtUsuario.getText();
            String nombre = txtNombre.getText();
            String apellido = txtApellido.getText();
            String clave = new String (txtClave.getPassword());
            String nacimiento = txtCumple.getText();
            String privilegio = (String) cobxPrivilegio.getSelectedItem();
            
            Usuarios registro = new Usuarios (identificacion, clave, nombre, apellido, usuario, nacimiento, privilegio);
                    
            if(registrar.RegistrarUser(registro)){
                JOptionPane.showMessageDialog(this, "Usuario Registrado correctamente",
                        "Registro Exitoso", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo registrar usuario",
                        "Registro fallido", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        LimpiarCajas();
        txtCarnet.requestFocus();
    }//GEN-LAST:event_pnlGuardarMouseClicked

    private void txtCarnetFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarnetFocusGained
        // TODO add your handling code here:
        if(txtCarnet.getText().equals("Ingrese su carnet"))
        {
            txtCarnet.setText("");
            txtCarnet.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtCarnetFocusGained

    private void txtCarnetFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCarnetFocusLost
        // TODO add your handling code here:
        if(txtCarnet.getText().equals(""))
        {
            txtCarnet.setText("Ingrese su carnet");
            txtCarnet.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtCarnetFocusLost

    private void txtUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusGained
        // TODO add your handling code here:
        if(txtUsuario.getText().equals("Ingrese su usuario"))
        {
            txtUsuario.setText("");
            txtUsuario.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtUsuarioFocusGained

    private void txtUsuarioFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUsuarioFocusLost
        // TODO add your handling code here:
        if(txtUsuario.getText().equals(""))
        {
            txtUsuario.setText("Ingrese su usuario");
            txtUsuario.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtUsuarioFocusLost

    private void txtNombreFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusGained
        // TODO add your handling code here:
        if(txtNombre.getText().equals("Ingrese su nombre"))
        {
            txtNombre.setText("");
            txtNombre.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtNombreFocusGained

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        if(txtNombre.getText().equals(""))
        {
            txtNombre.setText("Ingrese su nombre");
            txtNombre.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void txtApellidoFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusGained
        // TODO add your handling code here:
        if(txtApellido.getText().equals("Ingrese su apellido"))
        {
            txtApellido.setText("");
            txtApellido.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtApellidoFocusGained

    private void txtApellidoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtApellidoFocusLost
        // TODO add your handling code here:
        if(txtApellido.getText().equals(""))
        {
            txtApellido.setText("Ingrese su apellido");
            txtApellido.setForeground(new Color(0,0,0));
        }
    }//GEN-LAST:event_txtApellidoFocusLost

    private void txtClaveFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusGained
        // TODO add your handling code here:
        if(String.valueOf(txtClave.getPassword()).equals("Ingrese su Contraseña"))
        {
            txtClave.setText("");
            txtClave.setForeground(new Color(200,200,200));
            txtClave.setEchoChar('•');
        }
    }//GEN-LAST:event_txtClaveFocusGained

    private void txtClaveFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtClaveFocusLost
        // TODO add your handling code here:
        if(txtClave.getPassword().length<1)
        {
            txtClave.setEchoChar((char)0);
            txtClave.setText("Ingrese su Contraseña");
            txtClave.setForeground(new Color(200,200,200));
        }
    }//GEN-LAST:event_txtClaveFocusLost

    private void cbxMostrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbxMostrarActionPerformed
        // TODO add your handling code here:
        if(cbxMostrar.isSelected())
        {
            txtClave.setEchoChar((char)0);
        }else{
            txtClave.setEchoChar('•');
        }
    }//GEN-LAST:event_cbxMostrarActionPerformed

   
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
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Registrar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Registrar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JCheckBox cbxMostrar;
    private javax.swing.JComboBox<String> cobxPrivilegio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlCuerpo;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JPanel pnlRegresar;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtCumple;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

package Biblioteca.GUI;

import Biblioteca.DAL.ConexionMySQL;
import Biblioteca.DAL.RegistroUsuarios;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.sql.Connection;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

/**
 *
 * @author Laura Pineda
 */
public class Inicio extends javax.swing.JFrame {
    
    private RegistroUsuarios usuariologin = new RegistroUsuarios ((Connection) ConexionMySQL.obtenerConexion());

    public Inicio() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        imgLogo = new javax.swing.JLabel();
        pnlSalir = new javax.swing.JPanel();
        btnSalir = new javax.swing.JLabel();
        imgBiblioteca = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        txtIdentificacion = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        cbxMostrar = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        pnlIngresar = new javax.swing.JPanel();
        btnIngresar = new javax.swing.JLabel();
        btnRestablecer = new javax.swing.JLabel();
        pnlRegistrar = new javax.swing.JPanel();
        btnRegistrar = new javax.swing.JLabel();
        txtClave = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(70, 119, 152));

        imgLogo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/logo udb.png"))); // NOI18N

        pnlSalir.setBackground(new java.awt.Color(70, 119, 152));
        pnlSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlSalirMouseExited(evt);
            }
        });

        btnSalir.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnSalir.setForeground(new java.awt.Color(200, 200, 200));
        btnSalir.setText("Salir");
        btnSalir.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnSalir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnSalirMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnSalirMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnSalirMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlSalirLayout = new javax.swing.GroupLayout(pnlSalir);
        pnlSalir.setLayout(pnlSalirLayout);
        pnlSalirLayout.setHorizontalGroup(
            pnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalirLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(30, 30, 30))
        );
        pnlSalirLayout.setVerticalGroup(
            pnlSalirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlSalirLayout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(btnSalir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
        );

        imgBiblioteca.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/biblioteca.png"))); // NOI18N
        imgBiblioteca.setToolTipText("");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 245, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(imgBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(imgLogo, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addComponent(imgBiblioteca, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(69, 69, 69)
                .addComponent(pnlSalir, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jPanel2.setBackground(new java.awt.Color(142, 144, 145));
        jPanel2.setForeground(new java.awt.Color(88, 139, 173));

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Carnet:");

        txtIdentificacion.setBackground(new java.awt.Color(142, 144, 145));
        txtIdentificacion.setFont(new java.awt.Font("SansSerif", 1, 14)); // NOI18N
        txtIdentificacion.setForeground(new java.awt.Color(200, 200, 200));
        txtIdentificacion.setText("Ingrese su carnet");
        txtIdentificacion.setBorder(null);
        txtIdentificacion.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));

        jSeparator1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Contraseña:");

        jSeparator2.setBackground(new java.awt.Color(255, 255, 255));

        cbxMostrar.setBackground(new java.awt.Color(142, 144, 145));
        cbxMostrar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        cbxMostrar.setText("Mostrar");
        cbxMostrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cbxMostrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cbxMostrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                cbxMostrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                cbxMostrarMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                cbxMostrarMousePressed(evt);
            }
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                cbxMostrarMouseReleased(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Arial Narrow", 1, 36)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setText("Iniciar Sesión");

        pnlIngresar.setBackground(new java.awt.Color(142, 144, 145));
        pnlIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlIngresar.setPreferredSize(new java.awt.Dimension(154, 43));
        pnlIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlIngresarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlIngresarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlIngresarMouseExited(evt);
            }
        });

        btnIngresar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnIngresar.setForeground(new java.awt.Color(200, 200, 200));
        btnIngresar.setText("Ingresar");
        btnIngresar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnIngresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIngresarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlIngresarLayout = new javax.swing.GroupLayout(pnlIngresar);
        pnlIngresar.setLayout(pnlIngresarLayout);
        pnlIngresarLayout.setHorizontalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlIngresarLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(23, 23, 23))
        );
        pnlIngresarLayout.setVerticalGroup(
            pnlIngresarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlIngresarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        btnRestablecer.setText("¿Olvidó la contraseña?");
        btnRestablecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRestablecerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnRestablecerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnRestablecerMouseExited(evt);
            }
        });

        pnlRegistrar.setBackground(new java.awt.Color(142, 144, 145));
        pnlRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pnlRegistrar.setPreferredSize(new java.awt.Dimension(154, 43));
        pnlRegistrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlRegistrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlRegistrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlRegistrarMouseExited(evt);
            }
        });

        btnRegistrar.setFont(new java.awt.Font("Rockwell", 1, 18)); // NOI18N
        btnRegistrar.setForeground(new java.awt.Color(200, 200, 200));
        btnRegistrar.setText("Registrar");
        btnRegistrar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        javax.swing.GroupLayout pnlRegistrarLayout = new javax.swing.GroupLayout(pnlRegistrar);
        pnlRegistrar.setLayout(pnlRegistrarLayout);
        pnlRegistrarLayout.setHorizontalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlRegistrarLayout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(28, 28, 28))
        );
        pnlRegistrarLayout.setVerticalGroup(
            pnlRegistrarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlRegistrarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 35, Short.MAX_VALUE)
                .addContainerGap())
        );

        txtClave.setBackground(new java.awt.Color(142, 144, 145));
        txtClave.setFont(new java.awt.Font("SansSerif", 0, 14)); // NOI18N
        txtClave.setForeground(new java.awt.Color(200, 200, 200));
        txtClave.setText("jPasswordField1");
        txtClave.setBorder(null);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(14, 14, 14))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(271, 271, 271))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtIdentificacion)
                            .addComponent(jSeparator1)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(240, 240, 240))
                            .addComponent(txtClave))
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jSeparator2)
                        .addGap(54, 54, 54))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(6, 6, 6)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pnlIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 126, Short.MAX_VALUE)
                            .addComponent(btnRestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(174, 174, 174)
                                .addComponent(cbxMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addGap(91, 91, 91)
                                .addComponent(pnlRegistrar, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(60, 60, 60))))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(36, 36, 36)
                .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtIdentificacion)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtClave)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cbxMostrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRestablecer, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGap(8, 8, 8)))
                .addGap(22, 22, 22)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlRegistrar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE)
                    .addComponent(pnlIngresar, javax.swing.GroupLayout.DEFAULT_SIZE, 47, Short.MAX_VALUE))
                .addGap(31, 31, 31))
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 430, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.PREFERRED_SIZE, 700, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void pnlIngresarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresarMouseEntered
        btnIngresar.setForeground(new Color(255,255,255));
        pnlIngresar.setBackground(new Color(96,97,98));
    }//GEN-LAST:event_pnlIngresarMouseEntered

    private void pnlIngresarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresarMouseExited
        btnIngresar.setForeground(new Color(200,200,200));
        pnlIngresar.setBackground(new Color(142,144,145));
    }//GEN-LAST:event_pnlIngresarMouseExited

    private void pnlIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlIngresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pnlIngresarMouseClicked

    private void pnlRegistrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegistrarMouseClicked
        Registrar nuevoUsuario = new Registrar();
        nuevoUsuario.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlRegistrarMouseClicked

    private void pnlRegistrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegistrarMouseEntered
       btnRegistrar.setForeground(new Color(255,255,255));
        pnlRegistrar.setBackground(new Color(96,97,98));
    }//GEN-LAST:event_pnlRegistrarMouseEntered

    private void pnlRegistrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlRegistrarMouseExited
        btnRegistrar.setForeground(new Color(200,200,200));
        pnlRegistrar.setBackground(new Color(142,144,145));
    }//GEN-LAST:event_pnlRegistrarMouseExited

    private void cbxMostrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMostrarMouseEntered
        cbxMostrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_cbxMostrarMouseEntered

    private void cbxMostrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMostrarMouseExited
        cbxMostrar.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_cbxMostrarMouseExited

    private void cbxMostrarMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMostrarMousePressed
        cbxMostrar.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_cbxMostrarMousePressed

    private void cbxMostrarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMostrarMouseReleased
        cbxMostrar.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_cbxMostrarMouseReleased

    private void pnlSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalirMouseEntered
        pnlSalir.setBackground(new Color(1,79,133));
        btnSalir.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlSalirMouseEntered

    private void pnlSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalirMouseExited
        pnlSalir.setBackground(new Color(70,119,152));
        btnSalir.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_pnlSalirMouseExited

    private void pnlSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlSalirMouseClicked
        Object[] opciones = {"Aceptar", "Cancelar"};
        Component rootPane = null;
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea cerrar la aplicacion?",
                "Mensaje de confirmacion", JOptionPane.YES_NO_OPTION,
                QUESTION_MESSAGE, null, opciones, "Aceptar");

        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_pnlSalirMouseClicked

    private void btnSalirMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseEntered
        pnlSalir.setBackground(new Color(1,79,133));
        btnSalir.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnSalirMouseEntered

    private void btnSalirMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseExited
        pnlSalir.setBackground(new Color(70,119,152));
        btnSalir.setForeground(new Color(200,200,200));
    }//GEN-LAST:event_btnSalirMouseExited

    private void btnSalirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnSalirMouseClicked
        Object[] opciones = {"Aceptar", "Cancelar"};
        Component rootPane = null;
        int eleccion = JOptionPane.showOptionDialog(rootPane, "¿Desea cerrar la aplicacion?",
                "Mensaje de confirmacion", JOptionPane.YES_NO_OPTION,
                QUESTION_MESSAGE, null, opciones, "Aceptar");

        if (eleccion == JOptionPane.YES_OPTION) {
            System.exit(0);
        } else {

        }
    }//GEN-LAST:event_btnSalirMouseClicked

    private void btnRestablecerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestablecerMouseEntered
        btnRestablecer.setFont(new Font("Dialog", Font.BOLD, 12));
        btnRestablecer.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnRestablecerMouseEntered

    private void btnRestablecerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestablecerMouseExited
        btnRestablecer.setFont(new Font("Dialog", Font.PLAIN, 12));
        btnRestablecer.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnRestablecerMouseExited

    private void btnRestablecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRestablecerMouseClicked
        Restablecer cambio = new Restablecer();
        cambio.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRestablecerMouseClicked

    private void btnIngresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIngresarMouseClicked
        if(txtIdentificacion.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Carnet está vacío",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtClave.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Contraseña está vacío",
                    "Error", JOptionPane.ERROR_MESSAGE);
                } else if (!usuariologin.LocalizarUser(txtIdentificacion.getText().trim(),txtClave.getText().trim())){
                    JOptionPane.showMessageDialog(null, "Carnet o contraseña incorrecta"
                    + "\n Imposible encontrarlo",
                    "Error", JOptionPane.ERROR_MESSAGE);
                } else{
                        
                }
    }//GEN-LAST:event_btnIngresarMouseClicked

    private void cbxMostrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cbxMostrarMouseClicked
        if(cbxMostrar.isSelected()){
            txtClave.setEchoChar((char)0);
        } else{
            txtClave.setEchoChar('*');
        }
    }//GEN-LAST:event_cbxMostrarMouseClicked

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
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Inicio.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Inicio().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnIngresar;
    private javax.swing.JLabel btnRegistrar;
    private javax.swing.JLabel btnRestablecer;
    private javax.swing.JLabel btnSalir;
    private javax.swing.JCheckBox cbxMostrar;
    private javax.swing.JLabel imgBiblioteca;
    private javax.swing.JLabel imgLogo;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlIngresar;
    private javax.swing.JPanel pnlRegistrar;
    private javax.swing.JPanel pnlSalir;
    private javax.swing.JPasswordField txtClave;
    private javax.swing.JTextField txtIdentificacion;
    // End of variables declaration//GEN-END:variables
}

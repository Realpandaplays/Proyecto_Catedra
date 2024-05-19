/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package Biblioteca.Views;

import Biblioteca.DAL.ConexionMySQL;
import Biblioteca.DAL.InventarioMaterial;
import Biblioteca.POJOS.Material;
import java.awt.Color;
import java.awt.Font;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author DIEGO PADILLA
 */
public class Prestamo extends javax.swing.JPanel {
    
    private InventarioMaterial InventarioMaterial = new InventarioMaterial ((Connection) ConexionMySQL.obtenerConexion());
    private Material Pres = null;
    
    private void limpiarCajas(){
        txtId.setText(null);
        txtTitulo.setText(null);
        txtAutor.setText(null);
        txtDisponibilidad.setText(null);
        /*txtGenero.setText(null);*/
        
    }
    
    private void cargarCajas(Material Pres) {

       txtId.setText(Pres.getIdInterno());
        txtTitulo.setText(Pres.getTitulo());
        txtAutor.setText(Pres.getAutor());
        txtDisponibilidad.setText(String.valueOf(Pres.getDisponibilidad()));
        txtMaterial.setText(Pres.getTipoMaterial());

    }
    
    public Prestamo() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtAutor = new javax.swing.JTextField();
        bg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        txtTitulo = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jSeparator4 = new javax.swing.JSeparator();
        txtAutor1 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        jSeparator15 = new javax.swing.JSeparator();
        txtDisponibilidad = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jSeparator16 = new javax.swing.JSeparator();
        btnBuscarMaterial = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        txtCarnet = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnBuscar2 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        txtMaterial = new javax.swing.JTextField();

        txtAutor.setBackground(new java.awt.Color(241, 234, 234));
        txtAutor.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtAutor.setForeground(new java.awt.Color(100, 100, 100));
        txtAutor.setText("Ingrese el autor");
        txtAutor.setBorder(null);
        txtAutor.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAutorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAutorFocusLost(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/prestados.jpg"))); // NOI18N

        txtId.setBackground(new java.awt.Color(241, 234, 234));
        txtId.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtId.setForeground(new java.awt.Color(100, 100, 100));
        txtId.setText("Ingrese el Id Interno");
        txtId.setBorder(null);
        txtId.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtIdFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtIdFocusLost(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel2.setText("IdInterno:");

        txtTitulo.setBackground(new java.awt.Color(241, 234, 234));
        txtTitulo.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtTitulo.setForeground(new java.awt.Color(100, 100, 100));
        txtTitulo.setText("Ingrese el titulo");
        txtTitulo.setBorder(null);
        txtTitulo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtTituloFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtTituloFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Titulo:");

        txtAutor1.setBackground(new java.awt.Color(241, 234, 234));
        txtAutor1.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtAutor1.setForeground(new java.awt.Color(100, 100, 100));
        txtAutor1.setText("Ingrese el autor");
        txtAutor1.setBorder(null);
        txtAutor1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAutor1FocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAutor1FocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Autor:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("jLabel16");

        txtDisponibilidad.setBackground(new java.awt.Color(241, 234, 234));
        txtDisponibilidad.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtDisponibilidad.setForeground(new java.awt.Color(100, 100, 100));
        txtDisponibilidad.setText("Unidades disponibles");
        txtDisponibilidad.setBorder(null);
        txtDisponibilidad.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDisponibilidadFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDisponibilidadFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel15.setText("Disponibles:");

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Tipo material:");

        btnBuscarMaterial.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnBuscarMaterial.setForeground(new java.awt.Color(100, 100, 100));
        btnBuscarMaterial.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscarMaterial.setText("Buscar");
        btnBuscarMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMaterialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscarMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscarMaterialMouseExited(evt);
            }
        });

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

        jLabel6.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(66, 64, 64));
        jLabel6.setText("Carnet:");

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

        jLabel7.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(66, 64, 64));
        jLabel7.setText("Nombre:");

        btnBuscar2.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnBuscar2.setForeground(new java.awt.Color(100, 100, 100));
        btnBuscar2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnBuscar2.setText("Buscar");
        btnBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseExited(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Arial Black", 0, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(66, 64, 64));
        jLabel8.setText("Apellido:");

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

        txtMaterial.setBackground(new java.awt.Color(241, 234, 234));
        txtMaterial.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtMaterial.setForeground(new java.awt.Color(100, 100, 100));
        txtMaterial.setText("Tipo de Material");
        txtMaterial.setBorder(null);

        javax.swing.GroupLayout bgLayout = new javax.swing.GroupLayout(bg);
        bg.setLayout(bgLayout);
        bgLayout.setHorizontalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(bgLayout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator2)
                                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addGap(94, 94, 94)
                                .addComponent(btnBuscarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35))
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(bgLayout.createSequentialGroup()
                                    .addComponent(jLabel3)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtTitulo))
                                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                    .addComponent(jLabel4)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtAutor1))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, bgLayout.createSequentialGroup()
                                    .addComponent(jLabel15)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator15)
                                        .addComponent(txtDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(bgLayout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(bgLayout.createSequentialGroup()
                                        .addComponent(txtMaterial)
                                        .addGap(71, 71, 71))))
                            .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addGroup(bgLayout.createSequentialGroup()
                                    .addGap(102, 102, 102)
                                    .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bgLayout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jSeparator1)
                                        .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(bgLayout.createSequentialGroup()
                                    .addComponent(jLabel7)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(bgLayout.createSequentialGroup()
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(txtApellido))))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        bgLayout.setVerticalGroup(
            bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 599, Short.MAX_VALUE)
            .addGroup(bgLayout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(bgLayout.createSequentialGroup()
                        .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtAutor1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel15)
                    .addComponent(txtDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addComponent(jSeparator16, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCarnet, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnBuscar2, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(22, 22, 22)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(bgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(bg, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(bg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtAutorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorFocusGained
        // TODO add your handling code here:
        if(txtAutor.getText().equals("Ingrese el autor"))
        {
            txtAutor.setText("");
            txtAutor.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtAutorFocusGained

    private void txtAutorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutorFocusLost
        // TODO add your handling code here:
        if(txtAutor.getText().equals(""))
        {
            txtAutor.setText("Ingrese el autor");
            txtAutor.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtAutorFocusLost

    private void txtIdFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusGained
        // TODO add your handling code here:
        if(txtId.getText().equals("Ingrese el Id Interno"))
        {
            txtId.setText("");
            txtId.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtIdFocusGained

    private void txtIdFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtIdFocusLost
        // TODO add your handling code here:
        if(txtId.getText().equals(""))
        {
            txtId.setText("Ingrese el Id Interno");
            txtId.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtIdFocusLost

    private void txtTituloFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusGained
        // TODO add your handling code here:
        if(txtTitulo.getText().equals("Ingrese el titulo"))
        {
            txtTitulo.setText("");
            txtTitulo.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtTituloFocusGained

    private void txtTituloFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtTituloFocusLost
        // TODO add your handling code here:
        if(txtTitulo.getText().equals(""))
        {
            txtTitulo.setText("Ingrese el titulo");
            txtTitulo.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtTituloFocusLost

    private void txtAutor1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutor1FocusGained
        // TODO add your handling code here:
        if(txtAutor.getText().equals("Ingrese el autor"))
        {
            txtAutor.setText("");
            txtAutor.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtAutor1FocusGained

    private void txtAutor1FocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAutor1FocusLost
        // TODO add your handling code here:
        if(txtAutor.getText().equals(""))
        {
            txtAutor.setText("Ingrese el autor");
            txtAutor.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtAutor1FocusLost

    private void txtDisponibilidadFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDisponibilidadFocusGained
        // TODO add your handling code here:
        if(txtDisponibilidad.getText().equals("Unidades disponibles"))
        {
            txtDisponibilidad.setText("");
            txtDisponibilidad.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtDisponibilidadFocusGained

    private void txtDisponibilidadFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDisponibilidadFocusLost
        // TODO add your handling code here:
        if(txtDisponibilidad.getText().equals(""))
        {
            txtDisponibilidad.setText("Unidades disponibles");
            txtDisponibilidad.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtDisponibilidadFocusLost

    private void btnBuscarMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMaterialMouseClicked
        if (txtId.getText().trim().isEmpty()) {
            JOptionPane.showMessageDialog(null, "El campo Codigo no puede estar en blanco.", "Error",
                JOptionPane.ERROR_MESSAGE);
        } else if (!InventarioMaterial.LocalizarMaterial(txtId.getText().trim())) {
            JOptionPane.showMessageDialog(null, "No existe este codigo resgistrado."
                + "\n Busqueda Incompleta",
                "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            Pres = InventarioMaterial.seleccionarMaterial(txtId.getText().trim());
            cargarCajas(Pres);
            txtId.setEnabled(false);
            btnBuscarMaterial.requestFocus();
        }
    }//GEN-LAST:event_btnBuscarMaterialMouseClicked

    private void btnBuscarMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMaterialMouseEntered
        btnBuscar.setForeground(new Color(0,0,0));
        btnBuscar.setFont(new Font("Rockwell",Font.BOLD,18));
    }//GEN-LAST:event_btnBuscarMaterialMouseEntered

    private void btnBuscarMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMaterialMouseExited
        btnBuscar.setForeground(new Color(100,100,100));
        btnBuscar.setFont(new Font("Rockwell",Font.BOLD,14));
    }//GEN-LAST:event_btnBuscarMaterialMouseExited

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

    private void btnBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2MouseClicked

    private void btnBuscar2MouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseEntered
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2MouseEntered

    private void btnBuscar2MouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseExited
        // TODO add your handling code here:
    }//GEN-LAST:event_btnBuscar2MouseExited

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel bg;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnBuscar2;
    private javax.swing.JLabel btnBuscarMaterial;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator16;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtAutor1;
    private javax.swing.JTextField txtCarnet;
    private javax.swing.JTextField txtDisponibilidad;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtMaterial;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}

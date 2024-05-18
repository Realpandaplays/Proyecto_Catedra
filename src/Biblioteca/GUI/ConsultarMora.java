
package Biblioteca.GUI;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import Biblioteca.DAL.ConexionMySQL;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.sql.PreparedStatement;
import java.util.Locale;

/**
 *
 
 */
public class ConsultarMora extends javax.swing.JFrame {

    public ConsultarMora() {
        initComponents();
        jLabel2.setEnabled(false);
        txtMoraTotal.setEnabled(false);
        cargarTablaPrestamoMora();
        SetDate();
     
    }
    
    private void SetDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        txtFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
    }
    
        private void cargarTablaPrestamoMora(){
        LocalDate fechaActual = LocalDate.now();
            try {
                Connection con = ConexionMySQL.obtenerConexion();
                Statement st = con.createStatement();
                String sql = "SELECT usuario, fechaPrestamo FROM prestamos WHERE fecha_devolucion IS NULL";
                ResultSet rs = st.executeQuery(sql);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                DefaultTableModel tblTablaPrestamoMora = (DefaultTableModel) jTable.getModel();
                tblTablaPrestamoMora.setRowCount(0); 

                    while (rs.next()) {
                        String usuario = rs.getString("usuario");
                        String fechaPrestamoStr = rs.getString("fechaPrestamo"); 
                        LocalDate fechaPrestamo = LocalDate.parse(fechaPrestamoStr, formatter); 
                        long diasTranscurridos = ChronoUnit.DAYS.between(fechaPrestamo, fechaActual);

                        if (diasTranscurridos > 4) {
                            double mora = (diasTranscurridos - 4) * 0.25;
                            String tbData[] = {usuario, fechaPrestamo.toString(), String.valueOf(diasTranscurridos - 4), "$" + String.valueOf(mora)};
                            tblTablaPrestamoMora.addRow(tbData);
                        }
                    }
                    con.close();

                        if (tblTablaPrestamoMora.getRowCount() == 0){
                            JOptionPane.showMessageDialog(null, "No hay datos para mostrar en la tabla.", "Información", JOptionPane.INFORMATION_MESSAGE);
                        }
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
    }


    private void cargarTablaPrestamoMoraUsuario(String usuario) {
    LocalDate fechaActual = LocalDate.now();
    double totalMora = 0.0;
        try {
            Connection con = ConexionMySQL.obtenerConexion();
            Statement st = con.createStatement();
            String sql = "SELECT usuario, fechaPrestamo FROM prestamos WHERE fecha_devolucion IS NULL AND usuario = ?";
            PreparedStatement pstmt = con.prepareStatement(sql);
            pstmt.setString(1, usuario);
            ResultSet rs = pstmt.executeQuery();
            DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

            DefaultTableModel tblTablaPrestamoMora = (DefaultTableModel) jTable.getModel();
            tblTablaPrestamoMora.setRowCount(0);

                if (rs.next()){

                    do {
                        String fechaPrestamoStr = rs.getString("fechaPrestamo");
                        LocalDate fechaPrestamo = LocalDate.parse(fechaPrestamoStr, formatter);
                        long diasTranscurridos = ChronoUnit.DAYS.between(fechaPrestamo, fechaActual);

                            if (diasTranscurridos > 4) {
                                long diasConMora = diasTranscurridos - 4;
                                double mora = diasConMora * 0.25;
                                totalMora += mora;
                                String tbData[] = {usuario, fechaPrestamo.toString(), String.valueOf(diasConMora), "$" + String.valueOf(mora)};
                                tblTablaPrestamoMora.addRow(tbData);
                            }
                    }while (rs.next());
                    txtMoraTotal.setText("$" + String.valueOf(totalMora));
                }else{
                    JOptionPane.showMessageDialog(null, "El usuario no existe", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
                }
            con.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }
}
    private void cargarTablaPrestamoMoraAno(String año){
    LocalDate fechaActual = LocalDate.now();
    try {
        Connection con = ConexionMySQL.obtenerConexion();
        String sql = "SELECT usuario, fechaPrestamo FROM prestamos WHERE fecha_devolucion IS NULL AND YEAR(fechaPrestamo) = ?";
        PreparedStatement pstmt = con.prepareStatement(sql);
        pstmt.setString(1, año);
        ResultSet rs = pstmt.executeQuery();  
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        DefaultTableModel tblTablaPrestamoMora = (DefaultTableModel) jTable.getModel();
        tblTablaPrestamoMora.setRowCount(0); 


        if (!rs.next()) {
            JOptionPane.showMessageDialog(null, "No hay registros para el año " + año, "Sin registros", JOptionPane.INFORMATION_MESSAGE);
            con.close();
            return; 
        }

 
        do {
            String usuario = rs.getString("usuario");
            String fechaPrestamoStr = rs.getString("fechaPrestamo"); 
            LocalDate fechaPrestamo = LocalDate.parse(fechaPrestamoStr, formatter); 
            long diasTranscurridos = ChronoUnit.DAYS.between(fechaPrestamo, fechaActual);

            if (diasTranscurridos > 4) {
                double mora = (diasTranscurridos - 4) * 0.25;
                String tbData[] = {usuario, fechaPrestamo.toString(), String.valueOf(diasTranscurridos - 4), "$" + String.valueOf(mora)};
                tblTablaPrestamoMora.addRow(tbData);
            }
        } while (rs.next());

        con.close();
    } catch (Exception e) {
        JOptionPane.showMessageDialog(null, "Un error ha ocurrido: " + e, "Error", JOptionPane.ERROR_MESSAGE);
    }
}

 
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlEncabezado = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        txtUsuario = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        btnRegresar = new javax.swing.JLabel();
        txtMoraTotal = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JLabel();
        btnBuscar1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtAno = new javax.swing.JTextField();
        btnBuscar2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlEncabezado.setBackground(new java.awt.Color(70, 119, 152));

        jLabel10.setFont(new java.awt.Font("Cooper Black", 0, 24)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(255, 255, 255));
        jLabel10.setText("Consultar Mora");

        txtFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout pnlEncabezadoLayout = new javax.swing.GroupLayout(pnlEncabezado);
        pnlEncabezado.setLayout(pnlEncabezadoLayout);
        pnlEncabezadoLayout.setHorizontalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addGroup(pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                        .addGap(287, 287, 287)
                        .addComponent(txtFecha, javax.swing.GroupLayout.PREFERRED_SIZE, 386, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                        .addGap(312, 312, 312)
                        .addComponent(jLabel10)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlEncabezadoLayout.setVerticalGroup(
            pnlEncabezadoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEncabezadoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel10)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(txtFecha)
                .addContainerGap())
        );

        jTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nombre de usuario", "Fecha de préstamo", "Días transcurridos con mora", "Mora actual"
            }
        ));
        jScrollPane1.setViewportView(jTable);

        jLabel1.setText("Buscar un usuario:");

        btnRegresar.setBackground(new java.awt.Color(197, 197, 197));
        btnRegresar.setForeground(new java.awt.Color(66, 64, 64));
        btnRegresar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/regresar.png"))); // NOI18N
        btnRegresar.setText("Regresar al menú principal");
        btnRegresar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnRegresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnRegresarMouseClicked(evt);
            }
        });

        txtMoraTotal.setEditable(false);
        txtMoraTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMoraTotalActionPerformed(evt);
            }
        });

        jLabel2.setText("La mora total que posee el usuario es de:");

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("Buscar Usuario");
        btnBuscar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscarMouseClicked(evt);
            }
        });

        btnBuscar1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/buscar.png"))); // NOI18N
        btnBuscar1.setText("Volver a buscar todos los usuarios");
        btnBuscar1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar1MouseClicked(evt);
            }
        });

        jLabel3.setText("Filtrar registros por año:");

        btnBuscar2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/buscar.png"))); // NOI18N
        btnBuscar2.setText("Filtrar por año");
        btnBuscar2.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnBuscar2MouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlEncabezado, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 683, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 43, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 217, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(btnBuscar1))
                        .addGap(31, 31, 31))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(104, 104, 104)
                                .addComponent(jLabel1))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(36, 36, 36)
                                .addComponent(jLabel2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addComponent(btnBuscar2))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(80, 80, 80)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel3)
                                    .addComponent(btnBuscar))))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtMoraTotal, javax.swing.GroupLayout.DEFAULT_SIZE, 285, Short.MAX_VALUE)
                                .addContainerGap())
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtAno)
                                .addContainerGap())))))
            .addGroup(layout.createSequentialGroup()
                .addGap(703, 703, 703)
                .addComponent(txtUsuario)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(pnlEncabezado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnBuscar2)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtMoraTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnBuscar1)
                        .addGap(2, 2, 2)
                        .addComponent(btnRegresar, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnRegresarMouseClicked
        Principal_Admin menuAdmin = new Principal_Admin();
        menuAdmin.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnRegresarMouseClicked

    private void txtMoraTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMoraTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMoraTotalActionPerformed

    private void btnBuscarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscarMouseClicked
        String usuarioIngresado = txtUsuario.getText().trim();
    if (usuarioIngresado.isEmpty()) {
        JOptionPane.showMessageDialog(null, "Por favor, ingrese un nombre de usuario", "Campo vacío", JOptionPane.WARNING_MESSAGE);
    } else {
        cargarTablaPrestamoMoraUsuario(usuarioIngresado);
        jLabel2.setEnabled(true);
        txtMoraTotal.setEnabled(true);
        txtUsuario.setText(null);
        txtAno.setText(null);
    }
    }//GEN-LAST:event_btnBuscarMouseClicked

    private void btnBuscar1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar1MouseClicked
        cargarTablaPrestamoMora();
        jLabel2.setEnabled(false);
        txtMoraTotal.setEnabled(false);
        txtMoraTotal.setText(null);
        txtUsuario.setText(null);
        txtAno.setText(null);
    }//GEN-LAST:event_btnBuscar1MouseClicked

    private void btnBuscar2MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnBuscar2MouseClicked
        String año = txtAno.getText().trim();
        if (año.isEmpty()) {
            JOptionPane.showMessageDialog(null, "Por favor, ingrese un año", "Campo vacío", JOptionPane.WARNING_MESSAGE);
        }else {
            int year = Integer.parseInt(año);
            LocalDate now = LocalDate.now();
            int currentYear = now.getYear();
                if (year > currentYear) {
                    JOptionPane.showMessageDialog(null, "El año ingresado no puede ser mayor que el año actual (" + currentYear + ")", "Año inválido", JOptionPane.WARNING_MESSAGE);
                } else if (year <= 2024) {
                    cargarTablaPrestamoMoraAno(año);
                    txtAno.setText(null);
                    txtUsuario.setText(null);
                    jLabel2.setEnabled(false);
                    txtMoraTotal.setEnabled(false);
                    txtMoraTotal.setText(null);
                } else {
                    JOptionPane.showMessageDialog(null, "El año ingresado no puede ser mayor que 2024", "Año inválido", JOptionPane.WARNING_MESSAGE);
                }
        }

    }//GEN-LAST:event_btnBuscar2MouseClicked

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
            java.util.logging.Logger.getLogger(ConsultarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarMora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarMora().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnBuscar1;
    private javax.swing.JLabel btnBuscar2;
    private javax.swing.JLabel btnRegresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable;
    private javax.swing.JPanel pnlEncabezado;
    private javax.swing.JTextField txtAno;
    private javax.swing.JLabel txtFecha;
    private javax.swing.JTextField txtMoraTotal;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}

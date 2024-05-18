package Biblioteca.GUI;

import Biblioteca.Views.AgregarMaterial;
import java.awt.BorderLayout;
import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author Laura Pineda
 */
public class Principal_Profesor extends javax.swing.JFrame {

    
    public Principal_Profesor() {
        initComponents();
        SetDate();
    }

    private void SetDate(){
        LocalDate now = LocalDate.now();
        Locale spanishLocale = new Locale("es", "ES");
        txtFecha.setText(now.format(DateTimeFormatter.ofPattern("'Hoy es' EEEE dd 'de' MMMM 'de' yyyy", spanishLocale)));
        /*int year = now.getYear();
        int dia = now.getDayOfMonth();
        int month = now.getMonthValue();
        String[] meses = ("Enero", "Febero", "Marzo", "Abril", "Mayo", "Junio", "Julio",
        "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre");
        
        txtFecha.setText("Fecha: "+dia+" de "+meses[month - 1]+" de "+year);*/
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        pnlMenu = new javax.swing.JPanel();
        pnlMaterial = new javax.swing.JPanel();
        btnMaterial = new javax.swing.JLabel();
        pnlConsultarMaterial = new javax.swing.JPanel();
        btnConsultarMaterial = new javax.swing.JLabel();
        pnlPrestar = new javax.swing.JPanel();
        btnPrestamo = new javax.swing.JLabel();
        pnlDevolver = new javax.swing.JPanel();
        btnDevolver = new javax.swing.JLabel();
        pnlListarPrestamos = new javax.swing.JPanel();
        btnConsPrestamo = new javax.swing.JLabel();
        pnlAgregarMat = new javax.swing.JPanel();
        btnAgregarMat = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(88, 139, 173));

        pnlMaterial.setBackground(new java.awt.Color(88, 139, 173));

        btnMaterial.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnMaterial.setText("Modificar material");

        javax.swing.GroupLayout pnlMaterialLayout = new javax.swing.GroupLayout(pnlMaterial);
        pnlMaterial.setLayout(pnlMaterialLayout);
        pnlMaterialLayout.setHorizontalGroup(
            pnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaterialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(25, 25, 25))
        );
        pnlMaterialLayout.setVerticalGroup(
            pnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaterialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(19, 19, 19))
        );

        pnlConsultarMaterial.setBackground(new java.awt.Color(88, 139, 173));

        btnConsultarMaterial.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnConsultarMaterial.setText("Consultar material");

        javax.swing.GroupLayout pnlConsultarMaterialLayout = new javax.swing.GroupLayout(pnlConsultarMaterial);
        pnlConsultarMaterial.setLayout(pnlConsultarMaterialLayout);
        pnlConsultarMaterialLayout.setHorizontalGroup(
            pnlConsultarMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarMaterialLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnConsultarMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConsultarMaterialLayout.setVerticalGroup(
            pnlConsultarMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultarMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlPrestar.setBackground(new java.awt.Color(88, 139, 173));

        btnPrestamo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnPrestamo.setText("Préstamo");

        javax.swing.GroupLayout pnlPrestarLayout = new javax.swing.GroupLayout(pnlPrestar);
        pnlPrestar.setLayout(pnlPrestarLayout);
        pnlPrestarLayout.setHorizontalGroup(
            pnlPrestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPrestarLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlPrestarLayout.setVerticalGroup(
            pnlPrestarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPrestarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlDevolver.setBackground(new java.awt.Color(88, 139, 173));

        btnDevolver.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnDevolver.setText("Devolución");

        javax.swing.GroupLayout pnlDevolverLayout = new javax.swing.GroupLayout(pnlDevolver);
        pnlDevolver.setLayout(pnlDevolverLayout);
        pnlDevolverLayout.setHorizontalGroup(
            pnlDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDevolverLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlDevolverLayout.setVerticalGroup(
            pnlDevolverLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDevolverLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnDevolver, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlListarPrestamos.setBackground(new java.awt.Color(88, 139, 173));

        btnConsPrestamo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnConsPrestamo.setText("Consultar préstamos");

        javax.swing.GroupLayout pnlListarPrestamosLayout = new javax.swing.GroupLayout(pnlListarPrestamos);
        pnlListarPrestamos.setLayout(pnlListarPrestamosLayout);
        pnlListarPrestamosLayout.setHorizontalGroup(
            pnlListarPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlListarPrestamosLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnConsPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 150, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlListarPrestamosLayout.setVerticalGroup(
            pnlListarPrestamosLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlListarPrestamosLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlAgregarMat.setBackground(new java.awt.Color(88, 139, 173));
        pnlAgregarMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlAgregarMatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlAgregarMatMouseExited(evt);
            }
        });

        btnAgregarMat.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnAgregarMat.setText("Agregar Material");
        btnAgregarMat.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAgregarMatMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnAgregarMatMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnAgregarMatMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlAgregarMatLayout = new javax.swing.GroupLayout(pnlAgregarMat);
        pnlAgregarMat.setLayout(pnlAgregarMatLayout);
        pnlAgregarMatLayout.setHorizontalGroup(
            pnlAgregarMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAgregarMatLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(btnAgregarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAgregarMatLayout.setVerticalGroup(
            pnlAgregarMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarMatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlAgregarMat, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMenuLayout.createSequentialGroup()
                        .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(pnlListarPrestamos, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlDevolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlPrestar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pnlConsultarMaterial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addContainerGap())))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addGap(65, 65, 65)
                .addComponent(pnlAgregarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConsultarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlListarPrestamos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(75, Short.MAX_VALUE))
        );

        pnlHeader.setBackground(new java.awt.Color(88, 139, 173));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido/a a la libreria");

        txtFecha.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        txtFecha.setForeground(new java.awt.Color(255, 255, 255));
        txtFecha.setText("Hoy es {dayname} {day} de {month} de {year}");

        javax.swing.GroupLayout pnlHeaderLayout = new javax.swing.GroupLayout(pnlHeader);
        pnlHeader.setLayout(pnlHeaderLayout);
        pnlHeaderLayout.setHorizontalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addGroup(pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(161, 161, 161)
                        .addComponent(jLabel1))
                    .addGroup(pnlHeaderLayout.createSequentialGroup()
                        .addGap(153, 153, 153)
                        .addComponent(txtFecha)))
                .addContainerGap(329, Short.MAX_VALUE))
        );
        pnlHeaderLayout.setVerticalGroup(
            pnlHeaderLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlHeaderLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtFecha)
                .addContainerGap())
        );

        Content.setBackground(new java.awt.Color(241, 234, 234));
        Content.setPreferredSize(new java.awt.Dimension(765, 590));

        javax.swing.GroupLayout ContentLayout = new javax.swing.GroupLayout(Content);
        Content.setLayout(ContentLayout);
        ContentLayout.setHorizontalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 570, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 786, Short.MAX_VALUE)))
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, 570, Short.MAX_VALUE))
            .addComponent(pnlMenu, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlHeader, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

    private void btnAgregarMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMatMouseClicked
        AgregarMaterial pl = new AgregarMaterial();
        pl.setSize(765,590);
        pl.setLocation(0,0);
        Content.removeAll();
        Content.add(pl, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_btnAgregarMatMouseClicked

    private void btnAgregarMatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMatMouseEntered
        // TODO add your handling code here:
        pnlAgregarMat.setBackground(new Color(0,103,172));
        btnAgregarMat.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnAgregarMatMouseEntered

    private void btnAgregarMatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMatMouseExited
        // TODO add your handling code here:
        pnlAgregarMat.setBackground(new Color(88,139,173));
        btnAgregarMat.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnAgregarMatMouseExited

    private void pnlAgregarMatMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgregarMatMouseEntered
        // TODO add your handling code here:
        pnlAgregarMat.setBackground(new Color(0,103,172));
        btnAgregarMat.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlAgregarMatMouseEntered

    private void pnlAgregarMatMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlAgregarMatMouseExited
        // TODO add your handling code here:
        pnlAgregarMat.setBackground(new Color(88,139,173));
        btnAgregarMat.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlAgregarMatMouseExited

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
            java.util.logging.Logger.getLogger(Principal_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Profesor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Profesor().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel btnAgregarMat;
    private javax.swing.JLabel btnConsPrestamo;
    private javax.swing.JLabel btnConsultarMaterial;
    private javax.swing.JLabel btnDevolver;
    private javax.swing.JLabel btnMaterial;
    private javax.swing.JLabel btnPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlAgregarMat;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlConsultarMaterial;
    private javax.swing.JPanel pnlDevolver;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlListarPrestamos;
    private javax.swing.JPanel pnlMaterial;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrestar;
    private javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables
}

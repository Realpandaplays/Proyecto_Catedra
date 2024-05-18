package Biblioteca.GUI;

import java.awt.Color;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import Biblioteca.Views.AgregarMaterial;
import java.awt.BorderLayout;

/**
 *
 * @author Laura Pineda
 */
public class Principal_Admin extends javax.swing.JFrame {

    
    public Principal_Admin() {
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
        pnlAgregarMat = new javax.swing.JPanel();
        btnAgregarMat = new javax.swing.JLabel();
        pnlMaterial = new javax.swing.JPanel();
        btnMaterial = new javax.swing.JLabel();
        pnlConsultarMaterial = new javax.swing.JPanel();
        btnConsultarMaterial = new javax.swing.JLabel();
        pnlPrestar = new javax.swing.JPanel();
        btnPrestamo = new javax.swing.JLabel();
        pnlDevolver = new javax.swing.JPanel();
        btnDevolver = new javax.swing.JLabel();
        pnlConsulPrestamo = new javax.swing.JPanel();
        btnConsulPrestamo = new javax.swing.JLabel();
        pnlConfPrestamo = new javax.swing.JPanel();
        btnConfPrestamo = new javax.swing.JLabel();
        pnlCalcularMora = new javax.swing.JPanel();
        btnCalcularMora = new javax.swing.JLabel();
        pnlHeader = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtFecha = new javax.swing.JLabel();
        Content = new javax.swing.JPanel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        pnlMenu.setBackground(new java.awt.Color(88, 139, 173));

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
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarMatLayout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(btnAgregarMat, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAgregarMatLayout.setVerticalGroup(
            pnlAgregarMatLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAgregarMatLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAgregarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pnlMaterial.setBackground(new java.awt.Color(88, 139, 173));
        pnlMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlMaterialMouseExited(evt);
            }
        });

        btnMaterial.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnMaterial.setText("Modificar material");
        btnMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnMaterialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlMaterialLayout = new javax.swing.GroupLayout(pnlMaterial);
        pnlMaterial.setLayout(pnlMaterialLayout);
        pnlMaterialLayout.setHorizontalGroup(
            pnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaterialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31))
        );
        pnlMaterialLayout.setVerticalGroup(
            pnlMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlMaterialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        pnlConsultarMaterial.setBackground(new java.awt.Color(88, 139, 173));
        pnlConsultarMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlConsultarMaterialMouseClicked(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlConsultarMaterialMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                pnlConsultarMaterialMousePressed(evt);
            }
        });

        btnConsultarMaterial.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnConsultarMaterial.setText("Consultar material");
        btnConsultarMaterial.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsultarMaterialMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsultarMaterialMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsultarMaterialMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlConsultarMaterialLayout = new javax.swing.GroupLayout(pnlConsultarMaterial);
        pnlConsultarMaterial.setLayout(pnlConsultarMaterialLayout);
        pnlConsultarMaterialLayout.setHorizontalGroup(
            pnlConsultarMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsultarMaterialLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConsultarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(33, 33, 33))
        );
        pnlConsultarMaterialLayout.setVerticalGroup(
            pnlConsultarMaterialLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsultarMaterialLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsultarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlPrestar.setBackground(new java.awt.Color(88, 139, 173));
        pnlPrestar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlPrestarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlPrestarMouseExited(evt);
            }
        });

        btnPrestamo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnPrestamo.setText("Préstamo");
        btnPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnPrestamoMouseExited(evt);
            }
        });

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
                .addComponent(btnPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlDevolver.setBackground(new java.awt.Color(88, 139, 173));
        pnlDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlDevolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlDevolverMouseExited(evt);
            }
        });

        btnDevolver.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnDevolver.setText("Devolución");
        btnDevolver.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnDevolverMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnDevolverMouseExited(evt);
            }
        });

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
                .addComponent(btnDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlConsulPrestamo.setBackground(new java.awt.Color(88, 139, 173));
        pnlConsulPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlConsulPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlConsulPrestamoMouseExited(evt);
            }
        });

        btnConsulPrestamo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnConsulPrestamo.setText("Consultar préstamos");
        btnConsulPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnConsulPrestamoMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConsulPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConsulPrestamoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlConsulPrestamoLayout = new javax.swing.GroupLayout(pnlConsulPrestamo);
        pnlConsulPrestamo.setLayout(pnlConsulPrestamoLayout);
        pnlConsulPrestamoLayout.setHorizontalGroup(
            pnlConsulPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConsulPrestamoLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(btnConsulPrestamo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlConsulPrestamoLayout.setVerticalGroup(
            pnlConsulPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConsulPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConsulPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlConfPrestamo.setBackground(new java.awt.Color(88, 139, 173));
        pnlConfPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlConfPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlConfPrestamoMouseExited(evt);
            }
        });

        btnConfPrestamo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnConfPrestamo.setText("Configurar préstamos");
        btnConfPrestamo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnConfPrestamoMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnConfPrestamoMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlConfPrestamoLayout = new javax.swing.GroupLayout(pnlConfPrestamo);
        pnlConfPrestamo.setLayout(pnlConfPrestamoLayout);
        pnlConfPrestamoLayout.setHorizontalGroup(
            pnlConfPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlConfPrestamoLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnConfPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlConfPrestamoLayout.setVerticalGroup(
            pnlConfPrestamoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlConfPrestamoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnConfPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pnlCalcularMora.setBackground(new java.awt.Color(88, 139, 173));
        pnlCalcularMora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                pnlCalcularMoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                pnlCalcularMoraMouseExited(evt);
            }
        });

        btnCalcularMora.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnCalcularMora.setText("Calcular mora");
        btnCalcularMora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                btnCalcularMoraMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                btnCalcularMoraMouseExited(evt);
            }
        });

        javax.swing.GroupLayout pnlCalcularMoraLayout = new javax.swing.GroupLayout(pnlCalcularMora);
        pnlCalcularMora.setLayout(pnlCalcularMoraLayout);
        pnlCalcularMoraLayout.setHorizontalGroup(
            pnlCalcularMoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlCalcularMoraLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnCalcularMora, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlCalcularMoraLayout.setVerticalGroup(
            pnlCalcularMoraLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlCalcularMoraLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnCalcularMora, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout pnlMenuLayout = new javax.swing.GroupLayout(pnlMenu);
        pnlMenu.setLayout(pnlMenuLayout);
        pnlMenuLayout.setHorizontalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(pnlCalcularMora, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlConfPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlDevolver, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlPrestar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlAgregarMat, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlMaterial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 168, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(pnlConsultarMaterial, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(pnlConsulPrestamo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 31, Short.MAX_VALUE))
        );
        pnlMenuLayout.setVerticalGroup(
            pnlMenuLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlMenuLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(pnlAgregarMat, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlConsultarMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlPrestar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlDevolver, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(pnlConsulPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(pnlConfPrestamo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pnlCalcularMora, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27))
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
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
            .addGap(0, 765, Short.MAX_VALUE)
        );
        ContentLayout.setVerticalGroup(
            ContentLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 590, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addGap(190, 190, 190)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlHeader, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(Content, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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

    private void pnlMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMaterialMouseEntered
        pnlMaterial.setBackground(new Color(0,103,172));
        btnMaterial.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlMaterialMouseEntered

    private void pnlMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlMaterialMouseExited
        pnlMaterial.setBackground(new Color(88,139,173));
        btnMaterial.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlMaterialMouseExited

    private void btnMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMouseEntered
        pnlMaterial.setBackground(new Color(0,103,172));
        btnMaterial.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnMaterialMouseEntered

    private void btnMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnMaterialMouseExited
        pnlMaterial.setBackground(new Color(88,139,173));
        btnMaterial.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnMaterialMouseExited

    private void btnConsultarMaterialMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMaterialMouseEntered
        pnlConsultarMaterial.setBackground(new Color(0,103,172));
        btnConsultarMaterial.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnConsultarMaterialMouseEntered

    private void btnConsultarMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMaterialMouseExited
        pnlConsultarMaterial.setBackground(new Color(88,139,173));
        btnConsultarMaterial.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnConsultarMaterialMouseExited

    private void pnlPrestarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrestarMouseEntered
        pnlPrestar.setBackground(new Color(0,103,172));
        btnPrestamo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlPrestarMouseEntered

    private void pnlPrestarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPrestarMouseExited
        pnlPrestar.setBackground(new Color(88,139,173));
        btnPrestamo.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlPrestarMouseExited

    private void btnPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoMouseEntered
        pnlPrestar.setBackground(new Color(0,103,172));
        btnPrestamo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnPrestamoMouseEntered

    private void btnPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPrestamoMouseExited
        pnlPrestar.setBackground(new Color(88,139,173));
        btnPrestamo.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnPrestamoMouseExited

    private void pnlDevolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDevolverMouseEntered
        pnlDevolver.setBackground(new Color(0,103,172));
        btnDevolver.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlDevolverMouseEntered

    private void pnlDevolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDevolverMouseExited
        pnlDevolver.setBackground(new Color(88,139,173));
        btnDevolver.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlDevolverMouseExited

    private void btnDevolverMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMouseEntered
        pnlDevolver.setBackground(new Color(0,103,172));
        btnDevolver.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnDevolverMouseEntered

    private void btnDevolverMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnDevolverMouseExited
        pnlDevolver.setBackground(new Color(88,139,173));
        btnDevolver.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnDevolverMouseExited

    private void pnlConsulPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulPrestamoMouseEntered
        pnlConsulPrestamo.setBackground(new Color(0,103,172));
        btnConsulPrestamo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlConsulPrestamoMouseEntered

    private void pnlConsulPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsulPrestamoMouseExited
        pnlConsulPrestamo.setBackground(new Color(88,139,173));
        btnConsulPrestamo.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlConsulPrestamoMouseExited

    private void btnConsulPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsulPrestamoMouseEntered
        pnlConsulPrestamo.setBackground(new Color(0,103,172));
        btnConsulPrestamo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnConsulPrestamoMouseEntered

    private void btnConsulPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsulPrestamoMouseExited
        pnlConsulPrestamo.setBackground(new Color(88,139,173));
        btnConsulPrestamo.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnConsulPrestamoMouseExited

    private void pnlConfPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfPrestamoMouseEntered
        pnlConfPrestamo.setBackground(new Color(0,103,172));
        btnConfPrestamo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlConfPrestamoMouseEntered

    private void pnlConfPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConfPrestamoMouseExited
        pnlConfPrestamo.setBackground(new Color(88,139,173));
        btnConfPrestamo.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlConfPrestamoMouseExited

    private void btnConfPrestamoMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfPrestamoMouseEntered
        pnlConfPrestamo.setBackground(new Color(0,103,172));
        btnConfPrestamo.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnConfPrestamoMouseEntered

    private void btnConfPrestamoMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConfPrestamoMouseExited
        pnlConfPrestamo.setBackground(new Color(88,139,173));
        btnConfPrestamo.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnConfPrestamoMouseExited

    private void pnlCalcularMoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCalcularMoraMouseEntered
        pnlCalcularMora.setBackground(new Color(0,103,172));
        btnCalcularMora.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_pnlCalcularMoraMouseEntered

    private void pnlCalcularMoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlCalcularMoraMouseExited
        pnlCalcularMora.setBackground(new Color(88,139,173));
        btnCalcularMora.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlCalcularMoraMouseExited

    private void btnCalcularMoraMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMoraMouseEntered
        pnlCalcularMora.setBackground(new Color(0,103,172));
        btnCalcularMora.setForeground(new Color(255,255,255));
    }//GEN-LAST:event_btnCalcularMoraMouseEntered

    private void btnCalcularMoraMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnCalcularMoraMouseExited
        pnlCalcularMora.setBackground(new Color(88,139,173));
        btnCalcularMora.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_btnCalcularMoraMouseExited

    private void btnConsultarMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsultarMaterialMouseClicked
        // TODO add your handling code here:
        Consultar consultar = new Consultar();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsultarMaterialMouseClicked

    private void pnlConsultarMaterialMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultarMaterialMouseClicked
        Consultar consultar = new Consultar();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlConsultarMaterialMouseClicked

    private void pnlConsultarMaterialMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultarMaterialMousePressed
        // TODO add your handling code here:
        Consultar consultar = new Consultar();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_pnlConsultarMaterialMousePressed

    private void pnlConsultarMaterialMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlConsultarMaterialMouseExited
        pnlConsultarMaterial.setBackground(new Color(88,139,173));
        btnConsultarMaterial.setForeground(new Color(187,187,187));
    }//GEN-LAST:event_pnlConsultarMaterialMouseExited

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

    private void btnAgregarMatMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAgregarMatMouseClicked
        AgregarMaterial pl = new AgregarMaterial();
        pl.setSize(765,590);
        pl.setLocation(0,0);
        Content.removeAll();
        Content.add(pl, BorderLayout.CENTER);
        Content.revalidate();
        Content.repaint();
    }//GEN-LAST:event_btnAgregarMatMouseClicked

    private void btnConsulPrestamoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnConsulPrestamoMouseClicked
        // TODO add your handling code here:
        ConsultarAdmin consultar = new ConsultarAdmin();
        consultar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnConsulPrestamoMouseClicked

 
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
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Principal_Admin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Principal_Admin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Content;
    private javax.swing.JLabel btnAgregarMat;
    private javax.swing.JLabel btnCalcularMora;
    private javax.swing.JLabel btnConfPrestamo;
    private javax.swing.JLabel btnConsulPrestamo;
    private javax.swing.JLabel btnConsultarMaterial;
    private javax.swing.JLabel btnDevolver;
    private javax.swing.JLabel btnMaterial;
    private javax.swing.JLabel btnPrestamo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel pnlAgregarMat;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlCalcularMora;
    private javax.swing.JPanel pnlConfPrestamo;
    private javax.swing.JPanel pnlConsulPrestamo;
    private javax.swing.JPanel pnlConsultarMaterial;
    private javax.swing.JPanel pnlDevolver;
    private javax.swing.JPanel pnlHeader;
    private javax.swing.JPanel pnlMaterial;
    private javax.swing.JPanel pnlMenu;
    private javax.swing.JPanel pnlPrestar;
    private javax.swing.JLabel txtFecha;
    // End of variables declaration//GEN-END:variables
}

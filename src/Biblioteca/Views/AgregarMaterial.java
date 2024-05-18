package Biblioteca.Views;

import Biblioteca.DAL.ConexionMySQL;
import Biblioteca.DAL.InventarioMaterial;
import Biblioteca.POJOS.Material;
import java.awt.Color;
import java.sql.Connection;
import javax.swing.JOptionPane;

/**
 *
 * @author Laura Pineda
 */
public class AgregarMaterial extends javax.swing.JPanel {

    private InventarioMaterial material = new InventarioMaterial ((Connection) ConexionMySQL.obtenerConexion());
    private Material materiales = null;
    
    private void LimpiarCajas(){
        txtId.setText(null);
        bmbxMaterial.setSelectedIndex(0);
        txtTitulo.setText(null);
        txtDirector.setText(null);
        txtAutor.setText(null);
        txtEditorial.setText(null);
        txtPaginas.setText(null);
        txtUni.setText(null);
        txtISBN.setText(null);
        txtAlbum.setText(null);
        txtCancion.setText(null);
        txtDuracion.setText(null);
        txtCantante.setText(null);
        txtDisponibilidad.setText(null);
        txtPublicacion.setText(null);
    }
    
    private void CargasCajas(Material limpiar){
        txtId.setText(limpiar.getIdInterno());
        String Material = (String) bmbxMaterial.getSelectedItem();
        txtTitulo.setText(limpiar.getTitulo());
        txtDirector.setText(limpiar.getDirector());
        txtAutor.setText(limpiar.getAutor());
        txtEditorial.setText(limpiar.getEditorial());
        txtPaginas.setText(Integer.toString(limpiar.getNumPaginas()));
        txtUni.setText(limpiar.getUniversidad());
        txtISBN.setText(limpiar.getISBN());
        txtAlbum.setText(limpiar.getTituloAlbum());
        txtCancion.setText(limpiar.getTituloCancion());
        txtDuracion.setText(limpiar.getDuracion());
        txtCantante.setText(limpiar.getCantante());
        txtDisponibilidad.setText(Integer.toString(limpiar.getDisponibilidad()));
        txtPublicacion.setText(limpiar.getPublicacion());
    }
   
    public AgregarMaterial() {
        initComponents();
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlBg = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        bmbxMaterial = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAutor = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtDirector = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPaginas = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        txtEditorial = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtISBN = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtUni = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtCancion = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtAlbum = new javax.swing.JTextField();
        jLabel12 = new javax.swing.JLabel();
        txtCantante = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        txtDuracion = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        txtPublicacion = new javax.swing.JTextField();
        jLabel15 = new javax.swing.JLabel();
        txtDisponibilidad = new javax.swing.JTextField();
        jSeparator1 = new javax.swing.JSeparator();
        jSeparator2 = new javax.swing.JSeparator();
        jSeparator3 = new javax.swing.JSeparator();
        jSeparator4 = new javax.swing.JSeparator();
        jSeparator5 = new javax.swing.JSeparator();
        jSeparator6 = new javax.swing.JSeparator();
        jSeparator7 = new javax.swing.JSeparator();
        jSeparator8 = new javax.swing.JSeparator();
        jSeparator9 = new javax.swing.JSeparator();
        jSeparator10 = new javax.swing.JSeparator();
        jSeparator11 = new javax.swing.JSeparator();
        jSeparator12 = new javax.swing.JSeparator();
        jSeparator13 = new javax.swing.JSeparator();
        jSeparator14 = new javax.swing.JSeparator();
        jSeparator15 = new javax.swing.JSeparator();
        pnlBuscar = new javax.swing.JPanel();
        btnBuscar = new javax.swing.JLabel();
        pnlGuardar = new javax.swing.JPanel();
        btnGuardar = new javax.swing.JLabel();
        pnlEliminar = new javax.swing.JPanel();
        btnEliminar = new javax.swing.JLabel();
        pnlModificar = new javax.swing.JPanel();
        btnModificar = new javax.swing.JLabel();
        pnlActualizar = new javax.swing.JPanel();
        btnActualizar = new javax.swing.JLabel();
        pnlNuevo = new javax.swing.JPanel();
        btnNuevo = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(765, 590));

        pnlBg.setBackground(new java.awt.Color(241, 234, 234));

        jLabel1.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel1.setText("IdInterno:");

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
        jLabel2.setText("Tipo material:");

        bmbxMaterial.setBackground(new java.awt.Color(241, 234, 234));
        bmbxMaterial.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        bmbxMaterial.setForeground(new java.awt.Color(100, 100, 100));
        bmbxMaterial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar", "Libro", "Documental", "Prensa", "Revista", "Tesis", "Musica" }));
        bmbxMaterial.setBorder(null);

        jLabel3.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel3.setText("Titulo:");

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

        jLabel4.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel4.setText("Autor:");

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

        jLabel5.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel5.setText("Director:");

        txtDirector.setBackground(new java.awt.Color(241, 234, 234));
        txtDirector.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtDirector.setForeground(new java.awt.Color(100, 100, 100));
        txtDirector.setText("Ingrese el director");
        txtDirector.setBorder(null);
        txtDirector.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDirectorFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDirectorFocusLost(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel6.setText("Páginas:");

        txtPaginas.setBackground(new java.awt.Color(241, 234, 234));
        txtPaginas.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtPaginas.setForeground(new java.awt.Color(100, 100, 100));
        txtPaginas.setText("Ingrese el número de páginas");
        txtPaginas.setBorder(null);
        txtPaginas.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPaginasFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPaginasFocusLost(evt);
            }
        });
        txtPaginas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPaginasActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel7.setText("Editorial:");

        txtEditorial.setBackground(new java.awt.Color(241, 234, 234));
        txtEditorial.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtEditorial.setForeground(new java.awt.Color(100, 100, 100));
        txtEditorial.setText("Ingrese la editorial");
        txtEditorial.setBorder(null);
        txtEditorial.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtEditorialFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtEditorialFocusLost(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel8.setText("ISBN:");

        txtISBN.setBackground(new java.awt.Color(241, 234, 234));
        txtISBN.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtISBN.setForeground(new java.awt.Color(100, 100, 100));
        txtISBN.setText("Ingrese el ISBN");
        txtISBN.setBorder(null);
        txtISBN.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtISBNFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtISBNFocusLost(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel9.setText("Universidad:");

        txtUni.setBackground(new java.awt.Color(241, 234, 234));
        txtUni.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtUni.setForeground(new java.awt.Color(100, 100, 100));
        txtUni.setText("nombre de Universidad");
        txtUni.setBorder(null);
        txtUni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtUniFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUniFocusLost(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel10.setText("Canción:");

        txtCancion.setBackground(new java.awt.Color(241, 234, 234));
        txtCancion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtCancion.setForeground(new java.awt.Color(100, 100, 100));
        txtCancion.setText("Ingrese el nombre de la canción");
        txtCancion.setBorder(null);
        txtCancion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCancionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCancionFocusLost(evt);
            }
        });

        jLabel11.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel11.setText("Álbum:");

        txtAlbum.setBackground(new java.awt.Color(241, 234, 234));
        txtAlbum.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtAlbum.setForeground(new java.awt.Color(100, 100, 100));
        txtAlbum.setText("Ingrese el nombre del Album");
        txtAlbum.setBorder(null);
        txtAlbum.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtAlbumFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtAlbumFocusLost(evt);
            }
        });

        jLabel12.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel12.setText("Cantante:");

        txtCantante.setBackground(new java.awt.Color(241, 234, 234));
        txtCantante.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtCantante.setForeground(new java.awt.Color(100, 100, 100));
        txtCantante.setText("Ingrese el nombre del cantante");
        txtCantante.setBorder(null);
        txtCantante.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtCantanteFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCantanteFocusLost(evt);
            }
        });

        jLabel13.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel13.setText("Duración:");

        txtDuracion.setBackground(new java.awt.Color(241, 234, 234));
        txtDuracion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtDuracion.setForeground(new java.awt.Color(100, 100, 100));
        txtDuracion.setText("Ingrese la duracion");
        txtDuracion.setBorder(null);
        txtDuracion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtDuracionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDuracionFocusLost(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel14.setText("Publicación:");

        txtPublicacion.setBackground(new java.awt.Color(241, 234, 234));
        txtPublicacion.setFont(new java.awt.Font("SansSerif", 1, 12)); // NOI18N
        txtPublicacion.setForeground(new java.awt.Color(100, 100, 100));
        txtPublicacion.setText("Año de publicacion");
        txtPublicacion.setBorder(null);
        txtPublicacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                txtPublicacionFocusGained(evt);
            }
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtPublicacionFocusLost(evt);
            }
        });

        jLabel15.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        jLabel15.setText("Disponibles:");

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

        pnlBuscar.setBackground(new java.awt.Color(241, 234, 234));

        btnBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Biblioteca/GUI/imagenes/buscar.png"))); // NOI18N
        btnBuscar.setText("jLabel16");

        javax.swing.GroupLayout pnlBuscarLayout = new javax.swing.GroupLayout(pnlBuscar);
        pnlBuscar.setLayout(pnlBuscarLayout);
        pnlBuscarLayout.setHorizontalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlBuscarLayout.setVerticalGroup(
            pnlBuscarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBuscarLayout.createSequentialGroup()
                .addComponent(btnBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 7, Short.MAX_VALUE))
        );

        pnlGuardar.setBackground(new java.awt.Color(241, 234, 234));

        btnGuardar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(100, 100, 100));
        btnGuardar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnGuardar.setText("Guardar");
        btnGuardar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnGuardarMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout pnlGuardarLayout = new javax.swing.GroupLayout(pnlGuardar);
        pnlGuardar.setLayout(pnlGuardarLayout);
        pnlGuardarLayout.setHorizontalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlGuardarLayout.setVerticalGroup(
            pnlGuardarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlGuardarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlEliminar.setBackground(new java.awt.Color(241, 234, 234));

        btnEliminar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnEliminar.setForeground(new java.awt.Color(100, 100, 100));
        btnEliminar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnEliminar.setText("Eliminar");

        javax.swing.GroupLayout pnlEliminarLayout = new javax.swing.GroupLayout(pnlEliminar);
        pnlEliminar.setLayout(pnlEliminarLayout);
        pnlEliminarLayout.setHorizontalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlEliminarLayout.setVerticalGroup(
            pnlEliminarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlEliminarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlModificar.setBackground(new java.awt.Color(241, 234, 234));

        btnModificar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnModificar.setForeground(new java.awt.Color(100, 100, 100));
        btnModificar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnModificar.setText("Modificar");

        javax.swing.GroupLayout pnlModificarLayout = new javax.swing.GroupLayout(pnlModificar);
        pnlModificar.setLayout(pnlModificarLayout);
        pnlModificarLayout.setHorizontalGroup(
            pnlModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlModificarLayout.setVerticalGroup(
            pnlModificarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlModificarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlActualizar.setBackground(new java.awt.Color(241, 234, 234));

        btnActualizar.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnActualizar.setForeground(new java.awt.Color(100, 100, 100));
        btnActualizar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnActualizar.setText("Actualizar");

        javax.swing.GroupLayout pnlActualizarLayout = new javax.swing.GroupLayout(pnlActualizar);
        pnlActualizar.setLayout(pnlActualizarLayout);
        pnlActualizarLayout.setHorizontalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlActualizarLayout.setVerticalGroup(
            pnlActualizarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlActualizarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pnlNuevo.setBackground(new java.awt.Color(241, 234, 234));

        btnNuevo.setFont(new java.awt.Font("Rockwell", 1, 14)); // NOI18N
        btnNuevo.setForeground(new java.awt.Color(100, 100, 100));
        btnNuevo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        btnNuevo.setText("Nuevo");

        javax.swing.GroupLayout pnlNuevoLayout = new javax.swing.GroupLayout(pnlNuevo);
        pnlNuevo.setLayout(pnlNuevoLayout);
        pnlNuevoLayout.setHorizontalGroup(
            pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlNuevoLayout.setVerticalGroup(
            pnlNuevoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlNuevoLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(btnNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout pnlBgLayout = new javax.swing.GroupLayout(pnlBg);
        pnlBg.setLayout(pnlBgLayout);
        pnlBgLayout.setHorizontalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(jLabel11)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator11)
                                    .addComponent(txtAlbum)))
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(jLabel13)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator13)
                                    .addComponent(txtDuracion)))
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addComponent(jLabel15)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator15)
                                    .addComponent(txtDisponibilidad)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(pnlBgLayout.createSequentialGroup()
                                        .addComponent(jLabel1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator2)
                                            .addComponent(txtId)))
                                    .addGroup(pnlBgLayout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator3)
                                            .addComponent(txtTitulo)))
                                    .addGroup(pnlBgLayout.createSequentialGroup()
                                        .addComponent(jLabel5)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator5)
                                            .addComponent(txtDirector)))
                                    .addGroup(pnlBgLayout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator7)
                                            .addComponent(txtEditorial)))
                                    .addGroup(pnlBgLayout.createSequentialGroup()
                                        .addComponent(jLabel9)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jSeparator9)
                                            .addComponent(txtUni, javax.swing.GroupLayout.DEFAULT_SIZE, 175, Short.MAX_VALUE))))))
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pnlBgLayout.createSequentialGroup()
                                .addGap(47, 47, 47)
                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(jLabel4)
                                                .addComponent(jLabel8)
                                                .addGroup(pnlBgLayout.createSequentialGroup()
                                                    .addComponent(jLabel2)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jSeparator1)
                                                        .addComponent(bmbxMaterial, 0, 203, Short.MAX_VALUE)))
                                                .addComponent(txtAutor, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGroup(pnlBgLayout.createSequentialGroup()
                                                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(txtCancion, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(pnlBgLayout.createSequentialGroup()
                                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                    .addComponent(jSeparator6)
                                                    .addComponent(txtPaginas)))
                                            .addComponent(txtISBN, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(pnlBgLayout.createSequentialGroup()
                                            .addComponent(jLabel12)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jSeparator12)
                                                .addComponent(txtCantante, javax.swing.GroupLayout.DEFAULT_SIZE, 234, Short.MAX_VALUE)))
                                        .addGroup(pnlBgLayout.createSequentialGroup()
                                            .addComponent(jLabel14, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(txtPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 205, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 203, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(pnlBuscar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                                .addGap(92, 92, 92)
                                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jSeparator8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jSeparator10, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 224, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addComponent(pnlGuardar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pnlEliminar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlModificar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(pnlActualizar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(pnlNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(38, 38, 38))
        );
        pnlBgLayout.setVerticalGroup(
            pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlBgLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(2, 2, 2)
                        .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(pnlBuscar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel3)
                        .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel2)
                        .addComponent(bmbxMaterial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtDirector, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtEditorial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator7, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtUni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator9, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel11)
                            .addComponent(txtAlbum, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator11, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel13)
                            .addComponent(txtDuracion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator13, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel15)
                            .addComponent(txtDisponibilidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator15, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlBgLayout.createSequentialGroup()
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAutor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPaginas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator6, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(12, 12, 12)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtISBN, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator8, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtCancion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator10, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel12)
                            .addComponent(txtCantante, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator12, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel14)
                            .addComponent(txtPublicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jSeparator14, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22)
                .addGroup(pnlBgLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(pnlGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlEliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlModificar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlNuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlBg, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void txtPaginasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPaginasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPaginasActionPerformed

    private void btnGuardarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnGuardarMouseClicked
        if(bmbxMaterial.getSelectedItem().equals("Seleccionar")){
            JOptionPane.showMessageDialog(null, "Por favor seleccionar un tipo de material",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (bmbxMaterial.getSelectedItem().equals("Libro")) {
            
            if (txtId.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Codigo no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtTitulo.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Titulo no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtAutor.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Autor no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!txtPaginas.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "El campo Numero de Paginas solo puede contener numeros",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtEditorial.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo Editorial no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (txtISBN.getText().trim().isEmpty()){
            JOptionPane.showMessageDialog(null, "El campo ISBN no puede quedar en blanco",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!txtPublicacion.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "El campo Año de Publicación solo puede contener numeros",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else if (!txtDisponibilidad.getText().matches("[0-9]+")){
            JOptionPane.showMessageDialog(null, "El campo Unidades disponibles solo puede contener numeros",
                    "Error", JOptionPane.ERROR_MESSAGE);
        } else {
            String idInterno = txtId.getText();
            String titulo = txtTitulo.getText();
            String autor = txtAutor.getText();
            int numPaginas = Integer.parseInt(txtPaginas.getText());
            String editorial = txtEditorial.getText();
            String ISBN = txtISBN.getText();
            int yearPubli = Integer.parseInt(txtPublicacion.getText());
            int uniDispo = Integer.parseInt(txtDisponibilidad.getText());
                String director = null;
            
            Material MaterialAgregar = new Material(idInterno, titulo, numPaginas, autor, uniDispo, director,
                    editorial, ISBN);
            
            if (material.AgregarMaterial(materiales)){
                JOptionPane.showMessageDialog(this, "Material guardado correctamente",
                        "Guardar material", JOptionPane.INFORMATION_MESSAGE);
            } else {
                JOptionPane.showMessageDialog(this, "No se pudo guardar el material",
                        "Guardar material", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        }
        
            LimpiarCajas();
            txtId.requestFocus();
    }//GEN-LAST:event_btnGuardarMouseClicked

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

    private void txtDirectorFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirectorFocusGained
        // TODO add your handling code here:
        if(txtDirector.getText().equals("Ingrese el director"))
        {
            txtDirector.setText("");
            txtDirector.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtDirectorFocusGained

    private void txtDirectorFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDirectorFocusLost
        // TODO add your handling code here:
        if(txtDirector.getText().equals(""))
        {
            txtDirector.setText("Ingrese el director");
            txtDirector.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtDirectorFocusLost

    private void txtEditorialFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditorialFocusGained
        // TODO add your handling code here:
        if(txtEditorial.getText().equals("Ingrese la editorial"))
        {
            txtEditorial.setText("");
            txtEditorial.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtEditorialFocusGained

    private void txtEditorialFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtEditorialFocusLost
        // TODO add your handling code here:
        if(txtEditorial.getText().equals(""))
        {
            txtEditorial.setText("Ingrese la editorial");
            txtEditorial.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtEditorialFocusLost

    private void txtUniFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUniFocusGained
        // TODO add your handling code here:
        if(txtUni.getText().equals("nombre de Universidad"))
        {
            txtUni.setText("");
            txtUni.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtUniFocusGained

    private void txtAlbumFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlbumFocusGained
        // TODO add your handling code here:
         if(txtAlbum.getText().equals("Ingrese el nombre del Album"))
        {
            txtAlbum.setText("");
            txtAlbum.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtAlbumFocusGained

    private void txtUniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUniFocusLost
        // TODO add your handling code here:
        if(txtUni.getText().equals(""))
        {
            txtUni.setText("nombre de Universidad");
            txtUni.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtUniFocusLost

    private void txtAlbumFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtAlbumFocusLost
        // TODO add your handling code here:
         if(txtAlbum.getText().equals(""))
        {
            txtAlbum.setText("Ingrese el nombre del Album");
            txtAlbum.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtAlbumFocusLost

    private void txtDuracionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuracionFocusGained
        // TODO add your handling code here:
         if(txtDuracion.getText().equals("Ingrese la duracion"))
        {
            txtDuracion.setText("");
            txtDuracion.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtDuracionFocusGained

    private void txtDuracionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDuracionFocusLost
        // TODO add your handling code here:
         if(txtDuracion.getText().equals(""))
        {
            txtDuracion.setText("Ingrese la duracion");
            txtDuracion.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtDuracionFocusLost

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

    private void txtPaginasFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaginasFocusGained
        // TODO add your handling code here:
         if(txtPaginas.getText().equals("Ingrese el número de páginas"))
        {
            txtPaginas.setText("");
            txtPaginas.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtPaginasFocusGained

    private void txtPaginasFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPaginasFocusLost
        // TODO add your handling code here:
         if(txtPaginas.getText().equals(""))
        {
            txtPaginas.setText("Ingrese el número de páginas");
            txtPaginas.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtPaginasFocusLost

    private void txtISBNFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtISBNFocusGained
        // TODO add your handling code here:
         if(txtISBN.getText().equals("Ingrese el ISBN"))
        {
            txtISBN.setText("");
            txtISBN.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtISBNFocusGained

    private void txtISBNFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtISBNFocusLost
        // TODO add your handling code here:
         if(txtISBN.getText().equals(""))
        {
            txtISBN.setText("Ingrese el ISBN");
            txtISBN.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtISBNFocusLost

    private void txtCancionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCancionFocusGained
        // TODO add your handling code here:
         if(txtCancion.getText().equals("Ingrese el nombre de la canción"))
        {
            txtCancion.setText("");
            txtCancion.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtCancionFocusGained

    private void txtCancionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCancionFocusLost
        // TODO add your handling code here:
        if(txtCancion.getText().equals(""))
        {
            txtCancion.setText("Ingrese el nombre de la canción");
            txtCancion.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtCancionFocusLost

    private void txtCantanteFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantanteFocusGained
        // TODO add your handling code here:
         if(txtCantante.getText().equals("Ingrese el nombre del cantante"))
        {
            txtCantante.setText("");
            txtCantante.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtCantanteFocusGained

    private void txtCantanteFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCantanteFocusLost
        // TODO add your handling code here:
         if(txtCantante.getText().equals(""))
        {
            txtCantante.setText("Ingrese el nombre del cantante");
            txtCantante.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtCantanteFocusLost

    private void txtPublicacionFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPublicacionFocusGained
        // TODO add your handling code here:
         if(txtPublicacion.getText().equals("Año de publicacion"))
        {
            txtPublicacion.setText("");
            txtPublicacion.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtPublicacionFocusGained

    private void txtPublicacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtPublicacionFocusLost
        // TODO add your handling code here:
          if(txtPublicacion.getText().equals(""))
        {
            txtPublicacion.setText("Año de publicacion");
            txtPublicacion.setForeground(new Color(100,100,100));
        }
    }//GEN-LAST:event_txtPublicacionFocusLost


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> bmbxMaterial;
    private javax.swing.JLabel btnActualizar;
    private javax.swing.JLabel btnBuscar;
    private javax.swing.JLabel btnEliminar;
    private javax.swing.JLabel btnGuardar;
    private javax.swing.JLabel btnModificar;
    private javax.swing.JLabel btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator10;
    private javax.swing.JSeparator jSeparator11;
    private javax.swing.JSeparator jSeparator12;
    private javax.swing.JSeparator jSeparator13;
    private javax.swing.JSeparator jSeparator14;
    private javax.swing.JSeparator jSeparator15;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JSeparator jSeparator4;
    private javax.swing.JSeparator jSeparator5;
    private javax.swing.JSeparator jSeparator6;
    private javax.swing.JSeparator jSeparator7;
    private javax.swing.JSeparator jSeparator8;
    private javax.swing.JSeparator jSeparator9;
    private javax.swing.JPanel pnlActualizar;
    private javax.swing.JPanel pnlBg;
    private javax.swing.JPanel pnlBuscar;
    private javax.swing.JPanel pnlEliminar;
    private javax.swing.JPanel pnlGuardar;
    private javax.swing.JPanel pnlModificar;
    private javax.swing.JPanel pnlNuevo;
    private javax.swing.JTextField txtAlbum;
    private javax.swing.JTextField txtAutor;
    private javax.swing.JTextField txtCancion;
    private javax.swing.JTextField txtCantante;
    private javax.swing.JTextField txtDirector;
    private javax.swing.JTextField txtDisponibilidad;
    private javax.swing.JTextField txtDuracion;
    private javax.swing.JTextField txtEditorial;
    private javax.swing.JTextField txtISBN;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtPaginas;
    private javax.swing.JTextField txtPublicacion;
    private javax.swing.JTextField txtTitulo;
    private javax.swing.JTextField txtUni;
    // End of variables declaration//GEN-END:variables
}

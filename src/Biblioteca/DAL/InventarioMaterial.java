package Biblioteca.DAL;

import Biblioteca.POJOS.Material;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Laura Pineda
 */
public class InventarioMaterial {

   private Connection conexion;
    
    public InventarioMaterial(Connection conexion){
        this.conexion = conexion;
    }
    
    //Ingresar material
    
    public boolean AgregarMaterial (Material AgregarMaterial){
        boolean rowInserted = false;
        
        try {
            String sql = "INSERT INTO materiales (idInterno, titulo, autor, director, numPaginas, editorial, ISBN, universidad, tituloCancion"
                    + "tituloAlbum, cantante, duracion, publicacion, disponibilidad, tipoMaterial)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
          java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
          
          statement.setString(1, AgregarMaterial.getIdInterno());
          statement.setString(2, AgregarMaterial.getTitulo());
          statement.setString(3, AgregarMaterial.getAutor());
          statement.setString(4, AgregarMaterial.getDirector());  
          statement.setInt(5, AgregarMaterial.getNumPaginas());
          statement.setString(6, AgregarMaterial.getEditorial());
          statement.setString(7, AgregarMaterial.getISBN());
          statement.setString(8, AgregarMaterial.getUniversidad());
          statement.setString(9, AgregarMaterial.getTituloCancion());
          statement.setString(10, AgregarMaterial.getTituloAlbum());
          statement.setString(11, AgregarMaterial.getCantante());
          statement.setString(12, AgregarMaterial.getDuracion());
          statement.setString(13, AgregarMaterial.getPublicacion());
          statement.setInt(14, AgregarMaterial.getDisponibilidad());
          statement.setString(1, AgregarMaterial.getTipoMaterial());
          
          rowInserted = statement.executeUpdate() > 0;
          statement.close();
          
        }catch(SQLException ex){
            Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rowInserted;
    }
    
    //Localizar material por código interno
    
    public boolean LocalizarMaterial (String idInterno){
        boolean encontrado = false;
        
        try {
            String sql = "SELECT * FROM materiales WHERE idInterno = ?";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                encontrado = true;
            }

            resultSet.close();
            statement.close();
        } catch (SQLException ex) {
             Logger.getLogger(InventarioMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return encontrado;
    }
    
    /*Seleccionar un material por su código*/
    public Material seleccionarMaterial (String idInterno){
        Material materialPres = null;
        
        try {
            String sql = "SELECT * FROM cd WHERE idInterno = ?";
            
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                
                String id = resultSet.getString("idInterno");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                String director = resultSet.getString("director");
                int numPaginas = resultSet.getInt("numPaginas");
                String editorial = resultSet.getString("editorial");
                String ISBN = resultSet.getString("ISBN");
                String universidad = resultSet.getString("universidad");
                String tituloCancion = resultSet.getString("tituloCancion");
                String tituloAlbum = resultSet.getString("tituloAlbum");
                String cantante = resultSet.getString("cantante");
                String duracion = resultSet.getString("duracion");
                String publicacion = resultSet.getString("publicacion");
                int disponibilidad = resultSet.getInt("disponibilidad");
                String tipoMaterial = resultSet.getString("tipoMaterial");
                materialPres = new Material (id, titulo, autor, director, numPaginas, editorial, ISBN, universidad, tituloCancion, tituloAlbum, cantante, duracion, publicacion, disponibilidad, tipoMaterial);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
        }
        
            return materialPres;
        }
    
    //Seleccionar material por su código interno
    
    public Material SeleccionarMaterial (String idInterno){
        Material nuevo = null;
        
        try {
            String sql = "SELECT * FROM materiales WHERE idInterno = ?";
            
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                
                String id = resultSet.getString("idInterno");
                String titulo = resultSet.getString("titulo");
                String autor = resultSet.getString("autor");
                String director = resultSet.getString("director");
                int numPaginas = resultSet.getInt("numPaginas");
                String editorial = resultSet.getString("editorial");
                String ISBN = resultSet.getString("ISBN");
                String uni = resultSet.getString("universidad");
                String cancion = resultSet.getString("tituloCancion");
                String album = resultSet.getString("tituloAlbum");
                String cantante = resultSet.getString("cantante");
                String duracion = resultSet.getString("duracion");
                String publicacion = resultSet.getString("publicacion");
                int dispo = resultSet.getInt("disponibilidad");
                String material = resultSet.getString("tipoMaterial");
                
                nuevo = new Material (id, titulo, numPaginas, autor, dispo, director, 
                        editorial, ISBN);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(InventarioMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return nuevo;
    }
    
    //Actualizar material
    
    public boolean ActualizarMaterial (Material actualizar){
        boolean rowUpdated = false;
        
        try {
            String sql = "UPDATE libros SET titulo = ?, "
                    + " autor = ?, director = ?, numPaginas = ?, editorial = ?, ISBN = ?,"
                    + " universidad = ?, tituloCancion = ?, tituloAlbum = ?, cantante = ?, "
                    + "duracion = ?, publicacion = ?, disponibilidad = ?"
                    + " WHERE idInterno = ?";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, actualizar.getTitulo());
            statement.setString(2, actualizar.getAutor());
            statement.setString(3, actualizar.getDirector());
            statement.setInt(4, actualizar.getNumPaginas());
            statement.setString(5, actualizar.getEditorial());
            statement.setString(6, actualizar.getISBN());
            statement.setString(7, actualizar.getUniversidad());
            statement.setString(8, actualizar.getTituloCancion());
            statement.setString(9, actualizar.getTituloAlbum());
            statement.setString(10, actualizar.getCantante());
            statement.setString(11, actualizar.getDuracion());
            statement.setString(12, actualizar.getPublicacion());
            statement.setInt(13, actualizar.getDisponibilidad());
            statement.setString(14, actualizar.getTipoMaterial());
            
            statement.setString(15, actualizar.getIdInterno());
            
            rowUpdated = statement.executeUpdate()>0;
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(InventarioMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
    }
    
    //Eliminar Libro
    
    public boolean EliminarMaterial (String idInterno){
        boolean rowDeleted = false;
        
        try {
            String sql = "DELETE FROM materiales WHERE idInterno = ?";

            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, idInterno);

            rowDeleted = statement.executeUpdate() > 0;
            statement.close();

        } catch (SQLException ex) {
            Logger.getLogger(InventarioMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowDeleted;
    }
    
}

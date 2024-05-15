package Biblioteca.DAL;

import Biblioteca.POJOS.Material;
import Biblioteca.POJOS.Usuarios;
import java.sql.Connection;
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
                    + "tituloAlbum, cantante, duracion, publicacion, disponibilidad)"
                    + "VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
            
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
          
          rowInserted = statement.executeUpdate() > 0;
          statement.close();
          
        }catch(SQLException ex){
            Logger.getLogger(Material.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rowInserted;
    }
    
}

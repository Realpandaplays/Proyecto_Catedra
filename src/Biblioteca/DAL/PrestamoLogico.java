
package Biblioteca.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DIEGO PADILLA
 */
public class PrestamoLogico {
    private final Connection conexion;
    
    public PrestamoLogico(Connection conexion){
        this.conexion = conexion;
    }
    
     public void actualizarDispo(int idMaterial) throws SQLException {
        String query = "UPDATE materiales SET disponibilidad = disponibilidad - 1 WHERE idInterno = ?";
        try (Connection connection = ConexionMySQL.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idMaterial);
            preparedStatement.executeUpdate();
        }
     }
     
     
     
      public void registrarFechaPrestamo(int idPrestamos) throws SQLException {
        String query = "UPDATE prestamos SET fechaPrestamo = CURRENT_DATE WHERE IdPrestamos = ?";
        try (Connection connection = ConexionMySQL.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idPrestamos);
            preparedStatement.executeUpdate();
        }
    }
     
      public void registrarFechaDevolucion(int idPrestamos) throws SQLException {
        String query = "UPDATE prestamos SET fecha_devolucion = CURRENT_DATE WHERE IdPrestamos = ?";
        try (Connection connection = ConexionMySQL.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idPrestamos);
            preparedStatement.executeUpdate();
        }
    }
      
      public boolean agregarPrestamo(int idPrestamos) throws SQLException{
           boolean rowUpdated = false;
           try {
            String sql = "INSERT INTO prestamos SELECT usuario,privilegio,IdUsuario from usuarios WHERE IdUsuario = ?"
                    
                    + "INSERT INTO prestamos SELECT IdMateriales from materiales WHERE IdInterno = ?";

                    
            
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            
                        
            rowUpdated = statement.executeUpdate()>0;
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(InventarioMaterial.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
      }
              
      public void prestarMaterial(int idMaterial, int idPrestamo, int idPrestamos) throws SQLException {
        actualizarDispo(idMaterial);
        registrarFechaDevolucion(idPrestamo);
        registrarFechaPrestamo(idPrestamo);
        agregarPrestamo(idPrestamo);
    }
      
      
      
}

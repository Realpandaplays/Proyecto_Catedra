package Biblioteca.DAL;

import Biblioteca.POJOS.Prestamos;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import Biblioteca.POJOS.Prestamos;

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
      
      public void prestarMaterial(int idMaterial, int idPrestamo) throws SQLException {
        actualizarDispo(idMaterial);
        registrarFechaDevolucion(idPrestamo);
        registrarFechaPrestamo(idPrestamo);
    }
      
}

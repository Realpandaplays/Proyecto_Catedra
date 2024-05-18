package Biblioteca.DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class DevolucionesSQL {

    public void actualizarDisponibilidad(int idMaterial) throws SQLException {
        String query = "UPDATE materiales SET disponibilidad = disponibilidad + 1 WHERE idInterno = ?";
        try (Connection connection = ConexionMySQL.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idMaterial);
            preparedStatement.executeUpdate();
        }
    }

    public void registrarFechaDevolucion(int idPrestamo) throws SQLException {
        String query = "UPDATE prestamos SET fecha_devolucion = CURRENT_DATE WHERE IdPrestamos = ?";
        try (Connection connection = ConexionMySQL.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idPrestamo);
            preparedStatement.executeUpdate();
        }
    }

    public void eliminarPrestamo(int idPrestamo) throws SQLException {
        String query = "DELETE FROM prestamos WHERE IdPrestamos = ?";
        try (Connection connection = ConexionMySQL.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idPrestamo);
            preparedStatement.executeUpdate();
        }
    }

    public void devolverMaterial(int idMaterial, int idPrestamo) throws SQLException {
        actualizarDisponibilidad(idMaterial);
        registrarFechaDevolucion(idPrestamo);
        eliminarPrestamo(idPrestamo);
    }

    public long calcularDiasDePrestamo(int idPrestamo) throws SQLException {
        String query = "SELECT fechaPrestamo FROM prestamos WHERE IdPrestamos = ?";
        try (Connection connection = ConexionMySQL.obtenerConexion();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setInt(1, idPrestamo);
            ResultSet resultSet = preparedStatement.executeQuery();
            if (resultSet.next()) {
                LocalDate fechaPrestamo = resultSet.getDate("fechaPrestamo").toLocalDate();
                LocalDate fechaDevolucion = LocalDate.now();
                return ChronoUnit.DAYS.between(fechaPrestamo, fechaDevolucion);
            }
        }
        return 0;
    }

    public double calcularMora(long diasPrestamo) {
        long diasGracia = 4;
        double moraPorDia = 0.25;
        if (diasPrestamo > diasGracia) {
            return (diasPrestamo - diasGracia) * moraPorDia;
        }
        return 0.0;
    }
}

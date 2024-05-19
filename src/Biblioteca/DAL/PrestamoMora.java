package Biblioteca.DAL;

import java.util.List;
import java.util.ArrayList;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.JOptionPane;
import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.time.format.DateTimeFormatter;
import java.sql.PreparedStatement;

/**
 *
 */
public class PrestamoMora {

    public static class PrestamosConMoraResult {
            public List<String[]> prestamosConMora;
            public double totalMora;

                public PrestamosConMoraResult(List<String[]> prestamosConMora, double totalMora) {
                    this.prestamosConMora = prestamosConMora;
                    this.totalMora = totalMora;
                }
    }
   public static List<String[]> obtenerPrestamosConMora(String año) {
        List<String[]> prestamosConMora = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();

            try {
                Connection con = ConexionMySQL.obtenerConexion();
                String sql = "SELECT usuario, fechaPrestamo FROM prestamos WHERE fecha_devolucion IS NULL AND YEAR(fechaPrestamo) = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, año);
                ResultSet rs = pstmt.executeQuery();  
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "No hay registros para el año " + año, "Sin registros", JOptionPane.INFORMATION_MESSAGE);
                        con.close();
                        return prestamosConMora; 
                    }

                    do {
                        String usuario = rs.getString("usuario");
                        String fechaPrestamoStr = rs.getString("fechaPrestamo"); 
                        LocalDate fechaPrestamo = LocalDate.parse(fechaPrestamoStr, formatter); 
                        long diasTranscurridos = ChronoUnit.DAYS.between(fechaPrestamo, fechaActual);

                        if (diasTranscurridos > 4) {
                            double mora = (diasTranscurridos - 4) * 0.25;
                            String tbData[] = {usuario, fechaPrestamo.toString(), String.valueOf(diasTranscurridos - 4), "$" + String.valueOf(mora)};
                            prestamosConMora.add(tbData);
                        }
                    } while (rs.next());
                    con.close();
            }catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }

        return prestamosConMora;
    }
   
   public static PrestamosConMoraResult obtenerPrestamosConMoraPorUsuario(String usuario) {
        List<String[]> prestamosConMora = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();
        double totalMora = 0.0;

            try {
                Connection con = ConexionMySQL.obtenerConexion();
                String sql = "SELECT usuario, fechaPrestamo FROM prestamos WHERE fecha_devolucion IS NULL AND usuario = ?";
                PreparedStatement pstmt = con.prepareStatement(sql);
                pstmt.setString(1, usuario);
                ResultSet rs = pstmt.executeQuery();
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                    if (!rs.next()) {
                        JOptionPane.showMessageDialog(null, "El usuario no existe", "Usuario no encontrado", JOptionPane.WARNING_MESSAGE);
                        con.close();
                        return new PrestamosConMoraResult(prestamosConMora, totalMora);
                    }

                    do {
                        String fechaPrestamoStr = rs.getString("fechaPrestamo");
                        LocalDate fechaPrestamo = LocalDate.parse(fechaPrestamoStr, formatter);
                        long diasTranscurridos = ChronoUnit.DAYS.between(fechaPrestamo, fechaActual);

                            if (diasTranscurridos > 4) {
                                long diasConMora = diasTranscurridos - 4;
                                double mora = diasConMora * 0.25;
                                totalMora += mora;
                                String tbData[] = {usuario, fechaPrestamo.toString(), String.valueOf(diasConMora), "$" + String.valueOf(mora)};
                                prestamosConMora.add(tbData);
                            }
                    }while (rs.next());
                con.close();
        }catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Un error ha ocurrido: " + e, "Error", JOptionPane.ERROR_MESSAGE);
        }

        return new PrestamosConMoraResult(prestamosConMora, totalMora);
    }
   
    public static List<String[]> obtenerTodosLosPrestamosConMora() {
        List<String[]> prestamosConMora = new ArrayList<>();
        LocalDate fechaActual = LocalDate.now();

            try {
                Connection con = ConexionMySQL.obtenerConexion();
                String sql = "SELECT usuario, fechaPrestamo FROM prestamos WHERE fecha_devolucion IS NULL";
                Statement st = con.createStatement();
                ResultSet rs = st.executeQuery(sql);
                DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

                    while (rs.next()) {
                        String usuario = rs.getString("usuario");
                        String fechaPrestamoStr = rs.getString("fechaPrestamo");
                        LocalDate fechaPrestamo = LocalDate.parse(fechaPrestamoStr, formatter);
                        long diasTranscurridos = ChronoUnit.DAYS.between(fechaPrestamo, fechaActual);

                            if (diasTranscurridos > 4) {
                                double mora = (diasTranscurridos - 4) * 0.25;
                                String tbData[] = {usuario, fechaPrestamo.toString(), String.valueOf(diasTranscurridos - 4), "$" + String.valueOf(mora)};
                                prestamosConMora.add(tbData);
                            }
                    }

                con.close();
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Un error ha ocurrido: " + e, "Error", JOptionPane.ERROR_MESSAGE);
            }
        return prestamosConMora;
    }
}



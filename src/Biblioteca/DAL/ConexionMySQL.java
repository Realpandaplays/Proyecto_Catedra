
package Biblioteca.DAL;

/**
 *
 * @author Laura Pineda
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConexionMySQL {

    private static final String URL = "jdbc:mysql://localhost:3306/catedra_i";
    private static final String USUARIO = "root";
    private static final String CONTRASENA = "";
    
    
       public static Connection obtenerConexion() {
        Connection conexion = null;

            try {
                conexion = DriverManager.getConnection(URL, USUARIO, CONTRASENA);
                System.out.println("Conexión exitosa");
            } catch (SQLException ex) {
                ex.printStackTrace();
            }
            return conexion;
    }
    
}

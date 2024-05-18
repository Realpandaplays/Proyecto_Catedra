
package Biblioteca.DAL;

import java.sql.Connection;

/**
 *
 * @author DIEGO PADILLA
 */
public class PrestamoLogico {
    private Connection conexion;
    
    public PrestamoLogico(Connection conexion){
        this.conexion = conexion;
    }
    
}

package Biblioteca.DAL;

import Biblioteca.POJOS.Usuarios;
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
public class RegistroUsuarios {

   private Connection conexion;
    
    public RegistroUsuarios(Connection conexion){
        this.conexion = conexion;
    }
    
    //Agregar usuario
    
    public boolean RegistrarUser (Usuarios RegistroUsuarios){
        boolean rowInserted = false;
        
        try {
            String sql = "INSERT INTO usuarios (identificacion, clave, nombre, apellido,"
                    + "usuario, nacimiento, privilegio)"
                    + "VALUES (?,?,?,?,?,?,?)";
            
          java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
          
          statement.setString(1, RegistroUsuarios.getIdentificacion());
          statement.setString(2, RegistroUsuarios.getClave());
          statement.setString(3, RegistroUsuarios.getNombre());
          statement.setString(4, RegistroUsuarios.getApellido());  
          statement.setString(5, RegistroUsuarios.getUsuario());
          statement.setString(6, RegistroUsuarios.getNacimiento());
          statement.setString(7, RegistroUsuarios.getPrivilegio());
          
          rowInserted = statement.executeUpdate() > 0;
          statement.close();
        }catch(SQLException ex){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
         return rowInserted;
    }
    
    //Login
    
    public boolean LocalizarUser (String identificacion, String clave){
        boolean encontrado = false;
        
        try {
            String sql = "SELECT * FROM usuarios WHERE identificacion = ? AND clave = ?";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, identificacion);
            statement.setString(2, clave);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                encontrado = true;
            }

            resultSet.close();
            statement.close();
        }catch(SQLException ex){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
    }
    return encontrado;
    }
    
    //Seleccionar privilegio para login
    
    public Usuarios SelecPriv (String identificacion, String clave){
        Usuarios rol = null;
        
        try {
            String sql = "SELECT `privilegio` FROM `usuarios` WHERE `identificacion`='"+identificacion+"' AND `clave`='"+clave+"'";
            
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, identificacion);
            statement.setString(1,clave);

            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()){
                
                String privilegio = resultSet.getString("privilegio");
                
                rol = new Usuarios (privilegio);
            }
            resultSet.close();
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rol;
        
    }
    
    //Restablecer contraseña 
    
    public boolean ActualizarUser (Usuarios RegistroUsuarios){
        boolean rowUpdated = false;
        
        try {
            String sql = "UPDATE usuarios SET clave = ?"
                    + "WHERE identificacion = ? AND nacimiento = ?";
            
            PreparedStatement statement = conexion.prepareStatement(sql);
            
            statement.setString(1, RegistroUsuarios.getClave());
            statement.setString(2, RegistroUsuarios.getIdentificacion());
            statement.setString(2, RegistroUsuarios.getNacimiento());
            
            rowUpdated = statement.executeUpdate()>0;
            statement.close();
        }catch (SQLException ex) {
            Logger.getLogger(RegistroUsuarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rowUpdated;
        
    }
    
    //Localizar para restablecer contraseña
    
    public boolean Restablecer (String identificacion, String nacimiento){
        boolean encontrado = false;
        
        try {
            String sql = "SELECT nacimiento FROM usuarios WHERE identificacion = ? AND nacimiento = ?";
            java.sql.PreparedStatement statement = conexion.prepareStatement(sql);
            statement.setString(1, identificacion);
            statement.setString(2, nacimiento);
            ResultSet resultSet = statement.executeQuery();
            
            if (resultSet.next()) {
                encontrado = true;
            }

            resultSet.close();
            statement.close();
        }catch(SQLException ex){
            Logger.getLogger(Usuarios.class.getName()).log(Level.SEVERE, null, ex);
    }
    return encontrado;
    }
    
    
    
}

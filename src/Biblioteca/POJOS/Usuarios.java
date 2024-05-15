package Biblioteca.POJOS;

/**
 *
 * @author Laura Pineda
 */
public class Usuarios {

    private String identificacion;
    private String clave;
    private String nombre;
    private String apellido;
    private String usuario;
    private String nacimiento;
    private String privilegio;
    
    public Usuarios (String carnet, String clave, String nombre, String apellido, String usuario, String nacimiento, String privilegio){
        
        this.identificacion = carnet;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.usuario = usuario;
        this.nacimiento = nacimiento;
        this.privilegio = privilegio;
        
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public String getClave() {
        return clave;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getNacimiento() {
        return nacimiento;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setNacimiento(String nacimiento) {
        this.nacimiento = nacimiento;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }
    
    
}

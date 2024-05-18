package Biblioteca.POJOS;

/* @author DIEGO PADILLA */
public class Prestamos {
    private String Identificacion;
    private String usuario;
    private String privilegio;
    private String idInterno;
    private String fechaPrestamo;
    private String fecha_devolucion;

    public void setIdentificacion(String Identificacion) {
        this.Identificacion = Identificacion;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setPrivilegio(String privilegio) {
        this.privilegio = privilegio;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }

    public void setFechaPrestamo(String fechaPrestamo) {
        this.fechaPrestamo = fechaPrestamo;
    }

    public void setFecha_devolucion(String fecha_devolucion) {
        this.fecha_devolucion = fecha_devolucion;
    }
    
    public String getIdentificacion() {
        return Identificacion;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getPrivilegio() {
        return privilegio;
    }

    public String getIdInterno() {
        return idInterno;
    }

    public String getFechaPrestamo() {
        return fechaPrestamo;
    }

    public String getFecha_devolucion() {
        return fecha_devolucion;
    }
    
}

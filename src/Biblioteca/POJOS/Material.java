package Biblioteca.POJOS;

/**
 *
 * @author Laura Pineda
 */
public class Material {

    public Material(String idInterno, String titulo, String autor, String director, int numPaginas, String editorial, String ISBN, String universidad, String tituloCancion, String tituloAlbum, String cantante, String duracion, String publicacion, int disponibilidad, String tipoMaterial) {
        this.idInterno = idInterno;
        this.titulo = titulo;
        this.autor = autor;
        this.director = director;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.universidad = universidad;
        this.tituloCancion = tituloCancion;
        this.tituloAlbum = tituloAlbum;
        this.cantante = cantante;
        this.duracion = duracion;
        this.publicacion = publicacion;
        this.disponibilidad = disponibilidad;
        this.tipoMaterial = tipoMaterial;
    }
    
    private String idInterno;
    private String titulo;
    private String autor;
    private String director;
    private int numPaginas;
    private String editorial;
    private String ISBN;
    private String universidad;
    private String tituloCancion;
    private String tituloAlbum;
    private String cantante;
    private String duracion;
    private String publicacion;
    private int disponibilidad;
    private String tipoMaterial;
    
    public Material (String idInterno, String titulo, int numPaginas, String autor, int disponibilidad, String director, String editorial, String ISBN){
        
        this.idInterno = idInterno;
        this.titulo = titulo;
        this.autor = autor;
        this.director = director;
        this.numPaginas = numPaginas;
        this.editorial = editorial;
        this.ISBN = ISBN;
        this.universidad = universidad;
        this.tituloCancion = tituloCancion;
        this.tituloAlbum = tituloAlbum;
        this.cantante = cantante;
        this.duracion = duracion;
        this.publicacion = publicacion;
        this.disponibilidad = disponibilidad;
        this.tipoMaterial = tipoMaterial;
        
    }

    public String getIdInterno() {
        return idInterno;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getDirector() {
        return director;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public String getISBN() {
        return ISBN;
    }

    public String getUniversidad() {
        return universidad;
    }

    public String getTituloCancion() {
        return tituloCancion;
    }

    public String getTituloAlbum() {
        return tituloAlbum;
    }

    public String getCantante() {
        return cantante;
    }

    public String getDuracion() {
        return duracion;
    }

    public String getPublicacion() {
        return publicacion;
    }

    public int getDisponibilidad() {
        return disponibilidad;
    }
    
    public String getTipoMaterial() {
        return tipoMaterial;
    }

    public void setIdInterno(String idInterno) {
        this.idInterno = idInterno;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setUniversidad(String universidad) {
        this.universidad = universidad;
    }

    public void setTituloCancion(String tituloCancion) {
        this.tituloCancion = tituloCancion;
    }

    public void setTituloAlbum(String tituloAlbum) {
        this.tituloAlbum = tituloAlbum;
    }

    public void setCantante(String cantante) {
        this.cantante = cantante;
    }

    public void setDuracion(String duracion) {
        this.duracion = duracion;
    }

    public void setPublicacion(String publicacion) {
        this.publicacion = publicacion;
    }

    public void setDisponibilidad(int disponibilidad) {
        this.disponibilidad = disponibilidad;
    }  
    
    public void setTipoMaterial(String tipoMaterial) {
        this.tipoMaterial = tipoMaterial;
    }
 
}

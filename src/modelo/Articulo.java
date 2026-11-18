package modelo;

/**
 * Subclase de Trabajo. Agrega el nombre de la conferencia.
 */
public class Articulo extends Trabajo {

    private String nombreConferencia;

    public Articulo(String titulo, String autor, int anioPublicacion, String nombreConferencia) {
        super(titulo, autor, anioPublicacion);
        setNombreConferencia(nombreConferencia);
    }

    public String getNombreConferencia() {
        return nombreConferencia;
    }

    public void setNombreConferencia(String nombreConferencia) {
        if (nombreConferencia == null || nombreConferencia.trim().isEmpty()) {
            throw new IllegalArgumentException("El nombre de la conferencia no puede estar vacio.");
        }
        this.nombreConferencia = nombreConferencia.trim();
    }

    // Sobrescritura: agrega el tipo y el dato propio del Articulo
    @Override
    public String toString() {
        return "[Artículo] " + super.toString() + " | Conferencia: " + nombreConferencia;
    }
}
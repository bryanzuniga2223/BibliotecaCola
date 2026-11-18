package modelo;

/**
 * Subclase de Trabajo. Agrega el numero de edicion.
 */
public class Revista extends Trabajo {

    private int numeroEdicion;

    public Revista(String titulo, String autor, int anioPublicacion, int numeroEdicion) {
        super(titulo, autor, anioPublicacion);
        setNumeroEdicion(numeroEdicion);
    }

    public int getNumeroEdicion() {
        return numeroEdicion;
    }

    public void setNumeroEdicion(int numeroEdicion) {
        if (numeroEdicion <= 0) {
            throw new IllegalArgumentException("El numero de edicion debe ser mayor a cero.");
        }
        this.numeroEdicion = numeroEdicion;
    }

    // Sobrescritura: agrega el tipo y el dato propio de la Revista
    @Override
    public String toString() {
        return "[Revista] " + super.toString() + " | Edición: " + numeroEdicion;
    }
}
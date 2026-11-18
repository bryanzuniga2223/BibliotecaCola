package modelo;

/**
 * Subclase de Trabajo. Agrega el numero de paginas.
 */
public class Libro extends Trabajo {

    private int numeroPaginas;

    public Libro(String titulo, String autor, int anioPublicacion, int numeroPaginas) {
        super(titulo, autor, anioPublicacion);
        setNumeroPaginas(numeroPaginas);
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        if (numeroPaginas <= 0) {
            throw new IllegalArgumentException("El numero de paginas debe ser mayor a cero.");
        }
        this.numeroPaginas = numeroPaginas;
    }

    // Sobrescritura: agrega el tipo y el dato propio del Libro
    @Override
    public String toString() {
        return "[Libro] " + super.toString() + " | Páginas: " + numeroPaginas;
    }
}
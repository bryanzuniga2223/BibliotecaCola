package modelo;

/**
 * Clase base de la jerarquia de la Biblioteca.
 * Guarda los datos comunes a todos los trabajos bibliograficos.
 */
public class Trabajo {

    private String titulo;
    private String autor;
    private int anioPublicacion;

    public Trabajo(String titulo, String autor, int anioPublicacion) {
        setTitulo(titulo);
        setAutor(autor);
        setAnioPublicacion(anioPublicacion);
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        if (titulo == null || titulo.trim().isEmpty()) {
            throw new IllegalArgumentException("El titulo no puede estar vacio.");
        }
        this.titulo = titulo.trim();
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        if (autor == null || autor.trim().isEmpty()) {
            throw new IllegalArgumentException("El autor no puede estar vacio.");
        }
        this.autor = autor.trim();
    }

    public int getAnioPublicacion() {
        return anioPublicacion;
    }

    public void setAnioPublicacion(int anioPublicacion) {
        if (anioPublicacion <= 0) {
            throw new IllegalArgumentException("El anio de publicacion debe ser mayor a cero.");
        }
        this.anioPublicacion = anioPublicacion;
    }

    @Override
    public String toString() {
        return "Título: " + titulo + " | Autor: " + autor + " | Año: " + anioPublicacion;
    }
}
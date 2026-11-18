package estructura;

import modelo.Trabajo;

/**
 * Unidad de almacenamiento de la cola.
 * Guarda un Trabajo (que puede ser Libro, Revista o Articulo gracias al
 * polimorfismo) y la referencia al siguiente nodo.
 */
public class Nodo {

    private Trabajo dato;
    private Nodo siguiente;

    public Nodo(Trabajo dato) {
        if (dato == null) {
            throw new IllegalArgumentException("El nodo no puede guardar un trabajo nulo.");
        }
        this.dato = dato;
        this.siguiente = null;
    }

    public Trabajo getDato() {
        return dato;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
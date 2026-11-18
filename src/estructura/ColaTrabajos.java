package estructura;

import modelo.Trabajo;

/**
 * Cola dinamica (FIFO) de trabajos bibliograficos implementada con nodos.
 * Se inserta por el final y se atiende por el frente.
 * La clase no imprime ni lee datos: solo organiza la informacion.
 */
public class ColaTrabajos {

    private Nodo frente;
    private Nodo fin;
    private int tamanio;

    public ColaTrabajos() {
        frente = null;
        fin = null;
        tamanio = 0;
    }

    /** Encola un trabajo al final de la cola. */
    public void offer(Trabajo trabajo) {
        if (trabajo == null) {
            throw new IllegalArgumentException("No se puede encolar un trabajo nulo.");
        }
        Nodo nuevo = new Nodo(trabajo);
        if (isEmpty()) {
            frente = nuevo;
        } else {
            fin.setSiguiente(nuevo);
        }
        fin = nuevo;
        tamanio++;
    }

    /** Atiende: remueve y devuelve el trabajo del frente. */
    public Trabajo poll() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía: no hay trabajos para atender.");
        }
        Trabajo atendido = frente.getDato();
        frente = frente.getSiguiente();
        if (frente == null) {      // si se quedo vacia, el fin tambien es null
            fin = null;
        }
        tamanio--;
        return atendido;
    }

    /** Consulta el trabajo del frente sin removerlo. */
    public Trabajo peek() {
        if (isEmpty()) {
            throw new IllegalStateException("La cola está vacía: no hay trabajo en el frente.");
        }
        return frente.getDato();
    }

    public boolean isEmpty() {
        return frente == null;
    }

    /** Elimina todos los trabajos de la cola. */
    public void vaciarCola() {
        frente = null;
        fin = null;
        tamanio = 0;
    }

    public int size() {
        return tamanio;
    }

    /** Devuelve los trabajos en orden, del frente al final (para mostrarlos). */
    public Trabajo[] toArray() {
        Trabajo[] arreglo = new Trabajo[tamanio];
        Nodo actual = frente;
        int i = 0;
        while (actual != null) {
            arreglo[i] = actual.getDato();
            actual = actual.getSiguiente();
            i++;
        }
        return arreglo;
    }
}
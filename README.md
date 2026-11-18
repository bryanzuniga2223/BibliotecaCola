# Biblioteca – Cola de Trabajos (FIFO)

**Actividad 4.2: Estructuras de Datos Lineales Dinámicas — Gestión de Pila o Cola de Trabajos de Biblioteca**

Universidad de Guadalajara · Centro Universitario de Tonalá (CUT)  
Ingeniería en Ciencias Computacionales · Estructuras de Datos  
Docente: Jose Navarros Rios

## Integrantes

- Isai Gonzalez Nuñez
- Bryan Zuñiga De Leon

## Descripción

Aplicación en Java con interfaz gráfica Swing (NetBeans GUI Builder) que gestiona trabajos bibliográficos
mediante una **Cola (FIFO)** implementada con nodos. Reutiliza la jerarquía de herencia de la Biblioteca
y aplica polimorfismo para administrar de forma unificada los distintos tipos de trabajo.

- **Estructura elegida:** Cola de Trabajos (`ColaTrabajos` – FIFO)
- **Operaciones:** `offer` (encolar), `poll` (atender), `peek` (consultar frente), `isEmpty`, `vaciarCola`

## Estructura del proyecto

```
src/
├── modelo/
│   ├── Trabajo.java       Clase base: titulo, autor, anioPublicacion
│   ├── Libro.java         Subclase: numeroPaginas
│   ├── Revista.java       Subclase: numeroEdicion
│   └── Articulo.java      Subclase: nombreConferencia
├── estructura/
│   ├── Nodo.java          Guarda un Trabajo y la referencia al siguiente nodo
│   └── ColaTrabajos.java  Cola dinámica FIFO (frente / fin)
└── vista/
    └── VentanaBiblioteca.java / .form   Interfaz gráfica Swing
```

## Herencia y polimorfismo

`Libro`, `Revista` y `Articulo` heredan de `Trabajo` y sobrescriben `toString()`.
Cada `Nodo` almacena una referencia de tipo `Trabajo`, por lo que la cola acepta cualquiera de las tres
subclases. Al mostrar la cola, cada elemento ejecuta el `toString()` de su subclase real.

## Validaciones

- Título, autor y nombre de la conferencia no pueden estar vacíos.
- Año, número de páginas y número de edición deben ser enteros mayores a cero.
- Atender o consultar el frente con la cola vacía muestra un aviso en lugar de fallar.

## Cómo ejecutar

1. Abrir el proyecto en Apache NetBeans (**File > Open Project…**).
2. Clic derecho en `src/vista/VentanaBiblioteca.java` > **Run File**.

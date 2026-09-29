package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio11;

import java.util.LinkedHashSet;

public class CancionesFavoritas {

    private LinkedHashSet<String> canciones;

    /**
     * Inicializa una colección vacía de canciones favoritas.
     */
    public CancionesFavoritas() {
        canciones = new LinkedHashSet<>();
    }

    /**
     * Agrega una canción si todavía no está en la colección.
     *
     * @param cancion nombre de la canción
     */
    public void agregarCancion(String cancion) {
        if (canciones.add(cancion)) {
            System.out.println("Canción agregada: " + cancion);
        } else {
            System.out.println("La canción ya está en favoritos: " + cancion);
        }
    }

    /**
     * Elimina una canción de favoritos.
     *
     * @param cancion nombre de la canción que se desea eliminar
     */
    public void eliminarCancion(String cancion) {
        if (canciones.remove(cancion)) {
            System.out.println("Canción eliminada: " + cancion);
        } else {
            System.out.println("La canción no se encuentra en favoritos.");
        }
    }

    /**
     * Muestra las canciones en el orden en que fueron agregadas.
     */
    public void mostrarCanciones() {
        if (canciones.isEmpty()) {
            System.out.println("No hay canciones favoritas.");
            return;
        }

        System.out.println("Canciones favoritas:");

        for (String cancion : canciones) {
            System.out.println("- " + cancion);
        }
    }

    /**
     * Verifica si una canción está guardada en favoritos.
     *
     * @param cancion nombre de la canción que se desea buscar
     * @return true si existe; false en caso contrario
     */
    public boolean contieneCancion(String cancion) {
        return canciones.contains(cancion);
    }

    /**
     * Devuelve la cantidad de canciones favoritas.
     *
     * @return número de canciones almacenadas
     */
    public int cantidadCanciones() {
        return canciones.size();
    }
}

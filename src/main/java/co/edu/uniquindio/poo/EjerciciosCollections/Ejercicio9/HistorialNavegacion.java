package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio9;

import java.util.Stack;

public class HistorialNavegacion {

    private Stack<String> historial;

    /**
     * Inicializa una pila vacía para guardar las páginas visitadas.
     */
    public HistorialNavegacion() {
        historial = new Stack<>();
    }

    /**
     * Agrega una nueva página al historial.
     *
     * @param pagina dirección o nombre de la página visitada
     */
    public void visitarPagina(String pagina) {
        historial.push(pagina);
        System.out.println("Visitaste: " + pagina);
    }

    /**
     * Elimina la página actual y regresa a la página anterior.
     *
     * @return página anterior, o null si no existe
     */
    public String volverAtras() {
        if (historial.isEmpty()) {
            System.out.println("No hay páginas en el historial.");
            return null;
        }

        // Eliminar la página actual
        historial.pop();

        // Verificar si quedó una página anterior
        if (historial.isEmpty()) {
            System.out.println("No hay una página anterior.");
            return null;
        }

        String paginaActual = historial.peek();
        System.out.println("Regresaste a: " + paginaActual);
        return paginaActual;
    }

    /**
     * Muestra la página que se encuentra actualmente en la parte superior.
     *
     * @return página actual, o null si el historial está vacío
     */
    public String obtenerPaginaActual() {
        if (historial.isEmpty()) {
            return null;
        }

        return historial.peek();
    }

    /**
     * Muestra todas las páginas guardadas en la pila.
     */
    public void mostrarHistorial() {
        System.out.println("Historial: " + historial);
    }
}
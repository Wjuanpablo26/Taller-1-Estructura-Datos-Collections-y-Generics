package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio9;

public class Main {

    public static void main(String[] args) {

        HistorialNavegacion navegador = new HistorialNavegacion();

        // Visitar varias páginas
        navegador.visitarPagina("google.com");
        navegador.visitarPagina("youtube.com");
        navegador.visitarPagina("wikipedia.org");

        navegador.mostrarHistorial();

        // Consultar la página actual
        System.out.println(
                "Página actual: " + navegador.obtenerPaginaActual()
        );

        // Volver atrás
        navegador.volverAtras();

        navegador.mostrarHistorial();

        // Volver atrás nuevamente
        navegador.volverAtras();

        navegador.mostrarHistorial();
    }
}
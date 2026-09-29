package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio11;

public class Main {

    public static void main(String[] args) {

        CancionesFavoritas favoritos = new CancionesFavoritas();

        favoritos.agregarCancion("Vivir mi vida");
        favoritos.agregarCancion("Color esperanza");
        favoritos.agregarCancion("La vida es un carnaval");

        // Intentar agregar una canción repetida
        favoritos.agregarCancion("Vivir mi vida");

        // Mostrar canciones
        favoritos.mostrarCanciones();

        // Buscar una canción
        System.out.println(
                "¿Está Color esperanza? "
                        + favoritos.contieneCancion("Color esperanza")
        );

        // Mostrar cantidad de canciones
        System.out.println(
                "Total de canciones: " + favoritos.cantidadCanciones()
        );

        // Eliminar una canción
        favoritos.eliminarCancion("Color esperanza");

        favoritos.mostrarCanciones();
    }
}
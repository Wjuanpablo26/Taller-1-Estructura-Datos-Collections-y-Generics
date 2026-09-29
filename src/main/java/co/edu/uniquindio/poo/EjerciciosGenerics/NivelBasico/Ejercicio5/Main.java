package co.edu.uniquindio.poo.EjerciciosGenerics.NivelBasico.Ejercicio5;

/**
 * Prueba la clase genérica Par con diferentes tipos de datos.
 */
public class Main {

    public static void main(String[] args) {

        // Crear un par de nombres iguales
        Par<String> parNombres = new Par<>("Laura", "Laura");

        System.out.println("Primer nombre: "
                + parNombres.getPrimero());
        System.out.println("Segundo nombre: "
                + parNombres.getSegundo());
        System.out.println("¿Los nombres son iguales? "
                + parNombres.sonIguales());

        // Crear un par de números diferentes
        Par<Integer> parNumeros = new Par<>(10, 20);

        System.out.println("\nPrimer número: "
                + parNumeros.getPrimero());
        System.out.println("Segundo número: "
                + parNumeros.getSegundo());
        System.out.println("¿Los números son iguales? "
                + parNumeros.sonIguales());
    }
}

package co.edu.uniquindio.poo.EjerciciosGenerics.NivelBasico.Ejercicio3;

/**
 * Prueba la interfaz Contenedor y su implementación.
 */
public class Main {

    public static void main(String[] args) {

        // Crear un contenedor de nombres
        ListaContenedor<String> nombres = new ListaContenedor<>();

        nombres.agregar("Laura");
        nombres.agregar("Carlos");
        nombres.agregar("María");

        System.out.println("Primer nombre: " + nombres.obtener(0));
        System.out.println("Segundo nombre: " + nombres.obtener(1));
        System.out.println("Tercer nombre: " + nombres.obtener(2));
        System.out.println("Cantidad de nombres: "
                + nombres.cantidadElementos());

        // Crear un contenedor de números
        ListaContenedor<Integer> numeros = new ListaContenedor<>();

        numeros.agregar(10);
        numeros.agregar(20);
        numeros.agregar(30);

        System.out.println("\nPrimer número: " + numeros.obtener(0));
        System.out.println("Segundo número: " + numeros.obtener(1));
        System.out.println("Tercer número: " + numeros.obtener(2));
        System.out.println("Cantidad de números: "
                + numeros.cantidadElementos());

    }
}

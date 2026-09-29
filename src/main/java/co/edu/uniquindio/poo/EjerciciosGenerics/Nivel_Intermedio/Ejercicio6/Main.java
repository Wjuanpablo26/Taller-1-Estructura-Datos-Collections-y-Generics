package co.edu.uniquindio.poo.EjerciciosGenerics.Nivel_Intermedio.Ejercicio6;

/**
 * Prueba la clase CajaNumerica con distintos tipos de números.
 */
public class Main {

    public static void main(String[] args) {

        // Caja que almacena un número entero
        CajaNumerica<Integer> cajaEntero =
                new CajaNumerica<>(15);

        System.out.println("Número entero: "
                + cajaEntero.obtenerNumero());

        System.out.println("El doble es: "
                + cajaEntero.doble());

        // Caja que almacena un número decimal
        CajaNumerica<Double> cajaDecimal =
                new CajaNumerica<>(12.5);

        System.out.println("\nNúmero decimal: "
                + cajaDecimal.obtenerNumero());

        System.out.println("El doble es: "
                + cajaDecimal.doble());
    }
}
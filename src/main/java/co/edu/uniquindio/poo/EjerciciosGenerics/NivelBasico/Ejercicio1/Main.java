package co.edu.uniquindio.poo.EjerciciosGenerics.NivelBasico.Ejercicio1;

/**
 * Prueba la clase genérica Caja con diferentes tipos.
 */
public class Main {

    public static void main(String[] args) {

        // Caja que almacena texto
        Caja<String> cajaTexto = new Caja<>();
        cajaTexto.guardar("Caja Nueva");

        System.out.println("Contenido de cajaTexto: "
                + cajaTexto.obtener());

        // Caja que almacena números enteros
        Caja<Integer> cajaNumero = new Caja<>();
        cajaNumero.guardar(25);

        System.out.println("Contenido de cajaNumero: "
                + cajaNumero.obtener());

        // Caja que almacena números decimales
        Caja<Double> cajaDecimal = new Caja<>();
        cajaDecimal.guardar(15.75);

        System.out.println("Contenido de cajaDecimal: "
                + cajaDecimal.obtener());
    }
}

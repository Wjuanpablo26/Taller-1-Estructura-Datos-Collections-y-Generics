package co.edu.uniquindio.poo.EjerciciosGenerics.NivelAvanzado.Ejercicio15;

public class Main {

    public static void main(String[] args) {

        CalculadoraAvanzada<Integer> calculadoraEnteros =
                new CalculadoraAvanzada<>();

        int numero1 = 20;
        int numero2 = 8;

        System.out.println("Operaciones con Integer:");
        System.out.println("Suma: "
                + calculadoraEnteros.sumar(numero1, numero2));
        System.out.println("Resta: "
                + calculadoraEnteros.restar(numero1, numero2));
        System.out.println("Máximo: "
                + calculadoraEnteros.maximo(numero1, numero2));
        System.out.println("Mínimo: "
                + calculadoraEnteros.minimo(numero1, numero2));


        CalculadoraAvanzada<Double> calculadoraDecimales =
                new CalculadoraAvanzada<>();

        double decimal1 = 7.5;
        double decimal2 = 12.3;

        System.out.println("\nOperaciones con Double:");
        System.out.println("Suma: "
                + calculadoraDecimales.sumar(decimal1, decimal2));
        System.out.println("Resta: "
                + calculadoraDecimales.restar(decimal1, decimal2));
        System.out.println("Máximo: "
                + calculadoraDecimales.maximo(decimal1, decimal2));
        System.out.println("Mínimo: "
                + calculadoraDecimales.minimo(decimal1, decimal2));
    }
}
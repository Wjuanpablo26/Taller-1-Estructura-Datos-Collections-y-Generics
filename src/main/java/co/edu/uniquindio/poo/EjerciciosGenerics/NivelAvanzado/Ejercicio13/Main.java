package co.edu.uniquindio.poo.EjerciciosGenerics.NivelAvanzado.Ejercicio13;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ServicioNumerico<Integer> servicioEnteros =
                new ServicioNumerico<>();

        List<Integer> numeros = new ArrayList<>();

        numeros.add(25);
        numeros.add(8);
        numeros.add(42);
        numeros.add(16);

        System.out.println("Lista de enteros: " + numeros);
        System.out.println("Mínimo: "
                + servicioEnteros.minimo(numeros));
        System.out.println("Máximo: "
                + servicioEnteros.maximo(numeros));


        ServicioNumerico<Double> servicioDecimales =
                new ServicioNumerico<>();

        List<Double> decimales = new ArrayList<>();

        decimales.add(5.5);
        decimales.add(2.3);
        decimales.add(9.8);

        System.out.println("\nLista de decimales: " + decimales);
        System.out.println("Mínimo: "
                + servicioDecimales.minimo(decimales));
        System.out.println("Máximo: "
                + servicioDecimales.maximo(decimales));
    }
}

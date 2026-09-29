package co.edu.uniquindio.poo.EjerciciosGenerics.Nivel_Intermedio.Ejercicio7;

public class Main {

    public static void main(String[] args) {

        double resultado1 = Calculadora.sumar(10, 20);
        double resultado2 = Calculadora.sumar(5.5, 3.2);
        double resultado3 = Calculadora.sumar(7.5f, 2.5f);

        System.out.println("Suma de enteros: " + resultado1);
        System.out.println("Suma de decimales: " + resultado2);
        System.out.println("Suma de números Float: " + resultado3);
    }
}

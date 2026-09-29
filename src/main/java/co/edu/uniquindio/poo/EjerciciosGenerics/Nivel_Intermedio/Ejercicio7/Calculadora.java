package co.edu.uniquindio.poo.EjerciciosGenerics.Nivel_Intermedio.Ejercicio7;

public class Calculadora {

    /**
     * Suma dos valores numéricos y devuelve el resultado como double.
     *
     * @param <T> tipo de dato numérico que extiende de Number
     * @param numero1 primer número que se va a sumar
     * @param numero2 segundo número que se va a sumar
     * @return resultado de la suma como double
     */
    public static <T extends Number> double sumar(T numero1, T numero2) {
        return numero1.doubleValue() + numero2.doubleValue();
    }
}

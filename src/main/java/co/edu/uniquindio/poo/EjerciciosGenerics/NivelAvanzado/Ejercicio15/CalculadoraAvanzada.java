package co.edu.uniquindio.poo.EjerciciosGenerics.NivelAvanzado.Ejercicio15;

/**
 * Realiza operaciones matemáticas con tipos numéricos comparables.
 *
 * @param <T> tipo numérico que extiende de Number
 *            e implementa Comparable<T>
 */
public class CalculadoraAvanzada<T extends Number & Comparable<T>> {

    /**
     * Suma dos números y devuelve el resultado como double.
     *
     * @param a primer número
     * @param b segundo número
     * @return resultado de la suma
     */
    public double sumar(T a, T b) {
        return a.doubleValue() + b.doubleValue();
    }

    /**
     * Resta el segundo número al primero.
     *
     * @param a número al que se le resta
     * @param b número que se resta
     * @return resultado de la resta
     */
    public double restar(T a, T b) {
        return a.doubleValue() - b.doubleValue();
    }

    /**
     * Obtiene el mayor de dos números.
     *
     * @param a primer número
     * @param b segundo número
     * @return el número mayor
     */
    public T maximo(T a, T b) {
        if (a.compareTo(b) >= 0) {
            return a;
        }
        return b;
    }

    /**
     * Obtiene el menor de dos números.
     *
     * @param a primer número
     * @param b segundo número
     * @return el número menor
     */
    public T minimo(T a, T b) {
        if (a.compareTo(b) <= 0) {
            return a;
        }
        return b;
    }
}
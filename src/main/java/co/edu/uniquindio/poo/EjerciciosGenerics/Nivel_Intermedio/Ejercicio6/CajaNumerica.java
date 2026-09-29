package co.edu.uniquindio.poo.EjerciciosGenerics.Nivel_Intermedio.Ejercicio6;

/**
 * Clase genérica que almacena un valor numérico.
 *
 * @param <T> tipo numérico que extiende de Number
 */
public class CajaNumerica<T extends Number> {

    private T numero;

    /**
     * Crea una caja con un número.
     *
     * @param numero valor numérico que se almacenará
     */
    public CajaNumerica(T numero) {
        this.numero = numero;
    }

    /**
     * Devuelve el doble del número almacenado.
     *
     * @return doble del valor como double
     */
    public double doble() {
        return numero.doubleValue() * 2;
    }

    /**
     * Obtiene el número almacenado.
     *
     * @return número guardado
     */
    public T obtenerNumero() {
        return numero;
    }
}

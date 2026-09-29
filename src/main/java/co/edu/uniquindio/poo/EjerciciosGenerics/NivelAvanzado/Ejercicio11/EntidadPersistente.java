package co.edu.uniquindio.poo.EjerciciosGenerics.NivelAvanzado.Ejercicio11;

/**
 * Almacena un valor numérico y permite compararlo con otros
 * valores del mismo tipo.
 *
 * @param <T> tipo numérico que implementa Comparable
 */
public class EntidadPersistente<T extends Number & Comparable<T>> {

    private T valor;

    /**
     * Crea una entidad con el valor recibido.
     *
     * @param valor valor que se almacenará
     */
    public EntidadPersistente(T valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el valor almacenado.
     *
     * @return valor de la entidad
     */
    public T obtenerValor() {
        return valor;
    }

    /**
     * Compara el valor almacenado con otro valor del mismo tipo.
     *
     * @param otro valor con el que se va a comparar
     * @return un número negativo si es menor, cero si son iguales
     *         o un número positivo si es mayor
     */
    public int compararCon(T otro) {
        return valor.compareTo(otro);
    }

    /**
     * Indica si el valor almacenado es mayor que otro.
     *
     * @param otro valor con el que se va a comparar
     * @return true si el valor almacenado es mayor
     */
    public boolean esMayorQue(T otro) {
        return valor.compareTo(otro) > 0;
    }
}

package co.edu.uniquindio.poo.EjerciciosGenerics.Nivel_Intermedio.Ejercicio9;

/**
 * Define las operaciones básicas para almacenar elementos comparables.
 *
 * @param <T> tipo de dato que se almacenará
 */
public interface Almacenable<T extends Comparable<T>> {

    /**
     * Guarda un elemento.
     *
     * @param item elemento que se desea guardar
     */
    void guardar(T item);

    /**
     * Obtiene el mayor elemento almacenado.
     *
     * @return el mayor elemento o null si no hay elementos
     */
    T maximo();
}

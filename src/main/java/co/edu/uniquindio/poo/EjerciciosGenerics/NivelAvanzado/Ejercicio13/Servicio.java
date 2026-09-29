package co.edu.uniquindio.poo.EjerciciosGenerics.NivelAvanzado.Ejercicio13;

import java.util.List;

/**
 * Define operaciones para encontrar el mínimo y el máximo
 * de una lista de valores numéricos comparables.
 *
 * @param <T> tipo numérico que se almacenará
 */
public interface Servicio<T extends Number & Comparable<T>> {

    /**
     * Encuentra el valor mínimo de una lista.
     *
     * @param lista lista de números
     * @return el menor elemento
     */
    T minimo(List<T> lista);

    /**
     * Encuentra el valor máximo de una lista.
     *
     * @param lista lista de números
     * @return el mayor elemento
     */
    T maximo(List<T> lista);
}

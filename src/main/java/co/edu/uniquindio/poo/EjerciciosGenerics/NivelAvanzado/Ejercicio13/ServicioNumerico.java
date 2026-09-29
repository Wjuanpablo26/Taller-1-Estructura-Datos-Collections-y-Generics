package co.edu.uniquindio.poo.EjerciciosGenerics.NivelAvanzado.Ejercicio13;

import java.util.List;

/**
 * Implementa las operaciones para obtener el mínimo
 * y el máximo de una lista numérica.
 *
 * @param <T> tipo numérico que implementa Comparable
 */
public class ServicioNumerico<T extends Number & Comparable<T>>
        implements Servicio<T> {

    /**
     * Busca el menor elemento de la lista.
     *
     * @param lista lista de números
     * @return el menor elemento
     * @throws IllegalArgumentException si la lista está vacía
     */
    @Override
    public T minimo(List<T> lista) {

        if (lista.isEmpty()) {
            throw new IllegalArgumentException(
                    "La lista no puede estar vacía");
        }

        T menor = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(menor) < 0) {
                menor = lista.get(i);
            }
        }

        return menor;
    }

    /**
     * Busca el mayor elemento de la lista.
     *
     * @param lista lista de números
     * @return el mayor elemento
     * @throws IllegalArgumentException si la lista está vacía
     */
    @Override
    public T maximo(List<T> lista) {

        if (lista.isEmpty()) {
            throw new IllegalArgumentException(
                    "La lista no puede estar vacía");
        }

        T mayor = lista.get(0);

        for (int i = 1; i < lista.size(); i++) {
            if (lista.get(i).compareTo(mayor) > 0) {
                mayor = lista.get(i);
            }
        }

        return mayor;
    }
}

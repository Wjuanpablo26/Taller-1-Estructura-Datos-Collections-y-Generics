package co.edu.uniquindio.poo.EjerciciosGenerics.Nivel_Intermedio.Ejercicio9;

import java.util.ArrayList;

/**
 * Implementa la interfaz Almacenable y permite guardar elementos
 * y encontrar el mayor de ellos.
 *
 * @param <T> tipo de dato comparable que se almacenará
 */
public class Almacen<T extends Comparable<T>>
        implements Almacenable<T> {

    private ArrayList<T> elementos;

    /**
     * Construye un almacén vacío.
     */
    public Almacen() {
        elementos = new ArrayList<>();
    }

    /**
     * Guarda un elemento en el almacén.
     *
     * @param item elemento que se desea guardar
     */
    @Override
    public void guardar(T item) {
        elementos.add(item);
    }

    /**
     * Busca y devuelve el mayor elemento almacenado.
     *
     * @return el mayor elemento o null si el almacén está vacío
     */
    @Override
    public T maximo() {

        if (elementos.isEmpty()) {
            return null;
        }

        T mayor = elementos.get(0);

        for (int i = 1; i < elementos.size(); i++) {
            if (elementos.get(i).compareTo(mayor) > 0) {
                mayor = elementos.get(i);
            }
        }

        return mayor;
    }
}
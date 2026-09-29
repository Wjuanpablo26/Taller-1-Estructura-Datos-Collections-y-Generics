package co.edu.uniquindio.poo.EjerciciosGenerics.NivelBasico.Ejercicio3;

import java.util.ArrayList;

/**
 * Implementa la interfaz Contenedor usando un ArrayList.
 *
 * @param <T> tipo de dato que almacenará la lista
 */
public class ListaContenedor<T> implements Contenedor<T> {

    private ArrayList<T> elementos;

    /**
     * Crea un contenedor vacío.
     */
    public ListaContenedor() {
        elementos = new ArrayList<>();
    }

    /**
     * Agrega un elemento al final de la lista.
     *
     * @param item elemento que se desea agregar
     */
    @Override
    public void agregar(T item) {
        elementos.add(item);
    }

    /**
     * Obtiene el elemento ubicado en el índice indicado.
     *
     * @param indice posición del elemento
     * @return elemento ubicado en esa posición
     */
    @Override
    public T obtener(int indice) {
        return elementos.get(indice);
    }

    /**
     * Devuelve la cantidad de elementos almacenados.
     *
     * @return número de elementos
     */
    public int cantidadElementos() {
        return elementos.size();
    }
}
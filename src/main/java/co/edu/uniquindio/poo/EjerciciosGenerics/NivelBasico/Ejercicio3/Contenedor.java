package co.edu.uniquindio.poo.EjerciciosGenerics.NivelBasico.Ejercicio3;

/**
 * Interfaz genérica que define operaciones para un contenedor.
 *
 * @param <T> tipo de dato que almacenará el contenedor
 */
public interface Contenedor<T> {

    /**
     * Agrega un elemento al contenedor.
     *
     * @param item elemento que se desea agregar
     */
    void agregar(T item);

    /**
     * Obtiene un elemento según su posición.
     *
     * @param indice posición del elemento
     * @return elemento ubicado en esa posición
     */
    T obtener(int indice);
}

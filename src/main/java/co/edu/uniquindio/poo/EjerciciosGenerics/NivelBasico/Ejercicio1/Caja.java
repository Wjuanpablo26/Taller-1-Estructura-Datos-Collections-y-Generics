package co.edu.uniquindio.poo.EjerciciosGenerics.NivelBasico.Ejercicio1;

/**
 * Clase genérica que permite guardar y obtener un elemento
 * de cualquier tipo de dato.
 *
 * @param <T> tipo de dato que almacenará la caja
 */
public class Caja<T> {

    private T contenido;

    /**
     * Guarda un valor dentro de la caja.
     *
     * @param valor elemento que se desea guardar
     */
    public void guardar(T valor) {
        contenido = valor;
    }

    /**
     * Obtiene el valor almacenado en la caja.
     *
     * @return elemento guardado
     */
    public T obtener() {
        return contenido;
    }
}

package co.edu.uniquindio.poo.EjerciciosGenerics.NivelBasico.Ejercicio5;

import java.util.Objects;

/**
 * Clase genérica que almacena dos valores del mismo tipo.
 *
 * @param <T> tipo de dato de los valores almacenados
 */
public class Par<T> {

    private T primero;
    private T segundo;

    /**
     * Crea un par con dos valores.
     *
     * @param primero primer valor
     * @param segundo segundo valor
     */
    public Par(T primero, T segundo) {
        this.primero = primero;
        this.segundo = segundo;
    }

    /**
     * Verifica si los dos valores son iguales.
     *
     * @return true si son iguales, false si son diferentes
     */
    public boolean sonIguales() {
        return Objects.equals(primero, segundo);
    }

    /**
     * Obtiene el primer valor.
     *
     * @return primer elemento del par
     */
    public T getPrimero() {
        return primero;
    }

    /**
     * Obtiene el segundo valor.
     *
     * @return segundo elemento del par
     */
    public T getSegundo() {
        return segundo;
    }
}
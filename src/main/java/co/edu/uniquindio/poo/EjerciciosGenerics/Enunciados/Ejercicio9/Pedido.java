package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio9;

import java.time.LocalDate;

/**
 * Representa un pedido realizado por un cliente.
 * Su orden natural se establece por el ID.
 */
public class Pedido implements Comparable<Pedido> {

    private int id;
    private String cliente;
    private LocalDate fecha;
    private double total;

    /**
     * Crea un pedido con sus datos.
     *
     * @param id identificador del pedido
     * @param cliente nombre del cliente
     * @param fecha fecha del pedido
     * @param total valor total del pedido
     */
    public Pedido(int id, String cliente, LocalDate fecha, double total) {
        this.id = id;
        this.cliente = cliente;
        this.fecha = fecha;
        this.total = total;
    }

    public int getId() {
        return id;
    }

    public String getCliente() {
        return cliente;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public double getTotal() {
        return total;
    }

    /**
     * Compara los pedidos por su identificador.
     *
     * @param otro pedido con el que se compara
     * @return resultado de comparar los ID
     */
    @Override
    public int compareTo(Pedido otro) {
        return Integer.compare(this.id, otro.id);
    }

    /**
     * Devuelve los datos del pedido como texto.
     *
     * @return información del pedido
     */
    @Override
    public String toString() {
        return "ID: " + id
                + ", Cliente: " + cliente
                + ", Fecha: " + fecha
                + ", Total: $" + total;
    }
}

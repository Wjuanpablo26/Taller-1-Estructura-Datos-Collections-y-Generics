package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio7;

import java.util.LinkedList;

public class ColaBanco {

    private LinkedList<String> clientes;

    /**
     * Inicializa la cola de clientes del banco.
     */
    public ColaBanco() {
        clientes = new LinkedList<>();
    }

    /**
     * Agrega un cliente al final de la cola.
     *
     * @param nombre nombre del cliente que ingresa
     */
    public void agregarCliente(String nombre) {
        clientes.addLast(nombre);
        System.out.println(nombre + " ingresó a la cola.");
    }

    /**
     * Atiende y retira al primer cliente de la cola.
     *
     * @return nombre del cliente atendido, o null si no hay clientes
     */
    public String atenderCliente() {
        if (clientes.isEmpty()) {
            System.out.println("No hay clientes para atender.");
            return null;
        }

        String atendido = clientes.pollFirst();
        System.out.println("Atendiendo a: " + atendido);
        return atendido;
    }

    /**
     * Inserta un cliente urgente al inicio de la cola.
     *
     * @param nombre nombre del cliente urgente
     */
    public void agregarUrgente(String nombre) {
        clientes.addFirst(nombre);
        System.out.println(nombre + " ingresó con atención urgente.");
    }

    /**
     * Muestra los clientes en el orden actual de atención.
     */
    public void mostrarCola() {
        if (clientes.isEmpty()) {
            System.out.println("La cola está vacía.");
            return;
        }

        System.out.println("Cola de atención: " + clientes);
    }

    /**
     * Consulta si la cola no tiene clientes.
     *
     * @return true si está vacía; false si tiene clientes
     */
    public boolean estaVacia() {
        return clientes.isEmpty();
    }
}
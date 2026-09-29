package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio9;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

/**
 * Administra los pedidos y permite filtrarlos y ordenarlos.
 */
public class GestorPedidos {

    private LinkedList<Pedido> pedidos;

    /**
     * Construye un gestor de pedidos vacío.
     */
    public GestorPedidos() {
        pedidos = new LinkedList<>();
    }

    /**
     * Agrega un pedido al gestor.
     *
     * @param pedido pedido que se desea agregar
     */
    public void agregarPedido(Pedido pedido) {
        pedidos.add(pedido);
    }

    /**
     * Filtra los pedidos de un cliente exacto usando Iterator.
     *
     * @param cliente nombre exacto del cliente
     * @return lista de pedidos que pertenecen al cliente
     */
    public List<Pedido> filtrarPorCliente(String cliente) {

        List<Pedido> resultado = new LinkedList<>();
        Iterator<Pedido> iterador = pedidos.iterator();

        while (iterador.hasNext()) {
            Pedido pedido = iterador.next();

            if (pedido.getCliente().equals(cliente)) {
                resultado.add(pedido);
            }
        }

        return resultado;
    }

    /**
     * Ordena los pedidos por su orden natural: ID ascendente.
     */
    public void ordenarPorId() {
        Collections.sort(pedidos);
    }

    /**
     * Ordena por fecha ascendente y, si las fechas coinciden,
     * por total descendente.
     */
    public void ordenarPorFechaYTotal() {

        Comparator<Pedido> comparador = new Comparator<Pedido>() {
            @Override
            public int compare(Pedido p1, Pedido p2) {

                int resultadoFecha =
                        p1.getFecha().compareTo(p2.getFecha());

                if (resultadoFecha != 0) {
                    return resultadoFecha;
                }

                return Double.compare(p2.getTotal(), p1.getTotal());
            }
        };

        pedidos.sort(comparador);
    }

    /**
     * Muestra todos los pedidos.
     */
    public void mostrarPedidos() {
        for (Pedido pedido : pedidos) {
            System.out.println(pedido);
        }
    }
}

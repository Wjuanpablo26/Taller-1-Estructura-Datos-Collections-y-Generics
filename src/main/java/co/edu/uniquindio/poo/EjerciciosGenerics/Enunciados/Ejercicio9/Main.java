package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio9;

import java.time.LocalDate;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        GestorPedidos gestor = new GestorPedidos();

        gestor.agregarPedido(new Pedido(
                103, "Laura", LocalDate.of(2026, 9, 20), 150000));

        gestor.agregarPedido(new Pedido(
                101, "Carlos", LocalDate.of(2026, 9, 18), 200000));

        gestor.agregarPedido(new Pedido(
                105, "Laura", LocalDate.of(2026, 9, 18), 300000));

        gestor.agregarPedido(new Pedido(
                102, "Andrea", LocalDate.of(2026, 9, 20), 120000));

        gestor.agregarPedido(new Pedido(
                104, "Laura", LocalDate.of(2026, 9, 18), 180000));


        System.out.println("PEDIDOS REGISTRADOS:");
        gestor.mostrarPedidos();


        System.out.println("\nPEDIDOS DEL CLIENTE LAURA:");
        List<Pedido> pedidosLaura = gestor.filtrarPorCliente("Laura");

        for (Pedido pedido : pedidosLaura) {
            System.out.println(pedido);
        }


        System.out.println("\nPEDIDOS ORDENADOS POR ID:");
        gestor.ordenarPorId();
        gestor.mostrarPedidos();


        System.out.println("\nPEDIDOS ORDENADOS POR FECHA Y TOTAL:");
        gestor.ordenarPorFechaYTotal();
        gestor.mostrarPedidos();
    }
}

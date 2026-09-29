package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio7;

public class Main {

    public static void main(String[] args) {

        ColaBanco banco = new ColaBanco();

        // Agregar clientes normales
        banco.agregarCliente("Laura");
        banco.agregarCliente("Carlos");
        banco.agregarCliente("Andrés");

        banco.mostrarCola();

        // Insertar un cliente urgente al inicio
        banco.agregarUrgente("María - URGENTE");

        banco.mostrarCola();

        // Atender dos clientes
        banco.atenderCliente();
        banco.atenderCliente();

        banco.mostrarCola();
    }
}
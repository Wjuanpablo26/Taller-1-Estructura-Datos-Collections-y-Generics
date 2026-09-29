package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio13;

/**
 * Prueba el sistema de atención de pacientes.
 */
public class Main {

    public static void main(String[] args) {

        GestorHospital hospital = new GestorHospital();

        // Registrar pacientes con diferentes prioridades
        hospital.registrarPaciente(new Paciente("Laura", 3));
        hospital.registrarPaciente(new Paciente("Carlos", 1));
        hospital.registrarPaciente(new Paciente("María", 2));

        // Mostrar el orden de atención
        System.out.println("\nOrden de atención:");
        hospital.mostrarPacientes();

        // Atender al paciente más urgente
        System.out.println("\nAtención:");
        hospital.atenderPaciente();

        // Mostrar los pacientes que continúan pendientes
        System.out.println("\nPacientes restantes:");
        hospital.mostrarPacientes();
    }
}
package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio13;

import java.util.PriorityQueue;

/**
 * Administra la atención de pacientes según su prioridad.
 */
public class GestorHospital {

    private PriorityQueue<Paciente> pacientes;

    /**
     * Inicializa la cola de prioridad.
     */
    public GestorHospital() {
        pacientes = new PriorityQueue<>();
    }

    /**
     * Agrega un paciente a la cola.
     *
     * @param paciente paciente que se registra
     */
    public void registrarPaciente(Paciente paciente) {
        pacientes.offer(paciente);
        System.out.println("Paciente registrado: " + paciente);
    }

    /**
     * Atiende al paciente con mayor urgencia.
     *
     * @return paciente atendido, o null si no hay pacientes
     */
    public Paciente atenderPaciente() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes pendientes.");
            return null;
        }

        Paciente atendido = pacientes.poll();
        System.out.println("Atendiendo a: " + atendido);

        return atendido;
    }

    /**
     * Muestra los pacientes en el orden en que serían atendidos.
     * Se utiliza una copia para no modificar la cola original.
     */
    public void mostrarPacientes() {
        if (pacientes.isEmpty()) {
            System.out.println("No hay pacientes pendientes.");
            return;
        }

        PriorityQueue<Paciente> copia = new PriorityQueue<>(pacientes);

        System.out.println("Pacientes pendientes:");

        while (!copia.isEmpty()) {
            System.out.println(copia.poll());
        }
    }

    /**
     * Verifica si la cola está vacía.
     *
     * @return true si no hay pacientes pendientes
     */
    public boolean estaVacia() {
        return pacientes.isEmpty();
    }
}
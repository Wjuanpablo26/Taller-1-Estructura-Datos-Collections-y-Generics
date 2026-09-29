package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio11;

import java.util.Iterator;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ColaAtencionPacientes cola = new ColaAtencionPacientes();

        cola.agregarPaciente(
                new Paciente(1, "Laura", 3, 1000L));

        cola.agregarPaciente(
                new Paciente(2, "Carlos", 5, 2000L));

        cola.agregarPaciente(
                new Paciente(3, "Andrea", 4, 3000L));

        cola.agregarPaciente(
                new Paciente(4, "Camila", 5, 4000L));

        cola.agregarPaciente(
                new Paciente(5, "Andrés", 2, 5000L));

        System.out.println("PACIENTES REGISTRADOS:");
        cola.mostrarPacientes();

        System.out.println("\nPACIENTES ORDENADOS POR NOMBRE:");
        cola.ordenarPorNombre();
        cola.mostrarPacientes();

        System.out.println(
                "\nPACIENTES PRIORIDAD >= 3, MÁXIMO 3 RESULTADOS:");

        List<Paciente> seleccionados =
                cola.obtenerPacientesPrioritarios(3, 3);

        Iterator<Paciente> iterador = seleccionados.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}

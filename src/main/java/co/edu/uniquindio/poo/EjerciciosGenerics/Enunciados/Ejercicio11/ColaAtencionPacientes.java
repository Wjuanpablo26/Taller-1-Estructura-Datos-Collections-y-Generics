package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio11;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/**
 * Administra una cola de pacientes y permite seleccionar
 * pacientes según su prioridad y hora de ingreso.
 */
public class ColaAtencionPacientes {

    private LinkedList<Paciente> pacientes;

    /**
     * Construye una cola vacía.
     */
    public ColaAtencionPacientes() {
        pacientes = new LinkedList<>();
    }

    /**
     * Agrega un paciente a la cola.
     *
     * @param paciente paciente que se desea agregar
     */
    public void agregarPaciente(Paciente paciente) {
        pacientes.add(paciente);
    }

    /**
     * Devuelve hasta K pacientes con prioridad mayor o igual
     * a P, comenzando por los de ingreso más reciente.
     *
     * Utiliza Iterator para recorrer los pacientes.
     * No modifica la cola original.
     *
     * @param k cantidad máxima de pacientes que se devolverán
     * @param p prioridad mínima requerida
     * @return lista de pacientes seleccionados
     */
    public List<Paciente> obtenerPacientesPrioritarios(int k, int p) {

        List<Paciente> resultado = new ArrayList<>();

        if (k <= 0) {
            return resultado;
        }

        List<Paciente> copia = new ArrayList<>(pacientes);

        Comparator<Paciente> comparador = new Comparator<Paciente>() {
            @Override
            public int compare(Paciente paciente1, Paciente paciente2) {

                int comparacionPrioridad =
                        Integer.compare(
                                paciente2.getPrioridad(),
                                paciente1.getPrioridad());

                if (comparacionPrioridad != 0) {
                    return comparacionPrioridad;
                }

                return Long.compare(
                        paciente2.getTimestampIngreso(),
                        paciente1.getTimestampIngreso());
            }
        };

        copia.sort(comparador);

        Iterator<Paciente> iterador = copia.iterator();

        while (iterador.hasNext() && resultado.size() < k) {
            Paciente paciente = iterador.next();

            if (paciente.getPrioridad() >= p) {
                resultado.add(paciente);
            }
        }

        return resultado;
    }

    /**
     * Ordena la cola por el orden natural de los pacientes:
     * nombre alfabético.
     */
    public void ordenarPorNombre() {
        pacientes.sort(null);
    }

    /**
     * Muestra los pacientes registrados usando Iterator.
     */
    public void mostrarPacientes() {
        Iterator<Paciente> iterador = pacientes.iterator();

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}

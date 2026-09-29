package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio13;

/**
 * Representa un paciente del hospital.
 */
public class Paciente implements Comparable<Paciente> {

    private String nombre;
    private int prioridad;

    /**
     * Crea un paciente con su nombre y nivel de prioridad.
     *
     * @param nombre nombre del paciente
     * @param prioridad nivel de prioridad; 1 representa mayor urgencia
     */
    public Paciente(String nombre, int prioridad) {
        this.nombre = nombre;
        this.prioridad = prioridad;
    }

    /**
     * Obtiene el nombre del paciente.
     *
     * @return nombre del paciente
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene el nivel de prioridad.
     *
     * @return prioridad del paciente
     */
    public int getPrioridad() {
        return prioridad;
    }

    /**
     * Compara pacientes según su prioridad.
     * Un número menor indica mayor urgencia.
     *
     * @param otro paciente con el que se compara
     * @return resultado de la comparación
     */
    @Override
    public int compareTo(Paciente otro) {
        return Integer.compare(this.prioridad, otro.prioridad);
    }

    /**
     * Devuelve los datos del paciente en texto.
     *
     * @return nombre y prioridad
     */
    @Override
    public String toString() {
        return nombre + " - Prioridad: " + prioridad;
    }
}

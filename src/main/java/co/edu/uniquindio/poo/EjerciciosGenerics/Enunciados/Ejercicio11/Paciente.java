package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio11;

/**
 * Representa a un paciente de la cola de atención.
 * Su orden natural se establece por nombre.
 */
public class Paciente implements Comparable<Paciente> {

    private int id;
    private String nombre;
    private int prioridad;
    private long timestampIngreso;

    /**
     * Crea un paciente con sus datos.
     *
     * @param id identificador del paciente
     * @param nombre nombre del paciente
     * @param prioridad nivel de prioridad
     * @param timestampIngreso instante de ingreso en milisegundos
     */
    public Paciente(int id, String nombre, int prioridad,
                    long timestampIngreso) {
        this.id = id;
        this.nombre = nombre;
        this.prioridad = prioridad;
        this.timestampIngreso = timestampIngreso;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public int getPrioridad() {
        return prioridad;
    }

    public long getTimestampIngreso() {
        return timestampIngreso;
    }

    /**
     * Compara pacientes por nombre.
     *
     * @param otro paciente con el que se compara
     * @return resultado de comparar los nombres
     */
    @Override
    public int compareTo(Paciente otro) {
        return this.nombre.compareToIgnoreCase(otro.nombre);
    }

    /**
     * Devuelve los datos del paciente como texto.
     *
     * @return información del paciente
     */
    @Override
    public String toString() {
        return "ID: " + id
                + ", Nombre: " + nombre
                + ", Prioridad: " + prioridad
                + ", Ingreso: " + timestampIngreso;
    }
}

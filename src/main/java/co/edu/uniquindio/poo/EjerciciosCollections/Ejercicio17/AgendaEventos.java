package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio17;

import java.time.LocalDate;
import java.util.Map;
import java.util.TreeMap;

/**
 * Administra eventos organizados por fecha.
 */
public class AgendaEventos {

    private TreeMap<LocalDate, String> eventos;

    /**
     * Inicializa una agenda vacía.
     */
    public AgendaEventos() {
        eventos = new TreeMap<>();
    }

    /**
     * Agrega un evento para una fecha determinada.
     *
     * @param fecha fecha en la que se realizará el evento
     * @param nombre nombre del evento
     */
    public void agregarEvento(LocalDate fecha, String nombre) {
        eventos.put(fecha, nombre);
        System.out.println("Evento agregado: " + nombre);
    }

    /**
     * Muestra todos los eventos en orden cronológico.
     */
    public void mostrarEventos() {
        if (eventos.isEmpty()) {
            System.out.println("No hay eventos registrados.");
            return;
        }

        System.out.println("Agenda de eventos:");

        for (Map.Entry<LocalDate, String> evento : eventos.entrySet()) {
            System.out.println(
                    evento.getKey() + " - " + evento.getValue()
            );
        }
    }

    /**
     * Busca el evento más próximo desde una fecha indicada.
     *
     * @param desde fecha desde la cual se busca
     * @return el evento más próximo o null si no hay eventos posteriores
     */
    public Map.Entry<LocalDate, String> obtenerEventoProximo(
            LocalDate desde) {

        return eventos.ceilingEntry(desde);
    }

    /**
     * Elimina el evento registrado para una fecha.
     *
     * @param fecha fecha del evento que se eliminará
     */
    public void eliminarEvento(LocalDate fecha) {
        if (eventos.containsKey(fecha)) {
            String nombre = eventos.remove(fecha);
            System.out.println("Evento eliminado: " + nombre);
        } else {
            System.out.println("No hay un evento registrado en esa fecha.");
        }
    }
}

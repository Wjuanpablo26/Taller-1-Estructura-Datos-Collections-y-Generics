package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio17;

import java.time.LocalDate;
import java.util.Map;

/**
 * Prueba las operaciones de la agenda de eventos.
 */
public class Main {

    public static void main(String[] args) {

        AgendaEventos agenda = new AgendaEventos();

        // Registrar eventos en diferentes fechas
        agenda.agregarEvento(
                LocalDate.of(2026, 11, 15),
                "Entrega del proyecto"
        );

        agenda.agregarEvento(
                LocalDate.of(2026, 10, 10),
                "Exposición"
        );

        agenda.agregarEvento(
                LocalDate.of(2026, 12, 5),
                "Examen final"
        );

        // Mostrar eventos ordenados por fecha
        System.out.println();
        agenda.mostrarEventos();

        // Buscar el evento más próximo desde una fecha
        LocalDate fechaBusqueda = LocalDate.of(2026, 10, 1);

        Map.Entry<LocalDate, String> proximo =
                agenda.obtenerEventoProximo(fechaBusqueda);

        System.out.println("\nEvento más próximo:");

        if (proximo != null) {
            System.out.println(
                    proximo.getKey() + " - " + proximo.getValue()
            );
        } else {
            System.out.println("No hay eventos próximos.");
        }

        // Eliminar un evento
        System.out.println();
        agenda.eliminarEvento(LocalDate.of(2026, 11, 15));

        // Mostrar la agenda actualizada
        System.out.println();
        agenda.mostrarEventos();
    }
}
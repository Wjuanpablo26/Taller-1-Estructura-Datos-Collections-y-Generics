package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio5;

import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Collections;

/**
 * Administra los asistentes registrados.
 */
public class RegistroAsistentes {

    private LinkedList<Asistente> asistentes;

    /**
     * Construye un registro vacío.
     */
    public RegistroAsistentes() {
        asistentes = new LinkedList<>();
    }

    /**
     * Agrega un asistente al registro.
     *
     * @param asistente asistente que se desea registrar
     */
    public void agregarAsistente(Asistente asistente) {
        asistentes.add(asistente);
    }

    /**
     * Filtra asistentes cuyos nombres comienzan por una letra.
     * Utiliza únicamente Iterator para recorrer la lista.
     *
     * @param letra letra inicial que se desea buscar
     * @return lista de asistentes que cumplen la condición
     */
    public List<Asistente> filtrarPorInicial(char letra) {

        List<Asistente> resultado = new LinkedList<>();
        Iterator<Asistente> iterador = asistentes.iterator();

        char inicialBuscada = Character.toLowerCase(letra);

        while (iterador.hasNext()) {
            Asistente asistente = iterador.next();

            String nombre = asistente.getNombre();

            if (!nombre.isEmpty()
                    && Character.toLowerCase(nombre.charAt(0))
                    == inicialBuscada) {
                resultado.add(asistente);
            }
        }

        return resultado;
    }

    /**
     * Ordena los asistentes por nombre usando Comparator.
     */
    public void ordenarPorNombre() {

        Comparator<Asistente> comparadorNombre =
                new Comparator<Asistente>() {
                    @Override
                    public int compare(Asistente a1, Asistente a2) {
                        return a1.getNombre()
                                .compareToIgnoreCase(a2.getNombre());
                    }
                };

        asistentes.sort(comparadorNombre);
    }

    /**
     * Ordena los asistentes según su orden natural:
     * por documento.
     */
    public void ordenarPorDocumento() {
        Collections.sort(asistentes);
    }

    /**
     * Muestra los asistentes registrados.
     */
    public void mostrarAsistentes() {
        for (Asistente asistente : asistentes) {
            System.out.println(asistente);
        }
    }
}

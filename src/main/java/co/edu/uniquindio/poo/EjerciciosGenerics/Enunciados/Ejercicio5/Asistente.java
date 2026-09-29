package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio5;

/**
 * Representa a una persona registrada en el evento.
 * Su orden natural se establece por número de documento.
 */
public class Asistente implements Comparable<Asistente> {

    private String documento;
    private String nombre;

    /**
     * Construye un asistente con documento y nombre.
     *
     * @param documento documento del asistente
     * @param nombre nombre del asistente
     */
    public Asistente(String documento, String nombre) {
        this.documento = documento;
        this.nombre = nombre;
    }

    /**
     * Obtiene el documento del asistente.
     *
     * @return documento
     */
    public String getDocumento() {
        return documento;
    }

    /**
     * Obtiene el nombre del asistente.
     *
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Compara asistentes por su documento.
     *
     * @param otro asistente con el que se compara
     * @return resultado de la comparación de documentos
     */
    @Override
    public int compareTo(Asistente otro) {
        return this.documento.compareTo(otro.documento);
    }

    /**
     * Devuelve los datos del asistente como texto.
     *
     * @return documento y nombre
     */
    @Override
    public String toString() {
        return "Documento: " + documento + ", Nombre: " + nombre;
    }
}

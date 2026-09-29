package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio15;

import java.util.HashMap;
import java.util.Map;

/**
 * Administra un directorio de contactos telefónicos.
 */
public class DirectorioTelefonico {

    private HashMap<String, String> contactos;

    /**
     * Inicializa el directorio telefónico.
     */
    public DirectorioTelefonico() {
        contactos = new HashMap<>();
    }

    /**
     * Agrega un contacto si el nombre todavía no existe.
     *
     * @param nombre nombre del contacto
     * @param telefono número telefónico
     */
    public void agregarContacto(String nombre, String telefono) {
        if (contactos.containsKey(nombre)) {
            System.out.println("El contacto " + nombre + " ya existe.");
        } else {
            contactos.put(nombre, telefono);
            System.out.println("Contacto agregado: " + nombre);
        }
    }

    /**
     * Busca el número telefónico asociado a un nombre.
     *
     * @param nombre nombre que se desea buscar
     * @return número telefónico o null si no existe
     */
    public String buscarContacto(String nombre) {
        return contactos.get(nombre);
    }

    /**
     * Elimina un contacto del directorio.
     *
     * @param nombre nombre del contacto que se eliminará
     */
    public void eliminarContacto(String nombre) {
        if (contactos.containsKey(nombre)) {
            contactos.remove(nombre);
            System.out.println("Contacto eliminado: " + nombre);
        } else {
            System.out.println("El contacto no existe.");
        }
    }

    /**
     * Muestra todos los contactos registrados.
     */
    public void mostrarContactos() {
        if (contactos.isEmpty()) {
            System.out.println("El directorio está vacío.");
            return;
        }

        System.out.println("Directorio telefónico:");

        for (Map.Entry<String, String> contacto : contactos.entrySet()) {
            System.out.println(
                    contacto.getKey() + " - " + contacto.getValue()
            );
        }
    }
}
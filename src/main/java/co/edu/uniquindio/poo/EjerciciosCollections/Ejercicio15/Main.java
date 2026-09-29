package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio15;

/**
 * Prueba las operaciones del directorio telefónico.
 */
public class Main {

    public static void main(String[] args) {

        DirectorioTelefonico directorio = new DirectorioTelefonico();

        // Agregar contactos
        directorio.agregarContacto("Laura", "3101234567");
        directorio.agregarContacto("Carlos", "3159876543");
        directorio.agregarContacto("María", "3004567890");

        // Intentar agregar un nombre que ya existe
        directorio.agregarContacto("Laura", "3201112233");

        // Mostrar todos los contactos
        System.out.println();
        directorio.mostrarContactos();

        // Buscar un contacto
        System.out.println("\nBúsqueda:");
        String telefono = directorio.buscarContacto("Carlos");

        if (telefono != null) {
            System.out.println("Número de Carlos: " + telefono);
        } else {
            System.out.println("Contacto no encontrado.");
        }

        // Eliminar un contacto
        System.out.println();
        directorio.eliminarContacto("María");

        // Mostrar el directorio actualizado
        System.out.println();
        directorio.mostrarContactos();
    }
}

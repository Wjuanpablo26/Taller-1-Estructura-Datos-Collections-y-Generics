package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio5;


public class Main {

    public static void main(String[] args) {

        // Creamos el objeto que administra los mapas.
        ComparacionMapas inventario = new ComparacionMapas();

        // Agregamos productos en un orden determinado.
        inventario.agregarProducto(103, "Cafe");
        inventario.agregarProducto(101, "Leche");
        inventario.agregarProducto(105, "Azucar");
        inventario.agregarProducto(102, "Arroz");

        // Mostramos el contenido de HashMap.
        inventario.mostrarHashMap();

        System.out.println();

        // Mostramos el contenido de LinkedHashMap.
        inventario.mostrarLinkedHashMap();

        System.out.println();

        // Mostramos el contenido de TreeMap.
        inventario.mostrarTreeMap();
    }
}


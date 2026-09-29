package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio3;


public class Main {

    public static void main(String[] args) {

        // Creamos el objeto que administra el conjunto.
        ListaSinDuplicados lista = new ListaSinDuplicados();

        // Agregamos diferentes elementos.
        System.out.println(lista.agregar("Manzana"));
        System.out.println(lista.agregar("Pera"));
        System.out.println(lista.agregar("Banano"));

        // Intentamos agregar un elemento repetido.
        System.out.println(lista.agregar("Manzana"));

        // Mostramos los elementos almacenados.
        System.out.println("\nElementos del conjunto:");
        lista.mostrarElementos();

        // Consultamos la cantidad de elementos.
        System.out.println(
                "\nCantidad: " + lista.cantidad()
        );

        // Verificamos si existe una fruta.
        System.out.println(
                "¿Contiene Pera? " + lista.contiene("Pera")
        );
    }
}

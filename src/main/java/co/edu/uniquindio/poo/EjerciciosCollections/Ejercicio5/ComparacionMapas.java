package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio5;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;
import java.util.Map;

public class ComparacionMapas {

    // Mapa que no garantiza un orden específico.
    private HashMap<Integer, String> productosHash;

    // Mapa que conserva el orden de inserción.
    private LinkedHashMap<Integer, String> productosLinked;

    // Mapa que ordena las claves de menor a mayor.
    private TreeMap<Integer, String> productosTree;

    // Constructor: inicializa los tres mapas.
    public ComparacionMapas() {

        productosHash = new HashMap<>();
        productosLinked = new LinkedHashMap<>();
        productosTree = new TreeMap<>();
    }

    // Agrega un producto a los tres mapas.
    // El código es la clave y el nombre es el valor.
    public void agregarProducto(int codigo, String nombre) {

        productosHash.put(codigo, nombre);

        productosLinked.put(codigo, nombre);

        productosTree.put(codigo, nombre);
    }

    // Muestra los productos almacenados en HashMap.
    public void mostrarHashMap() {

        System.out.println("Productos HashMap:");

        for (Map.Entry<Integer, String> producto
                : productosHash.entrySet()) {

            System.out.println(
                    producto.getKey() + " - "
                            + producto.getValue()
            );
        }
    }

    // Muestra los productos almacenados en LinkedHashMap.
    public void mostrarLinkedHashMap() {

        System.out.println("Productos LinkedHashMap:");

        for (Map.Entry<Integer, String> producto
                : productosLinked.entrySet()) {

            System.out.println(
                    producto.getKey() + " - "
                            + producto.getValue()
            );
        }
    }

    // Muestra los productos almacenados en TreeMap.
    public void mostrarTreeMap() {

        System.out.println("Productos TreeMap:");

        for (Map.Entry<Integer, String> producto
                : productosTree.entrySet()) {

            System.out.println(
                    producto.getKey() + " - "
                            + producto.getValue()
            );
        }
    }
}

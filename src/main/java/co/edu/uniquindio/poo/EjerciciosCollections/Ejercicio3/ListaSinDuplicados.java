package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio3;


import java.util.HashSet;
import java.util.Iterator;

public class ListaSinDuplicados {

    // Creamos un conjunto que almacena textos sin duplicados.
    private HashSet<String> elementos;

    // Constructor: inicializa el conjunto vacío.
    public ListaSinDuplicados() {
        elementos = new HashSet<>();
    }

    // Agrega un elemento al conjunto.
    // Devuelve true si se agregó y false si ya existía.
    public boolean agregar(String elemento) {
        return elementos.add(elemento);
    }

    // Recorre e imprime todos los elementos
    // utilizando un Iterator.
    public void mostrarElementos() {

        // Creamos el iterador del conjunto.
        Iterator<String> it = elementos.iterator();

        // Recorremos mientras existan elementos.
        while (it.hasNext()) {

            // Obtenemos el siguiente elemento.
            String elemento = it.next();

            // Imprimimos el elemento.
            System.out.println(elemento);
        }
    }

    // Devuelve la cantidad de elementos almacenados.
    public int cantidad() {
        return elementos.size();
    }

    // Verifica si el conjunto contiene un elemento.
    public boolean contiene(String elemento) {
        return elementos.contains(elemento);
    }
}

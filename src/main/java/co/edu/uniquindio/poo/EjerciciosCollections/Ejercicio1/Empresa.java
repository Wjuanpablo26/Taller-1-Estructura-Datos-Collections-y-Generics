package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio1;


import java.util.TreeSet;
import java.util.Iterator;

public class Empresa {

    private TreeSet<Producto> productos;

    public Empresa() {
        productos = new TreeSet<>();
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public Producto buscarProducto(int codigo) {

        Iterator<Producto> it = productos.iterator();

        while (it.hasNext()) {
            Producto producto = it.next();

            if (producto.getCodigo() == codigo) {
                return producto;
            }
        }

        return null;
    }

    public void mostrarProductos() {

        Iterator<Producto> it = productos.iterator();

        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

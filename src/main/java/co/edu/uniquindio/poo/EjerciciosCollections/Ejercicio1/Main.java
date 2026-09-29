package co.edu.uniquindio.poo.EjerciciosCollections.Ejercicio1;


public class Main {

    public static void main(String[] args) {

        Empresa empresa = new Empresa();

        empresa.agregarProducto(
                new Producto(103, "Arroz", 4500)
        );

        empresa.agregarProducto(
                new Producto(101, "Leche", 3800)
        );

        empresa.agregarProducto(
                new Producto(105, "Cafe", 12000)
        );

        empresa.agregarProducto(
                new Producto(102, "Azucar", 5200)
        );

        System.out.println("INVENTARIO DE PRODUCTOS:");

        empresa.mostrarProductos();

        System.out.println("\nBUSQUEDA DE PRODUCTO:");

        Producto encontrado = empresa.buscarProducto(103);

        if (encontrado != null) {
            System.out.println("Producto encontrado:");
            System.out.println(encontrado);
        } else {
            System.out.println("Producto no encontrado.");
        }

        System.out.println("\nBUSQUEDA DE PRODUCTO INEXISTENTE:");

        Producto inexistente = empresa.buscarProducto(999);

        if (inexistente != null) {
            System.out.println(inexistente);
        } else {
            System.out.println("Producto no encontrado.");
        }
    }
}

package co.edu.uniquindio.poo.EjerciciosGenerics.Nivel_Intermedio.Ejercicio9;

public class Main {

    public static void main(String[] args) {

        Almacenable<Integer> almacenNumeros = new Almacen<>();

        almacenNumeros.guardar(15);
        almacenNumeros.guardar(8);
        almacenNumeros.guardar(27);
        almacenNumeros.guardar(12);

        System.out.println("Mayor número: "
                + almacenNumeros.maximo());


        Almacenable<String> almacenNombres = new Almacen<>();

        almacenNombres.guardar("Laura");
        almacenNombres.guardar("Carlos");
        almacenNombres.guardar("Andrea");

        System.out.println("Mayor nombre alfabéticamente: "
                + almacenNombres.maximo());
    }
}

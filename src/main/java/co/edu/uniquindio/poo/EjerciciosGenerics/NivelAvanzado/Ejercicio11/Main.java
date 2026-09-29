package co.edu.uniquindio.poo.EjerciciosGenerics.NivelAvanzado.Ejercicio11;

public class Main {

    public static void main(String[] args) {

        EntidadPersistente<Integer> entidad1 =
                new EntidadPersistente<>(50);

        System.out.println("Valor almacenado: "
                + entidad1.obtenerValor());

        System.out.println("¿Es mayor que 30? "
                + entidad1.esMayorQue(30));

        System.out.println("¿Es mayor que 70? "
                + entidad1.esMayorQue(70));

        System.out.println("Comparación con 50: "
                + entidad1.compararCon(50));


        EntidadPersistente<Double> entidad2 =
                new EntidadPersistente<>(15.5);

        System.out.println("¿15.5 es mayor que 12.0? "
                + entidad2.esMayorQue(12.0));
    }
}

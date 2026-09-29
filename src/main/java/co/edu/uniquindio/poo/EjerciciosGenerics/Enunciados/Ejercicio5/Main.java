package co.edu.uniquindio.poo.EjerciciosGenerics.Enunciados.Ejercicio5;

public class Main {

    public static void main(String[] args) {

        RegistroAsistentes registro = new RegistroAsistentes();

        registro.agregarAsistente(
                new Asistente("1045", "Laura"));

        registro.agregarAsistente(
                new Asistente("1020", "Carlos"));

        registro.agregarAsistente(
                new Asistente("1080", "Andrea"));

        registro.agregarAsistente(
                new Asistente("1010", "Camila"));

        registro.agregarAsistente(
                new Asistente("1060", "Andrés"));

        System.out.println("ASISTENTES REGISTRADOS:");
        registro.mostrarAsistentes();

        System.out.println("\nASISTENTES CUYO NOMBRE COMIENZA POR A:");
        for (Asistente asistente : registro.filtrarPorInicial('A')) {
            System.out.println(asistente);
        }

        System.out.println("\nORDENADOS POR DOCUMENTO:");
        registro.ordenarPorDocumento();
        registro.mostrarAsistentes();

        System.out.println("\nORDENADOS POR NOMBRE:");
        registro.ordenarPorNombre();
        registro.mostrarAsistentes();
    }
}
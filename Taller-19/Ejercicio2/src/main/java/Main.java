public class Main {

    public static void main(String[] args) {

        Almacenamiento almacenamientoLocal = new AlmacenamientoLocal("Java.pdf");
        GestorArchivos gestorLocal = new GestorArchivos(almacenamientoLocal);
        gestorLocal.guardarArchivo();
        gestorLocal.recuperarArchivo("Java.pdf");

        Almacenamiento almacenamientoNube = new AlmacenamientoNube("Principios de SOLID.pdf");
        GestorArchivos gestorNube = new GestorArchivos(almacenamientoNube);
        gestorNube.guardarArchivo();
        gestorNube.recuperarArchivo("Principios de SOLID.pdf");

    }
}

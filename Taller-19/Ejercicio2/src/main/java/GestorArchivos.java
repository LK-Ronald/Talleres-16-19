public class GestorArchivos {

    private Almacenamiento almacenamiento;

    public GestorArchivos(Almacenamiento almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public void guardarArchivo() {
        almacenamiento.guardar();
    }

    public void recuperarArchivo(String nombre) {
        almacenamiento.recuperarArchivo(nombre);
    }

}

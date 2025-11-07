public class AlmacenamientoLocal implements Almacenamiento {

    private String nombre;

    public AlmacenamientoLocal(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void guardar() {
        System.out.println("El archivo " + this.nombre + " se ha guardado localmente");
    }

    @Override
    public void recuperarArchivo(String nombre) {
        System.out.println("El archivo " + nombre + " se ha recuperado");
    }
}

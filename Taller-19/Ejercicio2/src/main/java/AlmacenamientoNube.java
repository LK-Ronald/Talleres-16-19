public class AlmacenamientoNube implements Almacenamiento {

    private String nombre;

    public AlmacenamientoNube(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void guardar() {
        System.out.println("Subiendo a la nube...");
        System.out.println("El archivo " + this.nombre + " se guardo en la nube");
    }

    @Override
    public void recuperarArchivo(String nombre) {
        System.out.println("Recuperando archivo de la nube...");
        System.out.println("El archivo " + nombre + " se ha recuperado de la nube");
    }
}

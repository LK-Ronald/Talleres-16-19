public class Documento {
    private String nombre;
    private String contenido;

    public Documento(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void exportar() {
        System.out.println("Exportando " + "\"" + this.nombre + "\"" + " a PDF");
    }
}

public class ReportePDF implements GeneradorReporte {

    private String nombre;
    private String contenido;

    public ReportePDF(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    @Override
    public void generarReporte() {
        System.out.println("Generando reporte "+this.nombre+" pdf...");
        System.out.println("Contenido: "+this.contenido);
    }
}

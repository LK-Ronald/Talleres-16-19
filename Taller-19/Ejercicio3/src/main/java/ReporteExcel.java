public class ReporteExcel implements GeneradorReporte {
    private String nombre;
    private String contenido;

    public ReporteExcel(String nombre, String contenido) {
        this.nombre = nombre;
        this.contenido = contenido;
    }

    @Override
    public void generarReporte() {
        System.out.println("Generando reporte "+this.nombre+" exel...");
        System.out.println("Contenido: "+this.contenido);
    }
}

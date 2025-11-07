public class GestorReportes {

    private GeneradorReporte generadorReporte;

    public GestorReportes(GeneradorReporte generadorReporte) {
        this.generadorReporte = generadorReporte;
    }

    public void generarReporte() {
        generadorReporte.generarReporte();
    }

}

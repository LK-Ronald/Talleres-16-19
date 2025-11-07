public class Main {

    public static void main(String[] args) {

        GeneradorReporte reportePdf = new ReportePDF("Formulas","formulas de matematicas");
        GestorReportes gestorReportesPdf = new GestorReportes(reportePdf);
        gestorReportesPdf.generarReporte();

        GeneradorReporte reporteExel = new ReporteExcel("Hoja de calculo","Contabilidad de la empresa");
        GestorReportes gestorReportesExel = new GestorReportes(reporteExel);
        gestorReportesExel.generarReporte();
    }
}

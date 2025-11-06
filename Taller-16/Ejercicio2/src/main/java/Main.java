public class Main {

    public static void main(String[] args) {

        Documento dc = new Documento("Java", "Aqui aprenderas a uasr java");
        dc.exportar();

        DocumentoExcel dx = new DocumentoExcel("Hoja de claculo", "Aqui estan la contabilidad de la pagina wed");
        dx.exportar();

        DocumentoWord dw = new DocumentoWord("Documentacion", "Aqui esta la documentacion del codigo");
        dw.exportar();

    }
}

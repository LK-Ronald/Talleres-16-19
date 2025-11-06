public class DocumentoExcel extends Documento {

    DocumentoExcel(String nombre, String contenido) {
        super(nombre, contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando " + "\"" + getNombre() + "\"" + " a Exel");
    }
}

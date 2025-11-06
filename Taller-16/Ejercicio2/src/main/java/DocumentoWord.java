public class DocumentoWord extends Documento {

    public DocumentoWord(String nombre, String contenido) {
        super(nombre, contenido);
    }

    @Override
    public void exportar() {
        System.out.println("Exportando " + "\"" + getNombre() + "\"" + " a Word");
    }
}

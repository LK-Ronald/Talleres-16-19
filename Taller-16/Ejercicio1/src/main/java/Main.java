public class Main {

    public static void main(String[] args) {

        Descuento compras2 = new DescuentoPorcentaje(10);
        Descuento compras3 = new DescuentoCantidad(9);

        AplicarDescuento aplicarDescuento  = new AplicarDescuento();
        aplicarDescuento.aplicarDescuento(compras2, 2000);
        aplicarDescuento.aplicarDescuento(compras3, 2000);
    }
}

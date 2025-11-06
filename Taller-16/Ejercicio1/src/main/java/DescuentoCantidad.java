public class DescuentoCantidad extends Descuento {
    private int cantidad;

    public DescuentoCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public double aplicarDecuento(double valorOriginal) {

        double valorFinal = valorOriginal;

        if (this.cantidad >= 10) {
            valorFinal = valorOriginal * 0.1;
        }

        if (this.cantidad >= 20) {
            valorFinal = valorOriginal * 0.2;
        }

        return valorFinal;
    }
}

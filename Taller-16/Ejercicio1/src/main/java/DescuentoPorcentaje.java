public class DescuentoPorcentaje extends Descuento {

    private double porcentaje;

    public DescuentoPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

    @Override
    public double aplicarDecuento(double valorOriginal) {
        double precioFinal = valorOriginal * (porcentaje / 100);

        return precioFinal;
    }
}

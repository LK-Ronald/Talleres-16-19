public class ServicioRetiros implements Retiros {

    @Override
    public void retirar(double monto) {
        System.out.println("Se retiro de tu cuenta: " + monto);
    }

}

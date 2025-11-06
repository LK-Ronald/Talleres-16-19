public class ServicioTransferencias implements Transferencias{

    @Override
    public void transferir(double monto, String numeroCuenta) {
        System.out.println("Se transfirio "+monto+", al numero de cuenta "+numeroCuenta);
    }
}

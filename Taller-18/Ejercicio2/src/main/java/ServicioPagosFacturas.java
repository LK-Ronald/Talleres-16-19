public class ServicioPagosFacturas implements PagosFacturas {

    @Override
    public void pagarFactura(String servicio, double aPagar) {

        System.out.println("El serivio a pagar es: " + servicio + ", Se descontara de tu saldo: " + aPagar);

    }

}

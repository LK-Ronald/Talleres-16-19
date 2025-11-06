public class MensajeroSMS extends Mensajero {

    MensajeroSMS(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("El mensaje se envio por SMS");
    }

}

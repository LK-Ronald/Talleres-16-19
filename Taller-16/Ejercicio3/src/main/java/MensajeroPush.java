public class MensajeroPush extends Mensajero {


    MensajeroPush(String mensaje) {
        super(mensaje);
    }

    @Override
    public void enviarMensaje() {
        System.out.println("El mensaje se envio por mensajeria push");
    }

}

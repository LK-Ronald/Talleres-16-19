public class Mensajero {

    private String mensaje;

    public Mensajero(String mensaje) {
        this.mensaje = mensaje;
    }

    public void enviarMensaje() {
        System.out.println("El mensaje se envio por correo electronico");
    }

}

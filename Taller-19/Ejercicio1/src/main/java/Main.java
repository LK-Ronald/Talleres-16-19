public class Main {

    public static void main(String[] args) {

        ServicioAutenticacion servicioAutenticacion = new AutenticacionLocal("ronald", "12345");
        GestorAutenticacion gestorAutenticacion = new GestorAutenticacion(servicioAutenticacion);
        gestorAutenticacion.autenticar("ronald", "12345");

        ServicioAutenticacion verificarUsuario = new AutenticacionOAuth("admin", "admin");
        GestorAutenticacion gestorAutenticacion1 = new GestorAutenticacion(verificarUsuario);
        gestorAutenticacion1.autenticar("admin", "1234");

    }
}

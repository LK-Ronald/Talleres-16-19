public class GestorAutenticacion {

    private ServicioAutenticacion servicioAutenticacion;

    public GestorAutenticacion(ServicioAutenticacion servicioAutenticacion) {
        this.servicioAutenticacion = servicioAutenticacion;
    }

    public void autenticar(String usuario, String password) {

        if (servicioAutenticacion.autenticarUsuario(usuario, password)) {
            System.out.println("Usuario autenticado correctamente");
        } else {
            System.out.println("Usuario o password incorrecto");
        }
    }

}

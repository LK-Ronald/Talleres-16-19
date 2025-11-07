public class AutenticacionOAuth implements ServicioAutenticacion {

    private String usuario;
    private String password;

    public AutenticacionOAuth(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public boolean autenticarUsuario(String usuario, String password) {

        if (usuario.equals(this.usuario) && password.equals(this.password)) {
            return true;

        } else {
            return false;
        }

    }

}

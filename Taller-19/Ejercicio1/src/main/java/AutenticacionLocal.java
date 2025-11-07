public class AutenticacionLocal implements ServicioAutenticacion {

    private String usuario;
    private String password;

    public AutenticacionLocal(String usuario, String password) {
        this.usuario = usuario;
        this.password = password;
    }

    @Override
    public boolean autenticarUsuario(String usuario, String password) {

        if (usuario.equals(this.usuario) && password.equals(this.password)) {
            return true;
        }

        return false;
    }
}

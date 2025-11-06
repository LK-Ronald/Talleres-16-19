public class Bicicleta extends Transporte {

    public Bicicleta() {
        super();
    }

    @Override
    public void acelerar(int velocidad) {

        this.velocidad += velocidad;
        System.out.println("Acelerarndo la velocidad de la bicicleta");
    }

    @Override
    public void desacelerar(int velocidad) {

        if (this.velocidad > velocidad) {
            this.velocidad -= velocidad;
        } else {
            this.velocidad = 0;
        }

        System.out.println("Frenando la bicicleta");
    }
}

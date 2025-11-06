public class Coche extends Transporte{

    public Coche() {
        super();
    }

    @Override
    public void acelerar(int velocidad) {

        this.velocidad += velocidad;
        System.out.println("Acelerarndo coche");
    }

    @Override
    public void desacelerar(int velocidad) {

        if (this.velocidad > velocidad) {
            this.velocidad -= velocidad;
        } else {
            this.velocidad = 0;
        }

        System.out.println("Desacelerando del coche");
    }
}

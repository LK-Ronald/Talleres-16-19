public class Transporte {

    protected int velocidad;

    public Transporte() {

        this.velocidad = 0;
    }

    public void acelerar(int velocidad) {

        this.velocidad += velocidad;
        System.out.println("Transporte acelerando");
    }

    public void desacelerar(int velocidad) {

        if (this.velocidad > velocidad) {
            this.velocidad -= velocidad;
        } else {
            this.velocidad = 0;
        }

        System.out.println("Transporte desacelerando");
    }

    public int getVelocidad() {

        return this.velocidad;
    }

}

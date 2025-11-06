public abstract class CuentaBancaria {

    protected double saldo;

    public CuentaBancaria(double saldo) {
        this.saldo = saldo;
    }

    public void depositar(double monto) {

        if (monto > 0) {

            saldo += monto;
            System.out.println("Depósito exitoso. Nuevo saldo: $" + this.saldo);

        } else {

            System.out.println("El monto a depositar es invalido.");
        }
    }

    public void retirar(double monto) {

        if (monto > 0 && monto <= saldo) {

            saldo -= monto;

            System.out.println("Retiro exitoso. Nuevo saldo: $" + saldo);

        } else {

            System.out.println("Saldo insuficientes o monto inválido.");
        }
    }

    public double consultarSaldo() {

        return saldo;
    }

}

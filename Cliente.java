public class Cliente {
    private String nombre;
    private String tipoCuenta;
    private double saldo;

    public Cliente(String nombre, String tipoCuenta, double saldo) {
        this.nombre = nombre;
        this.tipoCuenta = tipoCuenta;
        this.saldo = saldo;
    }

    // Métodos getter y setter
    // Por ejemplo:
    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}

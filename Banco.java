public class Banco {
    private Cliente cliente;

    public Banco(Cliente cliente) {
        this.cliente = cliente;
    }

    // Métodos para consultar saldo, retirar y depositar
    // Por ejemplo:
    public void consultarSaldo() {
        System.out.println("Saldo actual: " + cliente.getSaldo());
    }

    public void retirar(double cantidad) {
        if (cantidad > cliente.getSaldo()) {
            System.out.println("Saldo insuficiente");
        } else {
            cliente.setSaldo(cliente.getSaldo() - cantidad);
            System.out.println("Retiro exitoso. Saldo restante: " + cliente.getSaldo());
        }
    }

    public void depositar(double cantidad) {
        cliente.setSaldo(cliente.getSaldo() + cantidad);
        System.out.println("Depósito exitoso. Saldo actualizado: " + cliente.getSaldo());
    }
}
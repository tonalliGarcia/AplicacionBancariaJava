import java.util.Scanner;

public class Principal{
    public static void main(String [] args){
        Cliente cliente = new Cliente("Tony Stark", "Cuenta Corriente", 1599.99);
        Banco banco = new Banco(cliente);
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("Menú:");
            System.out.println("1. Consultar saldo");
            System.out.println("2. Retirar");
            System.out.println("3. Depositar");
            System.out.println("9. Salir");
            System.out.print("Elija una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    banco.consultarSaldo();
                    break;
                case 2:
                    System.out.print("Ingrese la cantidad a retirar: ");
                    double cantidadRetiro = scanner.nextDouble();
                    banco.retirar(cantidadRetiro);
                    break;
                case 3:
                    System.out.print("Ingrese la cantidad a depositar: ");
                    double cantidadDeposito = scanner.nextDouble();
                    banco.depositar(cantidadDeposito);
                    break;
                case 9:
                    System.out.println("Finalizando el programa. ¡Gracias por usar nuestros servicios!");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 9);

        scanner.close();
    }
}
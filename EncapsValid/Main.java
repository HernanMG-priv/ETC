package EncapsValid;
public class Main {

    public static void main(String[] args) {

        // Crear una cuenta bancaria
        CuentaBancaria cuenta1 = new CuentaBancaria(
            "Hernan Mendoza",
            "123456789",
            1000
        );

        // Consultar titular y numero de cuenta
        System.out.println("Titular: " + cuenta1.mosTitular());
        System.out.println("Número de cuenta: " + cuenta1.mosNumeroCuenta());

        // Consultar saldo inicial
        System.out.println("Saldo inicial: $" + cuenta1.consultarSaldo());

        // Deposito valido
        cuenta1.depositar(500);

        // Deposito invalido
        cuenta1.depositar(-200);

        // Retiro valido
       cuenta1.retirar(300);

        // Retiro invalido
        cuenta1.retirar(1500);

        // Consultar saldo final
        System.out.println("\nSaldo final: $" + cuenta1.consultarSaldo());
    }
}

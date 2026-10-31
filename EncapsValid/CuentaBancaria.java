package EncapsValid;
public class CuentaBancaria {

    private String titular;
    private String numeroCuenta;
    private double saldo;

    // Constructor
    public CuentaBancaria(String titular, String numeroCuenta, double Saldo) {
        this.titular = titular;
        this.numeroCuenta = numeroCuenta;
        this.saldo = Saldo;
    }

    //Datos encapsulados
    public String mosTitular() {
        return titular;
    }

    public String mosNumeroCuenta() {
        return numeroCuenta;
    }

    // Metodo para depositar
    public void depositar(double cantidad) {
        if (cantidad > 0) {
            saldo += cantidad;
        }
        else {
            System.out.println("No se puede depositar una cantidad negativa.");
        }
    }

    // Metodo para retirar
    public void retirar(double cantidad) {
        if (cantidad > 0 && cantidad <= saldo) {
            saldo -= cantidad;
        }
        else {
            System.out.println("No se puede retirar una cantidad negativa o mayor al saldo disponible.");
        }
    }


    // Metodo para consultar saldo
    public double consultarSaldo() {
        return saldo;
    }
}

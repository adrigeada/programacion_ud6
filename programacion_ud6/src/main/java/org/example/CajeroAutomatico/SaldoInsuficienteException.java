package org.example.CajeroAutomatico;

public class SaldoInsuficienteException extends RuntimeException {
    public SaldoInsuficienteException() {

        super("Cantidad a retirar mayor al saldo disponible");
    }
}

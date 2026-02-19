package org.example.CajeroAutomatico;

public class DepositoMaximoException extends RuntimeException {
    public DepositoMaximoException(int limite)
    {
        super("No se puede depositar mas de "+limite+"€");
    }
}

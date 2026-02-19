package org.example.CajeroAutomatico;

public class LimiteDiarioException extends RuntimeException {
    public LimiteDiarioException(int limite) {
        super("Cantidad a retirar por encima del limite: "+limite);
    }
}

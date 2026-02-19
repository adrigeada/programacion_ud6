package org.example.CajeroAutomatico;

public class MenorCeroException extends RuntimeException {
    public MenorCeroException() {
        super("El importe tiene que ser mayor que 0");
    }
}

package org.example.Practica.Excepciones;

public class DorsalExistenteException extends RuntimeException {
    public DorsalExistenteException() {
        super("Ya hay un jugador con ese dorsal.");
    }
}

package org.example;

public class EdadValida extends RuntimeException {
    public EdadValida() {

        super("Edad no permitida");
    }
}

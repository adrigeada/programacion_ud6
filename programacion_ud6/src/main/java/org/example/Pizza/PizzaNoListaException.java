package org.example.Pizza;

public class PizzaNoListaException extends RuntimeException {
    public PizzaNoListaException() {
        super("EL pedido aun no está listo");
    }
}

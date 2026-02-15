package org.example.ECommerce;

/**
 * Esta clase abstracta va a ser la madre de los distintos metodos de pago. TarjetaCredito, Paypal y Bizum. El método procesarPago debe de estar en todas sus hijas, en cada una de ellas hará algo diferente.
 */
public abstract class MetodoPago {

    public abstract void procesarPago(double importe);

}

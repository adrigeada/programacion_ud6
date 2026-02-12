package org.example.ECommerce;

import java.util.Arrays;

public class TarjetaCredito extends MetodoPago{
    private final int LONGITUD_NRO_TARJETA = 16;
    private final String[] tiposValidos = {"VISA","MASTERCARD","MAESTRO"};

    private String nro_tarjeta;
    private String tipo;

    public TarjetaCredito(String nro_tarjeta,String tipo){
        this.nro_tarjeta = nro_tarjeta;
        this.tipo = tipo;
    }


    public void validarTarjeta(){
        if (nro_tarjeta.length() == LONGITUD_NRO_TARJETA && Arrays.asList(tiposValidos).contains(tipo)){
            System.out.println("Tarjeta válida");
        } else if (nro_tarjeta.length() != LONGITUD_NRO_TARJETA) {
            System.out.println("La tarjeta tiene que tener 16 carácteres");
        }else {
            System.out.println("El tipo de tarjeta no es válido");
        }

    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con tarjeta de crédito "+tipo);
    }
}

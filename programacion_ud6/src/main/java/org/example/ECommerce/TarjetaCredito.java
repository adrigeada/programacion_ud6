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

    /**
     * Comprueba que el nro de tarjeta tenga la longitud adecuada (16 caracteres) y que el tipo sea válido, puede ser VISA, MASTERCARD, MAESTRO. En el metodo Tienda.iniciar pago, lo que se escriba se pasa a mayúsculas, para que coincida con los tipos.
     * @return true si la longitud y tipo válido. False si uno de los dos no es válido.
     */
    public boolean validarTarjeta(){
        if (nro_tarjeta.length() == LONGITUD_NRO_TARJETA && Arrays.asList(tiposValidos).contains(tipo)){
            System.out.println("Tarjeta válida");
            return true;
        } else if (nro_tarjeta.length() != LONGITUD_NRO_TARJETA) {
            System.out.println("La tarjeta tiene que tener 16 carácteres");
            return false;
        }else {
            System.out.println("El tipo de tarjeta no es válido");
            return false;
        }

    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de "+importe+"€ con tarjeta de crédito "+tipo);
    }

    public String getNro_tarjeta() {
        return nro_tarjeta;
    }

    public void setNro_tarjeta(String nro_tarjeta) {
        this.nro_tarjeta = nro_tarjeta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "TarjetaCredito{" +
                "nro_tarjeta='" + nro_tarjeta + '\'' +
                ", tipo='" + tipo + '\'' +
                '}';
    }
}

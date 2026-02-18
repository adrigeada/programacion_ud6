package org.example.prueba_enums;

public enum Tarjetas {
    VISA(0), MAESTRO(1.5), MASTERCARD(5);

    private final double COMISION;

    Tarjetas(double comision){
        this.COMISION = comision;
    }

    public double getCOMISION(){
        return COMISION;
    }


}

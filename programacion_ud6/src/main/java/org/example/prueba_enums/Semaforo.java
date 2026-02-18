package org.example.prueba_enums;

public enum Semaforo {
    ROJO,
    VERDE,
    AMARILLO;

    public Semaforo siguiente(){
        if (ordinal() == 0){
            return VERDE;
        } else if (ordinal() == 1) {
            return AMARILLO;
        }else {
            return ROJO;
        }
    }



}

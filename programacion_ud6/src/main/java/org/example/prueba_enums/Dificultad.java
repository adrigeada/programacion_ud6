package org.example.prueba_enums;

public enum Dificultad {
    FACIL(2),MEDIO(4),DIFICIL(8),EXPERTO(10);

    private final int MULTIPLICADOR;

    Dificultad(int multiplicador){
        this.MULTIPLICADOR = multiplicador;
    }

    public int getMULTIPLICADOR(){
        return MULTIPLICADOR;
    }

}

package org.example.Netflix;

import java.util.ArrayList;

public class StreamingApp {
    static ArrayList<Suscripcion> listaSuscripciones = new ArrayList<>();
    static void main() {

        PlanGratis gratis = new PlanGratis("Gratis",0);
        PlanBasico basico = new PlanBasico("Básico",9.99);
        PlanPremium premium = new PlanPremium("Premium",14.99);
        PlanFamiliar familiar = new PlanFamiliar("Familiar",19.99);

        listaSuscripciones.add(gratis);
        listaSuscripciones.add(basico);
        listaSuscripciones.add(premium);
        listaSuscripciones.add(familiar);

        for (Suscripcion suscripcion : listaSuscripciones){
            suscripcion.mostrarInfo();
            suscripcion.obtenerBeneficios();
            suscripcion.obtenerPeriodoPrueba();
        }


    }
}

package org.example.prueba_enums;

public class SemaforoApp {
    static void main(String[] args) {

        Semaforo semaforo = Semaforo.ROJO; //basicamente es como si fuera semaforo = ROJO

        for (int i = 0; i < 10; i++) {
            System.out.println(semaforo.name());
            semaforo = semaforo.siguiente(); //Como siguiente devuelve ROJO,AMARILLO O VERDE esto funciona

        }
    }

}

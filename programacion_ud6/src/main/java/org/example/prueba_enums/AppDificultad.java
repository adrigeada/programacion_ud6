package org.example.prueba_enums;

import java.util.Random;
import java.util.Scanner;

public class AppDificultad {
    static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        Random aleatoriio = new Random();
        Dificultad dificultad = null;

        try {
            System.out.println("Introduce la dificultad [FACIL, MEDIO, DIFICIL, EXPERTO]");
            dificultad = Dificultad.valueOf(teclado.next());
        } catch (Exception e) {
            System.out.println("Dificultad no válida");
            return;
        }


        int puntuacion = aleatoriio.nextInt(5001);
        int resultado = puntuacion * dificultad.getMULTIPLICADOR();

        System.out.println("Puntuación obtenida = "+puntuacion);
        System.out.println("Puntuación final = "+resultado);

    }
}

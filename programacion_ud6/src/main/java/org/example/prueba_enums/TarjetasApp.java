package org.example.prueba_enums;

import java.util.Scanner;

public class TarjetasApp {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Tarjetas tarjeta_tipo = Tarjetas.VISA;

        System.out.println(tarjeta_tipo.ordinal());
//        System.out.println(tarjeta_tipo);
        System.out.println(tarjeta_tipo.name());

        System.out.println("\nTipos de tarjetas");
       for (Tarjetas tarjetas :  Tarjetas.values()){ //values devuelve un vector con todo lo que tiene el enum dentro
           System.out.println(tarjetas);
       }

        System.out.println("\nIntroduce tipo de tarjeta");
       Tarjetas tipo = Tarjetas.valueOf(teclado.next()); //para pasar un string a algo que acepte enum

        System.out.println("La tarjeta de tipo "+tipo+ " tiene una comision de "+tipo.getCOMISION());

    }

}

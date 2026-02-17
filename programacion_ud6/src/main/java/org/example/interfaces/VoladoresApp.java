package org.example.interfaces;

import java.util.ArrayList;

public class VoladoresApp {
    static void main(String[] args) {

        Superman clark_kent = new Superman();
        Pajaro piolin = new Pajaro();


        clark_kent.volar();
        piolin.volar();

        Spiderman peter_parker = new Spiderman();

        ArrayList<Superheroe> listaHeroes = new ArrayList<>();

        listaHeroes.add(clark_kent);
        listaHeroes.add(peter_parker);

        for (Superheroe heroe : listaHeroes){
            if (heroe instanceof Superman){
                ((Superman) heroe).alientoHielo();
                ((Superman) heroe).rayoLaser();
            }

        }

    }
}

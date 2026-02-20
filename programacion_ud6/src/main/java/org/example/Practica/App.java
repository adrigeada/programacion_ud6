package org.example.Practica;

import org.example.Practica.Clases.Jugador;
import org.example.Practica.Enums.Equipos;
import org.example.Practica.Enums.Posiciones;

import java.util.ArrayList;

public class App {
    static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    static void main(String[] args) {

        Jugador adri = new Jugador("Adrian",27, Equipos.ALEVIN,Posiciones.PORTERO, listaJugadores);
        listaJugadores.add(adri);
        Jugador pepe = new Jugador("Pepe",30,Equipos.ALEVIN,Posiciones.CENTROCAMPISTA,listaJugadores);
        listaJugadores.add(pepe);
        Jugador juan = new Jugador("Juan",20,Equipos.ALEVIN,Posiciones.DELANTERO,listaJugadores);
        listaJugadores.add(juan);

        System.out.println(listaJugadores);


    }
}

package org.example.Practica.Clases;

import org.example.Practica.Enums.Equipos;
import org.example.Practica.Enums.Posiciones;
import org.example.Practica.Excepciones.DorsalExistenteException;
import org.example.Practica.Interfaces.AccionesDeportivas;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador extends MutxamelFC implements AccionesDeportivas {
    static Scanner teclado = new Scanner(System.in);

    private Equipos categoria;
    private int dorsal;
    private Posiciones posicion;


    public Jugador(String nombre, int edad,Equipos categoria,Posiciones posicion,ArrayList<Jugador> listaMutxa) {
        super(nombre, edad);
        this.categoria = categoria;
        setDorsal(listaMutxa);
        this.posicion = posicion;
    }

    public Equipos getCategoria() {
        return categoria;
    }

    public void setCategoria(Equipos categoria) {
        this.categoria = categoria;
    }

    public int getDorsal() {
        return dorsal;
    }

    public void setDorsal(ArrayList<Jugador> listaMutxa) {
        boolean control = false;

        do {
            control = false;
            System.out.println("Cual es el dorsal del jugador "+super.getNombre());
            int dorsal = teclado.nextInt();
            teclado.nextLine();

            if (listaMutxa.isEmpty()){
                this.dorsal = dorsal;
            }else {

                try {
                    for (Jugador jugador : listaMutxa){

                        if (jugador.dorsal == dorsal && jugador.getCategoria()== categoria){
                            throw new DorsalExistenteException();
                        }else {
                            this.dorsal = dorsal;
                        }

                    }
                }catch (DorsalExistenteException e){
                    System.out.println("Otro jugador ya tiene ese dorsal");
                    control = true;
                }

            }

        }while (control);

    }

    public void calentar(){
        System.out.println("Haciendo un par de carreritas para calentar los músculos");
    }

    public void descansar(){
        System.out.println("Descansando en el banquillo para no lesionarse");
    }

    public void marcarGol(){
        System.out.println("Chutando a puerta!!");
    }

    public Posiciones getPosicion() {
        return posicion;
    }

    public void setPosicion(Posiciones posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Jugador{" + super.toString()+
                "categoria=" + categoria +
                ", dorsal=" + dorsal +
                ", posicion=" + posicion +
                "} ";
    }

    @Override
    public void concentrarse() {
        System.out.println("Preparandose para jugar el partido");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad+" para jugar el partido");
    }

    @Override
    public void celebrarGol() {
        System.out.println("Deslizandose sobre las rodillas en el corner.");
    }

    //=======ACCIONES DEPORTIVAS=================

    @Override
    public void entrenar() {
        System.out.println("Practicando jugadas y entrenando cardio");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Jugando partido contra "+rival);
    }
}

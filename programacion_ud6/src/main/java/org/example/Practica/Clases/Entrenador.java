package org.example.Practica.Clases;

import org.example.Practica.Enums.Equipos;
import org.example.Practica.Interfaces.AccionesDeportivas;

public class Entrenador extends MutxamelFC implements AccionesDeportivas {

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad,Equipos equipo,String formacionPreferida) {
        super(nombre, edad);
        this.equipo = equipo;
        this.formacionPreferida = formacionPreferida;
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    public void setFormacionPreferida(String formacionPreferida) {
        this.formacionPreferida = formacionPreferida;
    }

    public void planificarEntrenamiento(){
        System.out.println("Planeando el próximo entrenamiento para seguir ganando");
    }

    public void hacerCambios(){
        System.out.println("Cambiando a los jugadores que están jugando mal");
    }

    @Override
    public String toString() {
        return "Entrenador{" +super.toString()+
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("Mascando chicle y pensando próxima jugada");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad+" con el equipo");
    }

    @Override
    public void celebrarGol() {
        System.out.println("No reacciona. Nada que celebrar.");
    }

    //=====ACCIONES DEPORTIVAS ===============

    @Override
    public void entrenar() {
        System.out.println("Gritando a los jugadores para que corran más rápido");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Dando instrucciones para ganar contra "+rival);
    }
}

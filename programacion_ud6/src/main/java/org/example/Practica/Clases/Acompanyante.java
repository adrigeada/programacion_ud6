package org.example.Practica.Clases;

public class Acompanyante extends MutxamelFC{

    private Jugador integrante;
    private String parentesco;

    public Acompanyante(String nombre, int edad,Jugador integrante,String parentesco) {
        super(nombre, edad);
        this.integrante = integrante;
        this.parentesco = parentesco;
    }

    public Jugador getIntegrante() {
        return integrante;
    }

    public void setIntegrante(Jugador integrante) {
        this.integrante = integrante;
    }

    public String getParentesco() {
        return parentesco;
    }

    public void setParentesco(String parentesco) {
        this.parentesco = parentesco;
    }

    public void animarEquipo(){
        System.out.println("Animando muy fuerte a mi equipo favorito");
    }

    @Override
    public String toString() {
        return "Acompanyante{" +super.toString()+
                "integrante=" + integrante +
                ", parentesco='" + parentesco + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("Preparandose para gritar muy fuerte");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad+" para animar a su equipo");
    }

    @Override
    public void celebrarGol() {
        System.out.println("GOOOOLASOOOOO ESPECTACULAAAAAR");
    }
}

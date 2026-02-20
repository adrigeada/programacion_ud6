package org.example.Practica.Clases;

public class Masajista extends MutxamelFC{

    private String titulacion;
    private int anosExperiencia;

    public Masajista(String nombre, int edad,String titulacion,int anosExperiencia) {
        super(nombre, edad);
        this.titulacion = titulacion;
        this.anosExperiencia = anosExperiencia;
    }

    public String getTitulacion() {
        return titulacion;
    }

    public void setTitulacion(String titulacion) {
        this.titulacion = titulacion;
    }

    public int getAnosExperiencia() {
        return anosExperiencia;
    }

    public void setAnosExperiencia(int anosExperiencia) {
        this.anosExperiencia = anosExperiencia;
    }

    public void darMasaje (Jugador jugador){
        System.out.println("Masajeando las piernas robustas de "+jugador.getNombre());
    }

    @Override
    public String toString() {
        return "Masajista{" +super.toString()+
                "titulacion='" + titulacion + '\'' +
                ", anosExperiencia=" + anosExperiencia +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("Preparandose para asistir en las lesiones de los jugadores");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad+" con el equipo para hacer masajes");
    }

    @Override
    public void celebrarGol() {
        System.out.println("Celebrando el gol con los lesionados del banquillo. ");
    }
}

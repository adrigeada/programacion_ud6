package org.example.Redes_Sociales;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> colaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        colaboraciones = new ArrayList<>();
    }

    public ArrayList<String> getColaboraciones() {
        return colaboraciones;
    }

    public void setColaboraciones(ArrayList<String> colaboraciones) {
        this.colaboraciones = colaboraciones;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Colaboraciones: ");
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboraciones=" + colaboraciones +
                '}';
    }
}

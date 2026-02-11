package org.example.Redes_Sociales;

import java.util.ArrayList;

public class Influencer extends Usuario{

    private ArrayList<String> listaColaboraciones;

    public Influencer(String nombre, int edad, String nombreUsuario, int seguidores) {
        super(nombre, edad, nombreUsuario, seguidores);
        listaColaboraciones = new ArrayList<>();
    }

    public void anyadirColab(String colaboracion){
        listaColaboraciones.add(colaboracion);
    }

    public void borrarColab(String colaboracion){
        listaColaboraciones.remove(colaboracion);
    }

    public ArrayList<String> getListaColaboraciones() {
        return listaColaboraciones;
    }

    public void setListaColaboraciones(ArrayList<String> listaColaboraciones) {
        this.listaColaboraciones = listaColaboraciones;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Colaboraciones: ");
        for (String colabo : listaColaboraciones){
            System.out.print("'"+colabo+"', ");
        }
    }

    @Override
    public String toString() {
        return "Influencer{" +
                "colaboraciones=" + listaColaboraciones +
                '}';
    }
}

package org.example.Carrefour;

import java.util.ArrayList;

public class Seguridad extends Persona {

    private String empresa;
    private ArrayList<String> listaArmas;

    public Seguridad(int codigo, String nombre, double sueldo,String empresa) {
        super(codigo, nombre, sueldo);
        this.empresa = empresa;
        listaArmas = new ArrayList<>();
    }

    public void anyadirArma(String arma){
        listaArmas.add(arma);
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public ArrayList<String> getListaArmas() {
        return listaArmas;
    }

    public void setListaArmas(ArrayList<String> listaArmas) {
        this.listaArmas = listaArmas;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Que trabaja en la empresa de seguridad "+empresa+" y tiene las armas: ");
        for (String armas : listaArmas){
            System.out.println("- "+armas);
        }
    }

    @Override
    public String toString() {
        return "Seguridad{" +
                "empresa='" + empresa + '\'' +
                ", listaArmas=" + listaArmas +
                '}';
    }
}

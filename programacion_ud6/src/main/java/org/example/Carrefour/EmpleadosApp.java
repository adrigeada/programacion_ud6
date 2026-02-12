package org.example.Carrefour;

import java.util.ArrayList;

public class EmpleadosApp {
    static void main() {


        Cajero jorge = new Cajero(147,"Jorge",1800);
        Seguridad adri = new Seguridad(123,"Adrian",1500,"Prosegur");
        Reponedor carlos = new Reponedor(254,"carlos",1300,5);

        jorge.mostrarInfo();
        adri.anyadirArma("porra");
        adri.anyadirArma("esposas");

        adri.mostrarInfo();

        Persona manuel = new Cajero(1234,"Manuel",2000);

        ArrayList<Persona> listaEmpleados = new ArrayList<>();

        listaEmpleados.add(manuel);
        listaEmpleados.add(adri);

        for (Persona persona : listaEmpleados){

        }

        fichar(manuel);
        fichar(adri);

        jorge.trabajar();
        adri.trabajar();
        carlos.trabajar();

    }

    public static void fichar(Persona persona){

        System.out.println("Fichando...");


    }
}

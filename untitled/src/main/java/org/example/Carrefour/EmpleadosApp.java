package org.example.Carrefour;

public class EmpleadosApp {
    static void main() {


        Cajero jorge = new Cajero(147,"Jorge",1800);
        Seguridad adri = new Seguridad(123,"Adrian",1500,"Prosegur");

        jorge.mostrarInfo();
        adri.anyadirArma("porra");
        adri.anyadirArma("esposas");

        adri.mostrarInfo();


    }
}

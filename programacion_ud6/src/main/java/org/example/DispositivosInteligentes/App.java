package org.example.DispositivosInteligentes;

import java.util.ArrayList;

public class App {
    static void main(String[] args) {

        Televisor tele = new Televisor("samsung");
        ParlanteInteligente alexa = new ParlanteInteligente("Alexa");
        AireAcondicionado bosh = new AireAcondicionado("bosch");

        ArrayList<Dispositivo> listaDispositivos = new ArrayList<>();
        listaDispositivos.add(tele);
        listaDispositivos.add(alexa);
        listaDispositivos.add(bosh);



        Dispositivo proyector = new Dispositivo("Optoma") {
            @Override
            public void encender() {
                if (isEstado()){
                    System.out.println("Proyector ya está encendido");
                }else {
                    System.out.println("Encendiendo proyector con ajuste automático de brillo...");
                    setEstado(true);
                }

            }
        };


        ControlRemoto proyector_sinc = new ControlRemoto() {
            @Override
            public void sincronizar() {
                System.out.println("Sincronizando proyector con control remoto");
            }
        };


        Dispositivo horno = new Dispositivo("Horno LG") {
            @Override
            public void encender() {
                if (isEstado()){
                    System.out.println(getNombre()+" ya está encendido");
                }else {
                    System.out.println("Calentando horno con ajuste automático de temperatura...");
                    setEstado(true);
                }

            }
        };


        listaDispositivos.add(proyector);
        listaDispositivos.add(horno);

        for (Dispositivo dispositivo : listaDispositivos){
            dispositivo.encender();

            if (dispositivo instanceof ControlRemoto){
                ((ControlRemoto) dispositivo).sincronizar();
            } else if (dispositivo.getNombre().equals("Optoma")) {
                proyector_sinc.sincronizar();
            }

            dispositivo.mostrarEstado();

            dispositivo.apagar();
        }
    }
}

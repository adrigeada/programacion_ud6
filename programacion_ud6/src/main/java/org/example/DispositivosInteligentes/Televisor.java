package org.example.DispositivosInteligentes;

public class Televisor extends Dispositivo implements ControlRemoto{


    public Televisor(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (!super.isEstado()){
            System.out.println("Encendiendo televisor...");
            super.setEstado(true);
        }else {
            System.out.println("El televisor ya está encendido.");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando televisor con control remoto");
    }


}

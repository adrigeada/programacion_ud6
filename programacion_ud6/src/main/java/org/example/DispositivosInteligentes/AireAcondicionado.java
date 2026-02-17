package org.example.DispositivosInteligentes;

public class AireAcondicionado extends Dispositivo implements ControlRemoto{


    public AireAcondicionado(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (!super.isEstado()){
            System.out.println("Encendiendo aire acondicioinado");
            super.setEstado(true);
        }else {
            System.out.println("El aire acondicioinado ya está encendido.");
        }
    }

    @Override
    public void sincronizar() {
        System.out.println("Sincronizando aire acondicionado con control remoto");
    }


}

package org.example.DispositivosInteligentes;

public class ParlanteInteligente extends Dispositivo{


    public ParlanteInteligente(String nombre) {
        super(nombre);
    }

    @Override
    public void encender() {
        if (!super.isEstado()){
            System.out.println("Activando parlante con comando de voz");
            super.setEstado(true);
        }else {
            System.out.println("El parlante ya está encendido.");
        }
    }
}

package org.example.interfaces;

public class Superman extends Superheroe implements Volador,Ataques{

    @Override
    public void volar() {
        System.out.println("Sobrevolando ciudad vigilando a los malos");
    }

    @Override
    public void rayoLaser() {
        System.out.println("Disparando laser por los ojos");
    }

    @Override
    public void alientoHielo() {
        System.out.println("Soplando aire frrío");
    }
}

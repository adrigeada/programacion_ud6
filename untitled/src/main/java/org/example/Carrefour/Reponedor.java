package org.example.Carrefour;

public class Reponedor extends Persona{

    private int pasillo;

    public Reponedor(int codigo, String nombre, double sueldo,int pasillo) {
        super(codigo, nombre, sueldo);
        this.pasillo = pasillo;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Trabaja en el pasillo " +pasillo);
    }

    @Override
    public String toString() {
        return "Reponedor{" +
                "pasillo=" + pasillo +
                '}';
    }
}

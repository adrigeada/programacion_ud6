package org.example.Carrefour;

import java.util.Scanner;

public class Cajero extends Persona{
    static Scanner teclado = new Scanner(System.in);

    private int caja;

    public Cajero(int codigo, String nombre, double sueldo) {
        super(codigo, nombre, sueldo);
        setCaja();

    }

    public int getCaja() {
        return caja;
    }

    public void setCaja() {
        System.out.println("Introduce la caja registradora: ");
        caja = teclado.nextInt();

    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Cajero que trabaja en la caja "+caja);
    }

    @Override
    public String toString() {
        return "Cajero{" +
                "caja=" + caja +
                '}';
    }
}

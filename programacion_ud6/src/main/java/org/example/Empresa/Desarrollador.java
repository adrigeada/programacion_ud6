package org.example.Empresa;

public class Desarrollador extends Empleado{

    public Desarrollador(){

    }

    @Override
    public void realizarTarea() {
        System.out.println("Escribiendo código y solucionando bugs.");
    }
}

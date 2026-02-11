package org.example.Empresa;

public class Gerente extends Empleado{

    public Gerente (){

    }


    @Override
    public void realizarTarea() {
        System.out.println("Supervisando el proyecto y organizando reuniones.");
    }
}

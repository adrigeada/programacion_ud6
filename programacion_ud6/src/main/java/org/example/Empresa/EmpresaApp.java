package org.example.Empresa;

import java.util.ArrayList;

public class EmpresaApp {

    static ArrayList<Empleado> listaEmpleados = new ArrayList<>();

    static void main() {

        Desarrollador adrian = new Desarrollador();
        Disenyador eric = new Disenyador();
        Gerente angel = new Gerente();

        listaEmpleados.add(adrian);
        listaEmpleados.add(eric);
        listaEmpleados.add(angel);

        for (Empleado empleados : listaEmpleados){
            empleados.realizarTarea();
        }

        asignarTarea(angel);
        asignarTarea(adrian);


    }

    public static void asignarTarea(Empleado empleado){
        System.out.println("\nAsignando tarea al empleado...");
        empleado.realizarTarea();
    }
}

package org.example.Practica.Clases;

import org.example.Practica.App;
import org.example.Practica.Enums.Equipos;
import org.example.Practica.Excepciones.FormatoFormacionException;
import org.example.Practica.Interfaces.AccionesDeportivas;

import java.util.ArrayList;
import java.util.Scanner;

public class Entrenador extends MutxamelFC implements AccionesDeportivas {
    private final String FORMATO_FORMACION = "\\d-\\d-\\d";
    private static Scanner teclado = new Scanner(System.in);

    private Equipos equipo;
    private String formacionPreferida;

    public Entrenador(String nombre, int edad,Equipos equipo) {
        super(nombre, edad);
        this.equipo = equipo;
        setFormacionPreferida();
    }

    public Equipos getEquipo() {
        return equipo;
    }

    public void setEquipo(Equipos equipo) {
        this.equipo = equipo;
    }

    public String getFormacionPreferida() {
        return formacionPreferida;
    }

    /**
     * Se pide la formacion preferida por teclado, y se comprueba que tenga el formato necesario usando matches. Si no lo tiene se activa una excepción personalizada que capturamos con el try catch. Si el formato está bien, se asigna la formacion al Entrenador creado.
     */
    public void setFormacionPreferida() {
        boolean control = false;

        do {
            control=false;
            System.out.println("Cual es la formación preferida de "+getNombre()+" [N-N-N]");
            String formacion = teclado.nextLine();
            try {

                if (formacion.matches(FORMATO_FORMACION)){
                    formacionPreferida = formacion;
                }else {
                    throw new FormatoFormacionException();
                }

            }catch (FormatoFormacionException e){
                System.out.println("El formato de la formacion no coincide con el indicado");
                control = true;
            }


        }while(control);

    }

    /**
     * Insertas por teclado lo que quieres modificar del entrenador seleccionado. Segun el atributo que elijas, hace un set para ese atributo.
     * @param entrenador seleccionado en el método elegirEntrenador()
     */
    public void modificarEntrenador(Entrenador entrenador){
        System.out.println("\nModificando "+entrenador);
        System.out.println("\nQue quieres modificar [nombre,edad,equipo,formacion]");
        String modificar = teclado.nextLine().toLowerCase();
        System.out.println("================================");

        switch (modificar){
            case "nombre":
                System.out.println("Nuevo nombre:");
                entrenador.setNombre(teclado.nextLine());
                break;
            case "edad":
                System.out.println("Nueva edad:");
                entrenador.setEdad(teclado.nextInt());
                break;
            case "equipo":
                System.out.println("Nuevo equipo:");
                entrenador.setEquipo(Equipos.valueOf(teclado.nextLine()));
                break;
            case "formacion":
                setFormacionPreferida();
                break;

            default:
                System.out.println("No es posible modificar "+modificar);

        }
    }



    public void planificarEntrenamiento(){
        System.out.println("Planeando el próximo entrenamiento para seguir ganando");
    }

    public void hacerCambios(){
        System.out.println("Cambiando a los jugadores que están jugando mal");
    }

    @Override
    public String toString() {
        return "Entrenador{" +super.toString()+
                "equipo=" + equipo +
                ", formacionPreferida='" + formacionPreferida + '\'' +
                '}';
    }

    @Override
    public void concentrarse() {
        System.out.println("Mascando chicle y pensando próxima jugada");
    }

    @Override
    public void viajar(String ciudad) {
        System.out.println("Viajando a "+ciudad+" con el equipo");
    }

    @Override
    public void celebrarGol() {
        System.out.println("No reacciona. Nada que celebrar.");
    }

    //=====ACCIONES DEPORTIVAS ===============

    @Override
    public void entrenar() {
        System.out.println("Gritando a los jugadores para que corran más rápido");
    }

    @Override
    public void jugarPartido(String rival) {
        System.out.println("Dando instrucciones para ganar contra "+rival);
    }
}

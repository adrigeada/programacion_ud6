package org.example.Practica;

import org.example.Practica.Clases.*;
import org.example.Practica.Enums.Equipos;
import org.example.Practica.Enums.Posiciones;

import java.util.ArrayList;
import java.util.Scanner;

public class App {
    static ArrayList<Jugador> listaJugadores = new ArrayList<>();
    static ArrayList<MutxamelFC> lista_muxta = new ArrayList<>();
    static Scanner teclado = new Scanner(System.in);
    static void main() {

        Jugador adri = new Jugador("Adrian",27, Equipos.SENIOR,Posiciones.PORTERO, listaJugadores);
        listaJugadores.add(adri);
        Jugador pepe = new Jugador("Pepe",30,Equipos.SENIOR,Posiciones.CENTROCAMPISTA,listaJugadores);
        listaJugadores.add(pepe);
        Jugador juan = new Jugador("Juan",20,Equipos.SENIOR,Posiciones.DELANTERO,listaJugadores);
        listaJugadores.add(juan);

//        Entrenador lucas = new Entrenador("Lucas",50,Equipos.SENIOR);
//        lista_muxta.add(lucas);
//        Entrenador carlos = new Entrenador("Carlos",40,Equipos.ALEVIN);
//        lista_muxta.add(carlos);
//
//        Masajista marcos = new Masajista("Marcos",31,"Fisioterapia",5);
//        lista_muxta.add(marcos);
//
//        Acompanyante pepi = new Acompanyante("Pepi",20,pepe,"Hermana");
//        lista_muxta.add(pepi);

        //crear acompañante desde menú

//        adri.concentrarse();
//        lucas.entrenar();
//        marcos.darMasaje(adri);
//        pepi.viajar("Valencia");
//        carlos.planificarEntrenamiento();
//        lucas.entrenar();
//        pepe.descansar();
//        pepe.calentar();
//        juan.jugarPartido("Betis");
//        pepi.animarEquipo();
//        lucas.hacerCambios();
//        adri.marcarGol();
//        marcos.celebrarGol();
//        lucas.viajar("Mutxamel");
//        adri.descansar();


        imprimirMenu();
        elegirmenu();



    }

    public static void minimain(){
        imprimirMenu();
        elegirmenu();
    }

    public static void imprimirMenu(){
        System.out.println("=== App de mantenimiento del MUTXAMEL FC ===");
        System.out.println("\n    [1]. Mantenimiento de jugadores");
        System.out.println("    [2]. Mantenimiento de entrenadores");
        System.out.println("    [3]. Mantenimiento masajistas");
        System.out.println("    [4]. Consultar equipos");
        System.out.println("    [X]. Salir");
        System.out.println("\n=============================");
        System.out.println("Selecciona una opción");
    }

    public static void elegirmenu(){
        String opcion = teclado.nextLine();

        switch (opcion){
            case "1":
                menuJugadores();
                break;
            case "2":
                elegirEntrenador();
                break;
            case "3":
                System.out.println("Trabajando en ello...");
                break;
            case "4":
                consultarEquipos();
                break;
            default:
                System.out.println("Saliendo del programa...");
        }
    }

    public static void menuJugadores(){
        System.out.println("=== Mantenimiento de Jugadores ===");
        System.out.println("\n    [1]. Añadir nuevo jugador");
        System.out.println("    [2]. Modificar datos de jugador existente");
        System.out.println("    [3]. Crear acompañantes (solo seniors)");
        System.out.println("    [X]. Volver al menú principal");
        System.out.println("==============================");
        System.out.println("Selecciona una opción:");
        opcionJugadores();
    }

    public static void opcionJugadores(){
        String opcion = teclado.nextLine();

        switch (opcion){
            case "1":
                anyadirJugador();
                menuJugadores();
                break;
            case "2":
                elegirJugador(listaJugadores);
                menuJugadores();
                break;
            case "3":
                anyadirAcompanyante();
                menuJugadores();
                break;
            default:
                minimain();
        }

    }

    public static void anyadirJugador(){
        Equipos equipo = null;
        Posiciones posicion = null;

        System.out.println("Nombre nuevo jugador:");
        String nombre = teclado.nextLine();

        System.out.println("Edad nuevo jugador:");
        int edad = teclado.nextInt();
        teclado.nextLine();

        boolean control = false;
        do {
            control = false;
            try {
                System.out.println("Equipo: [BENJAMIN,ALEVIN,INFANTIL,CADETE,JUVENIL,SENIOR]");
                equipo = Equipos.valueOf(teclado.nextLine().toUpperCase());
            }catch (IllegalArgumentException e){
                System.out.println("Equipo no válido");
                control = true;
            }

        }while (control);

        do {
            control = false;
            try {
                System.out.println("Posicion: [PORTERO,DEFENSA,CENTROCAMPISTA,DELANTERO]");
                posicion = Posiciones.valueOf(teclado.nextLine().toUpperCase());
            }catch (IllegalArgumentException e){
                System.out.println("Posición no válida");
                control = true;
            }
        }while (control);

        Jugador jugador = new Jugador(nombre,edad,equipo,posicion,listaJugadores);
        listaJugadores.add(jugador);
        System.out.println("Jugador añadido");

    }

    public static void elegirJugador (ArrayList<Jugador> listaMutxa){
        boolean control = false;
        System.out.println("\nQue jugador quieres modificar?");

        for (Jugador jugador : listaMutxa){
            System.out.println("- "+jugador);
        }
        String modificar = teclado.nextLine();

        for (Jugador jugador : listaMutxa){
            if (modificar.equalsIgnoreCase(jugador.getNombre())){

                System.out.println("\nModificando al "+jugador);
                System.out.println("====================================");
                jugador.modificarJugador(jugador,listaMutxa);
                control = true;
            }

        }

        if (!control){
            System.out.println("No hay jugadores con nombre "+modificar);
        }


    }

    public static void anyadirAcompanyante(){
        boolean control = false;
        System.out.println("Qué jugador quiere añadir un acompañante?");
        for (Jugador jugador : listaJugadores){
            System.out.println("- "+jugador.getNombre());
        }

        String nombre_jugador = teclado.nextLine();
        for (Jugador jugador : listaJugadores){
            if (nombre_jugador.equalsIgnoreCase(jugador.getNombre()) && jugador.getCategoria().equals(Equipos.SENIOR)){
                crearAcompanyante(jugador);
               control= true;
            }
        }
        if (!control){
            System.out.println("No hay jugadores con nombre: "+nombre_jugador+" en el equipo SENIOR");
        }

    }

    public static void crearAcompanyante(Jugador jugador){
        System.out.println("Nombre del acompañante:");
        String nombre = teclado.nextLine();

        System.out.println("Edad acompañante:");
        int edad = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Que parentesco tiene con "+jugador.getNombre()+" ?");
        String parentesco = teclado.nextLine();

        Acompanyante acompanyante = new Acompanyante(nombre,edad,jugador,parentesco);
        lista_muxta.add(acompanyante);
        System.out.println("Acompañante para el jugador "+jugador.getNombre()+" creado.");
    }


    public static void elegirEntrenador(){
        boolean control = false;
        System.out.println("Que entrenador quieres modificar?");
        for (MutxamelFC personal : lista_muxta){
            if (personal instanceof Entrenador){
                System.out.println(personal);
            }
        }
        String nombre = teclado.nextLine();
        for (MutxamelFC personal : lista_muxta){
            if (personal instanceof Entrenador){

                if (nombre.equalsIgnoreCase(personal.getNombre())){
                    ((Entrenador) personal).modificarEntrenador((Entrenador) personal,lista_muxta);
                    control = true;
                }

            }
        }
        if (!control){
            System.out.println("No hay ningun entrenador con nombre: "+nombre);
            minimain();
        }


    }

    public static void consultarEquipos(){
        System.out.println("Estos son nuestros equipos:");
        for (Equipos equipo : Equipos.values()){
            System.out.println(equipo);
        }

        boolean control = false;

        do {
            try {
                control = false;
                System.out.println("\n=====================");
                System.out.println("Que equipo quieres animar?");
                Equipos animar = Equipos.valueOf(teclado.nextLine().toUpperCase());
                System.out.println("\n AUPA "+animar.name()+"!!!");
            }catch (IllegalArgumentException e){
                System.out.println("Asegurate de escribir bien el nombre del equipo");
                control = true;
            }
        }while (control);

        minimain();

    }

}

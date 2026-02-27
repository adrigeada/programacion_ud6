package org.example.Entornos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class AppStoreManager {
    static Scanner teclado = new Scanner(System.in);
    public static ArrayList<Videojuego> listaVideojuegos = new ArrayList<>();
    static void main() {

    imprimirMenu();
    
    }

    public static void imprimirMenu(){
        System.out.println("=== GESTOR DE VIDEOJUEGOS ===");
        System.out.println("\nElige una opcion:");
        System.out.println("[1]. Añadir videojuego");
        System.out.println("[2]. Modificar videojuegos");
        System.out.println("[3]. Eliminar videojuegos");
        System.out.println("[4]. Consular videojuego por plataforma");
        System.out.println("[X]. Salir");
        gestorVideojuego();
    }

    public static void gestorVideojuego(){
        String eleccion = teclado.nextLine();

        switch (eleccion){
            case "1":
                crearVideojuego();
                break;
            case "2":

                break;
            case "3":

                break;
            case "4":

                break;

            default:
                System.out.println("Saliendo...");

        }


    }

    public static void crearVideojuego(){

        System.out.println("\nCreando videojuego...");
        System.out.println("Titulo videojuego:");
        String titulo = teclado.nextLine();

        System.out.println("Plataforma videojuego: "+ Arrays.toString(Plataformas.values()));
        Plataformas plataforma = Plataformas.valueOf(teclado.nextLine().toUpperCase());

        System.out.println("Género videojuego:");
        String genero = teclado.nextLine();

        System.out.println("Año lanzamiento:");
        int anyo = teclado.nextInt();
        teclado.nextLine();

        System.out.println("Precio videojuego");
        double precio = teclado.nextDouble();
        teclado.nextLine();

        System.out.println("Cuantos vas a añadir? (Stock)");
        int stock = teclado.nextInt();

        Videojuego videojuego = new Videojuego(titulo,plataforma,genero,anyo,precio,stock);
        listaVideojuegos.add(videojuego);

        System.out.println("\nVideojuegos actuales en la tienda:");
        for (Videojuego videojuego1 : listaVideojuegos){
            System.out.println(videojuego1);
        }

    }
}

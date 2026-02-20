package org.example.CajeroAutomatico;

import java.util.Scanner;

public class CajeroApp {
    static Scanner teclado = new Scanner(System.in);
    static CuentaBancaria caixa = new CuentaBancaria(700);
    static void main() {

        opcion(imprimirMenu());

    }

    public static String imprimirMenu(){
        System.out.println("\n=== Cajero Automático ===\n");
        System.out.println("[1]. Consultar saldo");
        System.out.println("[2]. Ingresar dinero");
        System.out.println("[3]. Retirar dinero");
        System.out.println("[X]. Salir");
        System.out.println("Selecciona una opción: ");
        return teclado.next();
    }

    public static void opcion(String opcion){


        switch (opcion){
            case "1":
                caixa.consultar();
                main();
                break;
            case "2":
                System.out.println("Introduce el importe a ingresar:");
                caixa.ingresar(pedir_importe());
                System.out.println("Dinero ingresado con éxito. Saldo actual: "+caixa.getSaldo()+"€");
                main();
                break;
            case "3":
                System.out.println("Introduce el importe a retirar:");
                caixa.retirar(pedir_importe());
                System.out.println("Dinero retirado con éxtito. Saldo actual: "+caixa.getSaldo()+"€");
                main();
                break;
            default:
                System.out.println("Saliendo del programa...");

        }


        }

    public static int pedir_importe(){

        int importe = teclado.nextInt();
        teclado.nextLine();
        if (importe <= 0){
            throw new MenorCeroException();
        }
        return importe;
    }




}

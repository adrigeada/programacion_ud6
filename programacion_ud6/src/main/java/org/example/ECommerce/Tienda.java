package org.example.ECommerce;

import java.util.Scanner;

public class Tienda {
    private static Scanner teclado = new Scanner(System.in);

    /**
     *
     * @param pago
     * @return
     */
    public static double realizarPago(MetodoPago pago){
        System.out.println("¿Cual es el importe a pagar?");
        double importe = teclado.nextDouble();
        teclado.nextLine();

        pago.procesarPago(importe);
        return importe;
    }

    /**
     *
     */
    public static void iniciarPago(){
        System.out.println("¿Qué método de pago vas a usar?[Bizum, Paypal, Tarjeta]");
        String eleccion = teclado.nextLine();

        switch (eleccion.toLowerCase()){

            case "bizum":
                System.out.println("Escribe tu número de telefono vinculado con Bizum:");
                String telf = teclado.nextLine();

                Bizum bizum = new Bizum(telf);

                if (bizum.validarBizum()){
                    realizarPago(bizum);
                    System.out.println("Pago aceptado. Muchas gracias.");
                }else {
                    System.out.println("Saliendo del programa...");
                }

                break;


            case "paypal":
                System.out.println("Escribe tu cuenta de Paypal:");
                String email = teclado.nextLine();

                Paypal paypal = new Paypal(email);

                if (paypal.validarPayPal()){
                    paypal.validarSaldo(realizarPago(paypal));

                }else {
                    System.out.println("Saliendo del programa...");
                }




                break;


            case "tarjeta":
                System.out.println("Introduce los datos de tu tarjeta:");
                String num = teclado.nextLine();
                System.out.println("Selecciona el tipo de tarjeta [VISA, MAESTRO, MASTERCARD]:");
                String tipo = teclado.nextLine().toUpperCase();
                TarjetaCredito tarjeta = new TarjetaCredito(num,tipo);

                if (tarjeta.validarTarjeta()){
                    realizarPago(tarjeta);
                    System.out.println("Pago aceptado. Muchas gracias");
                }else {
                    System.out.println("Los datos de tu tarjeta no son correctos. ");
                }




                break;

            default:
                System.out.println("El método de pago no existe");

        }


    }
}

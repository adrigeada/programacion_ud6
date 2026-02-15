package org.example.ECommerce;

import java.util.Scanner;

public class Tienda {
    private static Scanner teclado = new Scanner(System.in);

    /**
     * Recibe por teclado el importe a pagar.
     * @param pago, dependiendo de qué método de pago reciba este método, se ejecutará el correspondiente método abstracto procesarPago. Cada hija de MetodoPago tiene un procesarPago diferente.
     * @return solo se usa para Paypal. En este caso se devuelve el importe para que se compare con el saldo de la cuenta de Paypal. En los casos de Bizum y TarjetaCredito no se utiliza el return.
     */
    public static double realizarPago(MetodoPago pago){
        System.out.println("¿Cual es el importe a pagar?");
        double importe = teclado.nextDouble();
        teclado.nextLine();

        pago.procesarPago(importe);
        return importe;
    }

    /**
     *Se inserta por teclado el método de pago que queremos utilizar y se pasa a minúsculas. Dependiendo de cual hemos elegido cada caso del switch hará una cosa diferente.
     * - Bizum: recibe por teclado el telefono que se usa en el constructor. Si validarBizum es true se ejecuta realizarPago, si no se acaba el programa.
     * - Paypal: recibe por teclado la cuenta que se usa en el constructor. Si validarPaypal es true se le pasa realizarPago a validarSaldo para que se comparen el importe introducido en realizarPago con el saldo de paypal. Si es false, se acaba el programa.
     * - Tarjeta: Se piden el numero y el tipo de tarjeta, se usan en el constructor. Si validarTarjeta es true se ejecuta realizarPago, si no se acaba el programa.
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

                    if(paypal.validarSaldo(realizarPago(paypal))){
                        System.out.println("Gracias por su compra");
                    }else {
                        System.out.println("Saliendo del programa");
                    }

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

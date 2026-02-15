package org.example.ECommerce;

import java.util.Random;
import java.util.Scanner;

public class Bizum extends MetodoPago{
    private static Random aleatorio = new Random();
    private static Scanner teclado = new Scanner(System.in);
    private final int LONGITUD_TELF = 9;

    private String telefono;
    private int pin;

    public Bizum(String telefono){
        this.telefono = telefono;
        pin = setPin();
    }

    /**
     *Este método va a validar que el pin sea el mismo que se ha generado automáticamente y que el teléfono tenga 9 carácteres.
     * El teléfono es el que se ha dado en el constructor. El pin lo recibe por teclado.
     * @return true si las dos condiciones se cumplen. False si una de las dos no se cumple.
     */
    public boolean validarBizum(){
        System.out.println("Escribe el pin de Bizum");
        int pin = teclado.nextInt();
        teclado.nextLine();

        if (telefono.length()== LONGITUD_TELF && pin == this.pin){
            System.out.println("Bizum válido");
            return true;
        } else if (telefono.length() != LONGITUD_TELF) {
            System.out.println("Longitud de teléfono diferentes a "+LONGITUD_TELF);
            return false;
        }else {
            System.out.println("Pin incorrecto");
            return false;
        }
    }


    @Override
    public void procesarPago(double importe) {
        System.out.println("Procesando pago de importe "+importe+"€ con Bizum.");
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getPin() {
        return pin;
    }

    /**
     * A este método se le llama desde el constructor. Lo que devuelve es el atributo pin.
     * Se crea un pin aleatorio de 6 números. Uso String para que concatenarlo sea más fácil y que los ceros puedan ser parte del pin.
     * Imprime el chivato del pin para poder hacer las pruebas.
     * @return pin de 6 dígitos pasado a int.
     */
    public int setPin() {

        String pinString = "";
        for (int i = 0; i < 6; i++) {
            pinString+=Integer.toString(aleatorio.nextInt(10));
        }
        System.out.println("PIN aleatorio: "+pinString);

        return Integer.parseInt(pinString);
    }

    @Override
    public String toString() {
        return "Bizum{" +
                "telefono='" + telefono + '\'' +
                ", pin=" + pin +
                '}';
    }
}

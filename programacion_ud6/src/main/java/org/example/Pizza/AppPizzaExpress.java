package org.example.Pizza;

import java.util.ArrayList;
import java.util.Scanner;

public class AppPizzaExpress {
    static Scanner teclado = new Scanner(System.in);
    static  Empleado juan = new Empleado("Juan");
    static ArrayList<PizzaExpress> listaEntera = new ArrayList<>();

    static void main() {

        Empleado alberto = new Empleado("Alberto");
        listaEntera.add(juan);
        listaEntera.add(alberto);

        for (PizzaExpress empleados : listaEntera){
            if (empleados instanceof Empleado){
                empleados.obtenerDetalles();
            }
        }
        iniciarPedido();

    }

    public static void iniciarPedido(){
        System.out.println("Cual es tu nombre?");
        String nombre = teclado.nextLine();

        Cliente cliente = new Cliente(nombre);
        Pedido pedido = new Pedido(cliente);

        System.out.println(pedido.getEstadoPedido());

        double total = pedirPizza(pedido,cliente);

        juan.siguienteEstado(pedido);

        System.out.println("Pedido "+pedido.getEstadoPedido()+"Total pedido "+total);

        try{
            juan.entregarPedido(pedido);
        }catch (PizzaNoListaException e){
            System.out.println("La pizza no está lista aun");
        }

        juan.siguienteEstado(pedido);
        System.out.println(pedido.getEstadoPedido());

        pedido.setEstadoPedido(Estado.LISTO);
        juan.entregarPedido(pedido);




    }

    public static double pedirPizza(Pedido pedido, Cliente cliente){


        boolean control = false;
        CartaPizza eleccion = null;
        double total = 0;
        String repetir = "";

        do {
                control = false;
                cliente.pedir();

                try {
                    eleccion = (CartaPizza.valueOf(teclado.nextLine().toUpperCase()));
                }catch (IllegalArgumentException e){
                    System.out.println("no vale");
                    control = true;
                }

                if(!control){
                    pedido.getListaPizzas().add(eleccion);
                    total += eleccion.getPrecio();
                }else {
                    total += 0;
                }


            System.out.println("El precio actual de la cuenta es de "+total+"€. Quieres añadir otra pizza [S/N]");
            repetir = teclado.nextLine();

        }while(repetir.equals("s"));

        return total;

    }
}

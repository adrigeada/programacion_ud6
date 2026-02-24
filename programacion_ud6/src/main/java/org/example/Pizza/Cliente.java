package org.example.Pizza;

public class Cliente extends PizzaExpress implements AccionesPedido{

    private String nombre;
    private int descuento;

    public Cliente(String nombre){
        this.nombre = nombre;
        this.descuento = 20;
    }

    @Override
    public void obtenerDetalles() {
        System.out.println("Nombre: "+nombre+" descuento aplicado: "+descuento);
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstadoPedido(Estado.CANCELADO);
    }

    public void pedir(){
        System.out.println("Hola "+nombre+", qué te apetece hoy?");
        System.out.println("===CARTA===");

        for (CartaPizza pizza : CartaPizza.values()){
            System.out.println(pizza.name()+": "+pizza.getPrecio()+"€");
        }
    }

    public void pagar(){

    }

    public void recoger(){

    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nombre='" + nombre + '\'' +
                ", descuento=" + descuento +
                '}';
    }


}

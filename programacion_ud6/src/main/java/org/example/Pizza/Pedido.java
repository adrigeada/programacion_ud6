package org.example.Pizza;

import java.util.ArrayList;

public class Pedido extends PizzaExpress{

    private Cliente cliente;
    private ArrayList<CartaPizza> listaPizzas;
    private Estado estadoPedido;

    public Pedido(Cliente cliente){
        this.cliente = cliente;
        estadoPedido = Estado.CREANDO;
        listaPizzas = new ArrayList<>();
    }

    @Override
    public void obtenerDetalles() {

    }

    public void aplicarDescuento(){

    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public ArrayList<CartaPizza> getListaPizzas() {
        return listaPizzas;
    }

    public void setListaPizzas(ArrayList<CartaPizza> listaPizzas) {
        this.listaPizzas = listaPizzas;
    }

    public Estado getEstadoPedido() {
        return estadoPedido;
    }

    public void setEstadoPedido(Estado estadoPedido) {
        this.estadoPedido = estadoPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" +
                "cliente=" + cliente +
                ", listaPizzas=" + listaPizzas +
                ", estadoPedido=" + estadoPedido +
                '}';
    }
}

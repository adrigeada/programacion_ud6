package org.example.Pizza;

public class Empleado extends PizzaExpress implements AccionesPedido{

    private static int contador_id = 0;
    private static final String FORMATO_ID = "EMP";

    private String id_empleado;
    private String nombre;

    public Empleado (String nombre){
        ++contador_id;
        setId_empleado();
        this.nombre = nombre;
    }

    @Override
    public void obtenerDetalles() {
        System.out.println("Nombre empleado: "+nombre+", IdEmpleado: "+id_empleado);
    }

    @Override
    public void cancelar(Pedido pedido) {
        pedido.setEstadoPedido(Estado.CANCELADO);
    }

    public void siguienteEstado(Pedido pedido){

        switch (pedido.getEstadoPedido()){
            case CREANDO:
                pedido.setEstadoPedido(Estado.RECIBIDO);
                break;
            case RECIBIDO:
                pedido.setEstadoPedido(Estado.MONTANDO_PIZZA);
                break;
            case MONTANDO_PIZZA:
                pedido.setEstadoPedido(Estado.HORNEANDO);
                break;
            case HORNEANDO:
               pedido.setEstadoPedido(Estado.PREPARANDO_PEDIDO);
                break;
            case PREPARANDO_PEDIDO:
                pedido.setEstadoPedido(Estado.LISTO);
                break;
            default:
                System.out.println("Pedido cancelado");
        }

    }

    public void entregarPedido(Pedido pedido){
        if (!pedido.getEstadoPedido().equals(Estado.LISTO)){
            throw new PizzaNoListaException();
        }else {
            System.out.println("Entregando pedido");
        }
    }

    public String getId_empleado() {
        return id_empleado;
    }

    public void setId_empleado() {
        id_empleado = FORMATO_ID+contador_id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "id_empleado='" + id_empleado + '\'' +
                ", nombre='" + nombre + '\'' +
                '}';
    }

}

package org.example.Netflix;

public abstract class Suscripcion {

    private String nombrePlan;
    private double precio;

    public Suscripcion(String nombrePlan,double precio){
        this.nombrePlan = nombrePlan;
        this.precio = precio;

    }

    public String getNombrePlan() {
        return nombrePlan;
    }

    public void setNombrePlan(String nombrePlan) {
        this.nombrePlan = nombrePlan;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void mostrarInfo(){
        System.out.println("\nPlan: "+nombrePlan+", Precio: "+precio+"€");
    }

    public abstract void obtenerBeneficios();
    public abstract void obtenerPeriodoPrueba();

    @Override
    public String toString() {
        return "Suscripcion{" +
                "nombrePlan='" + nombrePlan + '\'' +
                ", precio=" + precio +
                '}';
    }
}

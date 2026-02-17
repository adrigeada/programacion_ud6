package org.example.DispositivosInteligentes;

public abstract class Dispositivo {

    private String nombre;
    private boolean estado;

    public Dispositivo(String nombre){
        this.nombre = nombre;
        estado = false;
    }

    public abstract void encender();
    public void apagar(){
        if (estado){
            estado = false;
            System.out.println(nombre+" apagado");
        }else {
            System.out.println(nombre+" ya está apagado");
        }
    }

    public void mostrarEstado(){
        System.out.println(estado);
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Dispositivo{" +
                "nombre='" + nombre + '\'' +
                ", estado=" + estado +
                '}';
    }
}

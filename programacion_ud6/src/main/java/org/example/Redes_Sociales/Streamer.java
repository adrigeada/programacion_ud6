package org.example.Redes_Sociales;

public class Streamer extends Usuario{

    private int numero_retransmisiones;
    private int horas_directo;

    public Streamer(String nombre, int edad, String nombreUsuario, int seguidores,int numero_retransmisiones,int horas_directo) {
        super(nombre, edad, nombreUsuario, seguidores);
        this.numero_retransmisiones = numero_retransmisiones;
        this.horas_directo = horas_directo;
    }

    public int getHoras_directo() {
        return horas_directo;
    }

    public void setHoras_directo(int horas_directo) {
        this.horas_directo = horas_directo;
    }

    public int getNumero_retransmisiones() {
        return numero_retransmisiones;
    }

    public void setNumero_retransmisiones(int numero_retransmisiones) {
        this.numero_retransmisiones = numero_retransmisiones;
    }

    @Override
    public void mostrarInfo(){
        super.mostrarInfo();
        System.out.println("Ha hecho "+numero_retransmisiones+" retransmisiones y ha estado "+horas_directo+" horas en directo.");
    }

    @Override
    public String toString() {
        return "Streamer{" +
                "numero_retransmisiones=" + numero_retransmisiones +
                ", horas_directo=" + horas_directo +
                '}';
    }
}

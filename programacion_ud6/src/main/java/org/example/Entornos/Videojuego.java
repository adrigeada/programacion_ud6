package org.example.Entornos;

public class Videojuego {

    private String titulo;
    private Plataformas plataforma;
    private String genero;
    private int anyo_lanzamiento;
    private double precio;
    private int stock;

    public Videojuego(String titulo,Plataformas plataforma,String genero,int anyo_lanzamiento,double precio,int stock){
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.genero = genero;
        this.anyo_lanzamiento = anyo_lanzamiento;
        this.precio = precio;
        this.stock = stock;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Plataformas getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(Plataformas plataforma) {
        this.plataforma = plataforma;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnyo_lanzamiento() {
        return anyo_lanzamiento;
    }

    public void setAnyo_lanzamiento(int anyo_lanzamiento) {
        this.anyo_lanzamiento = anyo_lanzamiento;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", genero='" + genero + '\'' +
                ", anyo_lanzamiento=" + anyo_lanzamiento +
                ", precio=" + precio +
                ", stock=" + stock +
                '}';
    }
}

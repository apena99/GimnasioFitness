package com.mycompany.gimnasiofitness;


public class Ejercicio {
    private String nombre;
    private String tipo; // pierna, espalda, brazo, etc.
    private String descripcion;

    public Ejercicio(String nombre, String tipo, String descripcion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.descripcion = descripcion;
        String saludo = "hola es una prueba";
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    @Override
    public String toString() {
        return nombre + " (" + tipo + "): " + descripcion;
    }
}

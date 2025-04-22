package com.mycompany.gimnasiofitness;

import java.util.ArrayList;
import java.util.List;

public class Rutina {
    private String nombre;
    private List<Ejercicio> ejercicios;

    public Rutina(String nombre) {
        this.nombre = nombre;
        this.ejercicios = new ArrayList<>();
    }

    // Métodos para gestionar ejercicios
    public void agregarEjercicio(Ejercicio ejercicio) {
        ejercicios.add(ejercicio);
    }

    public void eliminarEjercicio(Ejercicio ejercicio) {
        ejercicios.remove(ejercicio);
    }

    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    @Override
    public String toString() {
        StringBuilder detallesRutina = new StringBuilder("Rutina: " + nombre + "\n");
        for (Ejercicio ejercicio : ejercicios) {
            detallesRutina.append("- ").append(ejercicio.toString()).append("\n");
        }
        return detallesRutina.toString();
    }
}

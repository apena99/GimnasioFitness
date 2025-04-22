package com.mycompany.gimnasiofitness;

import java.util.ArrayList;
import java.util.List;

public class gimnasiofitness {
    private List<Usuario> usuarios = new ArrayList<>();
    private List<Ejercicio> ejercicios = new ArrayList<>();
    private List<Rutina> rutinas = new ArrayList<>();

    public gimnasiofitness() {
        // Ejercicios predefinidos
        ejercicios.add(new Ejercicio("Sentadillas", "Pierna", "Flexiona las rodillas y baja el cuerpo."));
        ejercicios.add(new Ejercicio("Press de banca", "Brazo", "Levanta la barra desde el pecho."));
        ejercicios.add(new Ejercicio("Peso muerto", "Espalda", "Levanta la barra desde el suelo."));
    }

    // Métodos para usuarios
    public boolean registrarUsuario(String nombre, String correo, String contraseña) {
        if (buscarUsuario(correo) != null) {
            return false; // Usuario ya existe
        }
        usuarios.add(new Usuario(nombre, correo, contraseña));
        return true;
    }

    public Usuario buscarUsuario(String correo) {
        for (Usuario usuario : usuarios) {
            if (usuario.getCorreo().equals(correo)) {
                return usuario;
            }
        }
        return null;
    }

    public boolean iniciarSesion(String correo, String contraseña) {
        Usuario usuario = buscarUsuario(correo);
        return usuario != null && usuario.getContraseña().equals(contraseña);
    }

    // Métodos para ejercicios
    public List<Ejercicio> getEjercicios() {
        return ejercicios;
    }

    // Métodos para rutinas
    public void agregarRutina(Rutina rutina) {
        rutinas.add(rutina);
    }

    public List<Rutina> getRutinas() {
        return rutinas;
    }
}





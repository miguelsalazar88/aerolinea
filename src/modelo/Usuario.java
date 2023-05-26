package modelo;

import java.util.ArrayList;

public abstract class Usuario {

    protected String username;
    protected String password;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Vuelo> vuelos;

    public Usuario(String username, String password, String nombre, String apellido) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.vuelos = new ArrayList<Vuelo>();
    }

    public void verHorario(){
        System.out.println("Horario");
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }
}

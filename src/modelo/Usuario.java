package modelo;

import java.util.ArrayList;

public abstract class Usuario {

    protected String username;
    protected String password;
    protected String nombre;
    protected String apellido;
    protected ArrayList<Vuelo> vuelos;
    protected ArrayList<Tiquete> tiquetes;


    public Usuario(String username, String password, String nombre, String apellido) {
        this.username = username;
        this.password = password;
        this.nombre = nombre;
        this.apellido = apellido;
        this.vuelos = new ArrayList<Vuelo>();
        this.tiquetes = new ArrayList<Tiquete>();
    }

    // Getters y Setters


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
    
    public ArrayList<Tiquete> getTiquetes(){
    	return tiquetes;
    }
    
    public void addFlights(Vuelo v) {
    	this.vuelos.add(v);
    }

    public void addTiquets(Tiquete t) {
    	this.tiquetes.add(t);
    }
}

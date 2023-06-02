package modelo;

import java.util.ArrayList;

public class SistemaSingleton {

    private ArrayList<Usuario> usuarios;
    private ArrayList<Aerolinea> aerolineas;
    private ArrayList<Ciudad> ciudades;
    private static SistemaSingleton instancia; //Instancia Singleton

    private SistemaSingleton(){
        this.usuarios = new ArrayList<Usuario>();
        this.aerolineas = new ArrayList<Aerolinea>();
        this.ciudades = Constants.getCiudades();
    }

    public static SistemaSingleton getInstance(){
        if (instancia==null){
            instancia = new SistemaSingleton();
        }
        return instancia;
    }

    public void registarUsuario(Usuario u){
        this.usuarios.add(u);
    }
    
    public void registrarTiquete (Usuario u, Tiquete t) {
    	u.addTiquets(t);
    }
    
    public void registrarVuelo (Usuario u, Vuelo v) {
    	u.addFlights(v);
    }
    
    

    public void registrarAerolinea(Aerolinea a){
        this.aerolineas.add(a);
    }

    public void addCiudad(Ciudad c){
        this.ciudades.add(c);
    }

    public boolean usuarioExiste(String username){
        boolean usuarioExiste = false;
        for (Usuario u : usuarios) {
            if (u.username == username){
                usuarioExiste = true;
            }
        }
        return usuarioExiste;
    }

    public Usuario login(){
        return null;
    }

    public ArrayList<Vuelo> getVuelos(){
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
        for (Aerolinea a :aerolineas) {
            for (Vuelo v: a.getVuelos()) {
                vuelos.add(v);
            }
        }
        return vuelos;
    }


    // Getters y Setters


    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Aerolinea> getAerolineas() {
        return aerolineas;
    }

    public ArrayList<Ciudad> getCiudades() {
        return ciudades;
    }
}

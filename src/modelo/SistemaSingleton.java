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
        this.ciudades = Utils.getCiudades();
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

    public Usuario login(String username, String password){
        Usuario usuario = null;
        for (Usuario u : usuarios) {
            if (u.getUsername().equals(username) && u.getPassword().equals(password)){
                usuario = u;
            }
        }
        return usuario;
    }

    public ArrayList<Vuelo> getVuelosComerciales(){
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
        for (Aerolinea a :aerolineas) {
            for (Vuelo v: a.getVuelos()) {
                if(v instanceof VueloComercial){
                    vuelos.add(v);
                }

            }
        }
        return vuelos;
    }

    public ArrayList<Vuelo> getVuelosCarga(){
        ArrayList<Vuelo> vuelos = new ArrayList<Vuelo>();
        for (Aerolinea a :aerolineas) {
            for (Vuelo v: a.getVuelos()) {
                if(v instanceof VueloCarga){
                    vuelos.add(v);
                }

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

    public void addUsuarios(ArrayList<Usuario> arrUsuarios){
        usuarios.addAll(arrUsuarios);
    }
}

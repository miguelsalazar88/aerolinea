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
        this.ciudades = new ArrayList<Ciudad>();
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

    public Usuario login(){
        return null;
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

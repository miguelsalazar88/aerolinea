package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class SistemaSingleton implements Serializable{

    private ArrayList<Usuario> usuarios;
    private ArrayList<Aerolinea> aerolineas;
    private ArrayList<Ciudad> ciudades;
    private static SistemaSingleton instancia;

    private SistemaSingleton(){
        this.usuarios = new ArrayList<Usuario>();
        this.aerolineas = new ArrayList<Aerolinea>();
        this.ciudades = createCiudades();
    }

    private ArrayList<Ciudad> createCiudades() {
        return null;
    }

    public static SistemaSingleton getInstance(){
        if (instancia == null){
            instancia = new SistemaSingleton();
        }
        return instancia;
    }

    public void registrarUsuario(Usuario u){
        this.usuarios.add(u);
    }

    public void registrarAerolinea(Aerolinea a){
        this.aerolineas.add(a);
    }

    public ArrayList<Usuario> getUsuarios() {
        return usuarios;
    }

    public ArrayList<Aerolinea> getAerolineas() {
        return aerolineas;
    }

    public Usuario loginCheck(String username, String password) {
        Usuario user = null;
        for (Usuario u: usuarios) {
            if (u.username == username){
                if (u.password == password){
                    user = u;
                }
            }
        }
        return user;
    }

    public boolean usuarioExiste(String username){
        boolean usuarioExiste = false;
        for (Usuario u: usuarios) {
            if (u.username == username){
                usuarioExiste = true;
            }
        }
        return usuarioExiste;
    }
}

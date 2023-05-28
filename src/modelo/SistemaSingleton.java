package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class SistemaSingleton implements Serializable{

    private ArrayList<Usuario> usuarios;
    private ArrayList<Aerolinea> aerolineas;
    private static SistemaSingleton instancia;

    private SistemaSingleton(){
        this.usuarios = new ArrayList<Usuario>();
        this.aerolineas = new ArrayList<Aerolinea>();
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

}

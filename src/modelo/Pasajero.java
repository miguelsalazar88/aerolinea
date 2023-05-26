package modelo;

import java.util.ArrayList;

public class Pasajero extends Usuario{

    private ArrayList<Tiquete> tiquetes;

    public Pasajero(String username, String password, String nombre, String apellido) {
        super(username, password, nombre, apellido);
        this.tiquetes = new ArrayList<Tiquete>();
    }

    public void comprarTiquete(Tiquete t){
        this.tiquetes.add(t);
    }

}

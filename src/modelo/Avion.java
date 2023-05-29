package modelo;

import java.io.Serializable;

public abstract class Avion implements Serializable {

    protected int id;
    protected String marca;
    protected String tipo;
    public Avion(int id, String marca, String tipo) {
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
    }
}

package modelo;

public abstract class Avion {

    protected int id;
    protected String marca;
    protected String tipo;

    public Avion(int id, String marca, String tipo) {
        this.id = id;
        this.marca = marca;
        this.tipo = tipo;
    }

    //Getters y Setters
    public int getId() {
        return id;
    }

    public String getMarca() {
        return marca;
    }

    public String getTipo() {
        return tipo;
    }
}

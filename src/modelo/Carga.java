package modelo;

public class Carga {

    private Usuario owner;
    private int peso;
    private int precio;

    public Carga(Usuario owner, int peso, int precio) {
        this.owner = owner;
        this.peso = peso;
        this.precio = precio;
    }

    public Usuario getOwner() {
        return owner;
    }

    public int getPeso() {
        return peso;
    }

    public int getPrecio() {
        return precio;
    }
}

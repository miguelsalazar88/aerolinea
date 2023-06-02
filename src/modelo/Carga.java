package modelo;

public class Carga {

    private Usuario owner;
    private int peso;

    public Carga(Usuario owner, int peso) {
        this.owner = owner;
        this.peso = peso;
    }

    public Usuario getOwner() {
        return owner;
    }

    public int getPeso() {
        return peso;
    }

}

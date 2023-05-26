package modelo;

public class Tiquete {

    private int idTiquete;
    private Pasajero owner;
    private Vuelo vuelo;
    private int precio;

    public Tiquete(int idTiquete, Pasajero owner, Vuelo vuelo, int precio) {
        this.idTiquete = idTiquete;
        this.owner = owner;
        this.vuelo = vuelo;
        this.precio = precio;
    }
}

package modelo;

public class Tiquete {

    private int idTiquete;
    private Pasajero owner;
    private Vuelo vuelo;

    public Tiquete(int idTiquete, Pasajero owner, Vuelo vuelo) {
        this.idTiquete = idTiquete;
        this.owner = owner;
        this.vuelo = vuelo;
    }

}

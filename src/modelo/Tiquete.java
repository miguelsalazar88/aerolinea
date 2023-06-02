package modelo;

public class Tiquete {

    private String idTiquete;
    private Pasajero owner;
    private Vuelo vuelo;

    public Tiquete(String idTiquete, Pasajero owner, Vuelo vuelo) {
        this.idTiquete = idTiquete;
        this.owner = owner;
        this.vuelo = vuelo;
    }

    public String getIdTiquete() {
        return idTiquete;
    }

    public Pasajero getOwner() {
        return owner;
    }

    public Vuelo getVuelo() {
        return vuelo;
    }
}

package modelo;

public class Ciudad {

    private String nombre;
    private Coordenadas coordenadas;

    public Ciudad(String nombre, Coordenadas coordenadas) {
        this.nombre = nombre;
        this.coordenadas = coordenadas;
    }

    public String getNombre() {
        return nombre;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }
}

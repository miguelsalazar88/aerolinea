package modelo;

import java.io.Serializable;

public class Ciudad implements Serializable {

    private String nombre;
    private Coordenadas coordenadas;

    public Ciudad(String nombre, Coordenadas coordenadas) {
        this.nombre = nombre;
        this.coordenadas = coordenadas;
    }

    public Coordenadas getCoordenadas() {
        return coordenadas;
    }
}

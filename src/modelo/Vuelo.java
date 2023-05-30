package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Vuelo implements Serializable {

    protected int idVuelo;
    protected Aerolinea aerolinea;
    protected Avion avion;
    protected Ciudad origen;
    protected Ciudad destino;
    protected Coordenadas ubicacion;
    protected ArrayList<Empleado> tripulacion;

    public Vuelo(int idVuelo, Aerolinea aerolinea, Avion avion, Ciudad origen, Ciudad destino, ArrayList<Empleado> tripulacion) {
        this.idVuelo = idVuelo;
        this.aerolinea = aerolinea;
        this.avion = avion;
        this.origen = origen;
        this.destino = destino;
        this.tripulacion = tripulacion;
        this.ubicacion = origen.getCoordenadas();
    }
}

package modelo;

import java.util.ArrayList;

public abstract class Vuelo {

    protected String idVuelo;
    protected Aerolinea aerolinea;
    protected Avion avion;
    protected Ciudad origen;
    protected Ciudad destino;
    protected Coordenadas ubicacion;
    protected ArrayList<Empleado> tripulacion;

    public Vuelo(String idVuelo, Aerolinea aerolinea, Avion avion, Ciudad origen, Ciudad destino) {
        this.idVuelo = idVuelo;
        this.aerolinea = aerolinea;
        this.avion = avion;
        this.origen = origen;
        this.destino = destino;
        this.ubicacion = origen.getCoordenadas();
        this.tripulacion = new ArrayList<Empleado>();
    }

    public void actualizarUbicacion() {
        int deltaX = destino.getCoordenadas().getX() - ubicacion.getX();
        int deltaY = destino.getCoordenadas().getY() - ubicacion.getY();

        if (deltaX != 0) {
            int pasoX = deltaX / Math.abs(deltaX); // Calcula el paso en el eje X
            ubicacion = new Coordenadas(ubicacion.getX() + pasoX, ubicacion.getY());
        } else if (deltaY != 0) {
            int pasoY = deltaY / Math.abs(deltaY); // Calcula el paso en el eje Y
            ubicacion = new Coordenadas(ubicacion.getX(), ubicacion.getY() + pasoY);
        }
    }

    //Getters y Setters

    public Coordenadas getUbicacion() {
        return ubicacion;
    }

    @Override
    public String toString() {
        return aerolinea.getNombre() + ": " + origen.getNombre() + " - " + destino.getNombre();
    }
    
    public String getInfo() {
    	return aerolinea.getNombre() + ": " + origen.getNombre() + " - " + destino.getNombre();
    }
}

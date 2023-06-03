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

    public String getIdVuelo() {
        return idVuelo;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public Ciudad getDestino() {
        return destino;
    }

    @Override
    public String toString() {
        return "Vuelo{" +
                "idVuelo='" + idVuelo + '\'' +
                ", avion=" + avion.getId() +
                ", origen=" + origen.getNombre() +
                ", destino=" + destino.getNombre() +
                '}';
    }

    public void setIdVuelo(String idVuelo) {
        this.idVuelo = idVuelo;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public Avion getAvion() {
        return avion;
    }

    public void setAvion(Avion avion) {
        this.avion = avion;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }

    public void setUbicacion(Coordenadas ubicacion) {
        this.ubicacion = ubicacion;
    }

    public ArrayList<Empleado> getTripulacion() {
        return tripulacion;
    }

    public void setTripulacion(ArrayList<Empleado> tripulacion) {
        this.tripulacion = tripulacion;
    }
}

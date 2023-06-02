package modelo;

import java.util.ArrayList;

public class VueloCarga extends Vuelo{

    ArrayList<Carga> cargas = new ArrayList<>();
    int pesoDisponible;

    public VueloCarga(String idVuelo, Aerolinea aerolinea, AvionCarga avion, Ciudad origen, Ciudad destino) {
        super(idVuelo, aerolinea, avion, origen, destino);
        this.pesoDisponible = avion.getCapacidad();
    }

    public void agregarCarga(Carga c){
        this.cargas.add(c);
        this.pesoDisponible -= c.getPeso();
    }

    public ArrayList<Carga> getCargas() {
        return cargas;
    }

    public int getPesoDisponible() {
        return pesoDisponible;
    }
}

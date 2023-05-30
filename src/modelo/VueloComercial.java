package modelo;

import java.util.ArrayList;

public class VueloComercial extends Vuelo{
    private Tiquete[] tiquetes;

    public VueloComercial(int idVuelo, Aerolinea aerolinea, Avion avion,
                          Ciudad origen, Ciudad destino, ArrayList<Empleado> tripulacion) {
        super(idVuelo, aerolinea, avion, origen, destino, tripulacion);
        AvionPasajeros avionCast = (AvionPasajeros) avion;
        this.tiquetes = new Tiquete[avionCast.getCupos()];
    }
}

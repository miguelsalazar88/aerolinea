package modelo;

import java.util.ArrayList;

public class VueloCarga extends Vuelo{

    private int carga;

    public VueloCarga(int idVuelo, Aerolinea aerolinea, Avion avion,
                      Ciudad origen, Ciudad destino,
                      ArrayList<Empleado> tripulacion) {
        super(idVuelo, aerolinea, avion, origen, destino, tripulacion);
        this.carga = 0;
    }
}

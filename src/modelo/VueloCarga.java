package modelo;

import java.util.ArrayList;

public class VueloCarga extends Vuelo{

    private int carga;

    public VueloCarga(int idVuelo, Aerolinea aerolinea, Avion avion,
                      Ciudad origen, Ciudad destino) {
        super(idVuelo, aerolinea, avion, origen, destino);
        this.carga = 0;
    }
}

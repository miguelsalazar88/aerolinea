package modelo;

import java.util.ArrayList;

public class VueloComercial extends Vuelo{

    private Tiquete[] tiquetes;

    public VueloComercial(String idVuelo, Aerolinea aerolinea, AvionPasajeros avion, Ciudad origen, Ciudad destino) {
        super(idVuelo, aerolinea, avion, origen, destino);
        this.tiquetes = new Tiquete[avion.getCupos()];
    }

    public void agregarTiquete(Tiquete t, int puesto){
        tiquetes[puesto] = t;
    }

    public ArrayList<Integer> getPuestosDisponibles(){
        ArrayList<Integer> puestosDisponibles = new ArrayList<Integer>();
        for (int i = 0; i < tiquetes.length; i++) {
            if (tiquetes[i] != null){
                puestosDisponibles.add(i);
            }
        }
        return puestosDisponibles;
    }
}

package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public abstract class Vuelo implements Serializable {

    protected int idVuelo;
    protected Avion avion;
    protected Ciudad origen;
    protected Ciudad destino;

    protected Coordenadas ubicacion;
    protected ArrayList<Empleado> tripulacion;

}

package modelo;

public class AvionCarga extends Avion {
    private int capacidad;

    public AvionCarga(int id, String marca, String tipo, int capacidad, int carga) {
        super(id, marca, tipo);
        this.capacidad = capacidad;
    }

    public int getCapacidad() {
        return capacidad;
    }

}

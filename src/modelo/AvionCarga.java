package modelo;

public class AvionCarga extends Avion{
    private int capacidad;

    public AvionCarga(int id, String marca, String tipo, int capacidad) {
        super(id, marca, tipo);
        this.capacidad = capacidad;
    }

    //Getters y Setters
    public int getCapacidad() {
        return capacidad;
    }
}

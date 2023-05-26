package modelo;

public class AvionPasajeros extends Avion{

    private int cupos;
    public AvionPasajeros(int id, String marca, String tipo, int cupos) {
        super(id, marca, tipo);
        this.cupos = cupos;
    }



}

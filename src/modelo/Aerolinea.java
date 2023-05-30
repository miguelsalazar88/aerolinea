package modelo;

import java.io.Serializable;
import java.util.ArrayList;

public class Aerolinea implements Serializable {

    private String nombre;
    private Empleado owner;
    private ArrayList<Avion> aviones;
    private ArrayList<Empleado> empleados;
    private ArrayList<Vuelo> vuelos;

    public Aerolinea(String nombre, Empleado owner) {
        this.nombre = nombre;
        this.owner = owner;
        this.aviones = new ArrayList<Avion>();
        this.empleados = new ArrayList<Empleado>();
        this.vuelos = new ArrayList<Vuelo>();
    }

    public void agregarAvion(Avion a){
        this.aviones.add(a);
    }

    public void agregarEmpleado(Empleado e){
        this.empleados.add(e);
    }

    public void agregarVuelo(Vuelo v){
        this.vuelos.add(v);
    }

    public ArrayList<Avion> getAviones() {
        return aviones;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
    }
}

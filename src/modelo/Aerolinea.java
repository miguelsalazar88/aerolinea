package modelo;

import java.util.ArrayList;

public class Aerolinea {
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

    public ArrayList<Vuelo> getVuelos() {
        return vuelos;
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

    //Getters y Setters
    public String getNombre() {
        return nombre;
    }

    public Empleado getOwner() {
        return owner;
    }

    public ArrayList<Avion> getAvionesPasajeros() {
        ArrayList<Avion> avionesPasajeros = new ArrayList<Avion>();
        for (Avion avion: aviones) {
            if( avion instanceof AvionPasajeros){
                avionesPasajeros.add(avion);
            }
        }
        return avionesPasajeros;
    }

    public ArrayList<Empleado> getEmpleados() {
        return empleados;
    }

    public ArrayList<Vuelo> getVuelosPasajeros() {
        ArrayList<Vuelo> vuelosPasajeros = new ArrayList<Vuelo>();
        for (Vuelo v: vuelos) {
            if(v instanceof VueloComercial){
                vuelosPasajeros.add(v);
            }
        }
        return vuelosPasajeros;
    }

    public ArrayList<Vuelo> getVuelosCarga() {
        ArrayList<Vuelo> vuelosPasajeros = new ArrayList<Vuelo>();
        for (Vuelo v: vuelos) {
            if(v instanceof VueloCarga){
                vuelosPasajeros.add(v);
            }
        }
        return vuelosPasajeros;
    }

    public ArrayList<Avion> getAvionesCarga() {
        ArrayList<Avion> avionesCarga = new ArrayList<Avion>();
        for (Avion avion: aviones) {
            if( avion instanceof AvionCarga){
                avionesCarga.add(avion);
            }
        }
        return avionesCarga;
    }
}

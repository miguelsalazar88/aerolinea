package modelo;

import java.util.ArrayList;

public class SistemaCreator {

    public static ArrayList<Ciudad> createCiudades(){
        ArrayList<Ciudad> ciudades = new ArrayList<Ciudad>();
        Ciudad bogota = new Ciudad("Bogota", new Coordenadas(171,264));
        Ciudad medellin = new Ciudad("Medellin", new Coordenadas(123,200));
        Ciudad cartagena = new Ciudad("Cartagena",new Coordenadas(124,100));
        Ciudad pasto = new Ciudad("Pasto",new Coordenadas(59,402));
        Ciudad riohacha = new Ciudad("Riohacha",new Coordenadas(210,41));
        Ciudad leticia = new Ciudad("Leticia",new Coordenadas(317,566));
        Ciudad barranquilla = new Ciudad("Barranquilla",new Coordenadas(145,61));
        Ciudad cucuta = new Ciudad("Cucuta",new Coordenadas(230,174));

        ciudades.add(bogota);
        ciudades.add(medellin);
        ciudades.add(cartagena);
        ciudades.add(pasto);
        ciudades.add(riohacha);
        ciudades.add(leticia);
        ciudades.add(barranquilla);
        ciudades.add(cucuta);

        return ciudades;
    }

    public static ArrayList<Aerolinea> createAerolineas(){
        return null;
    }

    public static Vuelo pruebasVuelo(){
        int idVuelo = 100;
        Avion boeing = new AvionPasajeros(100,"Boeing", "Comercial",100);
        Aerolinea avianca = new Aerolinea("avianca",new Empleado("a","a","a","a","a"));
        Ciudad origen = new Ciudad("Bogota", new Coordenadas(171,264));
        Ciudad destino = new Ciudad("Riohacha",new Coordenadas(210,41));

        VueloComercial vuelo = new VueloComercial(idVuelo,avianca,boeing,origen,destino);
        return vuelo;

    }

}

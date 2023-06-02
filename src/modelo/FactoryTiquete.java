package modelo;

public class FactoryTiquete {

    public static Tiquete crearTiquete(int silla, Pasajero owner, Vuelo vuelo){
        String idTiquete = idTiqueteGenerator(vuelo, silla);
        return new Tiquete(idTiquete, owner, vuelo);
    }

    public static String idTiqueteGenerator(Vuelo vuelo, int silla){
        return vuelo.getAerolinea().getNombre() + vuelo.getIdVuelo() + "-" + String.valueOf(silla +1);
    }

}

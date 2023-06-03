package modelo;

public class VueloFactory {
    
    public static Vuelo crearVuelo(String tipoVuelo, String idVuelo, Aerolinea aerolinea, Avion avion, Ciudad origen, Ciudad destino) {
        if (tipoVuelo.equalsIgnoreCase("comercial")) {
            return new VueloComercial(idVuelo, aerolinea, (AvionPasajeros) avion, origen, destino);
        } else if (tipoVuelo.equalsIgnoreCase("carga")) {
            return new VueloCarga(idVuelo, aerolinea, (AvionCarga) avion, origen, destino);
        } else {
            throw new IllegalArgumentException("Tipo de vuelo inválido: " + tipoVuelo);
        }
    }
}
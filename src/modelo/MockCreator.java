package modelo;

import java.util.ArrayList;

public class MockCreator {


    public static ArrayList<Pasajero> crearPasajeros(){

        ArrayList<Pasajero> pasajeros = new ArrayList<Pasajero>();

        Pasajero miguel = new Pasajero("miguel", "password",
                "Miguel", "Salazar");

        Pasajero alejo = new Pasajero("alejo", "password",
                "Alejandro", "Bermudez");

        Pasajero maria = new Pasajero("maria", "password",
                "Maria Camila", "Tibasosa");

        Pasajero sebas = new Pasajero("sebas", "password",
                "Sebastian", "Tovar");

        pasajeros.add(miguel);
        pasajeros.add(alejo);
        pasajeros.add(maria);
        pasajeros.add(sebas);

        return pasajeros;

    }

    public static ArrayList<Empleado> crearAdministradores(){

        ArrayList<Empleado> administradoresAerolineas = new ArrayList<Empleado>();

        Empleado adminAvianca = new Empleado("avianca","passowrd",
                "admin","Avianca","Administrador",1000000);

        Empleado adminLatam = new Empleado("latam","passowrd",
                "admin","Latam","Administrador",1000000);

        Empleado adminViva = new Empleado("viva","passowrd",
                "admin","Viva","Administrador",1000000);

        Empleado adminWingo = new Empleado("wingo","passowrd",
                "admin","Wingo","Administrador",1000000);

        Empleado adminUltra = new Empleado("ultra","passowrd",
                "admin","Ultra","Administrador",1000000);

        administradoresAerolineas.add(adminAvianca);
        administradoresAerolineas.add(adminLatam);
        administradoresAerolineas.add(adminViva);
        administradoresAerolineas.add(adminWingo);
        administradoresAerolineas.add(adminUltra);

        return administradoresAerolineas;
    }

    public static ArrayList<Aerolinea> crearAerolineas(ArrayList<Empleado> administradores){
        ArrayList<Aerolinea> aerolineas = new ArrayList<Aerolinea>();
        for (Empleado e:
             administradores) {
                String nombreAerolinea = e.getApellido();
                aerolineas.add(new Aerolinea(nombreAerolinea, e));
        }
        return aerolineas;
    }

    public static ArrayList<AvionPasajeros> crearAvionesPasajeros(){
        ArrayList<AvionPasajeros> aviones = new ArrayList<AvionPasajeros>();
        AvionPasajeros boeing747 = new AvionPasajeros(Utils.rnd.nextInt(100),"Boeing 747",
                "Pasajeros", Utils.rnd.nextInt(20)+10);
        AvionPasajeros airbusA320 = new AvionPasajeros(Utils.rnd.nextInt(100),"AirBus A320",
                "Pasajeros", Utils.rnd.nextInt(20)+10);
        AvionPasajeros boeing737 = new AvionPasajeros(Utils.rnd.nextInt(100),"Boeing 777",
                "Pasajeros", Utils.rnd.nextInt(20)+10);
        AvionPasajeros boeing787 = new AvionPasajeros(Utils.rnd.nextInt(100),"Boeing 787",
                "Pasajeros", Utils.rnd.nextInt(20)+10);
        AvionPasajeros airbusA380 = new AvionPasajeros(Utils.rnd.nextInt(100),"AirBus A380",
                "Pasajeros", Utils.rnd.nextInt(20)+10);

        aviones.add(boeing747);
        aviones.add(airbusA320);
        aviones.add(boeing737);
        aviones.add(boeing787);
        aviones.add(airbusA380);

        return aviones;
    }

    public static ArrayList<VueloComercial> crearVuelos(Aerolinea aerolinea, ArrayList<Avion> aviones){
        ArrayList<Ciudad> ciudades = Utils.getCiudades();
        ArrayList<VueloComercial> vuelos = new ArrayList<VueloComercial>();

        for (int i = 0; i < 10; i++) {
            String idVuelo = String.valueOf(Utils.rnd.nextInt(1000));
            AvionPasajeros avion = (AvionPasajeros) aviones.get(Utils.rnd.nextInt(aviones.size()));
            Ciudad origen = ciudades.get(Utils.rnd.nextInt(ciudades.size()));
            Ciudad destino;
            do{
                destino = ciudades.get(Utils.rnd.nextInt(ciudades.size()));
            } while (origen.equals(destino));
            vuelos.add(new VueloComercial(idVuelo,aerolinea,avion,origen,destino));
        }
        return vuelos;
    }

    public static void crearMock(){
        SistemaSingleton sistema = SistemaSingleton.getInstance();

        //Crear Pasajeros
        ArrayList<Pasajero> pasajeros = crearPasajeros();
        for (Pasajero p: pasajeros) {
            sistema.registarUsuario(p);
        }

        //Crear administradores
        ArrayList<Empleado> administradores = crearAdministradores();
        for (Empleado e: administradores) {
            sistema.registarUsuario(e);
        }
        // Crear Aerolineas, aviones y vuelos
        ArrayList<Aerolinea> aerolineas = crearAerolineas(administradores);
        for (Aerolinea aerolinea: aerolineas) {
            ArrayList<AvionPasajeros> avionesPasajeros = crearAvionesPasajeros();
            for (AvionPasajeros avionPasajeros: avionesPasajeros) {
                aerolinea.agregarAvion(avionPasajeros);
            }
            ArrayList<VueloComercial> vuelos = crearVuelos(aerolinea,aerolinea.getAviones());
            for (VueloComercial vuelo: vuelos) {
                aerolinea.agregarVuelo(vuelo);
            }
            sistema.registrarAerolinea(aerolinea);
        }
    }

}

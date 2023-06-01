package modelo;

import java.util.ArrayList;

public class MockCreator {

    public static ArrayList<Aerolinea> crearAerolineas(){
        return null;
    }

    public static ArrayList<Empleado> crearAdministradores(){

        Empleado adminAvianca = new Empleado("avianca","passowrd",
                "admin","avianca","Administrador",1000000);

        Empleado adminLatam = new Empleado("latam","passowrd",
                "admin","latam","Administrador",1000000);

        Empleado adminViva = new Empleado("viva","passowrd",
                "admin","viva","Administrador",1000000);

        Empleado adminWingo = new Empleado("wingo","passowrd",
                "admin","wingo","Administrador",1000000);

        Empleado adminUltra = new Empleado("ultra","passowrd",
                "admin","ultra","Administrador",1000000);

    }

}

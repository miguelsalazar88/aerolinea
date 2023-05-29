package app;

import controller.ControllerLogin;
import modelo.*;
import vista.VentanaLogin;
import vista.VentanaRegistro;

import java.util.ArrayList;

public class Launcher {
    public static void main(String[] args) {

        SistemaSingleton sistema = SistemaSerializer.recuperarSistema();

        if (sistema == null){
            sistema = SistemaSingleton.getInstance();
        }

        VentanaLogin ventanaLogin = new VentanaLogin();
        ControllerLogin contollerLogin = new ControllerLogin(ventanaLogin,sistema);

    }

}

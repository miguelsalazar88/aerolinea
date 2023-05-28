package app;

import controller.ControllerLogin;
import modelo.SistemaSingleton;
import vista.VentanaLogin;

public class Launcher {
    public static void main(String[] args) {

        SistemaSingleton sistema = SistemaSingleton.getInstance();
        VentanaLogin ventanaLogin = new VentanaLogin();
        ControllerLogin controllerLogin = new ControllerLogin(ventanaLogin, sistema);

    }

}

package app;

import controlador.ControladorVentanaPrincipal;
import modelo.SistemaSingleton;
import vista.VentanaPrincipal;

public class Launcher {

    public static void main(String[] args) {

        // Se llama a la instancia de sistema.
        SistemaSingleton sistema = SistemaSingleton.getInstance();

        //Se crea una instancia de VentanaPrincipal con su Controlador
        VentanaPrincipal ventanaPrincipal = new VentanaPrincipal("Principal");
        ControladorVentanaPrincipal controladorVentanaPrincipal = new ControladorVentanaPrincipal(
                ventanaPrincipal, sistema
        );

    }

}
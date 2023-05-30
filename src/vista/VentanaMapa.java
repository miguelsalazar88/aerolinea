package vista;

import controller.ControllerMapa;
import modelo.Ciudad;

import javax.swing.*;
import java.util.ArrayList;

public class VentanaMapa extends JFrame {

    private JButton startButton;
    private JButton stopButton;
    private PanelMapa panel = new PanelMapa();

    private ControllerMapa controller;

    public VentanaMapa(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(this.panel);
        pack();
        setVisible(true);
    }

    public void setController(ControllerMapa controllerMapa) {
        this.controller = controllerMapa;
    }

    public void start(){
        ArrayList<Ciudad> ciudades = this.controller.getSistema().getCiudades();
    }


}

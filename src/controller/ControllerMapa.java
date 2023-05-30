package controller;

import modelo.SistemaSingleton;
import vista.VentanaMapa;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerMapa implements ActionListener {

    private VentanaMapa vista;
    private SistemaSingleton sistema;

    public ControllerMapa(VentanaMapa vista, SistemaSingleton sistema) {
        this.vista = vista;
        this.sistema = sistema;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public SistemaSingleton getSistema() {
        return sistema;
    }
}

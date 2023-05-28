package controller;

import modelo.SistemaSingleton;
import vista.VentanaLogin;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerLogin implements ActionListener {

    VentanaLogin vista;
    SistemaSingleton sistema;

    public ControllerLogin(VentanaLogin vista, SistemaSingleton sistema) {
        this.vista = vista;
        this.sistema = sistema;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}

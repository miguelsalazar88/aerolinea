package controller;

import modelo.SistemaSingleton;
import vista.VentanaLogin;
import vista.VentanaRegistro;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ControllerRegistro implements ActionListener {

    VentanaRegistro vista;
    SistemaSingleton sistema;

    public ControllerRegistro(VentanaRegistro vista, SistemaSingleton sistema) {
        this.vista = vista;
        this.sistema = sistema;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(this.vista.getRegistrarButton())){
            System.out.println("Username: " + this.vista.getUsernameField());
            System.out.println("Password: " + this.vista.getPasswordField());
            System.out.println("Nombre: " + this.vista.getNombreField());
            System.out.println("Apellido: " + this.vista.getApellidoField());
            System.out.println("Tipo: " + this.vista.getTipoEmpleadoCbo());
        }



    }
}

package controller;

import modelo.SistemaSingleton;
import modelo.Usuario;
import vista.VentanaLogin;
import vista.VentanaRegistro;

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
        if (e.getSource().equals(this.vista.getIniciarSesionButton())){
            Usuario user = this.sistema.loginCheck(this.vista.getUsernameField(),
                    this.vista.getPasswordField());

            if (user == null){
                System.out.println("Usuario o contraseña inválidos");
            }

        }
        if (e.getSource().equals(this.vista.getRegistrarseButton())){
            System.out.println("Holi");
            VentanaRegistro ventanaRegistro = new VentanaRegistro();
            ControllerRegistro controllerRegistro = new ControllerRegistro(ventanaRegistro,
                    SistemaSingleton.getInstance());

        }
    }
}

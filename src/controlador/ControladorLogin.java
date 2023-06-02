package controlador;

import modelo.SistemaSingleton;
import modelo.Usuario;
import vista.VentanaLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorLogin extends Controlador {

    private VentanaLogin vista;

    public ControladorLogin(SistemaSingleton sistema, VentanaLogin vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource().equals(vista.getLoginButton())) {
            String username = vista.getUsernameField().getText();
            String password = new String(vista.getPasswordField().getPassword());

            if (username.isEmpty() || password.isEmpty()) {
                JOptionPane.showMessageDialog(vista, "Por favor, ingrese el nombre de usuario y la contraseña.",
                        "Campos vacíos", JOptionPane.ERROR_MESSAGE);
            } else {
                Usuario usuario = sistema.verificarCredenciales(username, password);
                if (usuario != null) {
                    JOptionPane.showMessageDialog(vista, "Inicio de sesión exitoso",
                            "Inicio de sesión", JOptionPane.INFORMATION_MESSAGE);
                } else {
                    JOptionPane.showMessageDialog(vista, "Credenciales incorrectas",
                            "Inicio de sesión", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
    }
}

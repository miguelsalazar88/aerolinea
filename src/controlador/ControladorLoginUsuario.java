package controlador;

import modelo.SistemaSingleton;
import modelo.Usuario;
import vista.VentanaLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorLoginUsuario extends Controlador{

    private VentanaLogin vista;

    public ControladorLoginUsuario(SistemaSingleton sistema, VentanaLogin vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("Buena");
        String username = this.vista.getUsernameField().getText();
        String password = this.vista.getPasswordField().getText();

        Usuario usuario = sistema.login(username, password);

        if (usuario == null){
            JOptionPane.showMessageDialog(this.vista,"Usuario y/o contraseña incorrectos", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            // Se crea un nuevo dashboard para usuario.
            // VentanaDashboardUsuario(Usuario u)
            JOptionPane.showMessageDialog(this.vista,"Login Exitoso","Success",JOptionPane.YES_OPTION);
        }

    }
}

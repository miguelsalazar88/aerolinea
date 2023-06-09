package controlador;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import modelo.Usuario;
import vista.VentanaDashboardEmpleado;
import vista.VentanaDashboardUsuario;
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
        String username = this.vista.getUsernameField().getText();
        String password = this.vista.getPasswordField().getText();

        Usuario usuario = sistema.login(username, password);


        if (usuario == null){
            JOptionPane.showMessageDialog(this.vista,"Usuario y/o contraseña incorrectos", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(this.vista,"Login Exitoso","Success",JOptionPane.YES_OPTION);
            this.vista.dispose();
            if(usuario instanceof Pasajero) {
                VentanaDashboardUsuario ventanaDashboardUsuario = new VentanaDashboardUsuario("Dashboard", usuario);
                ControladorDashboardUsuario controladorDashboardUsuario =
                        new ControladorDashboardUsuario(sistema, ventanaDashboardUsuario);
            }
            else{
                VentanaDashboardEmpleado ventanaDashboardEmpleado = new VentanaDashboardEmpleado("Dashboard", usuario);
                ControladorDashboardEmpleado controladorDashboardEmpleado =
                        new ControladorDashboardEmpleado(sistema, ventanaDashboardEmpleado);
            }
        }

    }
}

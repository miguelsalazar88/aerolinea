package controlador;

import modelo.Aerolinea;
import modelo.SistemaSingleton;
import modelo.Usuario;
import vista.VentanaDashboardAerolinea;
import vista.VentanaDashboardEmpleado;
import vista.VentanaDashboardUsuario;
import vista.VentanaLogin;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorLoginAerolinea extends Controlador{

    VentanaLogin vista;

    public ControladorLoginAerolinea(SistemaSingleton sistema, VentanaLogin vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String username = this.vista.getUsernameField().getText();
        String password = this.vista.getPasswordField().getText();

        Usuario usuario = sistema.login(username, password);

        if(usuario == null){
            JOptionPane.showMessageDialog(this.vista,"Usuario y/o contraseña incorrectos", "Error",JOptionPane.ERROR_MESSAGE);
        }

        Aerolinea aerolinea = sistema.loginAerolinea(usuario);

        if (aerolinea == null){
            JOptionPane.showMessageDialog(this.vista,"Usuario y/o contraseña incorrectos", "Error",JOptionPane.ERROR_MESSAGE);
        }
        else{
            VentanaDashboardAerolinea ventanaDashboardAerolinea =
                    new VentanaDashboardAerolinea("Dashboard", aerolinea);
            ControladorDashboardAerolinea controladorDashboardAerolinea =
                    new ControladorDashboardAerolinea(sistema, ventanaDashboardAerolinea);

        }
    }
}

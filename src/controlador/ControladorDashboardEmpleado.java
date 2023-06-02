package controlador;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import vista.VentanaComprarVuelos;
import vista.VentanaDashboardEmpleado;
import vista.VentanaDashboardUsuario;
import vista.VentanaMapa;

import java.awt.event.ActionEvent;

public class ControladorDashboardEmpleado extends Controlador{

    private VentanaDashboardEmpleado vista;

    public ControladorDashboardEmpleado(SistemaSingleton sistema, VentanaDashboardEmpleado vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource().equals(vista.getVerMapaButton())){
            VentanaMapa ventanaMapa = new VentanaMapa("Mapa");
            ventanaMapa.getPanel().start();
        }

        if(e.getSource().equals(vista.getMiItinerarioButton())){

        }

    }
}

package controlador;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import vista.VentanaComprarVuelos;
import vista.VentanaDashboardUsuario;
import vista.VentanaMapa;

import java.awt.event.ActionEvent;

public class ControladorVentanaDashboardUsuario extends Controlador{

    VentanaDashboardUsuario vista;

    public ControladorVentanaDashboardUsuario(SistemaSingleton sistema, VentanaDashboardUsuario vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {


        if(e.getSource().equals(vista.getComprarVueloButton())){
            Pasajero pasajero = (Pasajero) vista.getUsuario();
            VentanaComprarVuelos ventanaComprarVuelos = new VentanaComprarVuelos("Vuelos Disponibles",
                    pasajero);
        }

        if(e.getSource().equals(vista.getVerMapaButton())){
            VentanaMapa ventanaMapa = new VentanaMapa("Mapa");
            ventanaMapa.getPanel().start();
        }

    }
}

package controlador;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import vista.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorDashboardUsuario extends Controlador{

    VentanaDashboardUsuario vista;

    public ControladorDashboardUsuario(SistemaSingleton sistema, VentanaDashboardUsuario vista) {
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
            ControladorComprarVuelos controladorComprarVuelos =
                    new ControladorComprarVuelos(sistema,ventanaComprarVuelos);
        }

        if(e.getSource().equals(vista.getVerMapaButton())){
            VentanaMapa ventanaMapa = new VentanaMapa("Mapa");
            ventanaMapa.getPanel().start();
        }

        if (e.getSource().equals(vista.getMiItinerarioButton())){
            if(vista.getUsuario().getVuelos().isEmpty()){
                JOptionPane.showMessageDialog(this.vista,
                        "Usted no tiene Vuelos", "Error", JOptionPane.ERROR_MESSAGE);
            }
            else{
                VentanaItinerario ventanaItinerario = new VentanaItinerario("Mi Itinerario", vista.getUsuario());
            }
        }
        if(e.getSource().equals(vista.getEnviarCargaButton())){
            Pasajero pasajero = (Pasajero) vista.getUsuario();
            VentanaEnvioCarga ventanaEnvioCarga = new VentanaEnvioCarga("Vuelos disponibles", pasajero);
            ControladorEnvioCarga controladorEnvioCarga =
                    new ControladorEnvioCarga(sistema,ventanaEnvioCarga);
        }

    }
}

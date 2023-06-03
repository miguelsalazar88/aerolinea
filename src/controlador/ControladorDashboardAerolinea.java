package controlador;

import modelo.SistemaSingleton;
import vista.*;

import java.awt.event.ActionEvent;

public class ControladorDashboardAerolinea extends Controlador{

    VentanaDashboardAerolinea vista;

    public ControladorDashboardAerolinea(SistemaSingleton sistema, VentanaDashboardAerolinea vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vista.getVerMapaButton())){
            VentanaMapa ventanaMapa = new VentanaMapa("Mapa");
            ventanaMapa.getPanel().start();
        }

        if(e.getSource().equals(vista.getAsignarEmpleadoButton())){

        }

        if(e.getSource().equals(vista.getCrearEmpleadoButton())){

            VentanaRegistroEmpleado ventanaRegistroEmpleado =
                    new VentanaRegistroEmpleado("Registro de Empleado");

            ControladorRegistroEmpleado controladorRegistroEmpleado =
                    new ControladorRegistroEmpleado(sistema,ventanaRegistroEmpleado);

        }

        if(e.getSource().equals(vista.getCrearVueloButton())){

        }
        if(e.getSource().equals(vista.getMiItinerarioButton())){
            VentanaItinerarioAerolinea ventanaItinerarioAerolinea =
                    new VentanaItinerarioAerolinea("Mi Itinerario", vista.getAerolinea());
        }


    }
}

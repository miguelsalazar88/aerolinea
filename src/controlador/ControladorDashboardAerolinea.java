package controlador;

import modelo.Aerolinea;
import modelo.SistemaSingleton;
import vista.*;

import java.awt.event.ActionEvent;

public class ControladorDashboardAerolinea extends Controlador{

    public VentanaDashboardAerolinea vista;

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

            Aerolinea a = this.vista.getAerolinea();

            VentanaAsignarEmpleado ventanaAsignarEmpleado =
                    new VentanaAsignarEmpleado("Asignación empleado",a);

        }

        if(e.getSource().equals(vista.getCrearEmpleadoButton())){

            VentanaRegistroEmpleado ventanaRegistroEmpleado =
                    new VentanaRegistroEmpleado("Registro de Empleado");
            ventanaRegistroEmpleado.setAerolinea(this.vista.getAerolinea());

            ControladorRegistroEmpleado controladorRegistroEmpleado =
                    new ControladorRegistroEmpleado(sistema,ventanaRegistroEmpleado);

        }

        if(e.getSource().equals(vista.getCrearVueloButton())){

            VentanaCrearVuelo ventanaCrearVuelo = new VentanaCrearVuelo(vista.getAerolinea());
            ControladorCrearVuelo controladorCrearVuelo =
                    new ControladorCrearVuelo(sistema, ventanaCrearVuelo);

        }
        if(e.getSource().equals(vista.getMiItinerarioButton())){
            VentanaItinerarioAerolinea ventanaItinerarioAerolinea =
                    new VentanaItinerarioAerolinea("Mi Itinerario", vista.getAerolinea());


        }


    }
}

package controlador;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import modelo.VueloComercial;
import vista.VentanaComprarVuelos;
import vista.VentanaAsignarEmpleado;
import vista.VentanaSeleccionarSillas;

import java.awt.event.ActionEvent;

public class ControladorComprarVuelos extends Controlador{

    VentanaComprarVuelos vista;

    public ControladorComprarVuelos(SistemaSingleton sistema, VentanaComprarVuelos vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vista.getComprarButton())){
            int filaSeleccionada = vista.getTablaVuelos().getSelectedRow();
            VueloComercial vuelo = vista.getVuelos().get(filaSeleccionada);
            Pasajero pasajero = vista.getPasajero();
            VentanaSeleccionarSillas ventanaSeleccionarSillas = new VentanaSeleccionarSillas(vuelo);
            ControladorSeleccionarSillas controladorSeleccionarSillas
                    = new ControladorSeleccionarSillas(sistema, ventanaSeleccionarSillas, vuelo,pasajero);
        }

    }
}

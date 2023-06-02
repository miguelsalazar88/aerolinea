package controlador;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import modelo.Vuelo;
import vista.VentanaComprarVuelos;

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
            Vuelo vuelo = vista.getVuelos().get(filaSeleccionada);
            Pasajero pasajero = vista.getPasajero();
        }

    }
}

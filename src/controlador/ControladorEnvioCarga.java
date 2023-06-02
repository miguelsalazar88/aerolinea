package controlador;

import modelo.*;
import vista.*;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorEnvioCarga extends Controlador{

    private VentanaEnvioCarga vista;


    public ControladorEnvioCarga(SistemaSingleton sistema, VentanaEnvioCarga vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vista.getComprarButton())){
            int filaSeleccionada = vista.getTablaVuelos().getSelectedRow();
            VueloCarga vuelo = vista.getVuelos().get(filaSeleccionada);
            Pasajero pasajero = vista.getPasajero();
            VentanaCantidadCarga ventanaCantidadCarga = new VentanaCantidadCarga(vuelo);
            ControladorCantidadCarga controladorCantidadCarga
                    = new ControladorCantidadCarga(sistema,ventanaCantidadCarga, vuelo,pasajero);
        }
    }

}

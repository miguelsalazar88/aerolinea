package controlador;

import modelo.Pasajero;
import modelo.SistemaSingleton;
import modelo.Tiquete;
import modelo.VueloComercial;
import vista.VentanaSeleccionarSillas;

import java.awt.event.ActionEvent;

public class ControladorSeleccionarSillas extends Controlador{

    private VentanaSeleccionarSillas vista;
    private VueloComercial vuelo;
    private Pasajero pasajero;

    public ControladorSeleccionarSillas(SistemaSingleton sistema,
                                        VentanaSeleccionarSillas vista,
                                        VueloComercial vuelo, Pasajero pasajero) {
        super(sistema);
        this.vista = vista;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vista.getSeleccionarButton())){
            int silla = vista.getAsientoComboBox().getSelectedIndex() -1;

            vista.dispose();
        }

    }

}

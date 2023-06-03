package controlador;

import modelo.*;
import vista.VentanaAsignarEmpleado;
import vista.VentanaSeleccionarSillas;

import javax.swing.*;
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

            int silla = vista.getAsientoComboBox().getSelectedIndex();
            Tiquete tiquete = FactoryTiquete.crearTiquete(silla, pasajero, vuelo);
            vuelo.agregarTiquete(tiquete, silla);
            pasajero.addTiquete(tiquete);
            pasajero.addVuelo(tiquete.getVuelo());
            String mensaje = "Tiquete " + tiquete.getIdTiquete() + " comprado exitosamente";
            JOptionPane.showMessageDialog(this.vista, mensaje, "Exito", JOptionPane.YES_OPTION);
            vista.dispose();

    }

}

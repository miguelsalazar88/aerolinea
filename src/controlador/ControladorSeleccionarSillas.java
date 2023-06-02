package controlador;

import modelo.*;
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

        if (e.getSource().equals(vista.getSeleccionarButton())){
            int silla = vista.getAsientoComboBox().getSelectedIndex();
            Tiquete tiquete = FactoryTiquete.crearTiquete(silla, pasajero, vuelo);
            vuelo.agregarTiquete(tiquete, silla);
            pasajero.addTiquete(tiquete);
            String mensaje = "Tiquete " + tiquete.getIdTiquete() + " comprado exitosamente";
            JOptionPane.showMessageDialog(this.vista, mensaje, "Exito", JOptionPane.YES_OPTION);
            vista.dispose();
        }

    }

}

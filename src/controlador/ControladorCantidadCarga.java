package controlador;

import modelo.*;
import vista.VentanaCantidadCarga;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorCantidadCarga extends Controlador{

    private VentanaCantidadCarga vista;
    private VueloCarga vuelo;
    private Pasajero pasajero;

    public ControladorCantidadCarga(SistemaSingleton sistema,
                                    VentanaCantidadCarga vista,
                                    VueloCarga vuelo, Pasajero pasajero) {
        super(sistema);
        this.vista = vista;
        this.vuelo = vuelo;
        this.pasajero = pasajero;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vista.getSeleccionarButton())){
            int peso = vista.getCantidadCarga().getSelectedIndex();
            Carga carga = new Carga(pasajero, peso);
            vuelo.agregarCarga(carga);
            pasajero.addVuelo(vuelo);
            String mensaje = "Disponibilidad:" + (peso+1) + " comprada exitosamente";
            JOptionPane.showMessageDialog(this.vista, mensaje, "Exito", JOptionPane.YES_OPTION);
            vista.dispose();
        }

    }

}

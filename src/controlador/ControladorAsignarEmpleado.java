package controlador;

import modelo.*;
import vista.VentanaAsignarEmpleado;
import vista.VentanaCantidadCarga;
import vista.VentanaEnvioCarga;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorAsignarEmpleado extends Controlador{

    private VentanaAsignarEmpleado vista;


    public ControladorAsignarEmpleado(SistemaSingleton sistema, VentanaAsignarEmpleado vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource().equals(vista.getAsignarButton())){
            int indexEmpleado = vista.getEmpleadosComboBox().getSelectedIndex();
            int indexVuelo = vista.getVuelosComboBox().getSelectedIndex();
            Empleado empleado = vista.aerolinea.getEmpleados().get(indexEmpleado);
            Vuelo vuelo = sistema.getVuelos().get(indexVuelo);
            vuelo.getTripulacion().add(empleado);
            empleado.addVuelo(vuelo);
            JOptionPane.showMessageDialog(this.vista,"Empleado asignado", "Exito", JOptionPane.YES_OPTION);
            vista.dispose();
        }
    }

}

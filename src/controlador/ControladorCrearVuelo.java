package controlador;

import modelo.*;
import vista.VentanaCrearVuelo;

import javax.swing.*;
import java.awt.event.ActionEvent;

public class ControladorCrearVuelo extends Controlador{

    private VentanaCrearVuelo vista;

    public ControladorCrearVuelo(SistemaSingleton sistema, VentanaCrearVuelo vista) {
        super(sistema);
        this.vista = vista;
        this.vista.setController(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        Aerolinea aerolinea = vista.getAerolinea();
        String tipoVuelo = vista.getComercialRadioButton().isSelected() ? "comercial" : "carga";
        String idVuelo = vista.getIdVueloTextField().getText();
        int idxAvionSeleccionado = vista.getAvionComboBox().getSelectedIndex();
        Avion avion;

        if(vista.getComercialRadioButton().isSelected()){
            avion = vista.getAerolinea().getAvionesPasajeros().get(idxAvionSeleccionado);
        }

        else{
            avion = vista.getAerolinea().getAvionesCarga().get(idxAvionSeleccionado);
        }

        int idxCiudadOrigen = vista.getOrigenComboBox().getSelectedIndex();
        int idxCiudadDestino = vista.getDestinoComboBox().getSelectedIndex();

        if(idxCiudadOrigen == idxCiudadDestino){
            JOptionPane.showMessageDialog(vista, "Mismo Origen y Destino", "Error",
                    JOptionPane.ERROR_MESSAGE);
        }

        else {

            Ciudad origen = sistema.getCiudades().get(idxCiudadOrigen);
            Ciudad destino = sistema.getCiudades().get(idxCiudadDestino);

            Vuelo vuelo = VueloFactory.crearVuelo(tipoVuelo, idVuelo, aerolinea, avion, origen, destino);

            if (vuelo != null) {
                JOptionPane.showMessageDialog(this.vista, "Vuelo creado", "Exito", JOptionPane.YES_OPTION);
            }

            vista.getAerolinea().agregarVuelo(vuelo);
        }


    }
}

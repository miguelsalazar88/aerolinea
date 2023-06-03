package vista;

import controlador.Controlador;
import modelo.*;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaComprarVuelos extends Ventana{

    private Controlador controlador;
    private Pasajero pasajero;
    private ArrayList<VueloComercial> vuelos;
    private String[] columnas;
    private JTable tablaVuelos;
    private JScrollPane scrollPane;

    private JButton comprarButton;

    public VentanaComprarVuelos(String title, Pasajero pasajero) throws HeadlessException {
        super(title);
        this.pasajero = pasajero;
    }


    @Override
    public void initComponents() {
        this.columnas = Utils.columnasInfoVuelos;
        this.vuelos = SistemaSingleton.getInstance().getVuelosComerciales();
        Object[][] data = new Object[vuelos.size()][4];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            data[i][0] = vuelo.getIdVuelo();
            data[i][1] = vuelo.getAerolinea().getNombre();
            data[i][2] = vuelo.getOrigen().getNombre();
            data[i][3] = vuelo.getDestino().getNombre();

        }

        tablaVuelos = new JTable(data, columnas);
        scrollPane = new JScrollPane(tablaVuelos);
        getContentPane().add(scrollPane,BorderLayout.CENTER);

        comprarButton = new JButton("Seleccionar Vuelo");
        getContentPane().add(comprarButton, BorderLayout.SOUTH);
        pack();

    }

    @Override
    public void setController(Controlador c) {
        controlador = c;
        comprarButton.addActionListener(controlador);
    }

    public JButton getComprarButton() {
        return comprarButton;
    }

    public JTable getTablaVuelos() {
        return tablaVuelos;
    }

    public ArrayList<VueloComercial> getVuelos() {
        return vuelos;
    }

    public Pasajero getPasajero() {
        return pasajero;
    }
}

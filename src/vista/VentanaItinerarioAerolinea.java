package vista;

import controlador.Controlador;
import modelo.Aerolinea;
import modelo.Utils;
import modelo.Vuelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaItinerarioAerolinea extends JFrame{

    private Controlador controlador;
    private Aerolinea aerolinea;
    private String[] columnas;
    private JTable tablaVuelos;

    private JScrollPane scrollpane;

    public VentanaItinerarioAerolinea(String title, Aerolinea usuario) throws HeadlessException {
        this.aerolinea = usuario;
        setTitle(title);
        initComponents();
        pack();
        setVisible(true);
    }

    public void initComponents() {
        columnas = Utils.columnasInfoVuelos;
        ArrayList<Vuelo> vuelos = aerolinea.getVuelos();
        Object[][] data = new Object[vuelos.size()][4];

        for (int i = 0; i < vuelos.size(); i++) {
            Vuelo vuelo = vuelos.get(i);
            data[i][0] = vuelo.getIdVuelo();
            data[i][1] = vuelo.getAerolinea().getNombre();
            data[i][2] = vuelo.getOrigen().getNombre();
            data[i][3] = vuelo.getDestino().getNombre();
        }

        tablaVuelos = new JTable(data,columnas);
        scrollpane = new JScrollPane(tablaVuelos);
        getContentPane().add(scrollpane, BorderLayout.CENTER);
        pack();

    }

    public void setController(Controlador c) {

    }
}


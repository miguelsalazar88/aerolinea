package vista;

import controlador.Controlador;
import modelo.SistemaSingleton;
import modelo.Usuario;
import modelo.Utils;
import modelo.Vuelo;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaItinerario extends JFrame{

    private Controlador controlador;
    private Usuario usuario;
    private String[] columnas;
    private JTable tablaVuelos;

    private JScrollPane scrollpane;

    public VentanaItinerario(String title, Usuario usuario) throws HeadlessException {
        this.usuario = usuario;
        setTitle(title);
        initComponents();
        pack();
        setVisible(true);
    }

    public void initComponents() {
        columnas = Utils.columnasInfoVuelos;
        ArrayList<Vuelo> vuelos = usuario.getVuelos();
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


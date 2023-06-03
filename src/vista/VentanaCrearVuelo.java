package vista;

import controlador.Controlador;
import modelo.Aerolinea;
import modelo.Avion;
import modelo.Ciudad;
import modelo.SistemaSingleton;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaCrearVuelo extends JFrame {

    private Aerolinea aerolinea;
    private Controlador controlador;

    private JComboBox<String> avionComboBox;
    private JComboBox<String> origenComboBox;
    private JComboBox<String> destinoComboBox;
    private JRadioButton comercialRadioButton;
    private JRadioButton cargaRadioButton;
    private JTextField idVueloTextField;
    private JButton crearVueloButton;

    public VentanaCrearVuelo(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
        // Inicializar los elementos del JFrame
        avionComboBox = new JComboBox<>();
        origenComboBox = new JComboBox<>();
        destinoComboBox = new JComboBox<>();
        comercialRadioButton = new JRadioButton("Comercial");
        cargaRadioButton = new JRadioButton("Carga");
        idVueloTextField = new JTextField();
        crearVueloButton = new JButton("Crear Vuelo");

        // Configurar el JFrame
        setTitle("Crear Vuelo");
        setSize(400, 300);
        setLayout(new GridLayout(7, 2));

        // Agregar elementos al JFrame
        add(new JLabel("Tipo de Vuelo:"));
        add(new JPanel()); // Espacio vacío
        add(comercialRadioButton);
        add(new JPanel()); // Espacio vacío
        add(new JLabel(""));
        add(new JPanel()); // Espacio vacío
        add(cargaRadioButton);
        add(new JPanel()); // Espacio vacío
        add(new JLabel("Avión:"));
        add(avionComboBox);
        add(new JLabel("Ciudad de Origen:"));
        add(origenComboBox);
        add(new JLabel("Ciudad de Destino:"));
        add(destinoComboBox);
        add(new JLabel("ID de Vuelo:"));
        add(idVueloTextField);
        add(new JLabel(""));
        add(crearVueloButton);

        // Agrupar los botones de radio para que solo se pueda seleccionar uno a la vez
        ButtonGroup tipoVueloGroup = new ButtonGroup();
        tipoVueloGroup.add(comercialRadioButton);
        tipoVueloGroup.add(cargaRadioButton);

        getCiudades();

        // Agregar ActionListener a los botones de radio
        comercialRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getAvionesComerciales();
            }
        });

        cargaRadioButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getAvionesCarga();
            }
        });

        setVisible(true);
    }

    public void getAvionesComerciales() {
        avionComboBox.removeAllItems();
        ArrayList<Avion> aviones = aerolinea.getAvionesPasajeros();
        for (Avion avion: aviones) {
            avionComboBox.addItem(avion.getMarca());
        }
    }

    public void getAvionesCarga() {
        avionComboBox.removeAllItems();
        ArrayList<Avion> aviones = aerolinea.getAvionesCarga();
        for (Avion avion: aviones) {
            avionComboBox.addItem(avion.getMarca());
        }
    }

    public void getCiudades(){
        ArrayList<Ciudad> ciudades = SistemaSingleton.getInstance().getCiudades();
        for (Ciudad c: ciudades) {
            origenComboBox.addItem(c.getNombre());
            destinoComboBox.addItem(c.getNombre());
        }
    }

    public void setController(Controlador c){
        controlador = c;
        crearVueloButton.addActionListener(controlador);
    }

    public JComboBox<String> getAvionComboBox() {
        return avionComboBox;
    }

    public JComboBox<String> getOrigenComboBox() {
        return origenComboBox;
    }

    public JComboBox<String> getDestinoComboBox() {
        return destinoComboBox;
    }

    public JRadioButton getComercialRadioButton() {
        return comercialRadioButton;
    }

    public JRadioButton getCargaRadioButton() {
        return cargaRadioButton;
    }

    public JTextField getIdVueloTextField() {
        return idVueloTextField;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }
}



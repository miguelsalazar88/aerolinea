package vista;

import controlador.Controlador;
import modelo.Aerolinea;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;

public class VentanaDashboardAerolinea extends Ventana{

    public Aerolinea aerolinea;
    private Controlador controlador;
    private JPanel panel;
    private JLabel nameLabel;
    private JPanel buttonsPanel;
    private JButton verMapaButton;
    private JButton crearEmpleadoButton;
    private JButton crearVueloButton;
    private JButton miItinerarioButton;

    private JButton asignarEmpleadoButton;


    public VentanaDashboardAerolinea(String title, Aerolinea aerolinea) throws HeadlessException {
        super(title);
        this.aerolinea = aerolinea;
        setNameUsuario();
    }

    @Override
    public void initComponents() {
        panel = new JPanel(new BorderLayout());
        nameLabel = new JLabel("Nombre: ");
        panel.add(nameLabel, BorderLayout.NORTH);
        buttonsPanel = new JPanel(new GridLayout(3,3));
        crearVueloButton = new JButton("Crear Vuelo");
        buttonsPanel.add(crearVueloButton);
        crearEmpleadoButton = new JButton("Crear Empleado");
        buttonsPanel.add(crearEmpleadoButton);
        asignarEmpleadoButton = new JButton("Asignar Empleado");
        buttonsPanel.add(asignarEmpleadoButton);
        verMapaButton = new JButton("Ver Mapa");
        buttonsPanel.add(verMapaButton);
        miItinerarioButton = new JButton("Mi Itinerario");
        buttonsPanel.add(miItinerarioButton);
        panel.add(buttonsPanel, BorderLayout.CENTER);
        getContentPane().add(panel);
        setPreferredSize(new Dimension(800,600));
        pack();

    }

    @Override
    public void setController(Controlador c) {
        controlador = c;
        verMapaButton.addActionListener(controlador);
        miItinerarioButton.addActionListener(controlador);
        crearEmpleadoButton.addActionListener(controlador);
        crearVueloButton.addActionListener(controlador);
        asignarEmpleadoButton.addActionListener(controlador);
    }

    public void setNameUsuario(){
        Font font = nameLabel.getFont();
        Font newFont = font.deriveFont(font.getSize() + 16f);
        nameLabel.setFont(newFont);
        nameLabel.setText(aerolinea.getNombre());
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public JButton getVerMapaButton() {
        return verMapaButton;
    }

    public JButton getMiItinerarioButton() {
        return miItinerarioButton;
    }

    public JButton getCrearEmpleadoButton() {
        return crearEmpleadoButton;
    }

    public JButton getCrearVueloButton() {
        return crearVueloButton;
    }

    public JButton getAsignarEmpleadoButton() {
        return asignarEmpleadoButton;
    }
}

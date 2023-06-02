package vista;

import controlador.Controlador;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;

public class VentanaDashboardEmpleado extends Ventana{

    private Usuario usuario;

    private Controlador controlador;
    private JPanel panel;
    private JLabel nameLabel;
    private JPanel buttonsPanel;
    private JButton verMapaButton;
    private JButton miItinerarioButton;


    public VentanaDashboardEmpleado(String title, Usuario usuario) throws HeadlessException {
        super(title);
        this.usuario = usuario;
        setNameUsuario();
    }

    @Override
    public void initComponents() {
        panel = new JPanel(new BorderLayout());
        nameLabel = new JLabel("Nombre: ");
        panel.add(nameLabel, BorderLayout.NORTH);
        buttonsPanel = new JPanel(new GridLayout(1,1));
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
    }

    public void setNameUsuario(){
        Font font = nameLabel.getFont();
        Font newFont = font.deriveFont(font.getSize() + 16f);
        nameLabel.setFont(newFont);
        nameLabel.setText(usuario.getNombre() + " " + usuario.getApellido());
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public JButton getVerMapaButton() {
        return verMapaButton;
    }

    public JButton getMiItinerarioButton() {
        return miItinerarioButton;
    }
}


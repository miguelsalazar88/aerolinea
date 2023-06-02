package vista;

import controlador.Controlador;
import modelo.Usuario;

import javax.swing.*;
import java.awt.*;

public class VentanaDashboardUsuario extends Ventana{

    private Usuario usuario;

    private Controlador controlador;
    private JPanel panel;
    private JLabel nameLabel;
    private JPanel buttonsPanel;
    private JButton comprarVueloButton;
    private JButton verMapaButton;
    private JButton enviarCargaButton;
    private JButton miItinerarioButton;


    public VentanaDashboardUsuario(String title, Usuario usuario) throws HeadlessException {
        super(title);
        this.usuario = usuario;
        setNameUsuario();
    }

    @Override
    public void initComponents() {
        panel = new JPanel(new BorderLayout());
        nameLabel = new JLabel("Nombre: ");
        panel.add(nameLabel, BorderLayout.NORTH);
        buttonsPanel = new JPanel(new GridLayout(2,2));
        comprarVueloButton = new JButton("Comprar Vuelo");
        buttonsPanel.add(comprarVueloButton);
        verMapaButton = new JButton("Ver Mapa");
        buttonsPanel.add(verMapaButton);
        enviarCargaButton = new JButton("Enviar Carga");
        buttonsPanel.add(enviarCargaButton);
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
        comprarVueloButton.addActionListener(controlador);
        verMapaButton.addActionListener(controlador);
        enviarCargaButton.addActionListener(controlador);
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

    public JButton getComprarVueloButton() {
        return comprarVueloButton;
    }

    public JButton getVerMapaButton() {
        return verMapaButton;
    }

    public JButton getEnviarCargaButton() {
        return enviarCargaButton;
    }

    public JButton getMiItinerarioButton() {
        return miItinerarioButton;
    }
}

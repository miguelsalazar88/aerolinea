package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class VentanaPrincipal extends Ventana{

    private JButton btnMapa;
    private JButton btnUsuario;
    private JButton btnAerolinea;
    private JButton btnRegistrarse;
    private JButton btnComprar;

    public VentanaPrincipal(String title) throws HeadlessException {
        super(title);
        setSize(600,600);
        setLayout(new GridLayout(3,2));
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    @Override
    public void initComponents() {

        //Inicialización de Botones
        this.btnMapa = new JButton("Ver Mapa");
        this.btnUsuario = new JButton("Login Usuario");
        this.btnAerolinea = new JButton("Login Aerolínea");
        this.btnRegistrarse = new JButton("Registrarse");
        this.btnComprar = new JButton("Comprar Tiquetes");
        // Se agregan los botones a la Ventana
        this.add(btnMapa);
        this.add(btnUsuario);
        this.add(btnAerolinea);
        this.add(btnRegistrarse);
        this.add(btnComprar);

        btnMapa.setPreferredSize(new Dimension(200,100));
        btnUsuario.setPreferredSize(new Dimension(200,100));
        btnAerolinea.setPreferredSize(new Dimension(200,100));
        btnRegistrarse.setPreferredSize(new Dimension(200,100));
        btnComprar.setPreferredSize(new Dimension(200,100));
    }

    @Override
    public void setController(Controlador c) {
        controller = c;
        this.btnMapa.addActionListener(controller);
        this.btnUsuario.addActionListener(controller);
        this.btnAerolinea.addActionListener(controller);
        this.btnRegistrarse.addActionListener(controller);
        this.btnComprar.addActionListener(controller);
    }

    //Getters y Setters


    public JButton getBtnMapa() {
        return btnMapa;
    }

    public JButton getBtnUsuario() {
        return btnUsuario;
    }

    public JButton getBtnAerolinea() {
        return btnAerolinea;
    }

    public JButton getBtnRegistrarse() {
        return btnRegistrarse;
    }
    
    public JButton getBtnComprar() {
    	return btnComprar;
    }
}

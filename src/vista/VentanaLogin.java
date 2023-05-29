package vista;

import controller.ControllerLogin;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class VentanaLogin extends JFrame {

    private JPanel panel;
    private JTextField usuarioTextField;
    private JPasswordField contrasenaPasswordField;
    private JButton iniciarSesionButton;
    private JButton registrarseButton;
    private ControllerLogin controller;

    public VentanaLogin() {
        setTitle("Inicio de Sesión");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        initComponents();
        setVisible(true);
    }

    public void initComponents() {

        usuarioTextField = new JTextField();
        contrasenaPasswordField = new JPasswordField();
        iniciarSesionButton = new JButton("Iniciar Sesión");
        registrarseButton = new JButton("Registrarse");
        panel = new JPanel(new GridLayout(3,2));
        panel.add(new JLabel("Usuario:"));
        panel.add(usuarioTextField);
        panel.add(new JLabel("Contraseña:"));
        panel.add(contrasenaPasswordField);
        panel.add(iniciarSesionButton);
        panel.add(registrarseButton);
        add(panel);

    }

    public void setController(ControllerLogin c){
        controller = c;
        this.iniciarSesionButton.addActionListener(this.controller);
        this.registrarseButton.addActionListener(this.controller);
    }

    public String getUsernameField(){
        return usuarioTextField.getText();
    }

    public String getPasswordField(){
        return contrasenaPasswordField.getText();
    }

    public JButton getIniciarSesionButton() {
        return iniciarSesionButton;
    }

    public JButton getRegistrarseButton() {
        return registrarseButton;
    }
}

package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public class VentanaLogin extends Ventana{

    private JTextField usernameField;
    private JPasswordField passwordField;
    private JButton loginButton;

    private JLabel passwordLabel;
    private JLabel usernameLabel;

    private JPanel panel;

    public VentanaLogin(String title) throws HeadlessException {
        super(title);
    }

    @Override
    public void initComponents() {
        JPanel panel = new JPanel(new GridLayout(3, 2));

        panel = new JPanel(new GridLayout(3, 2));
        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();
        loginButton = new JButton("Login");

        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(loginButton);

        getContentPane().add(panel);
        pack();
    }

    @Override
    public void setController(Controlador c) {
        controller = c;
        loginButton.addActionListener(controller);
    }


    //Getters y Setters


    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JButton getLoginButton() {
        return loginButton;
    }
}

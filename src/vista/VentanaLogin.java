package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class VentanaLogin extends Ventana{

    private JTextField usernameField;
    private JPasswordField passwordField;

    public VentanaLogin(String title) throws HeadlessException {
        super(title);
    }

    @Override
    public void initComponents() {
        JPanel panel = new JPanel(new GridLayout(3, 2));

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField();

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField();

        JButton loginButton = new JButton("Login");
        loginButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = usernameField.getText();
                String password = new String(passwordField.getPassword());
                // Aquí puedes agregar la lógica de verificación de inicio de sesión
                System.out.println("Username: " + username);
                System.out.println("Password: " + password);
            }
        });

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
        // Aquí puedes asignar un controlador si es necesario
    }

}

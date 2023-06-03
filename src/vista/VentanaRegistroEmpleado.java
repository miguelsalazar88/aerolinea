package vista;

import controlador.Controlador;
import modelo.Aerolinea;
import modelo.Utils;

import javax.swing.*;
import java.awt.*;

public class VentanaRegistroEmpleado extends Ventana {

    private JPanel panel;
    private JLabel cargoLabel;
    private Aerolinea aerolinea;
    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel nombreLabel;
    private JLabel apellidoLabel;

    private JLabel salarioLabel;
    private JComboBox<String> tipoEmpleadoCBox;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField salarioField;
    private JButton registrarBtn;

    public VentanaRegistroEmpleado(String title) throws HeadlessException {
        super(title);
        setSize(400,400);
    }

    @Override
    public void initComponents() {
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        cargoLabel = new JLabel("Cargo:");
        tipoEmpleadoCBox = new JComboBox<>(Utils.cargos);
//        tipoEmpleadoCBox.setEnabled(false);
        usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);
        passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);
        nombreLabel = new JLabel("Nombre:");
        nombreField = new JTextField(20);
        apellidoLabel = new JLabel("Apellido:");
        apellidoField = new JTextField(20);
        salarioLabel = new JLabel("Salario:");
        salarioField = new JTextField(20);
//        salarioField.setEnabled(true);
//        salarioLabel.setVisible(true);
//        salarioField.setVisible(true);
        registrarBtn = new JButton("Registrarse");

        // Configuración de las restricciones del GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;

        gbc.gridy = 3;
        panel.add(cargoLabel, gbc);

        gbc.gridy = 4;
        panel.add(tipoEmpleadoCBox, gbc);

        gbc.gridy = 5;
        panel.add(usernameLabel, gbc);

        gbc.gridy = 6;
        panel.add(usernameField, gbc);

        gbc.gridy = 7;
        panel.add(passwordLabel, gbc);

        gbc.gridy = 8;
        panel.add(passwordField, gbc);

        gbc.gridy = 9;
        panel.add(nombreLabel, gbc);

        gbc.gridy = 10;
        panel.add(nombreField, gbc);

        gbc.gridy = 11;
        panel.add(apellidoLabel, gbc);

        gbc.gridy = 12;
        panel.add(apellidoField, gbc);

        gbc.gridy = 13;
        panel.add(salarioLabel,gbc);

        gbc.gridy = 14;
        panel.add(salarioField,gbc);

        gbc.gridy = 15;
        gbc.gridwidth = 2;
        panel.add(registrarBtn, gbc);

        add(panel);
    }

    @Override
    public void setController(Controlador c) {
        controller = c;
        this.registrarBtn.addActionListener(controller);
    }

    public JComboBox<String> getTipoEmpleadoCBox() {
        return tipoEmpleadoCBox;
    }

    public JTextField getUsernameField() {
        return usernameField;
    }

    public JPasswordField getPasswordField() {
        return passwordField;
    }

    public JTextField getNombreField() {
        return nombreField;
    }

    public JTextField getApellidoField() {
        return apellidoField;
    }

    public JTextField getSalarioField() {
        return salarioField;
    }

    public JButton getRegistrarBtn() {
        return registrarBtn;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public JLabel getCargoLabel() {
        return cargoLabel;
    }

    public void setCargoLabel(JLabel cargoLabel) {
        this.cargoLabel = cargoLabel;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }
}

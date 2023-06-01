package vista;

import controlador.Controlador;
import modelo.Constants;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemListener;

public class VentanaRegistro extends Ventana {

    private JPanel panel;
    private JLabel tipoLabel;
    private JLabel cargoLabel;

    private JLabel usernameLabel;
    private JLabel passwordLabel;
    private JLabel nombreLabel;
    private JLabel apellidoLabel;

    private JLabel salarioLabel;
    private ButtonGroup radioButtonGroup;
    private JRadioButton empleadoRadioButton;
    private JRadioButton pasajeroRadioButton;
    private JComboBox<String> tipoEmpleadoCBox;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JTextField salarioField;
    private JButton registrarBtn;

    public VentanaRegistro(String title) throws HeadlessException {
        super(title);
        setSize(400,400);
    }

    @Override
    public void initComponents() {
        panel = new JPanel(new GridBagLayout());
        GridBagConstraints gbc = new GridBagConstraints();
        panel.setBorder(BorderFactory.createEmptyBorder(10, 10, 10, 10));

        tipoLabel = new JLabel("Tipo usuario:");
        empleadoRadioButton = new JRadioButton("Empleado");
        pasajeroRadioButton = new JRadioButton("Pasajero");
        radioButtonGroup = new ButtonGroup();
        radioButtonGroup.add(empleadoRadioButton);
        radioButtonGroup.add(pasajeroRadioButton);
        cargoLabel = new JLabel("Cargo:");
        tipoEmpleadoCBox = new JComboBox<>(Constants.cargos);
        tipoEmpleadoCBox.setEnabled(false);
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
        salarioField.setEnabled(false);
        salarioLabel.setVisible(false);
        salarioField.setVisible(false);
        registrarBtn = new JButton("Registrarse");

        // Configuración de las restricciones del GridBagConstraints
        gbc.gridx = 0;
        gbc.gridy = 0;
        gbc.anchor = GridBagConstraints.WEST;
        panel.add(tipoLabel, gbc);

        gbc.gridy = 1;
        panel.add(empleadoRadioButton, gbc);

        gbc.gridy = 2;
        panel.add(pasajeroRadioButton, gbc);

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

        ItemListener rBtnListener = e -> {
            if (empleadoRadioButton.isSelected()) {
                tipoEmpleadoCBox.setEnabled(true);
                salarioField.setEnabled(true);
                salarioField.setVisible(true);
                salarioLabel.setVisible(true);

            } else {
                tipoEmpleadoCBox.setEnabled(false);
                salarioField.setEnabled(false);
                salarioField.setVisible(false);
                salarioLabel.setVisible(false);
            }
        };

        empleadoRadioButton.addItemListener(rBtnListener);
        pasajeroRadioButton.addItemListener(rBtnListener);
        add(panel);
    }

    @Override
    public void setController(Controlador c) {
        controller = c;
        this.registrarBtn.addActionListener(controller);
    }

    public JRadioButton getEmpleadoRadioButton() {
        return empleadoRadioButton;
    }

    public JRadioButton getPasajeroRadioButton() {
        return pasajeroRadioButton;
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
}

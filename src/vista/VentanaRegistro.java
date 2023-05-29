package vista;

import controller.ControllerRegistro;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class VentanaRegistro extends JFrame {
    private JRadioButton empleadoRadioButton;
    private JRadioButton passengerRadioButton;
    private JTextField usernameField;
    private JPasswordField passwordField;
    private JTextField nombreField;
    private JTextField apellidoField;
    private JComboBox<String> tipoEmpleadoComboBox;
    private JButton registrarButton;
    private ControllerRegistro controller;

    public VentanaRegistro() {
        setTitle("Registration");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JPanel panel = new JPanel(new GridLayout(12, 4));

        JLabel typeLabel = new JLabel("Tipo Usuario:");
        empleadoRadioButton = new JRadioButton("Empleado");
        passengerRadioButton = new JRadioButton("Pasajero");

        ButtonGroup typeButtonGroup = new ButtonGroup();
        typeButtonGroup.add(empleadoRadioButton);
        typeButtonGroup.add(passengerRadioButton);

        // Configurar el ComboBox
        JLabel categoryLabel = new JLabel("Category:");
        String[] categories = {"Piloto", "Co-piloto", "Tripulación"};
        tipoEmpleadoComboBox = new JComboBox<>(categories);
        tipoEmpleadoComboBox.setEnabled(false); // Desactivar por defecto

        JLabel usernameLabel = new JLabel("Username:");
        usernameField = new JTextField(20);

        JLabel passwordLabel = new JLabel("Password:");
        passwordField = new JPasswordField(20);

        JLabel nameLabel = new JLabel("Nombre:");
        nombreField = new JTextField(20);

        JLabel lastNameLabel = new JLabel("Apellido:");
        apellidoField = new JTextField(20);

        // Botón "Registrar"
        registrarButton = new JButton("Registrar");

        // Agregar los componentes al panel
        panel.add(typeLabel);
        panel.add(empleadoRadioButton);
        panel.add(new JLabel()); // Espacio en blanco para alinear los radiobuttons
        panel.add(passengerRadioButton);
        panel.add(categoryLabel);
        panel.add(tipoEmpleadoComboBox);
        panel.add(usernameLabel);
        panel.add(usernameField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(nameLabel);
        panel.add(nombreField);
        panel.add(lastNameLabel);
        panel.add(apellidoField);
        panel.add(registrarButton);

        // Manejar eventos de selección de los radiobuttons
        ItemListener radioButtonListener = new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                if (empleadoRadioButton.isSelected()) {
                    tipoEmpleadoComboBox.setEnabled(true);
                } else {
                    tipoEmpleadoComboBox.setEnabled(false);
                }
            }
        };

        empleadoRadioButton.addItemListener(radioButtonListener);
        passengerRadioButton.addItemListener(radioButtonListener);

        add(panel);

        setVisible(true);
    }

    public void setController(ControllerRegistro c){
        this.controller = c;
        this.registrarButton.addActionListener(this.controller);

    }

    public String getUsernameField(){
        return this.usernameField.getText();
    }

    public String getPasswordField(){
        return this.passwordField.getText();
    }

    public String getNombreField(){
        return this.nombreField.getText();
    }

    public String getApellidoField(){
        return this.apellidoField.getText();
    }

    public String getTipoEmpleadoCbo(){
        return this.tipoEmpleadoComboBox.getSelectedItem().toString();
    }

    public JButton getRegistrarButton() {
        return registrarButton;
    }
}



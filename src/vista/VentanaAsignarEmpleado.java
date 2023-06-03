package vista;

import controlador.Controlador;
import controlador.ControladorDashboardAerolinea;
import modelo.Aerolinea;
import modelo.Empleado;
import modelo.Vuelo;
import modelo.VueloComercial;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;


public class VentanaAsignarEmpleado extends JFrame {

    private Controlador controlador;
    private JPanel panel;
    public Aerolinea aerolinea;
    private JComboBox<Empleado> empleadosComboBox;
    private JComboBox<Vuelo> vuelosComboBox;
    private JButton asignarButton;

    public VentanaAsignarEmpleado(String title, Aerolinea a) throws HeadlessException {
        this.aerolinea=a;
        setTitle("Asignar Empleado");
        initcomponents();
        pack();
        setVisible(true);
    }

    public void initcomponents() {
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ArrayList<Empleado> empleados = aerolinea.getEmpleados();
        Empleado[] empleadosArray = empleados.toArray(new Empleado[empleados.size()]);
        empleadosComboBox = new JComboBox<>(empleadosArray);
        panel.add(empleadosComboBox);
        ArrayList<Vuelo> vuelos = aerolinea.getVuelos();
        Vuelo[] vuelosArray = vuelos.toArray(new Vuelo[vuelos.size()]);
        vuelosComboBox = new JComboBox<>(vuelosArray);
        panel.add(vuelosComboBox);
        asignarButton = new JButton("Asignar empleado");
        panel.add(asignarButton);
        getContentPane().add(panel);
    }

    public void setController(Controlador c){
        controlador = c;
        asignarButton.addActionListener(controlador);
    }

    public JButton getAsignarButton() {
        return asignarButton;
    }

    public JComboBox<Vuelo> getVueslosComboBox() {
        return vuelosComboBox;
    }
    public JComboBox<Empleado> getEmpleadsComboBox() {
        return empleadosComboBox;
    }

    public Controlador getControlador() {
        return controlador;
    }

    public void setControlador(Controlador controlador) {
        this.controlador = controlador;
    }

    public JPanel getPanel() {
        return panel;
    }

    public void setPanel(JPanel panel) {
        this.panel = panel;
    }

    public Aerolinea getAerolinea() {
        return aerolinea;
    }

    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

    public JComboBox<Empleado> getEmpleadosComboBox() {
        return empleadosComboBox;
    }

    public void setEmpleadosComboBox(JComboBox<Empleado> empleadosComboBox) {
        this.empleadosComboBox = empleadosComboBox;
    }

    public JComboBox<Vuelo> getVuelosComboBox() {
        return vuelosComboBox;
    }

    public void setVuelosComboBox(JComboBox<Vuelo> vuelosComboBox) {
        this.vuelosComboBox = vuelosComboBox;
    }

    public void setAsignarButton(JButton asignarButton) {
        this.asignarButton = asignarButton;
    }


}

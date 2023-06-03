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
    private JComboBox<String> empleadosComboBox;
    private JComboBox<String> vuelosComboBox;
    private JButton asignarEmpleadoButton;

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
        String[] empleadosArray = new String[empleados.size()];
        for (int i=0;i<empleadosArray.length;i++)
        {
            empleadosArray[i]=empleados.get(i).toString();
        }
        empleadosComboBox = new JComboBox<>(empleadosArray);
        panel.add(empleadosComboBox);
        ArrayList<Vuelo> vuelos = aerolinea.getVuelos();
        String[] vuelosArray = new String[vuelos.size()];
        for (int i=0;i<vuelosArray.length;i++)
        {
            vuelosArray[i]=vuelos.get(i).toString();
        }
        vuelosComboBox = new JComboBox<>(vuelosArray);
        panel.add(vuelosComboBox);
        asignarEmpleadoButton = new JButton("Asignar empleado");
        panel.add(asignarEmpleadoButton);
        getContentPane().add(panel);
    }

    public void setController(Controlador c){
        controlador = c;
        asignarEmpleadoButton.addActionListener(controlador);
    }

    public JButton getAsignarEmpleadoButton() {
        return asignarEmpleadoButton;
    }

    public JComboBox<String> getVueslosComboBox() {
        return vuelosComboBox;
    }
    public JComboBox<String> getEmpleadsComboBox() {
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

    public JComboBox<String> getEmpleadosComboBox() {
        return empleadosComboBox;
    }

    public void setEmpleadosComboBox(JComboBox<String> empleadosComboBox) {
        this.empleadosComboBox = empleadosComboBox;
    }

    public JComboBox<String> getVuelosComboBox() {
        return vuelosComboBox;
    }

    public void setVuelosComboBox(JComboBox<String> vuelosComboBox) {
        this.vuelosComboBox = vuelosComboBox;
    }

    public void setAsignarButton(JButton asignarButton) {
        this.asignarEmpleadoButton = asignarButton;
    }


}

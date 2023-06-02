package vista;

import controlador.Controlador;
import modelo.VueloComercial;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaSeleccionarSillas extends JFrame {

    private Controlador controlador;
    private JPanel panel;
    private VueloComercial vuelo;
    private JComboBox<Integer> asientoComboBox;
    private JButton seleccionarButton;

    public VentanaSeleccionarSillas(VueloComercial vuelo){
        this.vuelo = vuelo;
        setTitle("Seleccionar Asiento");
        initcomponents();
        pack();
        setVisible(true);
    }

    public void initcomponents(){
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        ArrayList<Integer> puestos = vuelo.getPuestosDisponibles();
        Integer[] puestosArray = puestos.toArray(new Integer[0]);
        asientoComboBox = new JComboBox<>(puestosArray);
        panel.add(asientoComboBox);
        seleccionarButton = new JButton("Seleccionar Asiento");
        panel.add(seleccionarButton);
        getContentPane().add(panel);

    }

    public void setController(Controlador c){
        controlador = c;
        seleccionarButton.addActionListener(controlador);
    }

    public JButton getSeleccionarButton() {
        return seleccionarButton;
    }

    public JComboBox<Integer> getAsientoComboBox() {
        return asientoComboBox;
    }
}

package vista;

import controlador.Controlador;
import modelo.VueloCarga;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;

public class VentanaCantidadCarga extends JFrame {

    private Controlador controlador;
    private JPanel panel;
    private VueloCarga vuelo;
    private JComboBox<Integer> cantidadCarga;
    private JButton seleccionarButton;

    public VentanaCantidadCarga(VueloCarga vuelo){
        this.vuelo = vuelo;
        setTitle("Cantidad de carga en Kg");
        initcomponents();
        pack();
        setVisible(true);
    }

    public void initcomponents(){
        panel = new JPanel();
        panel.setLayout(new FlowLayout());
        int pesoMaximo=vuelo.getPesoDisponible();
        ArrayList<Integer> pesos = new ArrayList<>();
        for (int i=0;i<pesoMaximo;i++)
        {
            pesos.add(i+1);
        }
        Integer[] pesosArray = pesos.toArray(new Integer[0]);
        cantidadCarga = new JComboBox<>(pesosArray);
        panel.add(cantidadCarga);
        seleccionarButton = new JButton("Seleccionar Carga");
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

    public JComboBox<Integer> getCantidadCarga() {
        return cantidadCarga;
    }
}

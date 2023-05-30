package vista;

import controller.ControllerMapa;
import modelo.Ciudad;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class VentanaMapa extends JFrame {

    private JButton startButton;
    private JButton stopButton;
    private PanelMapa panel = new PanelMapa();

    private ControllerMapa controller;

    public VentanaMapa(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        getContentPane().add(this.panel);
        pack();
        setVisible(true);
    }

    public void setController(ControllerMapa controllerMapa) {
        this.controller = controllerMapa;
    }

    public void start(){
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                panel.repaint();
            }
        });
        timer.start();
    }


}

package vista;

import controlador.Controlador;

import javax.swing.*;
import java.awt.*;

public abstract class Ventana extends JFrame {

    protected Controlador controller;

    public Ventana(String title) throws HeadlessException {

        setTitle(title);
        setVisible(true);
        initComponents();
        pack();
    }

    public abstract void initComponents();

    public abstract void setController(Controlador c);

}

package vista;

import controlador.Controlador;

import java.awt.*;

public class VentanaMapa extends Ventana{

    private PanelMapa panel;

    public VentanaMapa(String title) throws HeadlessException {
        super(title);
    }

    @Override
    public void initComponents() {
        panel = new PanelMapa();
        getContentPane().add(panel);
        pack();
    }

    @Override
    public void setController(Controlador c) {

    }

    public PanelMapa getPanel() {
        return panel;
    }
}

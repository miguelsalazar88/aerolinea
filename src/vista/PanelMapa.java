package vista;

import modelo.*;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class PanelMapa extends JPanel {

    private BufferedImage mapa;
    private BufferedImage avion;

    public PanelMapa(){
        this.mapa = ImageSingleton.getInstance().getMap();
        this.avion = ImageSingleton.getInstance().getPlane();
        Dimension size = new Dimension(mapa.getWidth(), mapa.getHeight());
        setPreferredSize(size);
    }
    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(mapa,0,0,null);
        ArrayList<VueloComercial> vuelos = SistemaSingleton.getInstance().getVuelosComerciales();
        for (Vuelo v: vuelos) {
            g.drawImage(avion, v.getUbicacion().getX(), v.getUbicacion().getY(),null);
            v.actualizarUbicacion();
        }
        ArrayList<Ciudad> ciudades = SistemaSingleton.getInstance().getCiudades();
        for (Ciudad c: ciudades) {
            g.setColor(Color.RED);
            g.fillOval(c.getCoordenadas().getX(),c.getCoordenadas().getY(),10,10);
        }

    }

    public void start(){
        Timer timer = new Timer(200, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                repaint();
            }
        });
        timer.start();
    }

}

package vista;

import controller.ControllerMapa;
import modelo.Ciudad;
import modelo.SistemaCreator;
import modelo.SistemaSingleton;
import modelo.Vuelo;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PanelMapa extends JPanel {
    private BufferedImage image;
    private SistemaSingleton sistema;

    private Vuelo v = SistemaCreator.pruebasVuelo();

    public PanelMapa(){
        this.sistema = SistemaSingleton.getInstance();
        try{
            String imagePath = "src/images/mapa.5.png";
            image = ImageIO.read(new File(imagePath));
            Dimension size = new Dimension(image.getWidth(), image.getHeight());
            setPreferredSize(size);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    protected void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image,0,0,null);
        for (Ciudad c: sistema.getCiudades()) {
            g.setColor(Color.RED);
            g.fillOval(c.getCoordenadas().getX(), c.getCoordenadas().getY(),10,10);
        }
        g.setColor(Color.BLUE);
        g.fillOval(v.getUbicacion().getX(),v.getUbicacion().getY(),10,10);
        v.actualizarUbicacion();
    }

}

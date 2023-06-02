package modelo;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class ImageSingleton {

    private BufferedImage plane;
    private BufferedImage map;
    private static ImageSingleton instance;

    private ImageSingleton(){
        try {
            plane = ImageIO.read(new File("src/images/airplane.png"));
            plane = resizeImage(plane, 20,20);
            map = ImageIO.read(new File("src/images/mapa.5.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static ImageSingleton getInstance(){
        if(instance == null){
            instance = new ImageSingleton();
        }
        return instance;
    }

    private BufferedImage resizeImage(BufferedImage originalImage, int width, int height) {
        BufferedImage resizedImage = new BufferedImage(width, height, BufferedImage.TYPE_INT_ARGB);
        Graphics2D g2d = resizedImage.createGraphics();
        g2d.drawImage(originalImage, 0, 0, width, height, null);
        g2d.dispose();
        return resizedImage;
    }

    public BufferedImage getPlane() {
        return plane;
    }

    public BufferedImage getMap() {
        return map;
    }
}

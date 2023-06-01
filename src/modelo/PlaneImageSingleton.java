package modelo;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PlaneImageSingleton {

    private BufferedImage image;
    private static PlaneImageSingleton instance;

    private PlaneImageSingleton(){
        try {
            image = ImageIO.read(new File("src/images/airplane.png"));
        } catch (IOException e){
            e.printStackTrace();
        }
    }

    public static PlaneImageSingleton getInstance(){
        if(instance == null){
            instance = new PlaneImageSingleton();
        }
        return instance;
    }

    public BufferedImage getImage() {
        return image;
    }
}

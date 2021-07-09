package model;
import java.awt.image.BufferedImage;

/**
 *
 * @author jorge
 */
public class Foto {
    BufferedImage imagen;
    String nombre;

    public Foto(BufferedImage imagen, String nombre) {
        this.imagen = imagen;
        this.nombre = nombre;
    }
}

package model;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author jorge
 */
public class Galeria {
    List<Foto> galeria = new ArrayList<Foto>();

    public List<Foto> getGaleria() {
        return galeria;
    }

    public void setGaleria(List<Foto> galeria) {
        this.galeria = galeria;
    }
    
}

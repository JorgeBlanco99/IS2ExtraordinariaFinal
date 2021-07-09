package model;

import java.util.List;

/**
 *
 * @author jorge
 */
public class Recorrido {
    private List <Elemento> elementos;
    
    public Recorrido(List <Elemento> elementos){
        this.elementos = elementos;
    }

    public Recorrido(Recorrido recorrido) {
    }

    public List<Elemento> getElementos() {
        return elementos;
    }

    public void setElementos(List<Elemento> elementos) {
        this.elementos = elementos;
    }
    
}

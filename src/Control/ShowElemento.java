package Control;

import model.Elemento;
import view.ElementoDisplay;

/**
 *
 * @author jorge
 */
public class ShowElemento implements Comand{
    private  ElementoDisplay elementoDisplay;
    private Elemento elemento;
   
    public ShowElemento(Elemento elemento, ElementoDisplay elementoDisplay) {
        this.elemento = elemento;
        this.elementoDisplay = elementoDisplay;
    }

    @Override
    public void execute() {
        //Mostrar el elemento
     
    }

}

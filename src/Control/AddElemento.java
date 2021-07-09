package Control;

import model.Elemento;
import model.Recorrido;
import view.ElementoDisplay;
import view.RecorridoDisplay;

/**
 *
 * @author jorge
 */

public class AddElemento implements Comand{
    private  Recorrido recorrido;
    private  ElementoDisplay elementoDisplay;
    private Elemento elemento;

        public AddElemento(Recorrido recorrido, ElementoDisplay elementoDisplay, Elemento elemento) {
            this.recorrido = recorrido;
            this.elementoDisplay = elementoDisplay;
            this.elemento = elemento;
        }
   

    

    @Override
    public void execute() {
        //Añdir el elemento al recorrido
       
    }

}

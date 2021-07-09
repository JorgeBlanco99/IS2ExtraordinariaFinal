package Control;

import model.Recorrido;
import view.RecorridoDisplay;

/**
 *
 * @author jorge
 */
public class ShowRecorrido implements Comand{
    private  RecorridoDisplay recorridoDisplay;
    private  Recorrido recorrido;
   

    public ShowRecorrido(Recorrido recorrido, RecorridoDisplay recorridoDisplay) {
        this.recorrido = recorrido;
        this.recorridoDisplay = recorridoDisplay;
    }

  

    @Override
    public void execute() {
        //mostrar el recorrido
        recorridoDisplay.display(recorrido);
    }
}

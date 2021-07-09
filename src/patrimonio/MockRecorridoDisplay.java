package patrimonio;

import model.Elemento;
import model.Recorrido;
import view.RecorridoDisplay;

/**
 *
 * @author jorge
 */
public class MockRecorridoDisplay implements RecorridoDisplay{

    @Override
    public void display(Recorrido recorrido) {
        for (Elemento elemento : recorrido.getElementos()) {
            System.out.println(elemento.toString());
        }
    }
    

}

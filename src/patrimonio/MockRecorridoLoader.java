package patrimonio;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import model.Elemento;
import model.Recorrido;
import view.RecorridoLoader;

/**
 *
 * @author jorge
 */
public abstract class MockRecorridoLoader implements RecorridoLoader {
    @Override
    public Recorrido load(){
        List<Elemento> recorrido = new ArrayList<>();
        Elemento el1 = new Elemento("calle luis doreste ", "antonio jose","ventosa", new Date(2015 ,12,20), "grafiti", "bueno", "Spray");
        Elemento el2 = new Elemento("calle juan doreste ", "jesus de leon","amor", new Date(2015 ,12,20), "escultura", "regular", "marmol");
        Elemento el3 = new Elemento("calle pedro doreste ", "antonio perez","luz", new Date(2015 ,12,20), "cuadro", "malo", "oleo");
        recorrido.add(el1);
        recorrido.add(el1);
        recorrido.add(el2);
        recorrido.add(el3);
        Recorrido recorrido1 = new Recorrido(recorrido);
        return recorrido1;
    }

}


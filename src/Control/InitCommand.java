package Control;
import java.util.HashMap;
import java.util.Map;
import model.Elemento;
import model.Recorrido;
import view.ElementoDisplay;
import view.RecorridoDisplay;

/**
 *
 * @author jorge
 */


public class InitCommand implements Comand{
    private final Map<String, Comand> commands =
            new HashMap<>();
    private final RecorridoDisplay recorridoDisplay;
    private final Recorrido recorrido;
    private final ElementoDisplay elementoDisplay;
    private final Elemento elemento;

    public InitCommand(RecorridoDisplay recorridoDisplay, Recorrido recorrido, ElementoDisplay elementoDisplay, Elemento elemento) {
        this.recorridoDisplay = recorridoDisplay;
        this.recorrido = recorrido;
        this.elementoDisplay = elementoDisplay;
        this.elemento = elemento;
    }

   

    
    @Override
    public void execute() {
        commands.put("SR", new ShowRecorrido(recorrido, recorridoDisplay));
        commands.put("SE", new ShowElemento(elemento, elementoDisplay));
        commands.put("AE", new AddElemento(recorrido,elementoDisplay,elemento));
    }
    
    public Map<String, Comand> getCommands() {
        return commands;
    }
    
}


package patrimonio;

import Control.Comand;
import Control.InitCommand;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import model.Elemento;
import model.Recorrido;
import view.ElementoDisplay;

/**
 *
 * @author jorge
 */
public class Main {

    private final static Comand NullCommand = new Comand.Null();
    private final Map<String, Comand> commands = new HashMap<>();
    private final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        new Main().execute();
    }
    
    public Main() {
        Recorrido recorrido = new MockRecorridoLoader().load();
        MockRecorridoDisplay recorridoDisplay = new MockRecorridoDisplay();
        recorridoDisplay.display(recorrido);
       //abrie que crear el nuevo elemento de similar  forma que el Recorrido
       //Elemento elemento = new Elemento();
       //y el display elemeto igual
       //para que se pudieran añadir elemento deberia  pasarselos al comand aqui
       //por eso da el error
        InitCommand init = new InitCommand(recorridoDisplay, recorrido);
        init.execute();
        commands.putAll(init.getCommands());
    }

    private String input() {
        return scanner.next().toUpperCase();
    }

    private void execute() {
        while (true) commands.getOrDefault(input(), NullCommand).execute();
    }
}

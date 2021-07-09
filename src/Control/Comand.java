package Control;

/**
 *
 * @author jorge
 */

public interface Comand {
    void execute();
    
    public static class Null implements Comand {
        @Override
        public void execute() { }
    }
}
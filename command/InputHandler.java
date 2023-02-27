/**
 * Class that gets the input form the user and calls a command depending on the input using a hashmap
 */
import java.util.HashMap;
public class InputHandler {
    private HashMap<String, Command> commands = new HashMap<String, Command>();
    private StopWatch watch;
    /**
     * Function will allow the program to take in the inputs by the user 
     * @author Trevor Seestedt
     */
    public InputHandler(StopWatch watch) {
        this.watch = watch;
        commands.put("1", new OneMinCommand(watch));
        commands.put("5", new FiveMinCommand(watch));
        commands.put("30", new ThirtySecCommand(watch));
    }
    /**
     * Function checks the inputs that the user enters
     * @author Trevor Seestedt
     */
    public boolean inputEntered(String data) {
        Command command = commands.get(data);
        if (command == null)
            return false; 
        command.execute();
        return true;
}
}

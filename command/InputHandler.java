package command;

import java.util.HashMap;
/**
 * A class that handles what the user inputs
 * @author Misyak
 */
public class InputHandler {
    private HashMap<String, Command> commands;

    /**
     * Creates the away to handle inputs by adding commands and strings to a HashMap
     * @param document The document where data will be stored
     */
    public InputHandler(Document document) {
        commands = new HashMap<String, Command>();
        commands.put("save", new SaveCommand(document));
        commands.put("view", new ViewCommand(document));
        commands.put("append", new AppendCommand(document));
        commands.put("write", new WriteCommand(document));
    }

    /**
     * Check if the key data is in our HashMap
     * @param data A string of what command the user entered
     */
    public void inputEntered(String data) {
        if(commands.get(data) != null) {
            commands.get(data).execute();
        }
    }
}

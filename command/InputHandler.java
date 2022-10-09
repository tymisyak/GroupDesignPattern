package command;

import java.util.HashMap;

public class InputHandler {
    private HashMap<String, Command> commands;

    public InputHandler(Document document) {
        commands.put("save", SaveCommand(document));
        commands.put("view", ViewCommand(document));
        commands.put("append", AppendCommand(document));
        commands.put("write", WriteCommand(document));
    }

    public void inputEntered(String data) {
        commands.get(data);
    }
}

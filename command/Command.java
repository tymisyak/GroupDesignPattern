package command;

/**
 * A command
 * @author Misyak
 */
public abstract class Command {

    protected Document document;

    /**
     * Creates a command
     * @param document Where the data will be affected by the commands
     */
    public Command(Document document) {
        this.document = document;
    }

    /**
     * Execution of the specific command
     * @return A string of the data in the document
     */
    public abstract String execute();
}
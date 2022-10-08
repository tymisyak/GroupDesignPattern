package command;
/**
 * a save command
 * @author jackson weems
 */
public class SaveCommand extends Command {
    /**
    ** creates the save command
     * @param doc where the data is saved
     */
    public SaveCommand(Document doc) {
        super(doc);
    }
    /**
     * saves a string version of the document
     * @return saves the document
     */
    public String execute() {
        return Document.save(); 
    }

}

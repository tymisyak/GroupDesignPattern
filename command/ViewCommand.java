package command;
/**
 * a view command
 * @author jackson weems
 */
public class ViewCommand extends Command {
    /**
     * creates the view command
     * @param doc where the data is viewed
     */
    public ViewCommand(Document doc) {
        super(doc);
    }
    /**
     * gets a String version of the document
     * @return data in the document
     */
    public String execute() {
        return Document.view(); 
    }
}

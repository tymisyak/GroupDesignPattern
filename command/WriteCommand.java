package command;

import java.util.Scanner;

/**
 * a write command
 * 
 * @author Mehdi Yassine
 */
public class WriteCommand extends Command {

    private Scanner in;

    /**
     * creates the write command
     * 
     * @param doc where the data is viewed
     */
    public WriteCommand(Document doc) {
        super(doc);
    }

    /**
     * gets a String version of the document
     * 
     * @return data in the document
     */
    public String execute() {
        return "The line was written to the file";
    }

}

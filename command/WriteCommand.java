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
        in = new Scanner(System.in);
    }

    /**
     * gets a String version of the document
     * 
     * @return data in the document
     */
    public String execute() {
        System.out.println("Enter text:");
        String line = in.nextLine();
        return document.write(line);
    }

}

package command;

import java.util.Scanner;

/**
 * a append command
 * 
 * @author Mehdi Yassine
 */
public class AppendCommand extends Command {
    private Scanner in;

    /**
     * creates the view command
     * 
     * @param doc where the data is viewed
     */
    public AppendCommand(Document doc) {
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
        return document.append(line);
    }
}

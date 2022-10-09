package command;

import java.util.ArrayList;
/**
 * Document class which stores the document the user creates
 * Written By Carter Risse
 */
public class Document {
private String fileName;
private ArrayList<String> lines;
    /**
     * Constructor method which sets the filename
     */
    public Document(String fileName) {
        fileName = this.fileName;
    }
    /**
     * This method is used to display the document the user is creating
     * @return returns the string format of the document
     */
    public String view()
    {
        String display = "__________________";
        for(int i = 0; i<lines.size();i++)
            display = display +"/n|     "+lines.get(i)+"     |";
        System.out.println("__________________");
        return display;
    }
    /**
     * This method adds another line with the users desired text to the document
     * @param line The new line being added to the document
     * @return Returns a string which tells the user that the lines were appended
     */
    public String append(String line)
    {
        lines.add(line);
        return "The line has been appended to the document";
    }
    /**
     * Adds a new line to the arraylist while removing the other lines present
     * @param line The line that the user wants to replace the previous text with
     * @return Returns assurance that the line was added and writen
     */
    public String write(String line)
    {
        lines.clear();
        lines.add(line);
        return "The line was written to the file";
    }
    /**
     * Saves the file the user has created
     * @return Returns a string that tells the user whether it saved or not
     */
    public String save()
    {
        if(FileManipulator.writeFile(fileName, lines))
        return "The file has been saved"; 
        else
        return "Sorry, we cannot save at this time";
    }

}
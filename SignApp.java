import java.util.*;

/**
 * Write a description of class SignApp here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SignApp
{
    public static void main(String[] args) {
        
    Scanner in = new Scanner(System.in);
    
    System.out.println("Enter message: ");
    String message = in.nextLine();
    
    System.out.println("Enter line width: ");
    int width = in.nextInt();
    
    Sign s = new Sign(message, width);
    
    System.out.println("You will need " + s.numberOfLines() + " lines to display this message.");
    
    System.out.println("Here are the lines separated by semicolons: ");
    System.out.println(s.getLines());
    
   }
}
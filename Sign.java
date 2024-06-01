
/**
 * Write a description of class Sign here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Sign
{
    private String message;
    private int width;
    public Sign(String m, int w){
        message = m;
        width = w;
    }
    public int numberOfLines(){
        int length = message.length();
        if(length == 0){
            return null;
        }
        if (length % width > 0){
            return length / width + 1;
        }
        
        return length / width;
    }
    public String getLines(){
        
        for(int i = 0; i < message.length(); i+=width){
            return message.substring(i, i +width) + ";";
        }
    }
}

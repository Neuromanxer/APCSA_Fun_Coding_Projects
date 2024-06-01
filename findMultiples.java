
/**
 * Write a description of class findMultiples here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class findMultiples extends mainMethod
{
    private int rows;
    private int columns;
    private int array [][];
    public findMultiples(int r, int c, int [][] arr){
        rows = r;
        columns = c;
        array = arr;
    }
    public List<Integer> findDivisors(int divisor)
    {
        ArrayList<Integer> list = new ArrayList<>();
        
        for(int i = 0; i < rows; i++){
            for (int j = 0; j < columns; j++){
                if (array[i][j] % divisor == 0){
                    list.add(array[i][j]);
                }
            }
        }
        return list;
    }
}

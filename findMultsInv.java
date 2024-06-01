
/**
 * Write a description of class findMultsInv here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class findMultsInv
{
    // instance variables - replace the example below with your own
    private ArrayList <Integer> list = new ArrayList<Integer>();
    private int divisor;
    /**
     * Constructor for objects of class findMultsInv
     */
    public int[][] array findMultsInv(ArrayList<Integer> list, int divisor)
    {
    super(list);
    for(int i = 0; i < list.length; i++){
        for(int j = 0; j < list.length; j++){
        if (list[i] % divisor){
            array[i][j] = list[i];
        }
    }
}
for (int a = 0; a < array.length; a++){
    for(int b = 0; b < array[0].length; b++){
        System.out.print(array[a][b] + ",")
    }
}

}
}

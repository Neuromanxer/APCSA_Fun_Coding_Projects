import java.util.*;

public class InverseFindMults{
    public static void main(String[] args) {
        // Create an ArrayList to store Integer values
        ArrayList<Integer> list = new ArrayList<Integer>();
        
        // Create a Scanner object to read input
        Scanner in = new Scanner(System.in);
        System.out.print("How many numbers? ");
        int quantity = in.nextInt();
        for (int i = 0; i < quantity; i++) {
            int n = (int)(Math.random()*50) + 1;
            list.add(n);
        }
        System.out.println("What is your divisor? ");
        int div = in.nextInt();
        System.out.println("Your numbers are: " + list);
        
        int[][] arr = new int[quantity][quantity];
        
        int[][] result = findDivisors2(list, div);
        
        System.out.println("Your divisors are " + result);
        
        
        
        
    }
    
    public static int [][] findDivisors2(ArrayList<Integer> list, int divisor)
    {
        int r = list.size();
        if (r % 2 == 1){
            r++;
        }
        int s = r / 2;
        int[][] arr = new int[s][s];
        for(int i = 0; i < (s); i++){
            for (int j = 0; j < (s); j++){
                int value  = list.get(arr[i][j]);
            }
        }
        return arr;
    }
}

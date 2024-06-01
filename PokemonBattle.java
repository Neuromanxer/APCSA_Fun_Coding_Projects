
/**
 * Write a description of class PokemonBattle here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
import java.util.*;
public class PokemonBattle
{
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        Pokemon[] pteam = new Pokemon[6];
        for( int i = 0; i < 6; i++){
            System.out.print("Enter your Pokemon's name" + (i+1) + ": ")
            String name = in.nextString();
            team[i] = new Pokemon(name);
        }
        System.out.print("Choose a Pokemon to fight (pick the number pokemon 1-6): ");
        int choice = scanner.nextInt() -1;
        if (choice < 0 
    }
}

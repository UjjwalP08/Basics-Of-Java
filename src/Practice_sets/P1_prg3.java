/**
 * write program which take input for user to his name and print some statements after print it
 * */

package Practice_sets;
import java.util.Scanner;

public class P1_prg3 {


    public static void main(String[] args) {

        System.out.println("Enter your Name");

        Scanner s= new Scanner(System.in);

        String str = s.next();

        System.out.println("Hello "+str+" have good day");
    }
}

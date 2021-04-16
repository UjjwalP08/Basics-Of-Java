/**
 * write program to find the your number is integer or not
 * */

package Practice_sets;
import java.util.Scanner;

public class P1_prg5 {

    public static void main(String[] args) {

        Scanner s=new Scanner(System.in);

        System.out.println("Enter a no");

        boolean a = s.hasNextInt();

        System.out.println(a);
    }

}

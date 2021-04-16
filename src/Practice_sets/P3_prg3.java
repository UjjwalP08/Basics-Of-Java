// Write the java program to fill the letter template which looks like below
// letter = "Dear |<name>| , Thanks lot"
// Replace the |<name>| with any name

package Practice_sets;

import java.util.Scanner;

public class P3_prg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String letter = "\"Dear |<name>| , Thanks lot\"";

        System.out.println("Enter a name which you want to insert in the letter template");
        String name = sc.next();

        System.out.println(letter.replace("|<name>|", name));
    }
}

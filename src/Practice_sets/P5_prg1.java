/**
 * Print star pattern
 * <p>
 * *****
 * ****
 * ***
 * **
 * *
 */
package Practice_sets;

import java.util.Scanner;

public class P5_prg1 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value ");
        int n = sc.nextInt();

        for (int i = n; 1 <= i; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*\t");
            }


            System.out.println();
        }


    }
}

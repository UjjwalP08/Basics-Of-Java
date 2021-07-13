/*
 * Write java Method to print below star pattern
 *   *
 *   * *
 *   * * *
 *   * * * *
 *   * * * * *
 *  */


package Practice_sets;

import java.util.Scanner;

public class P7_prg2 {
    static void star(int a) {

        for (int i = 1;i<=a;i++)
        {
            for (int j = 1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Value:-");
        int x = sc.nextInt();

        star(x);

    }
}

// Repeat 4th program of practice set 7 using recursion

package Practice_sets;

import java.util.Scanner;


public class P7_prg8 {

    static void star_recursion(int n) {
        if (n > 0) {
            star_recursion(n - 1);

            for (int i = 1; i <= n; i++) {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any value:- ");
        int a = sc.nextInt();

        star_recursion(a);

    }
}

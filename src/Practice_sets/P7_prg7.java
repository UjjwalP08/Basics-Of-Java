// Repeat 2nd program of practice set 7 using recursion

package Practice_sets;

import java.util.Scanner;

public class P7_prg7 {

    static void recursion_star(int n)
    {
        if (n > 0)
        {
            for (int i = n; i >= 1; i--)
            {
                System.out.print(" * ");
            }
            System.out.println();

            recursion_star(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any value:- ");
        int a = sc.nextInt();

        recursion_star(a);
    }
}


// Write the java method to print multiplication table of n number

package Practice_sets;

import java.util.Scanner;

public class P7_prg1 {

    static void table(int a)
    {
        for (int i=1;i<=10;i++)
        {
            System.out.println(a+" X "+i+" = "+(a*i));
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value:-");
        int x = sc.nextInt();

        table(x);
    }
}

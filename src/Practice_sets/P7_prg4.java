/*
* Print following pattern using java programing
*
*       * * * * *
*       * * * *
*       * * *
*       * *
*       *
*
* */


package Practice_sets;

import java.util.Scanner;
public class P7_prg4 {

    static void star(int x)
    {
        for(int i = x; i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print(" * ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value:-");
        int a = sc.nextInt();

        star(a);

    }
}

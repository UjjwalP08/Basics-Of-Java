// Write recursive function to calculate sum of fist n natural number

package Practice_sets;

import java.util.Scanner;

public class P7_prg3 {

    static double sum(double n)
    {
        if(n<=1)
        {
            return n;
        }
        else {
            return n + sum(n-1);
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any value:-");
        double a = sc.nextDouble();

        double b =sum(a);

        System.out.println("Sum of fist "+a+" number is "+b);

    }
}

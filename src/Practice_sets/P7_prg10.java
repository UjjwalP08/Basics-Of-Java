// Repeat 3rd program of practice set 7 using iterative approach

package Practice_sets;

import java.util.Scanner;

public class P7_prg10 {

    static double sum(double x)
    {
        double result = 0;
        for(int i = 1;i<=x;i++)
        {
            result += i;
        }

        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter any value");
        double a = sc.nextDouble();

        double b= sum(a);

        System.out.println("The sum of first "+a+" number is "+b);


    }
}

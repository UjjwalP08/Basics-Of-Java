
// Write function to convert celsius to fahrenheit

package Practice_sets;

import java.util.Scanner;

public class P7_prg9 {

    static double temp(double x)
    {
        return  ((9*x)/5) + 32;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any value:- ");
        double a = sc.nextDouble();

        double b =temp(a);
        System.out.println(a+" celsius is equal to "+b+" fahrenheit");
    }
}

//Evaluate given expression
package Practice_sets;

import java.util.Scanner;

public class P2_prg4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println();
        System.out.println("Your expression is (v*v-u*u)/(2*a*s)");
        System.out.println();

        System.out.println("Enter the value of v");
        float v = sc.nextFloat();

        System.out.println("Enter the value of u");
        float u = sc.nextFloat();

        System.out.println("Enter the value of a");
        float a = sc.nextFloat();

        System.out.println("Enter the value of s");
        float s = sc.nextFloat();

        float ans = (v * v - u * u) / (2 * a * s);

        System.out.println("Your answer is " + ans);
    }
}

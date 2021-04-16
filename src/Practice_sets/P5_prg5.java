// Write the java program to find the factorial  of given number
package Practice_sets;

import java.util.Scanner;

public class P5_prg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int fact =1;

        System.out.println("Enter Number that you want to find Factorial");
        int num = sc.nextInt();

        for (int i =1 ; i<=num ; i++)
        {
             fact = fact*i;
        }

        System.out.println(num+" factorial is "+ fact);
    }
}

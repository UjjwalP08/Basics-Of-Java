// Write the java program to sum of n even numbers

package Practice_sets;

import java.util.Scanner;


public class P5_prg2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        System.out.println("Enter value");
        int a = sc.nextInt();

        for (int i = 0;i<a;i++)
        {
            sum = sum +2*i;
//            System.out.print(2*i+"\t");
        }
        System.out.println("Sum of first "+a+" even no is "+sum);
    }
}

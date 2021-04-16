//Write java program to find the given year is leap year or not
package Practice_sets;

import java.util.Scanner;


public class P4_prg5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year");
        int year = sc.nextInt();

        if(year % 4==0 || year % 100==0 || year % 400==0)
        {
            System.out.println(year+" Year is Leap Year");
        }
        else
            System.out.println(year+" Year is Not Leap Year");

    }
}

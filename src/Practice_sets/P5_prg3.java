// Write the java program to print multiplication to given number up to 10
package Practice_sets;

import  java.util.Scanner;

public class P5_prg3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number which you want to print its multiplication table");
        int num = sc.nextInt();

        System.out.println("Your Multiplication Table of Number "+num+" is ");
        for ( int i =1; i<=10;i++)
        {
//            System.out.printf("Your Table %d*%d = %d\n",num,i,num*i);
            System.out.println("Your Table is  "+num+"*"+i+" = "+num*i);
        }

    }
}

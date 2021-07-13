package com.company;

// Recursion means function call it self
import java.util.Scanner;
public class No_22_Recursion {

    static int fact(int n) // Recursive approach
    {
        if(n==1 || n== 0)
        {
            return  1;
        }
        else
        {
            return (n*fact(n-1));
        }
    }

    static int fact1(int n) // Iterative approach
    {
        int result=1;
        for(int i= n;i>=1;i--)
        {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a Number:-");
        int a = sc.nextInt();
        int fa=fact(a);
        System.out.println(a+" factorial is "+fa);
        System.out.println();
        int fa1 = fact1(a);
        System.out.println(a+" factorial is "+fa1);



    }
}

// ~~~~~~~~~~~~~~~~~~~If else statements in java~~~~~~~~~~~~~~~~~~~~~~~~

package com.company;

import  java.util.Scanner;

public class If_else {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your age");
        int age = sc.nextInt();
        if (age > 18)
        {
            System.out.println("You are able to drive");
        }
        else
        {
            System.out.println("You aren't able to drive yet");
        }

    }
}

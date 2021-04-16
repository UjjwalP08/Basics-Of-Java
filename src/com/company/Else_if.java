// Else if statement use when we want use multiple condition in one conditional statement
package com.company;

import  java.util.Scanner;

public class Else_if {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter your age ");
        int age = sc.nextInt();
        if(age>18)
        {
            System.out.println("You are now adult");
        }
        else if(age == 18)
        {
            System.out.println("You are not now adult");
        }
        else
        {
            System.out.println("You are currently child now");
        }
    }
}

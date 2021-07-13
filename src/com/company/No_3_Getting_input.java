package com.company;

import java.util.Scanner;// Import Scanner class

// For read the input from user first we want to import that class

public class No_3_Getting_input {

    public static void main(String[] args) {
        System.out.println("Read to Input from User");

        Scanner s = new Scanner(System.in);
//  System.in means read the input into the keyboard

//        System.out.println("Enter 1st Value");
//        int a = s.nextInt(); // read integer as the input
//
//        System.out.println("Enter 2nd Value");
//        int b = s.nextInt();
//
//        int sum = a+b;
//
//        System.out.print("Sum of that no is ");
//        System.out.println(sum);

//        System.out.println("Enter 1st Decimal no");
//        float c = s.nextFloat(); // read decimal value as the input
//
//        System.out.println("Enter 2nd Decimal no");
//        float d = s.nextFloat(); // read decimal value as the input
//
//        float add = c + d;
//
//        System.out.print("Sum of that decimal no is ");
//        System.out.println(add);

//   Some time that help the check the given no data type

//        boolean b1=s.hasNextInt();// return true if no is integer otherwise return false
//        System.out.println(b1);


//          String str=s.next();// that code only return first word of the string
            String str=s.nextLine();// this code return whole string value
            System.out.println(str);


    }
}

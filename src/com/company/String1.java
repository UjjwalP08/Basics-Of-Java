/**
 * **************Strings in Java**************
 * <p>
 * In java string has special support so genreally string is class but according to special support we are use
 * the string as non-primitive data type
 */
package com.company;

import java.util.Scanner;

public class String1 {

    public static void main(String[] args) {

        String str = "This is my string";

        System.out.print("My string is = ");
        System.out.println(str);
        int a = 98;
        float b = 45.6f;
        System.out.printf("My variable a value is %d and variable b value is %f \n", a, b);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your string");
//        String s = sc.next(); // next only read your input first word of string
        String s = sc.nextLine(); // Line function read whole string
        System.out.println(s);

    }
}

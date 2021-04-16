package com.company;

import  java.util.Scanner;

public class Do_while_loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of a");
        int a = sc.nextInt();

        do {
            System.out.print(a+"\t");
            a++;
        }while (a>10);
    }
//    Do while loop is always at least execute one time even if the condition false
}

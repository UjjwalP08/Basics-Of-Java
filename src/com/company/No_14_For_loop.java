package com.company;

import  java.util.Scanner;

public class No_14_For_loop {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        int n = sc.nextInt();

        for (int i = 1; i<=n;i++)
        {
            System.out.print(i+"\t");
        }

    }
}

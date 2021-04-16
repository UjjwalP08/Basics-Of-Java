package com.company;

import java.util.Scanner;

public class While_loop {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Value of a");
        int a = sc.nextInt();

        while (a<10)
        {
            System.out.print(a+"\t");
            a++;
        }
    }
}

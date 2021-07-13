package com.company;

import java.util.Scanner;

public class No_15_Break_and_continue {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {

//            if(i == 3)
//            {
////                System.out.print(i+"\t");
//                break;
//            }

            if (i == 3) {
//                System.out.print(i+"\t");
                continue;
            }
            System.out.print(i + "\t");

        }

    }
}

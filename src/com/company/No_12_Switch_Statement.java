/**
 * when we want to use multiple choice in code , that time we are
 * use the switch statement in java
 */
package com.company;

import  java.util.Scanner;

public class No_12_Switch_Statement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a no between 1 to 4");
        int no = sc.nextInt();

//        switch (no)
//        {
//            case 1:
//                System.out.println("This is no 1");
//                break;
//            case 2:
//                System.out.println("This is no 2");
//                break;
//            case 3:
//                System.out.println("This is no 3");
//                break;
//            case 4:
//                System.out.println("This is no 4");
//                break;
//            default:
//                System.out.println("Enter correct no between 1 to 4");
//        }


//        Enhance Switch statements
//        In Enhance switch statement we not need to write the break statements
        switch (no) {
            case 1 -> System.out.println("This is no 1");
            case 2 -> System.out.println("This is no 2");
            case 3 -> System.out.println("This is no 3");
            case 4 -> System.out.println("This is no 4");
            default -> System.out.println("Enter correct no between 1 to 4");
        }

    }

}

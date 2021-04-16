/**
 * write program to find the percentage of student in 5 subject and take input from user
 * */



package Exercises;

import java.util.Scanner;

public class Exe1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter sub1 marks");
        float sub1=s.nextFloat();


        System.out.println("Enter sub2 marks");
        float sub2=s.nextFloat();

        System.out.println("Enter sub3 marks");
        float sub3=s.nextFloat();

        System.out.println("Enter sub4 marks");
        float sub4=s.nextFloat();

        System.out.println("Enter sub5 marks");
        float sub5=s.nextFloat();


        float percentage = (( (sub1+sub2+sub3+sub4+sub5))/500.0f)*100;

        System.out.println("Your percentage is "+percentage+"%");
    }
}

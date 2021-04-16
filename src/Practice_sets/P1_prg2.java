/**
 * write program to find cgpa of three subjects
 * */


package Practice_sets;

import java.util.Scanner;

public class P1_prg2 {
    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter sub1 marks");
        float sub1=s.nextFloat();

        System.out.println("Enter sub2 marks");
        float sub2=s.nextFloat();


        System.out.println("Enter sub3 marks");
        float sub3=s.nextFloat();

        float cgpa = (sub1+sub3+sub2)/30;

        System.out.println("Your Cgpa is "+cgpa);

    }
}

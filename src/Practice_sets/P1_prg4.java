/**
 * write program to convert kilometer into miles
 * */

package Practice_sets;

import java.util.Scanner;

public class P1_prg4 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter kilometer value which you want to convert in mile");
        float km = s.nextFloat();

        float km1 = km * 0.621f;

        System.out.println(km+" km  is equal to "+km1+" miles");


    }
}

// Random Function use to   Generate a integer or any floating point no
// Random function is inside the Random class so first we import random class to this program
package com.company;

import java.util.Random; // Importing Random Class

public class No_26_Random_func {
    public static void main(String[] args) {

        Random rd = new Random(); // Making Random class object

        int a = rd.nextInt(3); // Generate an integer no range between 0 to 3 but 0 is include and 3 exclude

        int b= rd.nextInt(); // Generate any integer number

        System.out.println(a);
        System.out.println(b);

    }
}

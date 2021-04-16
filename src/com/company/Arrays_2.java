package com.company;

public class Arrays_2 {

    public static void main(String[] args) {

        int [] marks = {23,32,45,23,77};

        // Length of Array
        System.out.println(marks.length);



        // Naive way to print the element of array
        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println(marks[3]);
        System.out.println(marks[4]);

        // Using loop
        for (int i = 0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }

        // Using Each loop

        int [] stud = {43,76,78,98,67};

        for(int element : stud)
        {
            System.out.println(element);
        }
    }

}

package com.company;

/**
 *  Array :- Set of the similar data type
 * array is start with index 0
 *
 * syntax:- data_type[ ]variable_name = new data_type[array size]
 *
 * */

public class Arrays {

    public static void main(String[] args) {
        /* Classroom of 500 students - You have to store marks of these 500 students
        You have 2 options:
        1. Create 500 variables
        2. Use Arrays (recommended)*/

//        Method 1 to declare and initialize the array

        int [ ]marks = new int[5];

        marks[0] = 45;
        marks[1] = 145;
        marks[2] = 5;
        marks[3] = 55;
        marks[4] = 895;

        // marks[5] = 96; - throws an error

        System.out.println(marks[0]);    //Array Traversal

        // 2. Declaration, memory allocation and initialization together
        int [] marks1 = {98, 45, 79, 99, 80};

        // 3. Declaration and then memory allocation
        // int [] marks;
        // marks = new int[5];





    }
}

package com.company;

public class No_18_Multi_dim_array {
    public static void main(String[] args) {
        int [][]arr = new int[2][3];

        // Adding an element in array
        arr[0][0]=43;
        arr[0][1]=434;
        arr[0][2]=34;
        arr[1][0]=4;
        arr[1][1]=3;
        arr[1][2]=5;

        for (int[] ints : arr) {
            for (int anInt : ints) {
                System.out.print(anInt);
                System.out.print("\t");
            }
            System.out.println();
        }




    }
}

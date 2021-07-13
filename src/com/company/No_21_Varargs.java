package com.company;

public class No_21_Varargs {

    /**
     * Suppose i want to make a method which is return the sum of 100 variable if we make the this way like
     *
     * static int sum(int a,int b .... up to 100 variables)
     *
     * that very lengthy method for it and visibility of code is gone in this
     * Worst case scenario we are use the Variable Arguments(varargs) for that
     *
     * Syntax:- static method_type method_name(int ...any_name)
     * here any_name is work as the array
     *
     * */

    static int sum(int ...marks) // Variable Arguments (var args)
    {
        int result = 0;

        for(int a:marks)
        {
            result += a;
        }
        return result;

    }

    static int sum1(int x,int ...marks) // Variable Arguments (var args) one arguments compulsory
    {
        int result = x;

        for(int a:marks)
        {
            result += a;
        }
        return result;

    }
    public static void main(String[] args) {

        System.out.println("The sum is "+sum()); // 0 Arguments
        System.out.println("The sum is "+sum(2,3)); // 2 Arguments
        System.out.println("The sum is "+sum(2,3,4)); // 3 Arguments
        System.out.println("The sum is "+sum(2,3,4,5)); // 4 Arguments
        System.out.println("The sum is "+sum(2,3,4,5,6)); // 5 Arguments

        System.out.println("The sum is "+sum1(5)); // we want to give one argument compulsory
        System.out.println("The sum is "+sum1(2,3)); // 2 Arguments
        System.out.println("The sum is "+sum1(2,3,4)); // 3 Arguments
        System.out.println("The sum is "+sum1(2,3,4,5)); // 4 Arguments
        System.out.println("The sum is "+sum1(2,3,4,5,6)); // 5 Arguments


    }
}

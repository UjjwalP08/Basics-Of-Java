package com.company;

public class No_19_Method {

    static int sum(int x,int y) // Using static keyword calling method
    {
        return x+y;
    }

    int diff(int x,int y) // without using static keyword
    {
        return x-y;
    }

    public static void main(String[] args) {
        int a=56;
        int b=34;

        int c=sum(a,b);

        System.out.println(c);

        No_19_Method obj = new No_19_Method(); // New to how to make object

        int d = obj.diff(a,b); // Using object calling method

        System.out.println(d);
    }
}

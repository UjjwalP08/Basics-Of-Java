/**
 * Operators use to perform operation on variable and its value
 * <p>
 * Types of Operators in Java
 * 1) Arithmetic Operators  + , - , / ,* , %
 * 2) Assignment Operators = , += , -= , *= , /=
 * 3) Comparison Operators == , <= , => , < , > , !=
 * 4) Logical Operators &&(and) , ||(or)
 * 5) Bitwise Operators &(Bitwise and) , |(Bitwise or)
 * 6) Increment and Decrement Operator ++ , --
 */

package com.company;

public class No_04_operatores {

    public static void main(String[] args) {
        System.out.println("Types Of Operators");

//        Arithmetic Operators
        int a = 8, b = 3;

        int c = a % b; // % this is modulo operator use to get the reminder of two no

        System.out.println(c);

        //        Assignment Operators
        int d = 45;
        //  here in this operators d=d+1 is same as d+=1

        d += 1;
        System.out.println(d);

        //        Comparison Operator

        int e = 98;

        System.out.println(e < 99);
        System.out.println(e > 99);
        //       Logical Operator
        // Logical and is work as and gate and Logical or is work as or gate
        System.out.println(78 < 90 && 98 > 90);
        System.out.println(78 < 9 && 98 > 90);
        System.out.println(78 < 9 || 98 > 90);
        //          Bitwise Operator
        //bitwise Operator work as the gate but that gate work for binary numbers
        System.out.println(3 & 2);
        System.out.println(3 | 2);

        //        Increment and Decrement Operator

        int i = 9;
        i++;

        System.out.println(i);

        System.out.println(++i);

        int j = 9;
        i--;

        System.out.println(i);

        System.out.println(--i);

        int k = 9;
        int p = k++;


        System.out.println(p);
        System.out.println(k);
        int m = 99;

        int q = ++m;


        System.out.println(q);
        System.out.println(m);
//        System.out.println(q);

        char o = 'A';
        o++;
        System.out.println(o);

        char t = 'A';
        t--;
        System.out.println(t);

    }
}

// For more information https://www.tutorialspoint.com/java/java_basic_operators.htm0
/*
 * Method Overriding:- If the child class implement same method with same parameters present in parent class again
 *,it is known as the Method overriding
 * */

package com.company;

class one{
    public void call()
    {
        System.out.println("I am one class call method");
    }
    public void get()
    {
        System.out.println("I am one clss get method");
    }
}

class two extends one{
    @Override // This annotation show that our method is overriding but if our method is not overriding and we use this annotation so it will produce an array
    public void call() // not change it's access modifier if you change it mean your method is not more longer overriding
    {
        System.out.println("I am two class call method");
    }
}

public class No_29_Method_Overriding {
    public static void main(String[] args) {
        one on = new one();
        on.call();

        two tw = new two();
        tw.call();
    }
}

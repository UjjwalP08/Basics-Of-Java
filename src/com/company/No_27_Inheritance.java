package com.company;

class base
{
    public int x;

    public int getX() {
        return x;
    }

    public void setX(int x) {

        System.out.println("Set the value of x in base class");
        this.x = x;
    }

    public void callx()
    {
        System.out.println("Call the value of x in base class");
    }

}

class  derive extends base
{
    public int y;

    public int getY() {
        return y;
    }

    public void setY(int y) {
        System.out.println("Set the value of y in derive class");
        this.y = y;
    }
}

public class No_27_Inheritance {
    public static void main(String[] args) {

        // Object of Base class
        base b1 = new base();
        b1.setX(45);
        System.out.println(b1.getX());
        b1.callx();
        System.out.println();

//        b1.setY(); // Give an error becoz parent class can-not use the property of child class

        // Object of Derive class
        derive d1 = new derive();
        d1.setX(4);
        System.out.println(d1.getX());
        d1.setY(445);
        System.out.println(d1.getY());

        d1.callx();

    }
}

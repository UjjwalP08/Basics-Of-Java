package com.company;

abstract class base2{ // Abstract class

    base2()
    {
        System.out.println("I am constructor of base class");
    }
    public void hello()
    {
        System.out.println("Hello word method is created");
    }
    abstract public void greet();// Abstract Method
    abstract public void meet();

}
class derive1 extends base2{
    @Override
    public void greet() {
        System.out.println("First time create class with using abstract class");
    }

    @Override
    public void meet() {
        System.out.println("hey how are you??");
    }
}
abstract class derive2 extends base2{ // abstract class
    public void th() {
        System.out.println("this is th method");
    }
}

public class No_31_Abstract_class_and_Method {
    public static void main(String[] args) {

//        base2 b2 = new base2() // Throw error
            derive1 d1 = new derive1();
//            derive2 d2 = new derive2(); // Throw error
    }
}
/**
 * we can't create an object of abstract class but we can create an object of class which is derived by an abstract class
 * generally abstract class use to create a class with the same method of abstract method as you can show in this program
 * */
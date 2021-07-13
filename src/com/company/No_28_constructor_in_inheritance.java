package com.company;

class base1{
    base1() // By default constructor without parameter is always call
    {
        System.out.println("I am constructor of base class");
    }
    base1(int x)
    {
        System.out.println("I am overloaded constructor of base class with value of x="+ x);
    }
}

class derived extends base1{ // Derived class in inherit the property of base1 class
    derived()
    {
        System.out.println("I am constructor of derived class");
    }

    derived(int x)
    {
        super(x); // Super keyword use to call the constructor with parameters
        System.out.println("I am overloaded constructor of derived class");
    }
    derived(int x,int y){
        super(x);
        System.out.println("I am overloaded constructor of derived class with value of y="+ y);
    }
}

class grand_derived extends derived{

    grand_derived(){
        System.out.println("I am constructor of grand_derived class");
    }
    grand_derived(int x,int y,int z)
    {
        super(x,y);
        System.out.println("I am overloaded constructor of grand_derived class with value of z="+ z);
    }

}

public class No_28_constructor_in_inheritance {
    public static void main(String[] args) {

//        base1 b1 = new base1();

//        derived d1 = new derived(); // If we not call base class constructor it is automatic firstly called by derived class
        // Then derived class constructor is called and it is called constructor without parameters

//        base1 b2 = new base1(5);
//        derived d2 = new derived(5);

//        grand_derived gd = new grand_derived();

        grand_derived gd1 = new grand_derived(4,5,6);
    }

}

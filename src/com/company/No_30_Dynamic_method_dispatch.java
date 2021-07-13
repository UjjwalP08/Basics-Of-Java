package com.company;

class Phone {

    public void type() {
        System.out.println("I am Phone");
    }

    public void feature() {
        System.out.println("I ma use for only calls");
    }

}

class Smartphone extends Phone {
    @Override
    public void type() {
        System.out.println("I am Smart Phone");
    }

    public void feature2() {
        System.out.println("I have all type of features");
    }
}

public class No_30_Dynamic_method_dispatch {
    public static void main(String[] args) {

//        Phone obj = new Phone();//Allow in java
//        Smartphone obj =new Smartphone();//Allow in java
//            obj.type()// Allow

        Phone ob = new Smartphone(); // Allow in Java

//        Smartphone ob2 = new Phone();// NOt allow in java

        ob.type();
        ob.feature();
    }
}
// In dynamic method dispatch we create object of sub class using super class reference
// here you show phone is super class reference and smartphone is sub class
// here we create smartphone object using phone class reference and this object only run
// super class method except overloading method.It run overloading method of subclass only
// In java object create in runtime not compile time
/**
 * Dynamic method dispatch is the mechanism in which a call to an overridden method is
 * resolved at run time instead of compile time. ... When a superclass reference is used to
 * call an overridden method, Java determines which version of the method to execute based on
 * \the type of the object being referred to at the time call.
 */
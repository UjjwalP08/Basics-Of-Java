package com.company;

class temp1{
    private  int id;

    private String name;
public temp1(){ // Constructor
    id =45;

    name="Enter-your-name";
}
public temp1(String n){ // Constructor
    id =4;
                            // Constructor overloading
    name=n;
}public temp1(String n , int i){ // Constructor
    id =i;

    name=n;
}

public void details()
        {
        System.out.println("Your name is "+name);

        System.out.println("Your id is "+ id);

    }
}

public class No_25_Constructor {
    public static void main(String[] args) {

        temp1 tp = new temp1();

        tp.details();
        System.out.println();

        temp1 tp1 = new temp1("Harry");

        tp1.details();
        System.out.println();

        temp1 tp2 = new temp1("Ujjwal Patel",96);

        tp2.details();

    }
}

package com.company;


class Employee {
    int id;

    int salary;

    String name;

    public void details()
    {
        System.out.println("Name is "+name);
        System.out.println("Id is " + id);
        System.out.println("Salary is " + salary);
    }
}

public class No_23_OOPS_1 {
    public static void main(String[] args) {
        System.out.println("Here we start to make our custom class");
        System.out.println();
        System.out.println();

        Employee ujjwal = new Employee(); // Creating an object from class
        Employee harry = new Employee();  // Creating an object from class

        // Setting Attributes from object
        ujjwal.name =  "Ujjwal Patel";
        ujjwal.id = 23;
        ujjwal.salary = 400000;

        // Setting Attributes from object
        harry.name = "Code With Harry";
        harry.id = 34;
        harry.salary = 8700000;

        ujjwal.details(); // Print details of object first way
        System.out.println();
        harry.details(); // Print detail of object first way

//        System.out.println("Name is "+ ujjwal.name);
//        System.out.println("Salary is "+ ujjwal.salary); // Print details of object 2nd way
//        System.out.println("Id is "+ ujjwal.id);




    }
}

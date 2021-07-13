package com.company;

class temp
{
    private int id;

    private String name;

     public void setName(String n) // Setter
     {
         this.name = n;
     }
     public void setId(int i) // Setter
     {
         this.id = i;

     }

     public int getId() // Getter
     {
         return id;
     }

     public String getName() // Getter
     {
         return  name;
     }

     public void detail()
     {
         System.out.println("Name is "+ name);

         System.out.println("Id is "+ id);
     }
}

public class No_24_Access_Modifires {
    public static void main(String[] args) {
        temp tp = new temp();

        tp.setId(45);
        tp.setName("Ujjwal Patel");
        tp.detail();

        System.out.println();

        System.out.println(tp.getId());
        System.out.println(tp.getName());

    }
}
/**
 * When we use private access modifier in program we can't access the object only with dot(.) operator
 *
 * for that we want to required setters and getter to access that variable of class
 * */
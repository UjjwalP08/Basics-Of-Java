package com.company;

public class No_20_Method_overloading {
//  case 1
//    static int change(int a){
//
//        a=98;
//
//        return a;
//    }


//    Case 2

//    static int change2(int [] array){
//
//        array[0] = 40;
//
//        return array[0];
//    }

    /** Methode Overloading
     *
     * Two or more method can have same name but different parameters such methods are  called as the Method Overloading
     * */

    static void meth()
    {
        System.out.println("That is Method 1");
    }

    static void meth(int a)
    {
        System.out.println("That is the Method 2 is "+a);       // here meth is example of method overloading
    }

    static void meth(int a,int b) // Here a and b is the parameter of the method
    {
        System.out.println("That is the Method 3 is "+a+" is "+b);
    }
    public static void main(String[] args) {

//      Case 1 when the actual value is not change
//        int x=43;
//        System.out.println(x);
//        change(x);
//        System.out.println(x);

//        Case 2
//        int arr[]={65,45,76,76,65};
//
//        System.out.println("Before Method call");
//        System.out.println("1st Element of an array is "+arr[0]);
//        System.out.println();
//        change2(arr);
//        System.out.println("After Method call");
//        System.out.println("1st Element of an array is "+arr[0]);

/**
 * In case 1 in the method which name is change 1 in there only the copy of variable is send not the actual value of variable send so that
 * we have no change reflect in actual variable
 *
 * But in case 2 we have an array in array we have an object which is store the address of that different element it means array is reference which store the
 * address not the actual value so that why when we call method(change 2) has passed the address or reference of that particular array that why we have
 * reflect the change in actual value
 * */

//            int a=34 ,b=8;

            meth();
            meth(34); // Method Overloading
            meth(49,65); // Here 49 and 65 are the Argument of the method


// Method overloading cannot perform only changing in return type of method

// Method overloading perform only changing happen in method parameter


    }
}

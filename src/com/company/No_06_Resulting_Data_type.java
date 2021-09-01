/**
   Resulting Data type after add or difference different type of data type
   R = s+i   --> int                                         R = Result , s= hort, b=byte , i=int , l=long , f=float , d=double , c=char
   R=s+b   --> int
   R=l+f   --> float
   R=i+f   --> float
   R=c+i   --> int
   R=c+s   --> int
   R=l+d   --> double
   R=f+d -->double
  */
package com.company;

public class No_06_Resulting_Data_type {

    public static void main(String[] args) {
        byte b=9;
        short s= 10;
        int i =11;
        long l=12L;
        float f=13.1f;
        double d=14.3;
        char c='1';


    }
}

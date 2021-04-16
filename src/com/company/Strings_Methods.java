package com.company;

public class Strings_Methods {

    public static void main(String[] args) {

        String str = "Ujjwal";
/**
 *  Index -----> 0 1 2 3 4 5
 *  String ---->U j  j  w a l
 * */
        System.out.println(str);

          // length() :- return the length of the string
        System.out.println(str.length());

         // toLowerCase() :- convert whole string to lower case
        System.out.println(str.toLowerCase());

        // toUpperCase() :- convert whole string to upper case
        System.out.println(str.toUpperCase());

        String str1 = "           Ujjwal          ";

        System.out.println(str1);

        // trim() :- remove extra white space in string and return the string
        System.out.println(str1.trim());

        // substring(int start) :- return  whole string from give int index
        System.out.println(str.substring(2));

        // substring(int start , int end) :- return string from given start index to end index
        // Where the start in include but end is exclude
        System.out.println(str.substring(1, 6));

        // replace(char , char) :- replace character  to given character  and return the string
        System.out.println(str.replace('w', 'a'));

        //replace(string , string) :- replace string to given string and return the string
        System.out.println(str.replace("wal", "wala"));

        System.out.println(str);

        //startsWith("string") :- return true if string is start with given string otherwise false
        System.out.println(str.startsWith("Uj"));
        System.out.println(str.startsWith("l"));


        //endsWith("string") :- return true if string is end with given string otherwise false
        System.out.println(str.endsWith("al"));
        System.out.println(str.endsWith("wa"));

        //charAt(int):- return the character at given index
        System.out.println(str.charAt(0));
        System.out.println(str.charAt(1));
        System.out.println(str.charAt(2));
        System.out.println(str.charAt(3));
        System.out.println(str.charAt(4));
        System.out.println(str.charAt(5));
        System.out.println(str.charAt(6));


          //indexOf("str") :-return the first index of string otherwise return -1
          //indexOf('ch') :-return the first index of character otherwise return -1
          //indexOf('ch' , int ) :-return the first index of character and start with given int index to find the first index value otherwise return -1
          //indexOf("str" , int ) :-return the first index of string and start with given int index to find the first index value otherwise return -1

        System.out.println(str.indexOf("wa"));
        System.out.println(str.indexOf('j'));
        System.out.println(str.indexOf('j', 2));
        System.out.println(str.indexOf("wa", 2));

          //lastIndexOf("str") :-return the last index of given string otherwise return -1
          //lastIndexOf('ch') :-return the last index of given character otherwise return -1
          //lastIndexOf('ch' , int ) :-return the last index of character and start with given int index to find the last index value otherwise return -1
          //lastIndexOf("str" , int ) :-return the last index of string and start with given int index to find the last index value otherwise return -1


        System.out.println(str.lastIndexOf('j'));
        System.out.println(str.lastIndexOf('w', 4));
        System.out.println(str.lastIndexOf("jwal"));
        System.out.println(str.lastIndexOf("wal", 3));

        //equals("str") :- return a true if given string is match with existing string otherwise return false (character case matters)
        System.out.println(str.equals("Ujjwal"));
        System.out.println(str.equals("ujjwal"));

        //equalsIgnoreCase("str") :- return a true if given string is match with existing string otherwise return false (character case  doesn't matters)
        System.out.println(str.equalsIgnoreCase("Ujjwal"));
        System.out.println(str.equalsIgnoreCase("ujjwal"));

//        Escape sequence characters
//        \t , \n , \' , \" ,\\
//          \t = tab
//        \n = new line
//        \" = print the  double quote
//        \\ = print the back slash
        System.out.println("This is my \" whole String \" \t now you can do which \t\\ which you want \\ ");

    }
}

package Practice_sets;

import  java.util.Scanner;

public class P4_prg2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Subject 1 marks");
        int sub1 = sc.nextInt();

        System.out.println("Enter Subject 2 marks");
        int sub2 = sc.nextInt();

        System.out.println("Enter Subject 3 marks");
        int sub3 = sc.nextInt();

        float total = ((sub1 + sub3 +sub2)/300.0f)*100.0f;

        System.out.println("Your Percentage is "+total+"%");

        if(total >= 40 && sub1 >=33 && sub2>=33 && sub3>=33)
        {
            System.out.println("You are Pass");
        }
        else {
            System.out.println("You are fail");
        }
    }
}

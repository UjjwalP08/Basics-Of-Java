package Practice_sets;

import java.util.Scanner;

public class P4_prg6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your website URL");
        String str = sc.next();

        if(str.endsWith(".com"))
        {
            System.out.println("Your website is Commercial Website");
        }
        else if (str.endsWith(".in"))
        {
            System.out.println("Your website is Indian Website");
        }
        else if(str.endsWith(".org"))
        {
            System.out.println("Your website is Organization Website");
        }
        else
        {
            System.out.println("Invalid URL");
        }

    }
}

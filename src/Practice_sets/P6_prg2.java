//write program give integer present in array or not

package Practice_sets;

import java.util.Scanner;

public class P6_prg2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []no={32,54,23,65,34,12};
        int check=0;

        System.out.println("Enter an integer:-");
        int a = sc.nextInt();

        for (int i=0; i<no.length;i++)
        {
            if(a == no[i])
            {
              check++;
            }

        }
        if(check == 0)
        {
            System.out.println("Integer not present in an array");
        }
        else
        {
            System.out.println("Integer present in an array");
        }



    }
}

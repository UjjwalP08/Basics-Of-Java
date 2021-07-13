// Print fibonacci series using recursion

package Practice_sets;

import java.util.Scanner;

public class P7_prg5 {

    static int fibo(int n){

        if(n==0 || n == 1)
        {
            return n;
        }
        else
        {
            return fibo(n - 1) + fibo(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any value:- ");
        int a= sc.nextInt();

//       int b =  fibo(a);

       for (int i =0;i<a;i++)
       {
           System.out.print(fibo(i)+",");
       }

    }
}

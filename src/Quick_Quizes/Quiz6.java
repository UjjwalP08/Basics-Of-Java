// Print fibonacci series using recursive and iterative approach both
// Fibonacci series :- 0,1,1,2,3,5....

package Quick_Quizes;


public class Quiz6 {

    static void fibo(int n)  // Iterative approach
    {
        int a = 0, b = 1, c;

        for (int i = 0; i < n; i++) {
            System.out.print(a + ",");

            c = a + b;
            a = b;
            b = c;

        }
    }

    static int fibo1(int n) { // Recursive approach
        if (n <= 1) {
            return n;
        } else {
            return fibo1(n - 1) + fibo1(n - 2);
        }
    }

    public static void main(String[] args) {
        fibo(8);
        System.out.println();


        for (int i = 0; i < 7; i++) { // Using Recursion
            int a = fibo1(i);
            System.out.print(a + ",");
        }
    }
}

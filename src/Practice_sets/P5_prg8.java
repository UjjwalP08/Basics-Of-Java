// Write the java program to find the sum of number occurring in 8 multiplication table
package Practice_sets;

public class P5_prg8 {
    public static void main(String[] args) {
        int n=8,sum=0;
        for ( int i =1; i<=10;i++)
        {
            sum += n*i;
        }
        System.out.println("Your sum is "+sum);
    }
}

// Write a function to find average of a set of numbers passed as argument

package Practice_sets;

public class P7_prg6 {

    static int avg(int ... no)
    {
        int result = 0;

        for(int x : no)
        {
            result += x;
        }

        return result/ no.length ;
    }

    public static void main(String[] args) {

        System.out.println("Average of 1 2 3 4 5 set number is "+avg(1,2,3,4,5));
        System.out.println("Average of 1 3 set number is  "+avg(1,3));


    }
}

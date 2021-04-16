//write java program to find maximum element in array

package Practice_sets;

public class P6_prg5 {
    public static void main(String[] args) {

        int []no={87,564,456,345,65};

        int max = 0;

        for(int i=0;i<no.length;i++)
        {
            if(max <= no[i])
            {
                 max = no[i];
            }
        }
        System.out.println("Maximum element of an array is "+max);

    }
}

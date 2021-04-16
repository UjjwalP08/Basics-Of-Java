// find minimum element in give an array

package Practice_sets;

public class P6_prg6 {
    public static void main(String[] args) {

        int []no={500,45,34,65,76};

        int min = no[0];

        for (int i=0;i<no.length;i++)
        {
            if(min>=no[i])
            {
                min = no[i];
            }

        }

        System.out.println("Minimum element of an array is "+min);

    }

}

// Write program to find average marks of student to givn an array

package Practice_sets;

public class P6_prg3 {
    public static void main(String[] args) {

        int []marks={45,49,43,44,43,45};
        float sum=0.0f;

        for(int element : marks)
        {
            sum = sum+element;
        }
        System.out.println("Average marks of student is "+sum/marks.length);
    }
}

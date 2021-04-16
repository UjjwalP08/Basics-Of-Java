//Create an array of 5 float element and find its element sum

package Practice_sets;

public class P6_prg1 {

    public static void main(String[] args) {

        float []arr = {32.5f,89.3f,12.5f,87.3f,90.5f};

        float sum=0;

        for (int i=0;i< arr.length;i++)
        {
            sum = sum + arr[i];
        }

        System.out.println("Array element sum is "+sum);
    }
}

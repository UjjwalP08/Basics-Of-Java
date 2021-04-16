// write java program to add 2 matrix size 2X3

package Practice_sets;

public class P6_prg4 {
    public static void main(String[] args) {

        int[][] mat1 = {{2, 3, 5}, {4, 5, 7}};

        int[][] mat2 = {{5, 6, 3}, {7, 8, 8}};

        int[][] result = {{0, 0, 0}, {0, 0, 0}};

        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                result[i][j] = mat1[i][j] + mat2[i][j];
            }

        }


        for (int i = 0; i < mat1.length; i++) {
            for (int j = 0; j < mat1[i].length; j++) {
                System.out.print(result[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }

    }
}

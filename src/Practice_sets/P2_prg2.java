/**
 * write a java program to encrypt a grade by adding 8 to it and Decrypt it show the correct grade
 */
package Practice_sets;

public class P2_prg2 {
    public static void main(String[] args) {
        char grade='B';
        // Encrypt grade
        grade = (char)(grade + 8);
        System.out.println(grade);

        // Decrypt grade
        grade = (char)(grade - 8);
        System.out.println(grade);

    }
}

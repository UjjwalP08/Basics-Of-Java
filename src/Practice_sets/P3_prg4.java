// Write the java program to detect the double and triple space in string
package Practice_sets;

public class P3_prg4 {
    public static void main(String[] args) {
        String myString = "This string contains double  and   triple spaces";
        System.out.println(myString.indexOf("  "));
        System.out.println(myString.indexOf("   "));
    }
}

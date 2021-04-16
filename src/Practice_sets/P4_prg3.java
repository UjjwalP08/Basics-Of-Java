/**
 * Write java program which is calculate the Salary paid by government after removing tex
 *              Salary              tax
 *          2.5L - 5.0L         5%
 *         5.0L - 10.0L      20%
 *         Above 10.0L     30%
 * */

package Practice_sets;

import java.util.Scanner;

public class P4_prg3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int tax;
        System.out.println("Enter Employee Salary");
        int salary = sc.nextInt();

        if (salary < 250000) {
            System.out.println("The Government paid " + salary + " to Employee");
        }
        else if (salary < 500000) {
            tax = (salary * 5) / 100;
            salary = salary - tax;
            System.out.println("The Government paid " + salary + " to Employee");

        }
        else if (salary < 1000000) {
            tax = (salary * 20) / 100;
            salary = salary - tax;
            System.out.println("The Government paid " + salary + " to Employee");
        }
        else {
            tax = (salary * 30) / 100;
            salary = salary - tax;
            System.out.println("The Government paid " + salary + " to Employee");

        }
    }
}

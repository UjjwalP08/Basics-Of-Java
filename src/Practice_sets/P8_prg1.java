/**
 * Create a class employee with following properties and methods
 * salary(integer and Property)
 * name (String and Property)
 * get_salary(Method and return salary)
 * get_name(Method and return name)
 * set_name(Method and change the name and return name)
 * */

package Practice_sets;

class Employee{

    String name ;

    int salary ;

    public String getName() {

        return name;
    }

    public int getSalary() {

        return salary;
    }

    public String setname(String n){

        return n;
    }

}

public class P8_prg1 {
    public static void main(String[] args) {

        Employee ujjwal = new Employee();
        Employee harry = new Employee();

        ujjwal.name = "Ujjwal Patel";
        ujjwal.salary = 89000;

        harry.name = "Code with Harry";
        harry.salary = 90000;

        System.out.println("\t \t Employee Details");
        System.out.println("Employee name is " + ujjwal.getName());
        System.out.println("Employee salary is " + ujjwal.getSalary());
        System.out.println();
        System.out.println();
        System.out.println("Employee name is " + harry.getName());
        System.out.println("Employee salary is " + harry.getSalary());


    }
}

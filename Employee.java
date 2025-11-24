import java.util.Scanner;

public class Employee {
    int emp_id;
    String emp_name;
    double basic_salary;

    public Employee(int id, String name, double basic) {
        this.emp_id = id;
        this.emp_name = name;
        this.basic_salary = basic;
    }

    public void calculateAndDisplayGross() {
        double hra = 0.10 * this.basic_salary;
        double da = 0.25 * this.basic_salary;
        double gross_salary = this.basic_salary + hra + da;

        System.out.println("\n");
        System.out.println("Employee ID: " + this.emp_id);
        System.out.println("Employee Name: " + this.emp_name);
        System.out.println("Basic Salary: " + this.basic_salary);
        System.out.println("HRA (10%): " + hra);
        System.out.println("DA (25%): " + da);
        System.out.println("\n");
        System.out.println("Gross Salary: " + gross_salary);
        System.out.println("\n");
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Employee ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter Employee Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Basic Salary: ");
        double basic = scanner.nextDouble();

        Employee emp = new Employee(id, name, basic);
        emp.calculateAndDisplayGross();

        scanner.close();
    }
}
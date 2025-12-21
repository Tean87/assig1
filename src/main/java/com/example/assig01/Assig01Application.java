import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        Human human = new Human(25, "Alex", true);
        human.sayHello();
        human.showStatus();

        System.out.println();

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee age: ");
        int age = scanner.nextInt();

        System.out.print("Is male (true/false): ");
        boolean isMale = scanner.nextBoolean();
        scanner.nextLine(); // очистка буфера

        System.out.print("Enter company name: ");
        String company = scanner.nextLine();

        System.out.print("Enter salary: ");
        float salary = scanner.nextFloat();

        Employee employee = new Employee(age, name, isMale, company, salary);

        employee.setSalary(employee.getSalary() + 500);

        employee.sayHello();
        employee.showStatus();

        System.out.println("Employee type: " + Employee.employeeType);

        System.out.println();

        Student student = new Student(18, "Tom", true, "AITU", 3.5f);
        student.sayHello();
        student.showStatus();

        scanner.close();
    }
}

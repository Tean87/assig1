public class Employee extends Human {

    private String company;
    private float salary;

    public static String employeeType = "Office worker";

    public Employee(int age, String name, boolean isMale, String company, float salary) {
        super(age, name, isMale);
        this.company = company;
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public void showStatus() {
        System.out.println(
                "I work at " + company + " and get this much money (i love money) " + salary
        );
    }
}

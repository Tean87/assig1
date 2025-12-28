public class Employee extends Human implements ICapability, IQualification {

    private String employeeId;

    public Employee(int age, String name, boolean isMale, String employeeId) {
        super(age, name, isMale);
        this.employeeId = employeeId;
    }

    @Override
    public void showStatus() {
        System.out.println(name + " is an employee with ID " + employeeId);
    }


    @Override
    public void activate() {
        System.out.println(name + " activated work mode");
    }

    @Override
    public void deactivate() {
        System.out.println(name + " deactivated work mode");
    }


    @Override
    public void qualify() {
        System.out.println(name + " is qualifying professionally");
    }

    @Override
    public void certify() {
        System.out.println(name + " received professional certificate");
    }
}


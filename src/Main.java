public class Main {
    public static void main(String[] args) {

        Student s1 = new Student(20, "Alice", true, "Uni1", 4.5f);
        Human h1 = new Student(21, "Bob", true, "Uni2", 3.8f);
        IQualification q1 = new Student(19, "Charlie", false, "Uni3", 4.0f);

        Employee e1 = new Employee(30, "David", true, "E001");
        Human h2 = new Employee(28, "Eva", false, "E002");
        ICapability c1 = new Employee(35, "Frank", true, "E003");

        s1.showStatus();
        s1.qualify();
        s1.certify();
        s1.showStudentId();
        s1.sayHello();

        System.out.println();

        h1.showStatus();
        h1.sayHello();

        System.out.println();

        q1.qualify();
        q1.certify();

        System.out.println();

        e1.showStatus();
        e1.activate();
        e1.deactivate();
        e1.qualify();
        e1.certify();
        e1.sayHello();

        System.out.println();

        c1.activate();
        c1.deactivate();
    }
}

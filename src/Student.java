public final class Student extends Human implements IQualification {

    private String university;
    private float gpa;
    private final String studentId = "S001";

    public Student(int age, String name, boolean isMale, String university, float gpa) {
        super(age, name, isMale);
        this.university = university;
        this.gpa = gpa;
    }

    public String getUniversity() {
        return university;
    }

    public void setUniversity(String university) {
        this.university = university;
    }

    public float getGpa() {
        return gpa;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    @Override
    public void showStatus() {
        System.out.println(
                name + " studies at " + university + " with GPA " + gpa
        );
    }

<<<<<<< HEAD
=======

>>>>>>> 9d3446cf488e0c77c82e0c0837ec0d63b615e7ac
    public final void showStudentId() {
        System.out.println("Student ID: " + studentId);
    }

    @Override
    public void qualify() {
        System.out.println(name + " is qualifying");
    }

    @Override
    public void certify() {
        System.out.println(name + " received certification");
    }
}
<<<<<<< HEAD
=======

>>>>>>> 9d3446cf488e0c77c82e0c0837ec0d63b615e7ac

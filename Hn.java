public class Human {

    private int age;
    private String name;
    private boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isMale() {
        return isMale;
    }

    public void setMale(boolean male) {
        isMale = male;
    }

    public void sayHello() {
        System.out.println("Hi, my actual real and unreal name is " + name);
    }

    public void showStatus() {
        System.out.println("I am just a human after all. Don't put ur blame on me");
    }
}

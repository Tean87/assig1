public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

    public abstract void showStatus();

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}


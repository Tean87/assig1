public abstract class Human {
    protected int age;
    protected String name;
    protected boolean isMale;

    public Human(int age, String name, boolean isMale) {
        this.age = age;
        this.name = name;
        this.isMale = isMale;
    }

<<<<<<< HEAD
=======

>>>>>>> 9d3446cf488e0c77c82e0c0837ec0d63b615e7ac
    public abstract void showStatus();

    public void sayHello() {
        System.out.println("Hello, my name is " + name);
    }
}
<<<<<<< HEAD

=======
>>>>>>> 9d3446cf488e0c77c82e0c0837ec0d63b615e7ac

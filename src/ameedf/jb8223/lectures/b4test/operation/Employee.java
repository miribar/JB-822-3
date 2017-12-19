package ameedf.jb8223.lectures.b4test.operation;

public class Employee {
    String title;

    public Employee(String title) {
        this.title = title;

    }

    public String describe() {
        return "I'm an employee and my title is " + this.title;
    }
}

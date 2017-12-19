package ameedf.jb8223.lectures.b4test.operation;

public class Manager extends Employee {
    String title;

    public Manager(String title) {
        super(title);
        this.title = super.title + "s Manager";
    }

    public String describe() {
        return "I'm a manager and my title is " + this.title;
    }

}

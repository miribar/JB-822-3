package ameedf.jb8223.lectures.b4test.operation;

public class SuperManager extends Manager {
    String title;

    public SuperManager(String title) {
        super(title);
        this.title = "Manager of " + super.title + "s";
    }

    public String describe() {
        return "I'm a super manager and I'm a " + this.title;
    }

}

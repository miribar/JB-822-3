package src.ameedf.jb8223.assignments.hw04;

import java.util.Random;

public class Person {

    final int id;
    String name;

    public Person() {
        Random newRandomNum = new Random();
        id = newRandomNum.nextInt(10_000);
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getName() + " was created with id " + getId();
    }
}

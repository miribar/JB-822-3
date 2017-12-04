package src.ameedf.jb8223.assignments.hw04;

public class Player extends Person implements Consumer {

    @Override
    public void consume() {
        //consumes the cards dealing
        System.out.println("I have my cards!");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

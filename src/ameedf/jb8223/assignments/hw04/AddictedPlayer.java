package src.ameedf.jb8223.assignments.hw04;

public class AddictedPlayer extends Player {

    private short amountOfDrugsOwned = 0;

    @Override
    public void consume() {
        amountOfDrugsOwned += 10;
        System.out.println("I have my drugs!");
    }

    @Override
    public String toString() {
        return this.getName();
    }
}

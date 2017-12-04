package src.ameedf.jb8223.assignments.hw04;

public class Santa implements Dealer {

    private int numOfToys;

    public Santa(int numOfToys) {
        this.numOfToys = numOfToys;
    }

    @Override
    public void deal(Consumer[] to) {
        System.out.println("Ho Ho Ho! Presents for all! Come and get them!");
        numOfToys--;
    }
}

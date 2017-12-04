package src.ameedf.jb8223.assignments.hw04;

public class CardsDealer extends Person implements Dealer {
    @Override
    public void deal(Consumer[] to) {
        //has a list of players to deal to
        for (Consumer consumer : to) {
            System.out.println(consumer + " got his cards!");
        }
    }
}

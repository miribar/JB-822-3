package src.ameedf.jb8223.assignments.hw04;

//has a list of players to deal to

import src.ameedf.jb8223.assignments.hw04.Dealer;
import src.ameedf.jb8223.assignments.hw04.Person;
import src.ameedf.jb8223.assignments.hw04.Player;

public class CardsDealer extends Person implements Dealer {

    public CardsDealer(String name) {
        super(name);
    }

    @Override
    public void deal(Object[] consumers) {
        System.out.println("\nCard dealer deals...");
        for (Object entity : consumers) {
            if (entity instanceof Player) {
                ((Player) entity).consume(false);
            }
        }
    }
}

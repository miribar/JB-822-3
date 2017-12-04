package src.ameedf.jb8223.assignments.hw04;

public class DrugsDealer extends Person implements Dealer {

    private short amountOfDrugs = 250;

    @Override
    public void deal(Consumer[] to) {
        // Has a list of AddictedPlayers to deal to, and a specific amount of drugs to deal (in grams).
        // Each addict will consume 10g each time. When there are no drugs to deal, the dealing action will do nothing
                if (amountOfDrugs > 0) {
                    amountOfDrugs -= 10;
                }

    }
}

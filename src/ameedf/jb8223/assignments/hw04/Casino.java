package src.ameedf.jb8223.assignments.hw04;

public class Casino {

    public void start() {
        Consumer[] consumers = new Consumer[2];

        //New players
        Player player = new Player();
        player.setName("Mark");
        consumers[0] = player;

        AddictedPlayer addictedPlayer = new AddictedPlayer();
        addictedPlayer.setName("Bobby");
        consumers[1] = addictedPlayer;

        //A new cards dealer
        CardsDealer cardsDealer = new CardsDealer();
        cardsDealer.setName("Sam");
        cardsDealer.deal(consumers);




        //A new drugs dealer
        DrugsDealer drugsDealer = new DrugsDealer();
        drugsDealer.setName("Johny");
        drugsDealer.deal(consumers);

        //One Santa
        Santa santaClaus = new Santa(4);
    }
}

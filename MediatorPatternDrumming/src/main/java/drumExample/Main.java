package drumExample;

public class Main {
    public static void main(String[] args) {
        Head head = new Head();
        Hand hand = new Hand();
        Leg leg = new Leg();
        Drum drum = new Drum();
        Mediator mediator = new Mediator(head, hand, leg, drum);

        head.setMediator(mediator);
        hand.setMediator(mediator);
        leg.setMediator(mediator);

        head.play(new Song("Unspeakable world", 2));
        head.play(new Song("House of Jade", 4));

    }
}
package drumExample;

public class Mediator {
    private Head head;
    private Hand hand;
    private Leg leg;
    private Drum drum;

    public Mediator(Head head, Hand hand, Leg leg, Drum drum) {
        this.head = head;
        this.hand = hand;
        this.leg = leg;
        this.drum = drum;
    }

    public void sendKick(){
        leg.kick();
    }

    public void sendHit(){
        hand.hit();
    }

    public void kick(){
        drum.BassSound();
    }

    public void hit(){
        drum.SnareSound();
    }

    public void rest() {
        hand.rest();
        leg.rest();
        drum.rest();
    }
}

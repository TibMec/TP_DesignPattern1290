package drumExample;

public class Hand {

    private Mediator mediator;

    public Hand() {
    }

    public void hit(){
        mediator.hit();
    }

    public void rest() {
        System.out.println("Hand is resting");
    }


    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

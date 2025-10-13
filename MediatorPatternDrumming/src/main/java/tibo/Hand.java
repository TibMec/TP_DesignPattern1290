package tibo;

public class Hand {
//    % = sans mediateur
    //    private Head head;
    //    private Drum drum;

    private Mediator mediator;

    public Hand() {
    }

    public void hit(){
//     %   drum.SnareSound();
        mediator.hit();
    }

    public void rest() {
        System.out.println("Hand is resting");
    }

//    Getters & setters

    //  %  Get & set for Head & Drum

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }
}

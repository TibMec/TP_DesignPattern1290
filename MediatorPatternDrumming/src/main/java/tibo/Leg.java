package tibo;

public class Leg {
//   % = sans mediateur:
    //   % private Head head;
    //   % private Drum drum;

    private Mediator mediator;

    public void kick(){
//   %     drum.BassSound();
        mediator.kick();
    }

//   % public Leg(Head head, Drum drum, Mediator mediator) {
//        this.head = head;
//        this.drum = drum;
//        this.mediator = mediator;
//    }

    public Leg() {
    }

//    Getters & setters
    //  %  get & set for Head & Drum

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void rest() {
        System.out.println("Leg is resting");
    }
}

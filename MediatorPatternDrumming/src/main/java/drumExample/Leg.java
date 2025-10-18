package drumExample;

public class Leg {


    private Mediator mediator;

    public void kick(){
        mediator.kick();
    }

    public Leg() {
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void rest() {
        System.out.println("Leg is resting");
    }
}

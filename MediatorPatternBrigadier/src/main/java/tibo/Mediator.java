package tibo;

public class Mediator implements IMediator {
    private Vehicule vehicule;
    private Ecolier ecolier;


    @Override
    public void avancer() {
        presence();
    }

    @Override
    public void arreter() {

    }

    @Override
    public void presence(Mouvement mouvement) {
//        if (mouvement == Ecolier) {
//
//        }
        System.out.println("Attention y a un "+ mouvement);
    }


}

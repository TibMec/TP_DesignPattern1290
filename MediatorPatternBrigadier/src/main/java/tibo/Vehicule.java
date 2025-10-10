package tibo;

public class Vehicule implements Mouvement {
    private static boolean isRunning;
    private static IMediator mediator;
//    private static boolean feuRouge; //presence d ecoliers


    public Vehicule() {
        this.isRunning = false;
        this.mediator = new Mediator();
    }

    public static void avancer() {
//        if (!feuRouge)

        mediator.avancer();
        isRunning = true;
        System.out.println("Vehicules avancent");
    }

    public static void arreter() {
        isRunning = false;
        mediator.arreter();
        System.out.println("Vehicules arretent");
    }

    public static boolean getIsRunning() {
        return isRunning;
    }

    public static void setIsRunninge(boolean isRunning) {
        Vehicule.isRunning = isRunning;
    }

    public static IMediator getMediator() {
        return mediator;
    }

    public static void setMediator(IMediator mediator) {
        Vehicule.mediator = mediator;
    }
}

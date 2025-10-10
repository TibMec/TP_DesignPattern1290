package tibo;

public class Ecolier implements Mouvement {
    private static boolean isCrossing;
    private static IMediator mediator;

    public Ecolier() {
        this.isCrossing = false;
        this.mediator = new Mediator();
    }

    public static void avancer() {
        if (!isCrossing)
        mediator.avancer();
        System.out.println("Ecoliers avancent");
    }

    public static void arreter() {
        mediator.arreter();
        System.out.println("Ecoliers arretent");
    }

    public static boolean isCrossing() {
        return isCrossing;
    }

    public static void setIsCrossing(boolean isCrossing) {
        Ecolier.isCrossing = isCrossing;
    }

    public static IMediator getMediator() {
        return mediator;
    }

    public static void setMediator(IMediator mediator) {
        Ecolier.mediator = mediator;
    }
}

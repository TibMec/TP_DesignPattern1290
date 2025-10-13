package tibo;

public class Head {
//    % = sans mediateur
//    private Hand hand;
//    private Leg leg;

    private Song song;
    private boolean soundsGood = true;
    private Mediator mediator;

    public Head() {
    }

//  %  public Head(Hand hand, Leg leg, Song song, boolean soundsGood, Mediator mediator) {
//        this.hand = hand;
//        this.leg = leg;
//        this.song = song;
//        this.soundsGood = soundsGood;
//        this.mediator = mediator;
//    }

    public boolean hear(){
        return soundsGood;
    }
    public void sendKick(){
//    %    leg.kick();
        mediator.sendKick();

    }
    public void sendHit(){
//    %    hand.hit();
        mediator.sendHit();
    }

    public void stop(){
        mediator.rest();
    }

    public void play(Song song){
        boolean songFinished = false;
        int i = song.getLength();
        System.out.println(String.format("Starting to play '%s' "+ song.getTitle()));
        while(!songFinished && soundsGood){
            mediator.sendKick();
            mediator.sendHit();
            mediator.sendKick();
            mediator.sendKick();
            mediator.sendHit();
            i--;
            if(i <= 0){
                songFinished = true;
                System.out.println(String.format("'%s' is finished.", song.getTitle()));
                this.stop();
            }
        }
    }

//    Getters & setters
    public Song getSong() {
        return song;
    }

    public boolean isSoundsGood() {
        return soundsGood;
    }

    public Mediator getMediator() {
        return mediator;
    }

    public void setMediator(Mediator mediator) {
        this.mediator = mediator;
    }

    public void setSong(Song song) {
        this.song = song;
    }
}

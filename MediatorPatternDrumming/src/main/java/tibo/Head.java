package tibo;

public class Head {

    private Song song;
    private boolean soundsGood = true;
    private Mediator mediator;


    public Head() {
    }

    public boolean hear(){
        return soundsGood;
    }

    public void sendKick(){
        mediator.sendKick();

    }
    public void sendHit(){
        mediator.sendHit();
    }

    public void stop(){
        mediator.rest();
    }

    public void play(Song song){
        boolean songFinished = false;
        int i = song.getLength();
        System.out.println(String.format("Starting to play '%s' ", song.getTitle()));
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

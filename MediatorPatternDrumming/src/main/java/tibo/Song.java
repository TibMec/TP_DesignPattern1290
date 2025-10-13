package tibo;

public class Song {
    private String title;
    private int length;

    public Song(String title, int length) {
        this.title = title;
        this.length = length;
    }

//    Getters & setters
    public String getTitle() {
        return title;
    }

    public int getLength() {
        return length;
    }

}

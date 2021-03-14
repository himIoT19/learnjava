package section8.linkedlist.challenge;

public class Song {
    private String title;
    private double duration;

    /***
     * Default constructor
     * @param title: Title of song
     * @param duration: Duration of song
     */
    public Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    /***
     * Getter
     * @return: title
     */
    public String getTitle() {
        return title;
    }

    /***
     * Overridden toString
     * @return: String(Title and duration of song)
     */
    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}

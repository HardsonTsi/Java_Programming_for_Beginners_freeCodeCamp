public class AudioBook extends Book {
    private int runTime;

    public AudioBook(int runTime) {
        this.runTime = runTime;
    }

    public AudioBook(String title, String author, int pageCount) {
        super(title, author, pageCount);
    }

    public int getRunTime() {
        return runTime;
    }

    public void setRunTime(int runTime) {
        this.runTime = runTime;
    }
}

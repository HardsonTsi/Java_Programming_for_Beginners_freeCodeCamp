public class Ebook extends Book {
    private String format;


    public Ebook(String format) {
        this.format = format;
    }

    public Ebook(String title, String author, int pageCount) {
        super(title, author, pageCount);
    }

    public String getFormat() {
        return format;
    }

    public void setFormat(String format) {
        this.format = format;
    }
}

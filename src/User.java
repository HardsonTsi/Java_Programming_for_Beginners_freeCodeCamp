import java.time.LocalDate;
import java.time.Period;
import java.util.ArrayList;

public class User {

    private String name;
    private LocalDate birthday;
    private ArrayList<Book> books = new ArrayList<>();

    public User() {
    }

    public User(String name, String birthday) {
        this.name = name;
        this.birthday = LocalDate.parse(birthday);
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public void setBooks(ArrayList<Book> books) {
        this.books = books;
    }

    public void borrow(Book book) {
        this.books.add(book);
    }

    @Override
    public String toString() {
        return String.format("%s was born back in %s and he is now %d years old.", this.getName(),
                this.getBirthday().toString(), this.age());
    }

    public int age() {
        int age = Period.between(this.getBirthday(), LocalDate.now()).getYears();
        return age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LocalDate getBirthday() {
        return birthday;
    }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }
}

public class Main {

    public static void main(String[] args) {

        User user = new User("TESSI Hardson", "2002-02-24");

        Book book = new Book("My father", "Hardson TESSI", 270);

        AudioBook audioBook = new AudioBook("Dracula", "Bram Stoker", 30000);

        user.borrow(book);

        System.out.println(user);
        System.out.printf("%s has borrowed these books: %s", user.getName(), user.getBooks().toString());

    }
}

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What is your name ?: ");
        String name = scanner.nextLine();

        System.out.printf("Hello %s how are you ?", name);

        scanner.close();

    }

}

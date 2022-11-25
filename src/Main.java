import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double double1 = scanner.nextDouble();

        System.out.print("Enter the secund number: ");
        double double2 = scanner.nextDouble();

        System.out.printf("first number = %f\n", double1);
        System.out.printf("secund number = %f\n", double2);

        //clean
        scanner.nextLine();

        System.out.print("What operation do you want to perform ?: ");
        String operation = scanner.nextLine();

        switch (operation) {
            case "sum":
                System.out.printf("%f + %f = %f", double1, double2, double1 + double2);
                break;
            case "sub":
                System.out.printf("%f - %f = %f", double1, double2, double1 - double2);
                break;
            case "mul":
                System.out.printf("%f * %f = %f", double1, double2, double1 * double2);
                break;
            case "div":
                if (double2 == 0) {
                    System.out.println("Can not divide by zero.");
                } else {
                    System.out.printf("%f / %f = %f", double1, double2, double1 / double2);

                }
                break;
            default:
                System.out.printf("%s is not a supported operation");
        }


        scanner.close();

    }

}

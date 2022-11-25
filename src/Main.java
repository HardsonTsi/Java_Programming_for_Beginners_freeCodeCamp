public class Main {

    public static void main(String[] args) {

        int number = 5;
        int multiplier = 1;

        //while
        while (multiplier <= 10) {
            System.out.printf("%d X %d = %d \n", number, multiplier, multiplier * number);
            multiplier++;
        }


        //do while
        do {
            System.out.printf("%d X %d = %d \n", number, multiplier, multiplier * number);
            multiplier++;

        } while (multiplier <= 10);


    }
}

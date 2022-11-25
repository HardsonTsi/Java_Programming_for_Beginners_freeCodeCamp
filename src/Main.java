public class Main {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5};

        int sum = 0;

        for (int number :
                numbers) {
            System.out.println(number);
            sum += number;
        }

        System.out.printf("sum = %d", sum);

    }
}

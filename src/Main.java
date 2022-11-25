import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5};

        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        //Deprecated
        //int copyOfNumbers[] = numbers;

        System.out.println(Arrays.equals(numbers, copyOfNumbers));

        //Deprecated
        System.out.println(numbers == copyOfNumbers);

    }

}

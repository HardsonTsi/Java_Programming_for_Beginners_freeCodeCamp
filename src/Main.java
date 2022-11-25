import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int numbers[] = {1, 2, 3, 4, 5};


        int copyOfNumbers[] = Arrays.copyOf(numbers, numbers.length);

        int startingIndex = 1;
        int endingIndex = 4;

        copyOfNumbers = Arrays.copyOfRange(numbers, startingIndex, endingIndex);

        //Deprecated
        //int copyOfNumbers[] = numbers;

        Arrays.fill(numbers, 0);

        System.out.println(Arrays.toString(numbers));
        System.out.println(Arrays.toString(copyOfNumbers));

    }

}

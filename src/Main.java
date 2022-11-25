import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char[] vowels = {'u', 'o', 'i', 'e', 'a'};

        int startingIndex = 1;
        int endingIndex = 4;

        Arrays.fill(vowels, startingIndex, endingIndex, 'x');

        System.out.println(Arrays.toString(vowels));

    }

}

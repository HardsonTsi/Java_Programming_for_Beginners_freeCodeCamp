import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char[] vowels = {'u', 'o', 'i', 'e', 'a'};

        Arrays.sort(vowels);

        int startingIndex = 1;
        int endingIndex = 4;

        char key = 'e';
        int foundItemIndex = Arrays.binarySearch(vowels, startingIndex, endingIndex, key);

        System.out.println(Arrays.toString(vowels));
        System.out.println(foundItemIndex);


    }

}

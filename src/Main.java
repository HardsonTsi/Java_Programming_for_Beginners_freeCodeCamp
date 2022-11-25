import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        char vowels[] = {'u', 'o', 'i', 'e', 'a'};


        //sort vowels
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));

        int startingIndex = 1;
        int endingIndex = 4;
        Arrays.sort(vowels, startingIndex, endingIndex);

        System.out.println(Arrays.toString(vowels));
        System.out.println(vowels.length);
    }

}

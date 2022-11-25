import java.util.ArrayList;
import java.util.Comparator;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);


        numbers.sort(Comparator.naturalOrder());
        System.out.println(numbers.toString());

        numbers.sort(Comparator.reverseOrder());
        System.out.println(numbers.toString());

        System.out.println(numbers.isEmpty());

        System.out.println(numbers.contains(Integer.valueOf(1)));

        System.out.println(numbers.size());

    }
}

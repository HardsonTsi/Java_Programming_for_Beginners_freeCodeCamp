import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        //remove index 2 value
        numbers.remove(2);
        //remove index 4 value
        numbers.remove(Integer.valueOf(4));

        //clear numbers
        numbers.clear();

        System.out.println(numbers.toString());

    }
}

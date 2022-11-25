import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> examScores = new HashMap<>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Bengali", 100);
        examScores.put("Computer programming", 100);

        examScores.forEach((key, value) -> {
            System.out.printf("%s --> %d\n", key, value);
        });

    }
}

import java.util.HashMap;

public class Main {

    public static void main(String[] args) {

        HashMap<String, Integer> examScores = new HashMap<>();

        examScores.put("Math", 75);
        examScores.put("Sociology", 85);
        examScores.put("English", 95);
        examScores.put("Bengali", 100);
        examScores.put("Computer programming", 100);

        examScores.putIfAbsent("Math", 70);

        examScores.replace("Math", 70);

        System.out.println(examScores.getOrDefault("Religion", 0));

        System.out.println(examScores);

        System.out.println(examScores.containsKey("Sociology"));
        examScores.remove("Sociology");

        System.out.println(examScores.containsValue(100));

        examScores.clear();

        System.out.println(examScores.size());

    }
}

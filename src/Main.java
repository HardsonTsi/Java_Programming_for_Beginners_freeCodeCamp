public class Main {

    public static void main(String[] args) {

        String name = "TESSI Hardson"; //%s
        String country = "Benin";
        int age = 20; //%d
        String company = "freeCodeCamp";
        double gpa = 3.8; //%f
        char percentSign = '%'; //%c
        boolean amITellingTheTruth = false; //%b

        String formattedString = String.format("Je suis %s vivant au %s. J'ai %s ans et je travaille chez %s.", name,
                country, age, company);
        System.out.println(formattedString);

        //Deprecated
     /*   System.out.println("Je suis " + name + " vivant au " + country + ". J'ai " + age + " ans et je travaille chez" +
                " " +
                company + ".");*/


    }

}

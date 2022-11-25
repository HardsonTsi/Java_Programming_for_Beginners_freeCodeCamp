public class Main {

    public static void main(String[] args) {

       String litteralString1 = "abc";
       String litteralString2  = "abc";

       String objectString1 = new String("xyz");
       String objectString2 = new String("xyz");

        System.out.println(litteralString1 == litteralString2);

        System.out.println(objectString1 == objectString2);

    }

}

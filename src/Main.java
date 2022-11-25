public class Main {

    public static void main(String[] args) {

        String string1 = new String("abc");
        String string2 = new String("abc");


        System.out.println(string1.equals(string2));
        string2 = "ABC";
        System.out.println(string1.equalsIgnoreCase(string2));

        //Deprecated
        //System.out.println(string1 == string2);





    }

}

package Lesson3_Conditional_Statements;

public class Praktika_22 {

    public static void main(String[] args) {


        System.out.println(inputNull("Salam"));

    }


    public static Character inputNull (String a ) {


        try {

            return a.charAt(2);
        }
//        catch (Exception exception) {
//
//            throw new CustomException ("Deyere null oturmek olmaz");
//        }

        finally {
            System.out.println("Deyer yalnishdir");
        }
    }

}

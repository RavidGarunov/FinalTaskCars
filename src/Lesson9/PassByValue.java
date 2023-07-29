package Lesson9;

public class PassByValue {

    public static void main(String[] args) {

        int a = 10 ;
        increment(a);

        System.out.println(a);


        increment(a);

    }


    public static void increment (int a ) {

        System.out.println(a++) ;
    }
}

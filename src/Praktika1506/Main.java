package Praktika1506;

public class Main {
    public static void main(String[] args) {

        printEqual(10 , -5 , 10 ); // Invalid value
        printEqual(10 , 10 , 10 ); // All equal
        printEqual(10 , 5 , 15 ); // All numbers different
        printEqual(10 , 5 , 10 ); // Neither equal nor different


    }



    public  static void printEqual (int a, int b , int c) {

        if (a < 0 || b <0 || c < 0 ){

            System.out.println("Invalid value");
        } else if ( a==b && b ==c ) {

            System.out.println("All numbers are equal");
        }
        else if ( a != b && b != c && a !=c) {

            System.out.println("All numbers are different");
        }

        else{
            System.out.println("neither equal nor different");
        }

    }

}

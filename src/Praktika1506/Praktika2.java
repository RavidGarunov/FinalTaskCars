package Praktika1506;

import static java.lang.Math.PI;
import static java.lang.Math.pow;

public class Praktika2 {

    public static void main(String[] args) {



        System.out.println(shouldWakeUp(true,2));


    }


    public static boolean shouldWakeUp ( boolean barking , int hourOfDay) {

        if (barking==true && (hourOfDay < 8  || hourOfDay >22 ) ){

            return true;
        }

        return false;

    }


    }


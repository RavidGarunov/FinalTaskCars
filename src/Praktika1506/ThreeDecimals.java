package Praktika1506;

public class ThreeDecimals {

    public static void main(String[] args) {

       System.out.println(areEqualByThreeDecimalPlaces(3.1806 , 4.1875));

    }


    public static boolean areEqualByThreeDecimalPlaces ( double a, double b )
    {
        a =  a *1000;
        b =  b *1000 ;

        if ((int) a %1000 == (int)b%1000){

            return true ;

        }
        return false;
    }
}

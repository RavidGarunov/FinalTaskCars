package Praktika1506;

public class MBandKB {
    public static void main(String[] args) {

        printMBandKB(5000);

    }

    public static void  printMBandKB ( int a ){

        int MB =  a / 1024 ;
        int KB =  a % 1024;

        if (a < 0 ){
            System.out.println("Invalid parameter");
        }
        else {
            System.out.println( MB + " Megabytes " + KB + " Kilobytes");
        }

    }

}

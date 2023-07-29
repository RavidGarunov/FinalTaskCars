package Praktika1506;

import com.sun.source.doctree.SeeTree;

public class Year {

    public static void main(String[] args) {

        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));

    }

    public static boolean isLeapYear ( int year){



        if (year== 1 || year>9999 ){
            return false;
        } else if (year%4==0) { //step 1
            if (year%100==0) { //step 2
                if (year%400==0){//step3
                    return  true;
            }
                else return false;
        }
            else return false;

    }       else return false;
}}

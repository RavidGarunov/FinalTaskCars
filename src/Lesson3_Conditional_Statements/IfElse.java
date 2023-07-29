package Lesson3_Conditional_Statements;

import java.util.Scanner;

public class IfElse {

    public static void main(String[] args) {

        Scanner sc  =  new Scanner(System.in);

        System.out.println("Ededi daxil edin :");

        String aa = sc.nextLine();

      int result =  aa.equals("Salam") ? 1 : aa.equals("Sagol") ? 2 : 0 ;

        System.out.println(result);



    }
}

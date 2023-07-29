package Lesson10;

import Lesson11_Inheritance.Teacher;

public class Main extends Teacher {

    public static void main(String[] args) {


        Main main = new Main();



        var cons = new Constructor(); // No args
        var cons2 = new Constructor("Ravid"); // 1 parametrli
        var cons3 =  new Constructor("Ravid","Garunov",28) ; // all args constructor
        System.out.println(cons3);


    }
}

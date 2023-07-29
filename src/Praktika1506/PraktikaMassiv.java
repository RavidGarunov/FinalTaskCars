package Praktika1506;

public class PraktikaMassiv {

    public static void main(String[] args) {


        int [] massiv = { 1 , 2 , 5 , 7 , 10 , 7 , 9 , 15 , 21  ,21, 10};



        for (int i = 0 ; i <massiv.length ; i++){

            for (int j = i+1;j<massiv.length;j++){
                if (massiv[i] == massiv[j]) {
                    System.out.println(massiv[i]);
                }

            }


        }


    }
}

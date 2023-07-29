import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     /*   int [] array = { 1 , 2 , 3 };

        System.out.println(array[0]);
        System.out.println(array[1]);
        System.out.println(array[2]);*/

//        int [] array = new int[3];

  //      System.out.println(array[0]);

      /*  String[] arrayString = new String[3];

        arrayString[0] = "Ravid";
        arrayString[1] = "Aysel";
        arrayString[2] = "Davud";

        System.out.println(arrayString);
        System.out.println(Arrays.toString(arrayString));*/

    /*    int [] array = {1 , 2 , 3 , 4 , 5};

        int startIndex = 0 ;
        int lastIndex = 4 ;

        while (startIndex<lastIndex){

            int temp = array[startIndex];
            array[startIndex]= array[lastIndex];
            array[lastIndex]= temp;
            startIndex++;
            lastIndex--;
        }

        System.out.println(Arrays.toString(array));*/


/*        int [] array = {1,2,3,4,5};
        Scanner sc = new Scanner(System.in);

        System.out.println("Axtardigimiz eded hansidir? ");

        int number = sc.nextInt();

        boolean daxildir = false;

        for ( int i = 0 ; i <array.length ; i++){
            if (number==array[i]){
                daxildir=true;
                break;
            }}

        System.out.println(daxildir);

          if (daxildir==true){
              System.out.println("Daxil etdiyiniz eded massive daxildir");
          }
          else {
              System.out.println("Daxil etdiyiniz eded massive daxil deyil");
          }*/

        int [] array = { 5 , 8 , 1 , 3 , 7};
         System.out.println("Evvel: " + Arrays.toString(array));

        Arrays.sort(array);

        System.out.println("Sonra: " + Arrays.toString(array));


        }
    }

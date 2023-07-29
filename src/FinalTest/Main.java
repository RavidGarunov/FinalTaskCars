package FinalTest;

//Car classi olacaq. Car domain class olacaq ve icerisinde bu deyishenleri saxlayacaq :
//        id, name, model, brand, releaseDate, color
//        ve servis methodlarimiz olacaq. Methodlar bunlardir :
//        createCar
//        getAllCars
//        getCarById
//        UpdateCarByName
//        DeleteCarById
//        car'larin hamsini bir listde saxlamaq lazimdir
//         Eger car tapilmasa throw CarNotFoundException atmaq lazimdir. Bu class custom exception class olacaq. yeni ozumuz yaratmaliyiq manual olaraq.


import java.sql.SQLOutput;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws NewException {



        while (true){
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter your operation from Menu :" + "\n 1.Add Cars" + "\n 2.Show All Cars" + "\n 3. Update Cars" + "\n 4. Delete Cars" );
            int operation = sc.nextInt();

            ServiceMethods serviceMethods =  new ServiceMethods();

            if (operation==1){
             serviceMethods.createCar();
            }
            else if (operation==2){
                System.out.println(serviceMethods.getAllCars());
            }
            else if (operation==3){
                System.out.println("Enter car name to update");
                String carname = sc.nextLine();
                serviceMethods.updateCarByName(carname);
            }
            else if (operation==4) {
                System.out.println("Enter car ID to delete");
                Integer ID = sc.nextInt();
                serviceMethods.deleteCardByID(ID);
            }
            else {
                System.out.println("Operation is wrong ");
            }

            }


    }



}

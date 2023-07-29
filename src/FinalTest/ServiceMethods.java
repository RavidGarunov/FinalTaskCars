package FinalTest;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.List;
import java.util.Scanner;

public class ServiceMethods {








    public void createCar() {

        Scanner sc = new Scanner(System.in);

        System.out.println("How many cars will you want to add?");
        int count = sc.nextInt();

        for (int i = 0 ; i <count; i++) {
            sc = new Scanner(System.in);

        System.out.println("Please enter details of Car ");
        System.out.println("Car name:");
        String name = sc.nextLine();
        System.out.println("Car model:");
        String model = sc.nextLine();
        System.out.println("Car brand:");
        String brand = sc.nextLine();
        System.out.println("Car color:");
        String color = sc.nextLine();
        System.out.println("Car Release date:");
        Integer releaseDate = sc.nextInt();
        System.out.println("Car ID:");
        Integer ID = sc.nextInt();


        Car car = new Car();

        car.setId(ID);
        car.setName(name);
        car.setModel(model);
        car.setBrand(brand);
        car.setReleaseDate(releaseDate);
        car.setColor(color);


        Config.cars.add(car);


    }}

    public List<Car> getAllCars() {
        return Config.cars;
    }


    public Car getCarByID(Integer ID) {



        for (int i = 0; i <= Config.cars.size(); i++) {

            if (ID.equals(Config.cars.get(i).getId())) {
                 return Config.cars.get(i);
            }
        }
        throw new RuntimeException("Car not found");
    }



    public void updateCarByName(String name) throws NewException {

        Scanner sc =  new Scanner(System.in);
            String oldname = sc.nextLine();
       try{ for (int i = 0; i <= Config.cars.size(); i++) {

            if (oldname.equals(Config.cars.get(i).getName())) {
               sc = new Scanner(System.in);
                String newName = sc.nextLine();
                 Config.cars.get(i).setName(newName);

                System.out.println("Car name updated successfully");
                break;
            }

            }}
        catch (Exception e) {
           throw new NewException("Car not found");
        }

        }


    public void deleteCardByID (Integer ID) throws NewException {

        try{for (int i = 0; i <= Config.cars.size(); i++) {

            if (ID.equals(Config.cars.get(i).getId())) {
                Config.cars.remove(i);
                break;
            }

        }}
        catch (Exception e){
            throw new NewException("car not found");
        }


    }

    }



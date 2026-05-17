package com.pluralsight;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class UserInterface {
    private static Dealership dealership;

    private UserInterface(Dealership dealership) {

    }


private static void init(){
        DealerShipFileManager fileManager = new DealerShipFileManager();
        dealership = fileManager.getDealership();
}

    public static void display() {
        init();
        Scanner theScanner = new Scanner(System.in);
        boolean running = true;

        while (running) {

            System.out.println("====================================");
            System.out.println("        DEALERSHIP MENU             ");
            System.out.println("====================================");
            System.out.println("1 - Find vehicles within a price range");
            System.out.println("2 - Find vehicles by make / model");
            System.out.println("3 - Find vehicles by year range");
            System.out.println("4 - Find vehicles by color");
            System.out.println("5 - Find vehicles by mileage range");
            System.out.println("6 - Find vehicles by type (car, truck, SUV, van)");
            System.out.println("7 - List ALL vehicles");
            System.out.println("8 - Add a vehicle");
            System.out.println("9 - Remove a vehicle");
            System.out.println("0 - Quit");
            System.out.print("Please choose an option: ");

            int usersInput = theScanner.nextInt();

            switch(usersInput) {
                case 1:
                    processGetByPriceRequest();
                    break;
                case 2:
                    processGetByMakeModelRequest();
                    break;
                case 3:
                    processGetByYearRequest();
                    break;
                case 4:
                    processGetByColorRequest();
                    break;
                case 5:
                    processGetByMileageRequest();
                    break;
                case 6:
                    processGetByVehicleTypeRequest();
                    break;
                case 7:
                    processGetAllVehiclesRequest();
                    break;
                case 8:
                    processAddVehicleRequest();
                    break;
                case 9:
                    processRemoveVehicleRequest();
                    break;
                case 0:
                    System.out.println("Goodbye!");
                    running = false;
                    break;
                default:
                    System.out.println("Invalid option. Please try again ");
                    break;
            }
        }
    }

    public static void processGetByPriceRequest() {

    }

    public static void processGetByMakeModelRequest() {

    }

    public static void processGetByYearRequest() {

    }

    public static void processGetByColorRequest() {

    }

    public static void processGetByMileageRequest() {

    }

    public static void processGetByVehicleTypeRequest() {

    }

    public static void processGetAllVehiclesRequest(){
        ArrayList<Vehicle> vehicles = dealership.getAllVehicles();
        displayVehicles(vehicles);
    }

    public static void processAddVehicleRequest() {
        Scanner scanner = new Scanner (System.in);

        System.out.println("Enter VIN: ");
        int vin = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter year: ");
        int year = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Enter make: ");
        String make = scanner.nextLine();

        System.out.println("Enter model: ");
        String model = scanner.nextLine();

        System.out.println("Enter type: ");
        String type = scanner.nextLine();

        System.out.println("Enter color: ");
        String color = scanner.nextLine();

        System.out.println("Enter mileage: ");
        int mileage = scanner.nextInt();

        System.out.println("Enter the price: ");
        double price = scanner.nextDouble();

        Vehicle vehicle = new Vehicle (vin, year, make, model, type, color, mileage, price);
        dealership.addVehicle(vehicle);

        DealerShipFileManager dfm = new DealerShipFileManager();
        dfm.saveDealership(dealership);

        System.out.println("Vehicle added successfully. ");



    }

    public static void processRemoveVehicleRequest() {

    }

    //special methods

    private static void displayVehicles(ArrayList<Vehicle> vehicleList){
        if (vehicleList.isEmpty()) {
            System.out.println("No vehicles found.");
        } else {
            for (Vehicle currentVehicle: vehicleList){
                System.out.println(currentVehicle);
            }
        }
    }


}

package com.pluralsight;

import java.io.*;
import java.security.spec.RSAOtherPrimeInfo;
import java.util.List;

public class DealerShipFileManager {
    public Dealership getDealership(){
        Dealership dealership = null;

        try(BufferedReader reader = new BufferedReader((new FileReader("inventory.csv")))){
            String line;

            line = reader.readLine();
            if (line != null){
                String [] tokens = line.split("\\|");
                dealership = new Dealership(tokens[0], tokens[1], tokens[2]);
            }

            while ((line = reader.readLine()) != null){
                String [] tokens = line.split("\\|");
                int vin = Integer.parseInt(tokens[0]);
                int year = Integer.parseInt(tokens[1]);
                String make = tokens[2];
                String model = tokens[3];
                String type = tokens[4];
                String color = tokens[5];
                int odometer = Integer.parseInt(tokens[6]);
                double price = Double.parseDouble(tokens[7]);


                Vehicle vehicle = new Vehicle(vin, year, make, model, type, color, odometer, price);
                if (dealership != null){
                    dealership.addVehicle(vehicle);
                }



            }


        }catch(IOException e) {
            System.out.println("Error reading the file" + e.getMessage());
        }
        return dealership;
    }

    public void saveDealership(Dealership dealership){
//        try (BufferedWriter writer = new BufferedWriter(new FileWriter("inventory.csv"))){
//            String theDealership = String.format("%s|%s|%s", dealership.getName(), dealership.getAddress(), dealership.getPhone());
//            writer.write(theDealership);
//            writer.newLine();
//
//            List<Vehicle> listAutos = dealership.getAllVehicles();
//
//            for (int i = 0; i < listAutos.size(); i++){
//                Vehicle vehicle = listAutos.get(i);
//
//                String vehicleLine = String.format("%d|%d|%s|%s|%s|%s|%d|%.2f",
//                        vehicle.getVin(),
//                        vehicle.getYear(),
//                        vehicle.getMake(),
//                        vehicle.getModel(),
//                        vehicle.getVehicleType(),
//                        vehicle.getColor(),
//                        vehicle.getOdometer(),
//                        vehicle.getPrice()
//                );
//                writer.write(vehicleLine);
//                writer.newLine();
//            }
//
//            System.out.println("Car saved successful!");
//
//        } catch (IOException e){
//            System.out.println("Error, car could not be saved.");
//        }


    }
}

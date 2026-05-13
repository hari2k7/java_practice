package com.hari.java.miniprojects.management;

import java.util.ArrayList;
import java.util.Scanner;
import java.io.*;

interface EfficiencyStandard{
    void calculateRange();
}

abstract class Vehicle{

    int vno;
    String make;

    public Vehicle(int vno, String make) {

        this.vno = vno;
        this.make = make;
    }

    abstract void showSpecs();

    protected abstract void calculateRange();
}

class ElectricCar extends Vehicle implements EfficiencyStandard{

    double batteryCapacity;
    double chargingTime;

    public ElectricCar(int vno,
                       String make,
                       double batteryCapacity,
                       double chargingTime) {

        super(vno, make);

        this.batteryCapacity = batteryCapacity;
        this.chargingTime = chargingTime;
    }

    @Override
    void showSpecs() {

        System.out.println(
                "\n--- Traffic Grid Data Log ---");

        System.out.println(
                "Vehicle No (vno): " + vno);

        System.out.println(
                "Manufacturer: " + make);

        System.out.println(
                "Status: Electric | Battery: "
                        + batteryCapacity + "kWh");

        System.out.println(
                "Charging Time: "
                        + chargingTime + " hrs");
    }

    @Override
    public void calculateRange() {

        try {

            if(batteryCapacity == 0) {

                throw new ArithmeticException(
                        "Battery cannot be zero");
            }

            double range =
                    batteryCapacity * 5;

            System.out.println(
                    "The Whisper: Driver, you have "
                            + range + " miles left.");
        }

        catch(ArithmeticException e) {

            System.out.println(
                    "ArithmeticException: "
                            + e.getMessage());
        }
    }
}

class Sedan extends ElectricCar{

    String luxuryTrim;

    public Sedan(int vno,
                 String make,
                 double batteryCapacity,
                 double chargingTime,
                 String luxuryTrim) {

        super(vno, make,
                batteryCapacity,
                chargingTime);

        this.luxuryTrim = luxuryTrim;
    }

    @Override
    void showSpecs() {

        super.showSpecs();

        System.out.println(
                "Luxury Trim: "
                        + luxuryTrim);
    }

    @Override
    public void calculateRange() {

        double range =
                batteryCapacity * 6;

        System.out.println(
                "The Whisper: Driver, you have "
                        + range + " miles left.");
    }
}

class HydrogenTruck extends Vehicle implements EfficiencyStandard{

    double hydrogenLevel;

    public HydrogenTruck(int vno,
                         String make,
                         double hydrogenLevel) {

        super(vno, make);

        this.hydrogenLevel =
                hydrogenLevel;
    }

    @Override
    void showSpecs() {

        System.out.println(
                "\n--- Traffic Grid Data Log ---");

        System.out.println(
                "Vehicle No (vno): "
                        + vno);

        System.out.println(
                "Manufacturer: "
                        + make);

        System.out.println(
                "Status: Hydrogen | Level: "
                        + hydrogenLevel);
    }

    @Override
    public void calculateRange() {

        double range =
                hydrogenLevel * 8;

        System.out.println(
                "The Whisper: Driver, you have "
                        + range + " miles left.");
    }
}

public class SmartFleetManagement {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        ArrayList<Vehicle> fleet = new ArrayList<>();

        int choice;

        int cnt = 1;

        do {
            System.out.println("\n===== VEHICLE MENU =====");
            System.out.println("1. Add Electric Car");
            System.out.println("2. Add Sedan");
            System.out.println("3. Add Hydrogen Truck");
            System.out.println("4. Show Specs");
            System.out.println("5. Calculate Range");
            System.out.println("6. Save to File");
            System.out.println("7. Read from File");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = sc.nextInt();
            sc.nextLine();

            switch(choice) {
                case 1:{
                    System.out.println("Registering Vehicle "+cnt+" :");
                    System.out.println("Enter vno: ");
                    String inp = sc.nextLine();
                    int vno = 0;
                    try {
                        if(inp.isEmpty()) {
                            throw new NullPointerException(
                                    "No value entered");
                        }
                        vno = Integer.parseInt(inp);
                    }catch(Exception e) {
                        System.out.println("Caught: "+ e.getMessage());
                        break;
                    }

                    System.out.println("make: ");
                    String make = sc.nextLine();
                    System.out.println("Battery capacity: ");
                    double bc = sc.nextDouble();
                    System.out.println("Charging time: ");
                    double ct = sc.nextDouble();

                    fleet.add(new ElectricCar(vno,make,bc,ct));
                    cnt++;
                    break;
                }
                case 2:{
                    System.out.println("Registering Vehicle "+cnt+" :");
                    System.out.println("Enter vno: ");
                    String inp = sc.nextLine();
                    int vno = 0;
                    try {
                        if(inp.isEmpty()) {
                            throw new NullPointerException(
                                    "No value entered");
                        }
                        vno = Integer.parseInt(inp);
                    }catch(Exception e) {
                        System.out.println("Caught: "+ e.getMessage());
                        break;
                    }
                    System.out.println("make: ");
                    String make = sc.nextLine();
                    System.out.println("Battery capacity: ");
                    double bc = sc.nextDouble();
                    System.out.println("Charging time: ");
                    double ct = sc.nextDouble();
                    sc.nextLine();
                    System.out.println("luxuryTrim: ");
                    String lt = sc.nextLine();

                    fleet.add(new Sedan(vno, make, bc, ct, lt));
                    cnt++;
                    break;
                }
                case 3:{
                    System.out.println("Registering Vehicle "+cnt+" :");
                    System.out.println("Enter vno: ");
                    String inp = sc.nextLine();
                    int vno = 0;
                    try {
                        if(inp.isEmpty()) {
                            throw new NullPointerException(
                                    "No value entered");
                        }
                        vno = Integer.parseInt(inp);
                    }catch(Exception e) {
                        System.out.println("Caught: "+ e.getMessage());
                        break;
                    }
                    System.out.println("make: ");
                    String make = sc.nextLine();
                    System.out.println("Hydrogen level: ");
                    double hl = sc.nextDouble();

                    fleet.add(new HydrogenTruck(vno, make, hl));
                    cnt++;
                    break;
                }
                case 4:{
                    for(Vehicle v : fleet) {
                        v.showSpecs();
                        System.out.println();
                    }
                    break;
                }
                case 5:{
                    System.out.println("Enter vno:");
                    int uvno = sc.nextInt();
                    for(Vehicle v : fleet) {
                        if(v.vno == uvno) {
                            try {
                                v.calculateRange();
                            }catch(Exception e) {
                                System.out.println("Caught: "+e.getMessage());
                            }
                        }
                    }
                    break;
                }
                case 6:{
                    for(Vehicle v : fleet) {
                        if(v instanceof ElectricCar) {
                            ElectricCar s = (ElectricCar)v;
                            try {
                                FileWriter fw = new FileWriter("data.txt",true);
                                fw.write("ElectricCar |"+s.vno + "|"+s.make+"|"+s.batteryCapacity+"|"+s.chargingTime+"\n");
                                fw.close();
                            }catch(Exception e) {
                                System.out.println("File Error");
                            }
                        }
                        else if(v instanceof Sedan) {
                            Sedan ec = (Sedan)v;
                            try {
                                FileWriter fw = new FileWriter("data.txt",true);
                                fw.write("Sedan |"+ec.vno + "|"+ec.make+"|"+ec.batteryCapacity+"|"+ec.chargingTime+"|"+ec.luxuryTrim+"\n");
                                fw.close();
                            }catch(Exception e) {
                                System.out.println("File Error");
                            }
                        }
                        else if(v instanceof HydrogenTruck) {
                            HydrogenTruck h = (HydrogenTruck)v;
                            try {
                                FileWriter fw = new FileWriter("data.txt",true);
                                fw.write("HydrogenTruck |"+h.vno + "|"+h.make+"|"+h.hydrogenLevel+"\n");
                                fw.close();
                            }catch(Exception e) {
                                System.out.println("File Error");
                            }
                        }

                    }
                    break;
                }
                case 7:{
                    try {
                        BufferedReader br = new BufferedReader(new FileReader("data.txt"));
                        String line;
                        while((line = br.readLine())!=null) {
                            System.out.println(line);
                        }
                    }catch(Exception e) {
                        System.out.println("File Error");
                    }
                    break;
                }
                case 8:
                    System.out.println("Exiting...");
                    break;
            }
        }while(choice != 8);

        sc.close();
    }
}
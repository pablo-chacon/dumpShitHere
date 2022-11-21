
import lanes.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class App {

    static public Lanes laneA = new LaneA(true, "A");
    static public Lanes laneB = new LaneB(true, "B");
    static public Lanes laneC = new LaneC(true, "C");
    static public Lanes laneD = new LaneD(true, "D");
    static public Lanes laneE = new LaneE(true, "E");
    static public List<Lanes> laneList = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        boolean programRunning = true;

        while (programRunning) {


            mainMenu();
            int choice = inputInt();

            if (choice == 1) {

                for (Lanes lanes : laneList) {
                    System.out.println(lanes);
                }

            } else if (choice == 2) {

                vehicleMenu();

                if (inputInt() == 1) {
                    Vehicle van = new Vehicle("Van");
                    System.out.print("Vehicle weight: \n>>>");
                    van.setWeight(inputInt());

                    if (laneA.isOpenLane()) {
                        laneA.addVehicle(van);
                        laneList.add(laneA);
                    } else if (laneB.isOpenLane()) {
                        laneB.addVehicle(van);
                        laneList.add(laneB);
                    } else {
                        System.out.println("No lanes available.");
                    }

                } else if (choice == 2) {
                    Vehicle smallTruck = new Vehicle("Small Truck");
                    System.out.print("Vehicle weight: \n>>>");
                    smallTruck.setWeight(sc.nextInt());

                    if (laneA.isOpenLane() && smallTruck.getWeight() < 5000) {
                        laneA.addVehicle(smallTruck);
                        laneList.add(laneA);
                    } else if (laneC.isOpenLane()) {
                        laneC.addVehicle(smallTruck);
                        laneList.add(laneC);
                    } else if (laneD.isOpenLane()) {
                        laneD.addVehicle(smallTruck);
                        laneList.add(laneD);
                    } else {
                        System.out.println("No lanes available.");
                    }


                } else if (choice == 3) {
                    Vehicle heavyTruck = new Vehicle("HeavyTruck");
                    System.out.print("Vehicle weight: \n>>>");
                    heavyTruck.setWeight(sc.nextInt());

                    if (laneD.isOpenLane() && heavyTruck.getWeight() < 9000) {
                        laneD.addVehicle(heavyTruck);
                        laneList.add(laneD);
                    } else if (laneE.isOpenLane()) {
                        laneE.addVehicle(heavyTruck);
                        laneList.add(laneE);
                    } else {
                        System.out.println("No lanes available.");
                    }

                }
            } else if (choice == 3) {
                System.out.println("Have a nice day, bye! =)");
                break;
            }
        }
    }

    public static int inputInt() {
        return new Scanner(System.in).nextInt();
    }

    public static void mainMenu() {
        System.out.println("""
            DumpaMera Menu.
                1. Docked trucks.
                2. Register new vehicle.
                3. Quit program.
                >>> """);

    }

    public static void vehicleMenu() {
        System.out.println("""
            VehicleTypes:
            1. Van
            2. small truck
            3. heavy truck
            >>>""");
    }


}
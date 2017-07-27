import java.util.Scanner;

public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCars = 0;
        String contin = " ";

        System.out.println("Welcome to Grand Circus Motors admin console!");
        do {
            System.out.println("How many cars are you entering: ");
            numCars = scan.nextInt();
            System.out.println("You entered " + numCars);
            Car[] cars = new Car[numCars];
            String make = "Ford";
            String model = "Taurus";
            int year = 0;
            double price = 0.00;
            for (int i = 0; i < numCars; i++) {
                scan.nextLine();

                System.out.println("Car " + (i + 1) + "");

                System.out.println("Enter make: ");
                make = scan.nextLine();

                System.out.println("Enter model: ");
                model = scan.nextLine();

                System.out.println("Enter year: ");
                year = scan.nextInt();

                System.out.println("Enter price: ");
                price = scan.nextDouble();

                Car car = new Car(make, model, year, price);
                cars[i] = car;
            }

            System.out.println("...");
            System.out.println("Current Inventory: ");

            for (Car car : cars) {

                System.out.println(car.toString());
            }
            System.out.println();

            System.out.println("Enter new set of cars? (y/n)");
            scan.nextLine();
            contin = scan.nextLine();

        } while (contin.equalsIgnoreCase("y"));

        System.out.println("GoodBye");

    }

}


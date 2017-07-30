import java.util.ArrayList;
import java.util.Scanner;


public class CarApp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int numCars = 0;
        String contin = " ";
        int option = 0;
        int contin2 = 0;

        System.out.println("Welcome to Grand Circus Motors admin console!");

        System.out.println("If you would like to add a car/cars to stock select 1: ");
        System.out.println("If you would like to sale a car/cars select 2: ");

        option = scan.nextInt();

        if (option == 1) {

            do {
                System.out.println("How many cars are you adding to inventory? ");
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

                System.out.println("Would you like to add more cars? (y/n)");
                scan.nextLine();
                contin = scan.nextLine();

            } while (contin.equalsIgnoreCase("y"));

            System.out.println("GoodBye");
        } else if (option == 2) {


            //int contin2 = 0;
            //Scanner scan1 = new Scanner(System.in);
            ArrayList<Car> stock = new ArrayList<Car>();
            stock.add(new Car("Ford", "Taurus", 2017, 25000.00));
            stock.add(new Car("Ford", "Explorer", 2017, 28000.00));
            stock.add(new Car("Chevrolet", "Impala", 2017, 35000.00));
            stock.add(new UsedCar("Ford", "Fusion", 2010, 22000.00, "used", 55000));
            stock.add(new UsedCar("Chevrolet", "Malibu", 2007, 10000.00, "used", 180000));
            stock.add(new UsedCar("Ford", "Escape", 2012, 25000.00, "used", 45000));


            int selection = getSelection(scan, stock);
            if (selection > 0 && selection < (stock.size() + 1)) {


                System.out.println(stock.get(selection - 1));
                scan.nextLine();
                System.out.println("Would you like to sale this car?");
                String sale = scan.nextLine();
                if (sale.equalsIgnoreCase("y")) {

                    stock.remove(selection - 1);

                    getSelection(scan, stock);

                }
            }
            System.out.println("Your sale has been processed ");
        }
    }

    public static int getSelection(Scanner scan, ArrayList<Car> stock) {
        int i = 1;
        for (Car c : stock) {
            System.out.println(i + ": " + c);
            i++;
        }
        System.out.println((i) + ". Quit ");
        System.out.println("Select Car to sale: ");
        return scan.nextInt();
    }
}








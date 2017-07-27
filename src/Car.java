/**
 * Created by Gateway on 7/27/2017.
 */

public class Car {


    private String make;
    private String model;
    private int year;
    private double price;


    public Car()
    {
        make = "Ford";
        model = "Taurus";
        year = 2010;
        price = 18000.00;
    }


    public Car (String makeOfCar, String modelOfCar, int yearOfCar, double priceOfCar)
    {
        make = makeOfCar;
        model = modelOfCar;
        year = yearOfCar;
        price = priceOfCar;
    }


    public String getMake() {
        return make;
    }
    public String getModel() {
        return model;
    }
    public int getYear() {
        return year;
    }
    public double getPrice(){
        return price;
    }

    public void setMake(String make) {
        this.make = make;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public void setYear(int year) {
        this.year = year;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString(){
        return make + "\t" + model + "\t" + year + "\t" + "$" + price;

    }





}

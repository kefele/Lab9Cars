/**
 * Created by Gateway on 7/27/2017.
 */
public class UsedCar extends Car {
    private double mileage;
    private String used;

    public UsedCar( String make, String model, int year, double price, String used, double mileage) {
        super( make, model, year, price);
        this.used = used;
        this.mileage = mileage;
    }
    public String getUsed() {return used;}
    public void setUsed(String used) {this.used = used;}
    public double getMileage() { return mileage;}
    public void setMileage(double mileage) {this.mileage = mileage;}



    //other methods
    //to make toString work, I have to match Object's toString header
    @Override
    public String toString() {
        return super.toString() +"\n" + " (" + used + ") " + mileage + " miles";
    }
}


package Moto;

public class MiniBike extends ClassicMotorcycle {

    public String model = "Honda Monkey bike";
    public String color = "red";
    public int weight = 68;
    public double fuelCapacity = 2.99;

    @Override
    public String noise() {
        return "My noise is low.";
    }
}

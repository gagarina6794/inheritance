package Moto;

public class MiniBike extends ClassicMotorcycle {

    String model = "Honda Monkey bike";
    String color = "red";
    int weight = 68;
    double fuelCapacity = 2.99;

    @Override
    public String noise() {
        return "My noise is low.";
    }
}

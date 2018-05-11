package Moto;

public class MotorBike extends Motorcycle {

    String model = "Suzuki RM-Z450";
    String color = "red";
    int weight = 112;
    double fuelCapacity = 6.3;

    @Override
    public boolean SUV() {
        return true;
    }

    @Override
    public void coolingSystem() {
        System.out.println("My cooling system is fluid.");
    }

    @Override
    public String noise() {
        return "My noise is medium.";
    }
}

package Moto;

public class MotorBike extends Motorcycle {

    public String model = "Suzuki RM-Z450";
    public String color = "red";
    public int weight = 112;
    public double fuelCapacity = 6.3;

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

package Moto;

public class Custom extends ClassicMotorcycle {

    public String model = "Harley Davidson Street Glide Moto.Custom";
    public int weight = 361;
    public double fuelCapacity = 17.5;

    @Override
    public String noise() {
        return "My noise is loud.";
    }

    public void securitySystem() {
        System.out.println("I have security system!");
    }

    public void navigationSystem() {
        System.out.println("I have navigation system!");
    }
}

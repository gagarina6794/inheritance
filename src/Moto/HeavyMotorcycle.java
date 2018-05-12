package Moto;

public class HeavyMotorcycle extends ClassicMotorcycle  {

    public String model = "Ural Dark Force";
    public int weight = 318;
    public double fuelCapacity = 7.5;

    @Override
    public String noise() {
        return "My noise is loud.";
    }

    public void bearing(){
        System.out.println("I can carry a large load.");
    }
}

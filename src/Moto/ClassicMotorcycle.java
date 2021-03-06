package Moto;

public class ClassicMotorcycle extends Motorcycle {

    public String model = "Jawa 350 Typ 638";
    public String color = "black";
    public int weight = 155;
    public double fuelCapacity = 3.4;

    @Override
    public boolean SUV() {
        return false;
    }

    @Override
    public void coolingSystem() {
        System.out.println("My cooling system is air.");
    }

    @Override
    public String noise() {
        return "My noise is normal.";
    }

    public  void lightRoad(){
        System.out.println("I can shine.");
    }
}

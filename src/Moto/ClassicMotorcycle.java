package Moto;

public class ClassicMotorcycle extends Motorcycle {

    String model = "Jawa 350 Typ 638";
    String color = "black";
    int weight = 155;
    double fuelCapacity = 3.4;

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

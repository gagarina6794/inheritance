package Moto;

public abstract class Motorcycle {

    String model;
    String color;
    double weight;
    double fuelCapacity;

    protected abstract boolean SUV();
    protected abstract void coolingSystem();
    protected abstract String noise();

    protected void drive(){
        System.out.println("I'm drive!");
    }

    protected void stop(){
        System.out.println("I stop!");
    }
}

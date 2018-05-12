package Moto;

public abstract class Motorcycle {

    protected String model;
    protected String color;
    protected double weight;
    protected double fuelCapacity;

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

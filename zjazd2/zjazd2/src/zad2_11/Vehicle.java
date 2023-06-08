package zad2_11;

public class Vehicle {

    private int numberOfPassengers;
    private  float fuelcap;
    private float fuelConsumptionPer100kilometer;

    public Vehicle(int numberOfPassengers, float fuelcap, float fuelConsumptionPer100kilometer) {
        this.numberOfPassengers = numberOfPassengers;
        this.fuelcap = fuelcap;
        this.fuelConsumptionPer100kilometer = fuelConsumptionPer100kilometer;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public float getFuelcap() {
        return fuelcap;
    }

    public float getFuelConsumptionPer100kilometer() {
        return fuelConsumptionPer100kilometer;
    }


}

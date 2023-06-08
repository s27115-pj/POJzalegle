package zad2_13;

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

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public float getFuelcap() {
        return fuelcap;
    }

    public void setFuelcap(float fuelcap) {
        this.fuelcap = fuelcap;
    }

    public float getFuelConsumptionPer100kilometer() {
        return fuelConsumptionPer100kilometer;
    }

    public void setFuelConsumptionPer100kilometer(float fuelConsumptionPer100kilometer) {
        this.fuelConsumptionPer100kilometer = fuelConsumptionPer100kilometer;
    }

    public void range( String vehicleName){
        StringBuilder sb = new StringBuilder();
        sb.append(vehicleName).append(" przewozi ").append(getNumberOfPassengers()).append(" osób na odległość do ").append(fuelcap/fuelConsumptionPer100kilometer*100f ).append(" kilometrów");
        System.out.println(sb);
    }

    public void petrolUseForGivenDistance(float distance){

        System.out.println("potrzebuje "+(fuelConsumptionPer100kilometer/100f)*distance+"litrów paliwa");
    }

}

package zad2_12;


public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(5,60f,7.3f);
        Vehicle sportsCar = new Vehicle(2,50f,15f);
        StringBuilder sb = new StringBuilder();
        sb.append("Minivan").append(" przewozi ").append(miniVan.getNumberOfPassengers()).append(" osób");
        System.out.println(sb);
        miniVan.range();
        sb.setLength(0);

        sb.append("Auto Sportowe").append(" przewozi ").append(sportsCar.getNumberOfPassengers()).append(" osób");
        System.out.println(sb);
        sportsCar.range();

    }









}
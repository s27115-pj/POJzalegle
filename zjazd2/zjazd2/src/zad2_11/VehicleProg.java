package zad2_11;



public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(5,60f,7.3f);
        Vehicle sportsCar = new Vehicle(2,50f,15f);
        StringBuilder sb = new StringBuilder();
        sb.append("Minivan przewozi ").append(miniVan.getNumberOfPassengers()).append(" osób\n").append("Zasięg (km): ").append(miniVan.getFuelcap()/miniVan.getFuelConsumptionPer100kilometer()*100);
        sb.append("\n\n").append("Auto Sportowe przewozi ").append(sportsCar.getNumberOfPassengers()).append(" osób\n").append("Zasięg (km): ").append(sportsCar.getFuelcap()/sportsCar.getFuelConsumptionPer100kilometer()*100);
        System.out.println(sb);

    }








}
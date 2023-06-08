package zad2_13;


public class VehicleProg {
    public static void main(String[] args) {
        Vehicle miniVan = new Vehicle(5,60f,7.3f);
        Vehicle sportsCar = new Vehicle(2,50f,15f);
       System.out.print("Minivan ");
        miniVan.petrolUseForGivenDistance(100);
        System.out.print("Auto sportowe ");
        sportsCar.petrolUseForGivenDistance(100);




    }
}
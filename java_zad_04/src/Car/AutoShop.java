package Car;

public class AutoShop {
    public static void main(String[] args) {
        Sedan sedan = new Sedan();
        sedan.setRegularPrice(25000);
        sedan.setSpeed(120);
        sedan.setLength(18);

        Ford ford1 = new Ford();
        ford1.setRegularPrice(30000);
        ford1.setSpeed(150);
        ford1.setYear(2021);
        ford1.setManufacturedDiscount(2000);

        Ford ford2 = new Ford();
        ford2.setRegularPrice(28000);
        ford2.setSpeed(140);
        ford2.setYear(2022);
        ford2.setManufacturedDiscount(1500);

        Truck truck = new Truck();
        truck.setRegularPrice(40000);
        truck.setSpeed(100);
        truck.setWeight(2500);

        System.out.println("Sedan - " + sedan.getPurchaseInfo() + "Sale Price: " + sedan.getSalePrice());
        System.out.println("Ford1 - " + ford1.getPurchaseInfo() + "Sale Price: " + ford1.getSalePrice());
        System.out.println("Ford2 - " + ford2.getPurchaseInfo() + "Sale Price: " + ford2.getSalePrice());
        System.out.println("Truck - " + truck.getPurchaseInfo() + "Sale Price: " + truck.getSalePrice());
    }
}

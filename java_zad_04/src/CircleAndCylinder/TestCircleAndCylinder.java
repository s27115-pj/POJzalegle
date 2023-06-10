package CircleAndCylinder;

public class TestCircleAndCylinder {
    public static void main(String[] args) {
        Circle circle1 = new Circle();
        System.out.println("Circle 1 - Radius: " + circle1.getRadius());
        System.out.println("Circle 1 - Area: " + circle1.getArea());

        Circle circle2 = new Circle(2.5);
        System.out.println("Circle 2 - Radius: " + circle2.getRadius());
        System.out.println("Circle 2 - Area: " + circle2.getArea());

        Cylinder cylinder1 = new Cylinder();
        System.out.println("Cylinder 1 - Radius: " + cylinder1.getRadius());
        System.out.println("Cylinder 1 - Height: " + cylinder1.getHeight());
        System.out.println("Cylinder 1 - Volume: " + cylinder1.getVolume());

        Cylinder cylinder2 = new Cylinder(3.0, 5.0);
        System.out.println("Cylinder 2 - Radius: " + cylinder2.getRadius());
        System.out.println("Cylinder 2 - Height: " + cylinder2.getHeight());
        System.out.println("Cylinder 2 - Volume: " + cylinder2.getVolume());


        Cylinder cylinder = new Cylinder(2.0);
        System.out.println("Cylinder - Radius: " + cylinder.getRadius());
        System.out.println("Cylinder - Height: " + cylinder.getHeight());
        System.out.println("Cylinder - Volume: " + cylinder.getVolume());


    }
}

package CircleAndCylinder;

public class Circle {
    private double radius = 1.0;
    private String color = "blue";

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public double getArea(){
        return(Math.PI*radius*radius);
    }

    @Override
    public String toString() {
        return "CircleAndCylinder.Circle{" +
                "radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }

}

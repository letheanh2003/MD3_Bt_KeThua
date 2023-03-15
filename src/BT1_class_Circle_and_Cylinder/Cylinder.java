package BT1_class_Circle_and_Cylinder;

public class Cylinder extends Circle {
    private double height;

    public Cylinder() {
        this.height = 50;
    }

    public Cylinder(double radius, String color, double height) {
        super(radius, color);
        this.height = height;
    }

    public double getVolume() {
        return super.getArea() * height;
    }

    @Override
    public String toString() {
        return "Cylinder{" +
                "height=" + height +
                '}' + super.toString();
    }
}
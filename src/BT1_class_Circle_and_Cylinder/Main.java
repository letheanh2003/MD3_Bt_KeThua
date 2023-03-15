package BT1_class_Circle_and_Cylinder;

public class Main {
    public static void main(String[] args) {
        //CIRCLE
        printTest("CIRCLE");
        Circle cr = new Circle();
        System.out.println(cr);
        Circle cr1 = new Circle(5, "red");
        System.out.println(cr1.getArea());
        System.out.println(cr1);
        //CYLINDER
        printTest("CYLINDER");
        Cylinder cy = new Cylinder();
        System.out.println(cy);
        Cylinder cy1 = new Cylinder(5, "green", 10);
        System.out.println(cy1);
        System.out.println(cy1.getVolume());
    }

    public static void printTest(String value) {
        System.out.println();
        System.out.println("----------------" + value + "---------------------");
        System.out.println();
    }
}

package BT2_Poind2dAndPoind3d;

public class Main {
    public static void main(String[] args) {
        // Point2D
        printTest1("POINT 2D");
        Point2D pnt = new Point2D();
        System.out.println(pnt);
        Point2D pnt1 = new Point2D(10, 20);
        System.out.println(pnt1);
        //Point3D
        printTest1("POINT 3D");
        Point3D pnt3 = new Point3D();
        System.out.println(pnt3);
        Point3D pnt4 = new Point3D(10,20,30);
        System.out.println(pnt4);

    }
    public static void printTest1(String value) {
        System.out.println();
        System.out.println("--------" + value + "--------");
        System.out.println();
    }
}

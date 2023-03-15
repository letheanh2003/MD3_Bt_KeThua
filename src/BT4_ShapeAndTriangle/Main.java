package BT4_ShapeAndTriangle;

public class Main {
    public static void main(String[] args) {
        //Shape
        printTest("SHAPE");
        Shape shape = new Shape();
        System.out.println(shape);
        Shape shape1 = new Shape("blue", false);
        System.out.println(shape1);

        //Triangle
        printTest("TRIANGLE");
        Triangle triangle = new Triangle();
        System.out.println(triangle);
        Triangle triangle1 = new Triangle("Orange", true, 6, 6, 6);
        System.out.println(triangle1);
    }
    public static void printTest(String value) {
        System.out.println();
        System.out.println("--------" + value + "--------");
        System.out.println();

    }
}

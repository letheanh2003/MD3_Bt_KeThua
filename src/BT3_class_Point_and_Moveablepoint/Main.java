package BT3_class_Point_and_Moveablepoint;

public class Main {
    public static void main(String[] args) {
        //POINT
        printTest("POINT");
        Point pt = new Point();
        System.out.println(pt);
        Point pt1 = new Point(10,20);
        System.out.println(pt1);

        //PointAndMove
        printTest("PointAndMove");
        PointAndMove pam = new PointAndMove();
        System.out.println(pam);
        System.out.println(pam.move());
        PointAndMove pam1 = new PointAndMove(10,20,30,40);
        System.out.println(pam1);
        System.out.println(pam1.move());
    }
    public static void printTest(String value) {
        System.out.println();
        System.out.println("--------" + value + "--------");
        System.out.println();
    }
}

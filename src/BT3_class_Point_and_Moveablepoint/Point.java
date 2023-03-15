package BT3_class_Point_and_Moveablepoint;

public class Point {
    protected float x, y;

    public Point(float x, float y) {
        this.x = x;
        this.y = y;
    }

    public Point() {
        x = y = 50.0f;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void setXY(float x, float y) {
        this.x = x;
        this.y = y;
    }
    public float[] getXY(){
        return new float[] {x, y};
    }

    @Override
    public String toString() {
        return "Point{" +
                "x=" + x +
                ", y=" + y +
                '}';
    }
}

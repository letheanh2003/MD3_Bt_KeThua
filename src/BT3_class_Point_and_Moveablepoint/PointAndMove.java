package BT3_class_Point_and_Moveablepoint;

public class PointAndMove extends Point {
    private float xSpeed, ySpeed;

    public PointAndMove(float x, float y, float xSpeed, float ySpeed) {
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public PointAndMove(float x, float y) {
        super(x, y);
    }

    public PointAndMove() {
        super();
        xSpeed = ySpeed = 10;
    }

    public float getxSpeed() {
        return xSpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed) {
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    public float[] getSpeed() {
        return new float[]{
                xSpeed, ySpeed
        };
    }

    @Override
    public String toString() {
        return "PointAndMove{" +
                "xSpeed=" + xSpeed +
                ", ySpeed=" + ySpeed +
                '}' + super.toString();
    }

    public PointAndMove move() {
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}

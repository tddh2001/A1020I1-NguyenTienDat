package PointMoveablePoint;

public class MovablePoint extends Point {
    private float xSpeed = 0.0f;
    private float ySpeed = 0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x, y);
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public MovablePoint(){
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
    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    public float[] getSpeed() {
        float[] arr2 = new float[2];
        arr2[0] = xSpeed;
        arr2[1] = ySpeed;
        return arr2;
    }
    public String toString(){
        return super.toString() + ", speed=(" +xSpeed+" ,"+ySpeed+")";
    }
    public MovablePoint move(){
        x += xSpeed;
        y += ySpeed;
        return this;
    }
}

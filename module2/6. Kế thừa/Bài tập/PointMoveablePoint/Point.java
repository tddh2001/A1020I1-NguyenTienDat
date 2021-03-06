package PointMoveablePoint;

public class Point {
    public float x;
    public float y;

    public Point(float x, float y){
        this.x = x;
        this.y = y;
    }
    public Point(){
    }

    public float getX() {
        return x;
    }

    public float getY() {
        return y;
    }

    public void setX(float x) {
        this.x = x;
    }

    public void setY(float y) {
        this.y = y;
    }
    public void setXY(float x, float y){
        this.x = x;
        this.y = y;
    }
    public float[] getXY() {
        float[] arr1 = new float[2];
        arr1[0] = x;
        arr1[1] = y;
        return arr1;
    }
    public String toString(){
        return "(" +x +", " +y +")";
    }
}

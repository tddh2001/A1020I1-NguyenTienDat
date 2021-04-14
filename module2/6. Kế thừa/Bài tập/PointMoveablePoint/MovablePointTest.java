package PointMoveablePoint;

public class MovablePointTest {
    public static void main(String[] args) {
        MovablePoint movablePoint = new MovablePoint();
        movablePoint = new MovablePoint(1, 2 , 5, 5);
        System.out.println(movablePoint);
        System.out.println(movablePoint.move());
    }
}

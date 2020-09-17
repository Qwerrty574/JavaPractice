package ru.mirea.ikbo2519.pr3.part5;

import ru.mirea.ikbo2519.pr3.part4.*;

public class MovableRectangle implements Movable {
    private MovablePoint topLeft;
    private MovablePoint bottomRight;

    public MovableRectangle(int x1, int y1, int x2, int y2, int xSpeed, int ySpeed) {
        this.topLeft = new MovablePoint(x1, y1, xSpeed, ySpeed);
        this.bottomRight = new MovablePoint(x1, y1, xSpeed, ySpeed);
        assert (!(topLeft.xSpeed==bottomRight.xSpeed&&topLeft.ySpeed== bottomRight.ySpeed));
    }

    @Override
    public String toString() {
        return "MovableRectangle{" +
                "topLeft=" + topLeft +
                ", bottomRight=" + bottomRight +
                '}';
    }

    public void moveUp() {
    }

    public void moveDown() {
    }

    public void moveLeft() {
    }

    public void moveRight() {
    }
}

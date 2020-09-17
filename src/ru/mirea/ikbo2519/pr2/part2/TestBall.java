package ru.mirea.ikbo2519.pr2.part2;

public class TestBall {
    public static void main(String[] args) {
        Ball ball_1 = new Ball();
        Ball ball_2 = new Ball(0.5, 2.9);
        ball_1.setXY(0.0, 1.0);
        System.out.println(ball_1.toString());
        ball_1.move(-2.7, 2.5);
        System.out.println(ball_1.toString());
        ball_2.move(3, -4);
        System.out.println(ball_2.toString());
    }
}

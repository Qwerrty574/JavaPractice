package ru.mirea.ikbo2519.pr1.part3;

public class TestBall {
    public static void main(String[] args) {
        Ball ball_1 = new Ball(5, "red");
        Ball ball_2 = new Ball(7);
        ball_2.setColor("black");
        System.out.println(ball_1);
        System.out.println(ball_2);
    }
}

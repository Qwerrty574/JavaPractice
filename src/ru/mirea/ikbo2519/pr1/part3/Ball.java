package ru.mirea.ikbo2519.pr1.part3;

public class Ball {
    private int size;
    private String color;

    public Ball(int size, String color) {
        this.size = size;
        this.color = color;
    }

    public Ball(int size) {
        this.size = size;
        this.color = "Uncolored";
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Ball{" +
                "size=" + size +
                ", color='" + color + '\'' +
                '}';
    }
}

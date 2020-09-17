package ru.mirea.ikbo2519.pr3.part2;

import ru.mirea.ikbo2519.pr3.part1.Shape;

public class Rectangle extends Shape {
    protected double width;
    protected double length;

    public Rectangle(double width,double length,String color,boolean filled){
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }

    public Rectangle(double width,double length){
        this.width = width;
        this.length = length;
    }

    public Rectangle() {}

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    @Override
    public double getArea() {
        return 0;
    }

    @Override
    public double getPerimeter() {
        return 0;
    }

    @Override
    public String toString() {
        return "Rectangle{" +
                "color='" + color + '\'' +
                ", filled=" + filled +
                ", width=" + width +
                ", length=" + length +
                '}';
    }
}

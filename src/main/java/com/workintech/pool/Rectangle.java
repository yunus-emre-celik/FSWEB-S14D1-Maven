package com.workintech.pool;

public class Rectangle {
    private double width, length;

    public Rectangle(double length, double width) {
        this.length = Math.max(length,0);
        this.width = Math.max(width,0);
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }
    public double getArea(){
        return this.width*this.length;
    }
}

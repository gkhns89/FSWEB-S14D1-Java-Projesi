package com.wit.inheritance.model.p1;

public class Rectangle {

    private double width;
    private double length;



    public Rectangle(double width, double length) {

        if (length <= 0) {


            this.length = 0;

        } else {

            this.length = length;
        }

        if (width <= 0) {

            this.width = 0;


        } else {
            this.width = width;

        }

    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public double getArea(){

        return width*length;
    }
}

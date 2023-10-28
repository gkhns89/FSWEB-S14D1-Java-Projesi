package com.wit.inheritance.model;

public class Circle {

    private double radius;



    public Circle(double radius) {

        if (radius<=0){
            this.radius=radius;
        }
        else{
            this.radius=radius;
        }

    }

    public double getRadius() {
        return radius;
    }

    public double getArea()
    {
        return radius*radius*Math.PI;

    }
}

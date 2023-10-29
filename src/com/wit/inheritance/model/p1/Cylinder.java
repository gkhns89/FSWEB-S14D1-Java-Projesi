package com.wit.inheritance.model.p1;

public class Cylinder extends Circle {

    private final double height;

    public Cylinder(double radius, double height) {
        super(radius);
        if (height<=0){
            this.height=0;
        }
        else {
            this.height= height;
        }

    }

    public double getHeight() {
        return height;
    }

    public double getVolume(){

        return getArea()*this.height;

    }
}

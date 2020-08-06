package com.workshop.designpatterns.factory_method;

public class Car extends Modal implements Transport {
    public Car(){
        this.typeName = "Car";
        this.wheels = 4;
        this.speed = ModalSpeed.FAST;
    }

    @Override
    public void deliver() {
        System.out.println("Fast speed - "+this.typeName);
    }
}

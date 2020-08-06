package com.workshop.designpatterns.factory_method;

public class Bike extends Modal implements Transport {
    public Bike(){
        this.typeName = "Bike";
        this.wheels = 2;
        this.speed = ModalSpeed.SLOW;
    }

    @Override
    public void deliver() {
        System.out.println("Slow speed - "+this.typeName);
    }
}

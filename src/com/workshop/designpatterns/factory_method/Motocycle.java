package com.workshop.designpatterns.factory_method;

public class Motocycle extends Modal implements Transport{
    public Motocycle(){
        this.typeName = "Motocycle";
        this.wheels = 2;
        this.speed = ModalSpeed.MEDIUM;
    }

    @Override
    public void deliver() {
        System.out.println("Medium speed - "+this.typeName);
    }
}

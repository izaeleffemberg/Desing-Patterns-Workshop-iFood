package com.workshop.designpatterns.factory_method;

public class TransportFactory {
    public Transport getTransport(ModalSpeed speed){
        switch (speed){
            case FAST:
                return new Car();
            case MEDIUM:
                return new Motocycle();
            case SLOW:
                return new Bike();
        }
        return null;
    }
}

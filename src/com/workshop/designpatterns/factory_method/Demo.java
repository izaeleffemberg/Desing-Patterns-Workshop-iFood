package com.workshop.designpatterns.factory_method;

public class Demo {
    public static void main (String[] args){
        TransportFactory factory = new TransportFactory();
        Transport firstTransport = factory.getTransport(ModalSpeed.FAST);
        Transport secondTransport = factory.getTransport(ModalSpeed.SLOW);

        firstTransport.deliver();
        secondTransport.deliver();
    }
}

package com.workshop.designpatterns.factory_method;

public abstract class Modal {
    public String typeName;
    public int wheels;
    public ModalSpeed speed;

    public void modalDescription(){
        System.out.println("Modal - type: "+typeName+" ; wheels: "+wheels);
    }


}

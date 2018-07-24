package com.codes.Object_oriented.InternalClass.anonymous;

abstract class Device {
    private String name;
    public abstract double getPrince();
    public Device(){}
    public Device(String name){
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

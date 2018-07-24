package com.codes.Object_oriented.abstractClass;

public abstract class SpeedMeter {
    private double turnRate;
    public SpeedMeter(){}
    public abstract double getRadius();

    public void setTurnRate(double turnRate) {
        this.turnRate = turnRate;
    }
    public double getSpeed(){
        return Math.PI * 2 * getRadius() * turnRate;
    }
}

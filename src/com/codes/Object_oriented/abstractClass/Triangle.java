package com.codes.Object_oriented.abstractClass;

public class Triangle extends Shape {
    private double a;
    private double b;
    private double c;
    public Triangle(String color, double a, double b, double c){
        super(color);
        this.getSide(a, b, c);
    }

    private void getSide(double a, double b, double c) {
        if(a >= b + c || b >= a + c || c >= a + b){
            System.out.println("三角形两边和必须大于第三条边");
            return;
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getType() {
        return a + b + c;
    }

    @Override
    public String calPerimeter() {
        return "三角形";
    }
}

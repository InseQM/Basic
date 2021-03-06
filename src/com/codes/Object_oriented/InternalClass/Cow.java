package com.codes.Object_oriented.InternalClass;

public class Cow {
    private double weight;
    public Cow(){ }
    public Cow(double weight){
        this.weight = weight;
    }
    //定义一个非静态内部类的俩个实例变量
    private class CowLeg {
        //非静态内部类的两个实例变量
        private double length;
        private String color;

        public CowLeg() {
        }

        public CowLeg(double length, String color) {
            this.color = color;
            this.length = length;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            this.length = length;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public void info() {
            System.out.println("当前牛腿颜色是:" + color + ", 高是:" + length);
            System.out.println("本牛腿所在的奶牛重:" + weight);
        }
    }
    public void test(){
        CowLeg c1 = new CowLeg(1.12, "黑白相间");
        c1.info();
    }
    public static void main(String[] args){
        Cow cow = new Cow(378.9);
        cow.test();
    }

}

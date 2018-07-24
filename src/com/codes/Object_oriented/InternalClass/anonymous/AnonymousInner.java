package com.codes.Object_oriented.InternalClass.anonymous;

public class AnonymousInner {
    public void test(Device d){
        System.out.println("购买了一个" + d.getName() + ",花掉了" + d.getPrince());
    }

    public static void main(String[] args) {
        AnonymousInner ai = new AnonymousInner();
        ai.test(new Device("电子示波器") {
            @Override
            public double getPrince() {
                return 67.8;
            }
        });
        Device d = new Device() {
            {
                System.out.println("匿名内部类的初始化块...");
            }
            @Override
            public double getPrince() {
                return 56.2;
            }
            //重写父类的实例方法
            public String getName(){
                return "键盘";
            }
        };
        ai.test(d);
    }
}

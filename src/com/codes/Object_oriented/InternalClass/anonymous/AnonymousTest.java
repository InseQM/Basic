package com.codes.Object_oriented.InternalClass.anonymous;

public class AnonymousTest {
    public void test(Product p){
        System.out.println("购买了一个" + p.getName() + ",花掉了" + p.getPrince());
    }

    public static void main(String[] args) {
        AnonymousTest ta = new AnonymousTest();
        ta.test(new Product() {
            @Override
            public double getPrince() {
                return 567.8;
            }

            @Override
            public String getName() {
                return "AGP显卡";
            }
        });
    }
}
